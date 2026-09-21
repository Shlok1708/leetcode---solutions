import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            dfs(root, "", result);
        }
        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {
        // Append current node's value to the path
        if (path.isEmpty()) {
            path = Integer.toString(node.val);
        } else {
            path = path + "->" + node.val;
        }

        // If it's a leaf node, add the path to the result list
        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }

        // Recurse left and right children if they exist
        if (node.left != null) {
            dfs(node.left, path, result);
        }
        if (node.right != null) {
            dfs(node.right, path, result);
        }
    }
}