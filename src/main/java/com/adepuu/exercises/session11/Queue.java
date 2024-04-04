package com.adepuu.exercises.session11;

class QueueNode {
    int data;
    QueueNode next;

    public QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Queue {
    private QueueNode front;
    private QueueNode rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Error: Queue is empty");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Error: Queue is empty");
            return -1;
        }
        return front.data;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Front element: " + queue.peek());

        System.out.println("Dequeued element: " + queue.dequeue());

        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Size of queue: " + queue.size());
    }

    public int size() {
        int count = 0;
        QueueNode current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
