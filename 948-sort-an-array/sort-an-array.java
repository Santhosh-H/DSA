class Solution {
   public static void merge(int[] nums, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        merge(nums, low, mid);
        merge(nums, mid + 1, high);
        mergetogther(nums, low, mid, high);
    }

    public static void mergetogther(int[] nums, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        List<Integer> l = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                l.add(nums[left]);
                left++;
            } else {
                l.add(nums[right]);
                right++;
            }
        }

        while (left <= mid) {
            l.add(nums[left++]);
        }

        while (right <= high) {
            l.add(nums[right++]);
        }

        for (int i = low; i <= high; i++) {
            nums[i] = l.get(i - low);
        }
    }

    public int[] sortArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        merge(nums, low, high);
        return nums;
    }
}