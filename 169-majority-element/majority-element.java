class Solution {
    public int majorityElement(int[] nums) {

        // BETTER SOLUTION IT ALSO ACCEPT THE TEST CASE:
        
    //  HashMap<Integer, Integer> countMap = new HashMap<>();
    //     int majorityCount = nums.length / 2;

    //     // Storing the elements with their occurrence
    //     for (int num : nums) {
    //         int count = countMap.getOrDefault(num, 0) + 1;
    //         if (count > majorityCount) {
    //             return num;
    //         }
    //         countMap.put(num, count);
    //     }

    //     return -1; // If no majority element is found;


//OPTIMAL SOLUTION

    int n = nums.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }
}