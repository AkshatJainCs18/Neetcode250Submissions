class Solution {
    public boolean isAnagram(String s, String t) {
        int[] f = new int[26];
        if(t.length() < s.length())
            return isAnagram(t,s);
        for(char c : s.toCharArray())
            f[c - 'a']++;
        
        for(char c : t.toCharArray()){
            f[c - 'a']--;
            if(f[c - 'a'] < 0)
                return false;
        }
        return true;
    }
}
