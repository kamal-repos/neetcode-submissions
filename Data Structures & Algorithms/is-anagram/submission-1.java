class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] array = new int[26];

        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i) - 'a'] += 1;
            array[t.charAt(i) - 'a'] -= 1;
        }

        for (int i : array) {
            if (i != 0) {
                return false;
            }
        }

        return true;

    }
}
