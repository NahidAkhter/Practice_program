package javaDsImplements;

public class LinkedListImpl {

    public static void main(String[] args) {

        Nod head = new Nod(1);
        Nod second = new Nod(2);
        Nod third = new Nod(3);

        head.next = second;
        second.next = third;

        System.out.println("LinkedList");

        System.out.print("[");
        while (null != head){
            System.out.print(head.value+ " ");
            head = head.next;
        }
        System.out.println("]");
    }
}

class Nod {

    int value;
    Nod next;

    Nod(int actualValue){
        value = actualValue;
        next = null;
    }

}