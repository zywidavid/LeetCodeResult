class Solution {
    bool isUpper(const char c) {
        return 'A' <= c && c <= 'Z';
    }
    bool isLower(const char c) {
        return 'a' <= c && c <= 'z';        
    }
    char toLower(const char upper) {
        return upper - 'A' + 'a';
    }
    bool table1NotLargerThanTable2(int table1[], int table2[]) {
        for (int i = 0; i < 26; ++i) {
            if (table1[i] > table2[i])
                return false;
        }
        return true;
    }
public:
    string shortestCompletingWord(string licensePlate, vector<string>& words) {
        string res;
        int table[26] = {0};
        for (auto c : licensePlate)
        {
            if (isUpper(c))  // alternative std::isupper()
                table[toLower(c) - 'a']++;
            else if (isLower(c))
                table[c - 'a']++;
        }
        for (auto word : words)
        {
            int tbl[26];
            memset(tbl, 0, sizeof(tbl));
            for (auto c : word)
            {
                tbl[c - 'a']++;
            }
            if (table1NotLargerThanTable2(table, tbl))
            {
                if (res.size() == 0 || word.length() < res.size())
                    res = word;
            }
        }
        return res;
    }
};