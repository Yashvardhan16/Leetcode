class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
      List<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq,Collections.reverseOrder());
        int count =0;
        int total_element = arr.length;
        int i= 0;
       while(total_element>arr.length/2){
           total_element -= freq.get(i);
             count++;  i++;
       
       }
        return    count;
    }
}