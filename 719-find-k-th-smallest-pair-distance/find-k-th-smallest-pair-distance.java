class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        // int n=nums.length;
        // ArrayList<Integer> l=new ArrayList<Integer>();
        // int ind=0;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         int sub=nums[j]-nums[i];
        //         l.add(Math.abs(sub));
        //     }
        // }
        // for(int i: l) System.out.println(i);
        // PriorityQueue<Integer>p=new PriorityQueue<Integer>(Collections.reverseOrder());
        // for(int i=0;i<l.size();i++){
        // p.offer(l.get(i));
        // if(p.size()>k) p.poll();}
        // return p.peek();
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, right = nums[n - 1] - nums[0];
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0, j = 0;
            
            for (int i = 0; i < n; i++) {
                while (j < n && nums[j] - nums[i] <= mid) j++;
                count += j - i - 1;
            }
            
            if (count >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
}