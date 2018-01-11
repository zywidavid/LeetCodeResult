// Remove Adjacent Repeated Characters IV
//
// Repeatedly remove all adjacent, repeated characters in a given string from left to right.
//
// No adjacent characters should be identified in the final string.
//
// Examples
//
// "abbbaaccz" → "aaaccz" → "ccz" → "z"
// "aabccdc" → "bccdc" → "bdc"

public class Solution {
  public String deDup(String input) {
    if (input == null || input.length() <= 1) {
      return input;
    }
    char[] arr = input.toCharArray();
    int i = 0;
    // arr[i] as the top of a stack
    for (int j = 1; j < arr.length; j++) {
      if (i == -1 || arr[j] != arr[i]) {
        arr[++i] = arr[j];
      } else {
        // pop and ignore all the consecutive duplicates
        i--;
        while (j + 1 < arr.length && arr[j] == arr[j + 1]) {
          j++;
        }
      }
    }
    return new String(arr, 0, i + 1);
  }
}
