package material.linkedlist;

public class SingleLinkedList {
    private Node head;
    private Node tail;

    public boolean insertNewNode(int value){
        if(head == null){
            insertFirstNode(value);
        }else{
            Node node = head;
            while (node.getNextNode() != null){
                node = node.getNextNode();
            }
            insertLastNode(node, value);
        }
        return true;
    }



    public boolean insertNewNodeAtSpecificLocation(int value, int locationIndex){
        boolean result = false;
        if(head == null){
            insertFirstNode(value);
            result = true;
        }else{
            Node node = head;
            int counter = 0;
            while(node.getNextNode() != null){
                counter++;
                if(counter == locationIndex - 1){
                    Node nextNode = node.getNextNode();
                    Node newNode = new Node(value, nextNode);
                    node.setNextNode(newNode);
                    result = true;
                    break;
                }else{
                    node = node.getNextNode();
                }
            }

            //if the locationIndex is exactly index of the last node
            counter++;
            if(counter == locationIndex - 1 && node.getNextNode() == null){
                insertLastNode(node, value);
                result = true;
            }
        }
        return result;
    }

    public void printALlNode(){
        if(head == null){
            System.out.println("the linkedList is still empty");
        }else{
            System.out.println("Head  value : " + head.getValue());
            System.out.println(" ==================================== ");
            Node node = head;
            int counter = 1;
            while (node.getNextNode() != null){
                System.out.println("Node " + counter + " value : " + node.getValue());
                node = node.getNextNode();
                counter++;
            }
            //print the last node
            System.out.println("Node " + counter + " value : " + node.getValue());

            //print tail
            System.out.println(" ==================================== ");
            System.out.println("Tail  value : " + tail.getValue());
        }
    }

    private void insertFirstNode(int value){
        Node node = new Node(value, null);
        head = node;
        tail = node;
    }

    private void insertLastNode(Node currentNode, int value){
        Node newNode = new Node(value, null);
        currentNode.setNextNode(newNode);
        tail = newNode;
    }

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertNewNode(12);
        singleLinkedList.insertNewNode(14);
        singleLinkedList.insertNewNode(18);
        singleLinkedList.insertNewNode(2);
        singleLinkedList.insertNewNodeAtSpecificLocation(3, 3);
        singleLinkedList.insertNewNodeAtSpecificLocation(10, 6);
        singleLinkedList.printALlNode();
    }
}

class Node{
    public Node(int value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    private int value;
    private Node nextNode;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
