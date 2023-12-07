package ru.job4j.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRunner {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        System.out.println(queue.element());
    }

}
