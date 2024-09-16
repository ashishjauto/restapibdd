package com.app.auto.test.sketch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class SketchCollections {

    public static void main(String[] args) {


        List<Integer> integerList = new ArrayList<>();

        integerList.add(21);
        integerList.add(2);
        integerList.add(3);

        Collections.swap(integerList, 1, 2);

        integerList.forEach(s -> System.out.println(s));

        System.out.println("After swap");

        Collections.sort(integerList);

        System.out.println("Reverse");

        integerList.forEach(s -> System.out.println(s));


        LinkedList<Integer> linkedList = new LinkedList();

        linkedList.add(34);
        linkedList.add(55);
        linkedList.add(81);

        linkedList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer +" Square " +integer*integer);


            }
        });

    }





}
