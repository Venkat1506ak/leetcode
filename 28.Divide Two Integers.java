// Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
// The integer division should truncate toward zero, which means losing its fractional part.
// For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.
// Return the quotient after dividing dividend by divisor.
// Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range:
// [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1,
// then return 231 - 1, and if the quotient is strictly less than -231, then return -231.
// Example 1:
// Input: dividend = 10, divisor = 3
// Output: 3
// Explanation: 10/3 = 3.33333.. which is truncated to 3.
// Example 2:
// Input: dividend = 7, divisor = -3
// Output: -2
// Explanation: 7/-3 = -2.33333.. which is truncated to -2.

class Solution {
    public int divide(int dividend, int divisor) {
        int count=0,count1=1;
        int div=dividend,d=divisor;
        if(dividend==Integer.MIN_VALUE && divisor==-1)return Integer.MAX_VALUE;
        if(dividend==Integer.MAX_VALUE && divisor==-1)return -dividend;
        if(dividend==Integer.MIN_VALUE && divisor==1)return Integer.MIN_VALUE;
        //if(dividend==divisor)return 1;
        if(divisor==Integer.MIN_VALUE && dividend!=Integer.MIN_VALUE){
            return 0;
        }
        System.out.print(dividend);
        if(dividend==Integer.MIN_VALUE && divisor==2){
            div= Integer.MAX_VALUE;
            //dividend=div;
            while(div>=d){
                count1++;
                div=div-d;
            }
            return -count1;
        }
        
        else if(dividend<0 && divisor<0){
            
            while(dividend<=divisor){
                //System.out.print();
                count++;
                dividend=dividend-divisor;
            }
            return count;
        }
        else if(dividend>0 && divisor>0){
            while(dividend>=divisor){
                count++;
                dividend=dividend-divisor;
            }
            return count;
        }
        else if(dividend<0){
            
            while(div<=0){
                //System.out.print("sam");
                count++;
                div=div+d;
            }
            return -(count-1);
        }
        else{
            d=Math.abs(divisor);
            while(div>=d){
                //System.out.print("sam");
                count++;
                div=div-d;
            }
            return -count;
        }
    }
}
