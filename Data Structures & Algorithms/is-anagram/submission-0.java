class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> compare = new HashMap<>();

        for(Character i: s.toCharArray()) {
            if(compare.containsKey(i)) {
                compare.put(i, compare.get(i)+1);
            } else {
                compare.put(i, 1);
            }
        }

        for(char i: t.toCharArray()) {
            if(!compare.containsKey(i)) return false;
            
            compare.put(i, compare.get(i)-1);
            
            if(compare.get(i) == 0) {
                compare.remove(i);
            }
        }
        return compare.isEmpty();
    }
}
