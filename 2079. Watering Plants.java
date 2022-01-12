class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int availableWater = capacity;              
        for (int i = 0; i < plants.length; i++) {    
            if (availableWater >= plants[i]) {      
                availableWater -= plants[i];         
                steps++;                             
            } else {                                 
                steps += i;                         
                availableWater = capacity;           
                steps += i;
                availableWater -= plants[i];         
                steps++;                             
            }
        }
        return steps;
    }
}
