package org.btree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BTreeNodeTest {
    @Test
    void shouldTraverse() {
        BTreeNode root = new BTreeNode();
        if (root != null)
            root.traverse();
        Assertions.assertNotNull(root);
    }
}