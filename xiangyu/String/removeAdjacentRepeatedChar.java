// Remove adjacent, repeated characters in a given string, leaving only one character for each group of such characters.
//
// Assumptions
//
// Try to do it in place.
// Examples
//
// “aaaabbbc” is transferred to “abc”

public class Solution {
  public String deDup(String input) {
    if (input == null) {
      return null;
    }
    char[] arr = input.toCharArray();

    int i = 0;
    for (int j = 0; j < arr.length; j++) {
      if (j == 0 || arr[j] != arr[i - 1]) {
        arr[i] = arr[j];
        i++;
      }
    }
    return new String(arr, 0, i);
  }
}
