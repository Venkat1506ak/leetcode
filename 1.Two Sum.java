class Solution {
    public int[] twoSum(int[] nums, int target) {
        int max=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int[] result=new int[max+1];
        int right=result.length-1;
        for(int i=0;i<nums.length;i++){
            result[nums[i]]=nums[i];
        }
        while(left<right){
            if(result[left]!=0 && result[right]!=0){
                if(left+right==target){
                    return new int[]{left,right};
                }
                else if(left+right<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        
        

        // HashMap<> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(!(map.contains(nums[i]))){
        //         map.put(nums[i],i);
        //     }
        // }
        // Arrays.stream()



        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j] == target){
        //                   return new int[]{i,j};        
        //         }
        //     }
        // }
         return new int[]{};
    }
}
