package Solution;


import java.util.Arrays;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
      if(nums.length==1) return true;
      Arrays.sort(nums);
      int xp=nums[0];
      for(int i=1;i<nums.length;i++) {
          xp ^= nums[i];
          if(xp==0) return false;
          xp=nums[i];

      }
        return true;
    }
}