package javaDsImplements.linkedlist;

public class Main {

    public static void main(String[] args) {
        Nod head = new Nod(100);
        Nod first = new Nod(110);
        Nod second = new Nod(120);

        head.next = first;
        first.next = second;

        System.out.println("===LinkedList===");

        while(null != head){
            System.out.println(head.value + " ");
            head = head.next;
        }
    }

}


class Nod {

    int value;
    Nod next;

    public Nod(int actualValue) {
        value = actualValue;
        next = null;
    }
}
