

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Build the frequency map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // 2. Create the buckets (Array of Lists)
        // Size is nums.length + 1 because the max frequency a number can have is nums.length
        List<Integer>[] buckets = new List[nums.length + 1];

        // 3. Populate the buckets
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            // Initialize the list in the bucket if it doesn't exist yet
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }

            // Add the number to the bucket corresponding to its frequency
            buckets[frequency].add(num);
        }

        // 4. Gather the top k elements by reading buckets from right to left
        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[index++] = num;
                    // Stop once we have collected exactly k elements
                    if (index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}