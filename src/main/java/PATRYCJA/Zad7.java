package PATRYCJA;

import java.util.* ;

public class Zad7
{
    Node root;
    static class Node
    {
        int val;
        Node left, right;
        Node(int v)
        {
            val = v;
            left = null;
            right = null;
        }
    }


    Zad7(Node r) { root = r; }


    Zad7() { }



    public boolean isSymmetric(Node root)
    {

        Queue<Node> q = new LinkedList<Node>();

        q.add(root.left);
        q.add(root.right);

        while (!q.isEmpty())
        {

            Node tempLeft = q.remove();
            Node tempRight = q.remove();


            if (tempLeft==null && tempRight==null)
                continue;

            if ((tempLeft==null && tempRight!=null) ||
                    (tempLeft!=null && tempRight==null))
                return false;

            if (tempLeft.val != tempRight.val)

            q.add(tempLeft.left);
            q.add(tempRight.right);
            q.add(tempLeft.right);
            q.add(tempRight.left);
        }

        return true;
    }

    public static void main(String[] args)
    {
        Node n = new Node(1);
        Zad7 bt = new Zad7(n);
        bt.root.left = new Node(5);
        bt.root.right = new Node(5);
        bt.root.left.left = new Node(50);
        bt.root.left.right = new Node(3);
        bt.root.right.left = new Node(10);
        bt.root.right.right = new Node(64);

        if (bt.isSymmetric(bt.root))
            System.out.println("Drzewo binarne jest symetryczne");
        else
            System.out.println("Drzewo binarne nie jest symetryczne");
    }
}
