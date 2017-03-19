/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.pkgthis.a.binary.search.tree;

/**
 *
 * @author osama
 */
class Node {
    int data;
    Node left;
    Node right;
 }
public class IsThisABinarySearchTree {

    /**
     * @param args the command line arguments
     */
    boolean checkBST(Node root) {
        if (root == null) return false;
        else{
            if(root.left != null){
                if(root.left.data >= root.data) return false;
                return checkBST(root.left);
            }
            else if(root.right != null){
                if(root.right.data < root.data) return false;
                return checkBST(root.right);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
