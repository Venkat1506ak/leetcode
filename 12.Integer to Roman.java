class Solution {
    public String intToRoman(int num) {
        int n[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String s[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder str=new StringBuilder();
        int i=0;
        while(num>0){
            if(num>=n[i]){
                str.append(s[i]);
                num-=n[i];
            }
            else{
                i++;
            }
        }
        return str.toString();
    }
}
