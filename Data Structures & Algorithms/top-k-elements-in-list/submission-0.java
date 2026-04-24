class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }   

        int[] result = new int[k];
        for(int j=0; j<k; j++) {
            Integer maxKey=0;
            Integer maxValue=0;
            for(Map.Entry<Integer, Integer>  entry: map.entrySet()) {
                if(entry.getValue()>= maxValue) {
                    maxKey = entry.getKey();
                    maxValue = entry.getValue();
                }
            } 
            result[j] = maxKey;
            map.remove(maxKey);
        }

        return result; 
    }
}
