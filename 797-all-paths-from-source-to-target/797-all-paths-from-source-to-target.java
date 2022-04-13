class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList();
        ans.add(0);
        dfs(graph,0,ans,list);
        return list;
    }
    void dfs(int[][] graph , int node, List<Integer> ans, List<List<Integer>> list){
        if(node==graph.length-1){
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int nextnode:graph[node]){
            ans.add(nextnode);
            dfs(graph,nextnode,ans,list);
            ans.remove(ans.size()-1);
        }
    }
}