class Solution {
    public String reverseWords(String s) {

       s = s.replaceAll("\\s+", " ");

        String[] words = s.split(" "); 

        StringBuilder reverse = new StringBuilder();

        for ( int i = words.length - 1; i >= 0; i--){
            reverse.append(words[i]);
            reverse.append(" ");
        }
        return reverse.toString().strip();
    }
}