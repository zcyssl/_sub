package Solution;


import com.sun.scenario.effect.impl.state.AccessHelper;

import javax.management.openmbean.InvalidOpenTypeException;
import java.util.*;
import java.awt.Point;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.DelayQueue;
import java.util.stream.Collectors;

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
};

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
    }
}