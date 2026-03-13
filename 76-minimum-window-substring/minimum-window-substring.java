class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> target = new HashMap<>();
        int required = 0;
        int formed = 0;
        for (char ch : t.toCharArray()) {
            if (!target.containsKey(ch)) {
                required++;
            }
            target.put(ch, target.getOrDefault(ch, 0) + 1);
        }
        int startindex = 0;
        int minLen = Integer.MAX_VALUE;
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);
            if (target.containsKey(ch) && window.get(ch).equals(target.get(ch))) {
                formed++;
            }
            while (formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startindex = left;
                }
                if (target.containsKey(s.charAt(left))
                        && window.get(s.charAt(left)).equals(target.get(s.charAt(left)))) {
                    formed--;
                }
                window.put(s.charAt(left), window.get(s.charAt(left)) - 1);
                left++;
            }
        }
        if (minLen == Integer.MAX_VALUE)
            return "";

        return s.substring(startindex, startindex + minLen);
    }
}