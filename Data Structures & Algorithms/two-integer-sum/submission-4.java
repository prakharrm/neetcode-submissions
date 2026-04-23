class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int j=0; j<nums.length; j++) {
            if(map.containsKey(target-nums[j]) && j!= map.get(target-nums[j])) {
                int i=map.get(target-nums[j]);
               
                    return new int[]{j,i};
                
            }
        }

        return new int[]{0,0};
    }
}
