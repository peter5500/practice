class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] table = new int[26];
        for (char c : magazine.toCharArray()){
            table[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()){
            table[c - 'a']--;
            if (table[c - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}