class Solution {
    public int majorityElement(int[] num) {
		int ans = 0; int major = num[0];
		for(int i:num) {
			if(ans==0){
                major=i; 
                ans++;	}
			else if(i==major) ans++;
			else ans--;
		}
		return major;
	}}
