class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(Arrays.stream(gas).sum()<Arrays.stream(cost).sum()){
            return -1;
        }
        int n=gas.length;
        int ans=0;
        int remaining_gas=0;
        for(int i=0;i<n;i++){
            remaining_gas=remaining_gas+gas[i]-cost[i];
            if(remaining_gas<0){
                ans=i+1;
                remaining_gas=0;
            }
        }
        return ans;
    }
}