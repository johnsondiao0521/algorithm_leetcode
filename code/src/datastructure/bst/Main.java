package datastructure.bst;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        BST<Integer> bst = new BST<>();
//        int[] nums = {5, 3, 6, 8, 4, 2};
//        for(int num: nums)
//            bst.add(num);
//
//        bst.preOrder();
//        System.out.println();
//
//        bst.inOrder();
//        System.out.println();
//
//        bst.postOrder();
//        System.out.println();
//        System.out.println(bst);

        BST<Integer> bst = new BST<>();
        Random random = new Random();

        int n = 5;
        int[] bst_num = {2, 5, 6, 8, 7};
        for(int i=0; i<n; i++)
            bst.add(bst_num[i]);
        System.out.println(bst.size());
        ArrayList<Integer> nums = new ArrayList<>();
        while (!bst.isEmpty())
            nums.add(bst.removeMin());
        System.out.println(nums);
    }
}
