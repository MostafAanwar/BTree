package org.btree;

public class BTreeNode {

    int[] keys;
    BTreeNode[] c;
    int n;
    boolean leaf;
    int t;
    public BTreeNode(){
        t = 0;
        leaf = false;
    }
    public BTreeNode(int _t, boolean _leaf) {

        t = _t;
        leaf = _leaf;
        keys = new int[2*t-1];
        c = new BTreeNode [2*t];
        n = 0;
    }

    public BTreeNode search(int k) {
        int i = 0;
        while (i < n && k > keys[i])
            i++;

        if (keys[i] == k)
            //return this node

        if (leaf == true)
            return null;

        return c[i].search(k);
    }

    public void traverse() {

        int i;
        for (i = 0; i < n; i++) {
            // If this is not leaf, then before printing key[i],
            // traverse the subtree rooted with child c[i].
            if (leaf == false)
                c[i].traverse();
            System.out.println(keys[i]);
        }
        // Print the subtree rooted with last child
        if (leaf == false)
            c[i].traverse();
    }

}
