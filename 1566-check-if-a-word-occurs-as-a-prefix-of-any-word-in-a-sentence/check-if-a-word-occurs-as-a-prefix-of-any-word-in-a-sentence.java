class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String sen[]=sentence.split(" ");
        for(int i=0;i<sen.length;i++){
            if(sen[i].startsWith(searchWord)){
                return (i+1);
            }
        }
        return -1;
    }
}