package Prob1;

public class ArrayQueueImplTest {
    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println("1. Queue : " + queue);

        queue.dequeue();
        queue.dequeue();
        System.out.println("2. Queue after call dequeue 2 times: " + queue);

        queue.enqueue(70);
        queue.enqueue(80);
        System.out.println("3. Queue after call enqueue 2 times: " + queue);

        System.out.println("4. Peek the queue: " + queue.peek());
        System.out.println("5. Queue size: " + queue.size());

    }
}
