class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        char[] haystacks = haystack.toCharArray();
        char[] needles = needle.toCharArray();
        int N = needles.length;
        for(int i = 0; i < haystacks.length; i++){
            if((i + N - 1) < haystacks.length && (haystacks[i] != needles[0] || haystacks[i + N - 1] != needles[N - 1])){
                continue;
            }else{
                boolean found = true;
                for(int j = i; j < i + N; j++){
                    if(j > haystacks.length -1 || haystacks[j] != needles[j-i]) {
                        found = false;
                        break;
                    }
                }
                if(found) return i;
            }
        }
        return -1;
    }
}
