class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int n = plants.length;
        int current =capacity;
        for(int i=0;i<n;i++){
            if(current>=plants[i]){
             current -=plants[i];
            steps +=1;
            }
            else if(current<plants[i]){
                current = capacity;
                steps += 2*i+1;
                current -= plants[i];
            }
        }
        return steps;
    }
}
