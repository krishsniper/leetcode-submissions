class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String sortedKey = new String(temp);
            if(!map.containsKey(sortedKey)){
                map.put(sortedKey,new ArrayList<>());
            }
            map.get(sortedKey).add(strs[i]);

        }
        return new ArrayList<>(map.values());

    }
}