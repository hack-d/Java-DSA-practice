public class SumOfNodes_7 {
    public static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static class binaryTree{
        static int index=-1;
        public node buildTree(int[] nodes){
            index++;

            if(nodes[index]==-1){
                return null;
            }

            node newnode=new node(nodes[index]);
            newnode.left=buildTree(nodes);
            newnode.right=buildTree(nodes);

            return newnode;

        }
    }

    public static int sum(node root){
        if(root==null){
            return 0;
        }

        int leftSum=sum(root.left);
        int rightSum=sum(root.right);

        return leftSum+rightSum+root.data;
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree=new binaryTree();
        node root=tree.buildTree(nodes);
        //System.out.println(root.data);
        System.out.println(sum(root));
    }
}
