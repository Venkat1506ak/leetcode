class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count=0;
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    count++;
                }
            }
        }
        else{
            return false;
        }
        char[] a1=s1.toCharArray();
        char[] a2=s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(count==0){
            return true;
        }
        else if(count==2){
            for(int i=0;i<s1.length();i++){
                if(a1[i]!=a2[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
        
    }
}
