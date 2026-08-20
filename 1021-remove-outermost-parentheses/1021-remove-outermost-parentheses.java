class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int op = 0;

        for( char c : s.toCharArray()){
            if(c == '('){
                if(op > 0){
                    res.append(c);
                }
                op++;
            }else if(c == ')'){
                op--;
                if(op > 0){
                    res.append(c);
                }
            }
        }
        return res.toString();
    }
}