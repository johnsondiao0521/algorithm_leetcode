package datastructure.bst;

public class BST_template<E extends Comparable<E>>{

    private class Node{
        public E e;
        public Node left;
        public Node right;

        public Node(E e){
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    //向二叉搜索树中添加新的元素e
    public void add(E e){

    }
    // 向以node为根的二分搜索树中插入元素e，递归算法
    //返回插入新节点后二分搜索树的根

    //查看二分搜索树中是否包含元素e
    public boolean contains(E e){
        return false;
    }

    // 二分搜索树的前序遍历
    public void preOrder(){

    }

    // 二分搜索树的中序遍历
    public void inOrder(){

    }

    // 二分搜索树的后序遍历
    public void postOrder(){

    }

    // 二分搜索树的层序遍历
    public void levelOrder(){

    }

    // 二分搜索树的非递归前序遍历
    public void preOrderNR(){

    }

    // 寻找二分搜索树的最小元素
    public E minimum(){
        return null;
    }

    // 寻找二分搜索树的最大元素
    public E maximum(){
        return null;
    }

    // 从二分搜索树中删除最小值所在节点, 返回最小值
    public E removeMin(){
        return null;
    }

    // 从二分搜索树中删除最大值所在节点
    public E removeMax(){
        return null;
    }

    // 从二分搜索树中删除元素为e的节点
    public void remove(E e){

    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        generateBSTString(root, 0, res);
        return res.toString();
    }
    private void generateBSTString(Node node, int depth, StringBuilder res){
        if(node == null){
            res.append(generateDepthString(depth) + "null\n");
            return;
        }
        res.append(generateDepthString(depth) + node.e + "\n");
        generateBSTString(node.left, depth+1, res);
        generateBSTString(node.right, depth+1, res);
    }
    private String generateDepthString(int depth){
        StringBuilder res = new StringBuilder();
        for(int i=0; i<depth; i++)
            res.append("--");
        return res.toString();
    }
}