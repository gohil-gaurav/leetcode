class Solution {
    public String interpret(String command) {
         StringBuilder result = new StringBuilder();
         int i =0;
       while(i < command.length()) {
            char ch = command.charAt(i);
         if(ch == 'G'){
            result.append("G");
            i++;
         }else if(ch == '(' ){
            if(command.charAt(i+1) == ')'){
                result.append("o");
                i+=2;
            }else{
                result.append("al");
                i += 4;
            }
         }
        }
        return result.toString();
    }
}