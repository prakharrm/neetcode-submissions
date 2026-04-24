class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> map= new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String s: strs) {
            List<Integer> count = new ArrayList<Integer>(Collections.nCopies(26,0));

            for (int i = 0; i < s.length(); i++) {
                if(count.get(s.charAt(i) - 'a') == 0) {
                    count.set(s.charAt(i) - 'a',1);
                } else {
                    count.set(s.charAt(i) - 'a', count.get(s.charAt(i) - 'a')+1);
                }
            }

           
            map.computeIfAbsent(count, k -> new ArrayList<>()).add(s);
        }

        // for(Map.Entry<List<Integer>, List<String>> entry : map.entrySet()) {
        //     List<String> list = new ArrayList<>();

        //     for(String anagrams: entry.getValue()) {
        //         list.add(anagrams);
        //     }

        //     result.add(list);
        // }

        // return result;

        return new ArrayList<>(map.values());
    

    }
}
