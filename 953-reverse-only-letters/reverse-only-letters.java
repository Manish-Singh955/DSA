class Solution {
    public String reverseOnlyLetters(String s) {
        int start=0;
        int end =s.length()-1;
        char ch[]=s.toCharArray();
        while(start<end){
            if(!Character.isLetter(ch[start])){
                start++;
            }else if(!Character.isLetter(ch[end])){
                end--;
            }else{
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
}