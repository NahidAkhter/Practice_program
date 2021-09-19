package linkedList;

import java.sql.SQLOutput;

public class Main {

    static int n, sum;
    public static void main(String[] args) {

        Nod head = new Nod(0);
        Nod first = new Nod(2);
        Nod second = new Nod(4);
        Nod third = new Nod(8);
        Nod fourth = new Nod(11);
        Nod fifth = new Nod(16);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

       // traverse(head);


    }

    static void sumofLastnNodes(Nod head){

        if(null == head)
            return;

        sumofLastnNodes(head.next);

        if(n > 0)
        {
            sum = sum + head.value;
            --n;
        }


    }

    static void traverse(Nod node){
        while(null !=node){
            System.out.print(node.value + " ");
            node = node.next;

        }

    }


}

class Nod {

    int value;
    Nod next;

    Nod(int actualValue) {
        value = actualValue;
        next = null;
    }

}