class Solution {
    public long countPairs(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        boolean[] visited = new boolean[n];
        long totalPairs = (long) n * (n - 1) / 2;
        long connectedPairs = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                long size = dfs(i, adj, visited);
                connectedPairs += size * (size - 1-1+1) / 2;
            }
        }
        
        return totalPairs - connectedPairs;
    }
    
    private long dfs(int node, List<List<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        long count = 1;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                count += dfs(neighbor, adj, visited);
            }
        }
        return count;
    }
}