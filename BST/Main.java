package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        Tree intTree=new Tree();
        int[] arr={25,20,15,27,30,29,26,32,17};
        for( int i:arr) intTree.insert(i);

        intTree.traverseInOrder();
        System.out.println();
        System.out.println(intTree.get(27));
        System.out.println(intTree.get(17));
        System.out.println(intTree.get(8));
        System.out.println(intTree.min());
        System.out.println(intTree.max());
    }
}
