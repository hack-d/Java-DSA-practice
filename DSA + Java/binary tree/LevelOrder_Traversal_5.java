import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder_Traversal_5 {
    
        static class node{
            int data;
            node left;
            node right;
    
            node(int data){
                this.data=data;
                this.left=null;
                this.right=null;
            }
        }
    
        static class binaryTree{
            static int index=-1;
            public node buildTree(int nodes[]){
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
    
        /**
         * very important
         */
        public static void levelOrder(node root){
            if(root==null){
                return;
            }

            Queue<node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                    
                }
            }

        }
        public static void main(String[] args) {
            int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            binaryTree tree=new binaryTree();
            node root=tree.buildTree(nodes);
            levelOrder(root);
        }
    }
    



