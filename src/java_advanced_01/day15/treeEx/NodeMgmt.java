package java_advanced_01.day15.treeEx;

public class NodeMgmt {

    Node head = null;

    public class Node{
        Node left, right;
        int value;

        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data){
        if(head == null){
            head = new Node(data);
        } else {
            Node findNode = this.head;
            while(true){
                if(findNode.value < data){
                    if(findNode.right == null){
                        findNode.right = new Node(data);
                        break;
                    }
                    findNode = findNode.right;
                } else if(findNode.value > data){
                    if(findNode.left == null){
                        findNode.left = new Node(data);
                        break;
                    }
                    findNode = findNode.left;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
