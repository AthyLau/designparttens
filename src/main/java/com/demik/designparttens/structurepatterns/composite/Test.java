package com.demik.designparttens.structurepatterns.composite;

/**
 * Function:
 *
 *                                            1
 *                                 2                    3
 *                           4           5         6            7
 *                       8      9    10    11   12   13     14     15
 *
 * @author liubing
 * Date: 2019/8/21 5:53 PM
 * @since JDK 1.8
 */
public class Test {

    public static void main(String args[]){
        BinaryTreeNode node1 = new BinaryTreeNode("ndoe","1");
        BinaryTreeNode node2 = new BinaryTreeNode("ndoe","2");
        BinaryTreeNode node3 = new BinaryTreeNode("ndoe","3");
        BinaryTreeNode node4 = new BinaryTreeNode("ndoe","4");
        BinaryTreeNode node5 = new BinaryTreeNode("ndoe","5");
        BinaryTreeNode node6 = new BinaryTreeNode("ndoe","6");
        BinaryTreeNode node7 = new BinaryTreeNode("ndoe","7");
        BinaryTreeNode node8 = new BinaryTreeNode("ndoe","8");
        BinaryTreeNode node9 = new BinaryTreeNode("ndoe","9");
        BinaryTreeNode node10 = new BinaryTreeNode("ndoe","10");
        BinaryTreeNode node11 = new BinaryTreeNode("ndoe","11");
        BinaryTreeNode node12 = new BinaryTreeNode("ndoe","12");
        BinaryTreeNode node13 = new BinaryTreeNode("ndoe","13");
        BinaryTreeNode node14 = new BinaryTreeNode("ndoe","14");
        BinaryTreeNode node15 = new BinaryTreeNode("ndoe","15");

        node1.addNode(node2);
        node1.addNode(node3);
        node2.addNode(node4);
        node2.addNode(node5);
        node3.addNode(node6);
        node3.addNode(node7);
        node4.addNode(node8);
        node4.addNode(node9);
        node5.addNode(node10);
        node5.addNode(node11);
        node6.addNode(node12);
        node6.addNode(node13);
        node7.addNode(node14);
        node7.addNode(node15);

        System.out.println(node1.toString());
        node1.soutAllSonNodes();
    }
}
