package PATRYCJA;

public class Zad5 {
    private Zad5 left;
    private Zad5 right;

    public Zad5 OdwracanieDrzewa(Zad5 root) {
        if (root == null) {
            return root;
            OdwracanieDrzewa(root.left);
            OdwracanieDrzewa(root.right);
            Zad5 t = root.left;
            root.left = root.right;
            root.right = t;
            return root;
        }
    }
}



