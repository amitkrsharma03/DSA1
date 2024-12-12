package Programs;

import java.util.ArrayList;

public class DFS {
    class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(){}
        TreeNode(int val){ this.val=val; }
        TreeNode(int val , TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public ArrayList<Integer> dfsOfGraph(TreeNode node) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(node==null) return list;
        if(node.left==null && node.right==null) {
            list.add(1);
            return list;
        }
        ArrayList<Integer> left=dfs(node.left);
        ArrayList<Integer> right=dfs(node.right);
        int maxlen=Math.max(left.size(),right.size());
        for(int i=0;i<=maxlen;i++){
            int sum=0;
            if(i<left.size()){
                sum+=left.get(i);
            }
            if(i<right.size()){
                sum+=right.get(i);
            }
            list.add(sum);
        }
        return list;
    }
}
