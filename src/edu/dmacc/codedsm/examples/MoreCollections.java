package edu.dmacc.codedsm.examples;

import java.util.*;

public class MoreCollections {

    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();
        fillList(myArrayList);
        LinkedList<String> myLinkedList = new LinkedList<String>();
        fillList(myLinkedList);

        long startTimeArray = System.currentTimeMillis();
        String arrayElement = myArrayList.get(5000000);
        long endTimeArray = System.currentTimeMillis();
        long elapsedArray = endTimeArray - startTimeArray;
        System.out.println("elapsedArray = " + elapsedArray);

        long startTimeLinked = System.currentTimeMillis();
        String linkedElement = myLinkedList.get(5000000);
        long endTimeLinked = System.currentTimeMillis();
        long elapsedLinked = endTimeLinked - startTimeLinked;
        System.out.println("elapsedLinked = " + elapsedLinked);

        Queue<PlainOldObject> myObjectQueue = new LinkedList<PlainOldObject>();
        myObjectQueue.add(new PlainOldObject("Mary", 35));
        System.out.println("myObjectQueue.peek() = " + myObjectQueue.peek());
        System.out.println("myObjectQueue.remove() = " + myObjectQueue.remove());
        System.out.println("myObjectQueue.size() = " + myObjectQueue.size());

        Set<PlainOldObject> myObjectSet = new HashSet<PlainOldObject>();
        myObjectSet.add(new PlainOldObject("Stan", 27));
        myObjectSet.add(new PlainOldObject("Stan", 27));
        System.out.println("myObjectSet.size() = " + myObjectSet.size());

        Stack<PlainOldObject> myObjectStack = new Stack<>();
        myObjectStack.push(new PlainOldObject("Jess", 45));
        System.out.println("myObjectStack.peek() = " + myObjectStack.peek());
        System.out.println("myObjectStack.pop() = " + myObjectStack.pop());
        System.out.println("myObjectStack.size() = " + myObjectStack.size());

        Map<String, PlainOldObject> myObjectMap = new HashMap<>();
        myObjectMap.put("A", new PlainOldObject("Nate", 40));
        myObjectMap.put("B", new PlainOldObject("Bob", 20));
        for (String key : myObjectMap.keySet()) {
            System.out.println(key + " = " + myObjectMap.get(key));
        }
        System.out.println("myObjectMap.size() = " + myObjectMap.size());
    }

    public static void fillList(List<String> list) {
        for (int i = 0; i < 10000000; i++) {
            list.add("AString");
        }
    }
}
