package PATRYCJA;

import java.util.LinkedList;

class Wezel<T> {
    private T data;
    private Wezel<T> parent;
    private LinkedList<Wezel<T>> children;

    public Wezel() {
        parent = null;
        children = new LinkedList<Wezel<T>>();
    }

    public Wezel(Wezel<T> parent) {
        this();
        this.parent = parent;
    }

    public Wezel(Wezel<T> parent, T data) {
        this(parent);
        this.data = data;
    }

    public Wezel<T> getParent(){
        return parent;
    }

    public void setParent(Wezel<T> parent) {
        this.parent = parent;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getDegree() {
        return children.size();
    }

    public boolean isLeaf(){
        return children.isEmpty();
    }

    public Wezel<T> addChild(Wezel<T> child) {
        child.setParent(this);
        children.add(child);
        return child;
    }

    public Wezel<T> addChild(T data) {
        Wezel<T> child = new Wezel<T>(this, data);
        children.add(child);
        return child;
    }

    public Wezel<T> getChild(int i){
        return children.get(i);
    }

    public Wezel<T> removeChild(int i) {
        return children.remove(i);
    }

    public void removeChildren() {
        children.clear();
    }

    public LinkedList<Wezel<T>> getChildren() {
        return children;
    }

    public Wezel<T> getLeftMostChild() {
        if (children.isEmpty()) return null;
        return children.get(0);
    }

    public Wezel<T> getRightSibling() {
        if (parent != null) {
            LinkedList<Wezel<T>> parentsChildren = parent.getChildren();
            int pos = parentsChildren.indexOf(this);
            if (pos < (parentsChildren.size()-1))
                return parentsChildren.get(pos+1);
        }
        return null;
    }

    public String toString() {
        return data.toString();
    }
}
