package java_advanced_01.day15.linkedListEx;

import java.util.Iterator;

public class SingleLinkedListEx <T>{
    public Node<T> head = null;

    public class Node<T>{
        T data;
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if(head == null){
            head = new Node<T>(data);
        } else{
            Node<T> node = this.head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll(){
        if(head != null){
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> search(T data){
        if(head != null){
            Node<T> node = head;
            while(node != null){
                if(node.data.equals(data)){
                    return node;
                }
                node = node.next;
            }
        }
        return null;
    }

    public void addNodeInside(T data, T isData){
        if(head != null){
            Node<T> node = head;
            while(node != null){
                if(node.data.equals(isData)){
                    Node<T> node1 = new Node<>(data);
                    if(node.next != null){
                        node1.next = node.next;
                        node.next = node1;
                    } else {
                        node.next = node1;
                    }
                }
                node = node.next;
            }
        }
    }

    public boolean deleteNode(T isData){
        if(head != null) {
            Node<T> node = head;
            while (node.next != null) {
                if (node.next.data.equals(isData)) {
                    if (node.next.next != null) {
                        node.next = node.next.next;
                    } else {
                        node.next = null;
                    }
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SingleLinkedListEx<Integer> myLinkedList = new SingleLinkedListEx<Integer>();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);

//        System.out.println(myLinkedList.head.data);
//        System.out.println(myLinkedList.head.next.data);
        myLinkedList.printAll();
        System.out.println(myLinkedList.search(2).data);
        myLinkedList.addNodeInside(5,2);
        myLinkedList.deleteNode(2);
        System.out.println(myLinkedList.search(2));
        myLinkedList.printAll();
    }
}
