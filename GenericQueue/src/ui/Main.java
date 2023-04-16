import dataStructures.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue =new Queue<>();
        System.out.println(queue.isEmpty());
        queue.enqueue(4);
        queue.enqueue(8);
        queue.dequeue();
        System.out.println(queue.front());
    }
}