// Determine if a small string is a substring of another large string.
//
// Return the index of the first occurrence of the small string in the large string.
//
// Return -1 if the small string is not a substring of the large string.
//
// Assumptions
//
// Both large and small are not null
// If small is empty string, return 0
// Examples
//
// “ab” is a substring of “bcabc”, return 2
// “bcd” is not a substring of “bcabc”, return -1
// "" is substring of "abc", return 0
// public class Solution {

  public int strstr(String large, String small) {
    if (small == null || small.length() < 1) {
      return 0;
    }
    int n = large.length();
    int m = small.length();
    for (int i = 0; i <= n - m; i++) {
      int j = 0;
      while (j < m) {
        if (large.charAt(i + j) != small.charAt(j)) {
          break;
        }
        j++;
      }
      if (j == m) {
        return i;
      }
    }
    return -1;
  }
}
