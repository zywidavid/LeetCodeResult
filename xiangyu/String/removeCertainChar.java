// Remove given characters in input string, the relative order of other characters should be remained. Return the new string after deletion.
//
// Assumptions
//
// The given input string is not null.
// The characters to be removed is given by another string, it is guranteed to be not null.
// Examples
//
// input = "abcd", t = "ab", delete all instances of 'a' and 'b', the result is "cd".

public class Solution {
  public String remove(String input, String t) {
    char[] arr = input.toCharArray();
    Set<Character> set = buildSet(t);
    int i = 0, j = 0;
    while (j < arr.length) {
        if (!set.contains(arr[j])) {
          arr[i] = arr[j];
          i++;
          j++;
        } else {
          j++;
        }
    }
    return new String(arr, 0, i);
  }
  private Set<Character> buildSet(String t) {
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < t.length(); i++) {
      set.add(t.charAt(i));
    }
    return set;
  }
}
