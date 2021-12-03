// Moore's Voting Algorithm for least time and space complexity.
class Solution {
    public int majorityElement(int[] num) {
	int max =0;
        int count =0;
        for(int i:num){
            if(count==0){
                max = i;
            }
          if(i==max){
           count +=1;
       }
        else{
            count -=1;
        }}
       
        return max;
	}}
