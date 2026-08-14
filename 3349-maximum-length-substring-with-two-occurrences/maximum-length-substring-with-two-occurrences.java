class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> a = new HashMap<>();

        int i = 0;
        int max = 0;

        for (int j = 0; j < s.length(); j++) {

            char c = s.charAt(j);
            a.put(c, a.getOrDefault(c, 0) + 1);

            while (a.get(c) > 2) {

                char x = s.charAt(i);

                a.put(x, a.get(x) - 1);

                i++;
            }

            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}