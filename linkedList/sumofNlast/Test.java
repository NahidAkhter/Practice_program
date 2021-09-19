package linkedList.sumofNlast;

public class Test {

    static Node head;
    static int n, sum;

    static class Node
    {
        int data;
        Node next;
    };

    static void push(Node head_ref, int new_data)
    {
        Node new_node = new Node();
        new_node.data = new_data;

        new_node.next = head_ref;
        head_ref = new_node;
        head = head_ref;
    }

    static void sumOfLastN_Nodes(Node head)
    {
        if (head == null)
            return;

        // recursively traverse the remaining nodes
        sumOfLastN_Nodes(head.next);

        if (n > 0)
        {
            sum = sum + head.data;
            --n;
        }
    }

    static int sumOfLastN_NodesUtil(Node head, int n)
    {
        if (n <= 0)
            return 0;
        sum = 0;
        sumOfLastN_Nodes(head);
        return sum;
    }

    // Driver Code
    public static void main(String[] args)
    {
        head = null;

        // create linked list 10.6.8.4.12
        push(head, 12);
        push(head, 4);
        push(head, 8);
        push(head, 6);
        push(head, 10);


        n = 2;
        System.out.print("Sum of last " + n +
                " nodes = " +
                sumOfLastN_NodesUtil(head, n));

    }
}
