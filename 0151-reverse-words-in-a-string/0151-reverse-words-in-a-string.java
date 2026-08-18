class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder ch = new StringBuilder();

        for(int i=words.length-1; i>=0; i--){
            ch.append(words[i]);
            if(i > 0){
                ch.append(" ");
            }
        }
        return ch.toString();
    }
}