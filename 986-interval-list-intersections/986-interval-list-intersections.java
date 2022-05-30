class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();
        int ptr1=0;
        int ptr2=0;
        
        while(ptr1<firstList.length && ptr2<secondList.length){
            
        //csp = common starting point , cep = common ending point
        int csp = Math.max(firstList[ptr1][0],secondList[ptr2][0]);
        int cep =  Math.min(firstList[ptr1][1],secondList[ptr2][1]);
            
            if(csp<=cep){
                int[] interval ={csp,cep};
                list.add(interval);
            }
             if(firstList[ptr1][1]<secondList[ptr2][1]){
                ptr1++;
            }else{
                ptr2++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}