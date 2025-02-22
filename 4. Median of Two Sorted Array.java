class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        // int n=nums1.length+nums2.length;
        // int median= n/2;
        // if(n%2!=0){
        //     int i=0,j=0,l=0;
        //     while(n>=i){
        //         if(i==median){
        //             if(nums1[j]>nums2[l]){
        //                 return nums2[l];
        //             }
        //             else{
        //                 return nums1[i];
        //             }
        //         }
        //         if(nums1[j]>nums2[l] ){
        //             l++;
        //             i++;
        //         }
        //         else{
        //             j++;
        //             i++;
        //         }
        //     }
        // }
        // else if(n%2==0){
        //     int i=0,j=0,l=0;
        //     int sum=0;
        //     while(n>=i){
        //         if(i==median-1){
        //             if(nums1[j]>nums2[l]){
        //                 sum+=nums2[l];
        //             }
        //             else{
        //                 sum+=nums1[j];
        //             }
        //         }
        //         if(i==median){
        //             if(nums1[j]>nums2[l]){
        //                 return sum+nums2[l];
        //             }
        //             else{
        //                 return sum+nums1[j];
        //             }
        //         }
                
        //         if(nums1[j]>nums2[l] ){
        //             l++;
        //             i++;
        //         }
        //         else{
        //             j++;
        //             i++;
        //         }
        //     }
        // }
        // return nums1[0];


        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        Arrays.sort(c);

        int len = c.length;
        if (len % 2 == 0)
            return (c[len / 2] + c[len / 2 - 1]) / 2.0;
        else
            return c[len / 2];
    }
    
    
}
