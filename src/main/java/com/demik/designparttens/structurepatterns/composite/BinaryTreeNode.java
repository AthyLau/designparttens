package com.demik.designparttens.structurepatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:单向查找的二叉树
 *
 * @author liubing
 * Date: 2019/8/21 5:36 PM
 * @since JDK 1.8
 */
public class BinaryTreeNode {

    private String data;
    private String nodeId;
    private List<BinaryTreeNode> sonNodes;

    public BinaryTreeNode(String data, String nodeId) {
        this.data = data;
        this.nodeId = nodeId;
        this.sonNodes = new ArrayList<>();
    }

    public void addNode(BinaryTreeNode binaryTreeNode){
        this.sonNodes.add(binaryTreeNode);
    }

    public void remove(BinaryTreeNode binaryTreeNode){
        this.sonNodes.remove(binaryTreeNode);
    }

    public void soutAllSonNodes(){
        sonNodes.forEach(x->{
            System.out.println(x.toString());
            if(x.getSonNodes() != null){
                x.soutAllSonNodes();
            }
        });
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public List<BinaryTreeNode> getSonNodes() {
        return sonNodes;
    }

    public void setSonNode(List<BinaryTreeNode> sonNodes) {
        this.sonNodes = sonNodes;
    }

    @Override
    public String toString() {
        return "BinaryTreeNode{" +
                "data='" + data + '\'' +
                ", nodeId='" + nodeId + '\'' +
                '}';
    }
}
