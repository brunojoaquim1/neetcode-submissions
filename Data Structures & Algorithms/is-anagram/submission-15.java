class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;   // soma pra s
            count[t.charAt(i) - 'a']--;   // subtrai pra t, no mesmo loop
        }

        for (int c : count)
            if (c != 0) return false;
        return true;
    }
}
