class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] array = new int[26];

        for (char c : s.toCharArray()) {
            int charIndex = (int) c - (int) 'a';
            array[charIndex] += 1;
        }

        for (char c : t.toCharArray()) {
            int charIndex = (int) c - (int) 'a';
            array[charIndex] -= 1;
        }

        for (int i : array) {
            if (i != 0) {
                return false;
            }
        }

        return true;

    }
}
