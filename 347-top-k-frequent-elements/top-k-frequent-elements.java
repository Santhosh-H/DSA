class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //https://www.youtube.com/watch?v=EBNPu0GgM64
         List<Integer>[] bucket = new List[nums.length + 1];
    Map<Integer, Integer> frequencyMap = new HashMap<>();

    for (int n : nums) {
      frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
    }

    for (int key : frequencyMap.keySet()) {
      int frequency = frequencyMap.get(key);
      if (bucket[frequency] == null) {
        bucket[frequency] = new ArrayList<>();
      }
      bucket[frequency].add(key);
    }

    List<Integer> topK = new ArrayList<>();
    for (int pos = bucket.length - 1;pos >= 0 && topK.size() < k; pos--) {
      if (bucket[pos] != null) {
        topK.addAll(bucket[pos]);
      }
    }

    return topK.stream().mapToInt(i -> i).toArray();

  }
    }