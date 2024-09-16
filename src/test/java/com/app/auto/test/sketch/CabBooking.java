package com.app.auto.test.sketch;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@FunctionalInterface
interface Cab{
    public String bookCab(String source, String destination);
}

public class CabBooking {

    public static void main(String[] args) {


        Cab cab = (source , destination )->{
            System.out.println("Cab booked for "+source
                    +destination);
            return ("Price for booking cab"+500 +"INR");
        };


        HashMap<String,String> stringStringHashMap = new HashMap<>( );

        stringStringHashMap.put(new Faker().name().firstName(),new Faker().name().lastName());
        stringStringHashMap.put(new Faker().name().firstName(),new Faker().name().lastName());
        stringStringHashMap.put(new Faker().name().firstName(),new Faker().name().lastName());
        stringStringHashMap.put(new Faker().name().firstName(),new Faker().name().lastName());
        stringStringHashMap.put(new Faker().name().firstName(),new Faker().name().lastName());


       /* stringStringHashMap.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(stringStringHashMap.size());
                System.out.println("FirstName "+s+"LastName "+s2);
            }
        });
*/

        List<String> arraysString = Arrays.asList(getFakeName(),getFakeName(),getFakeName(),getFakeName());

        List<String>longNames=arraysString.stream().filter(string->string.length()>5 && string.length()<8).collect(Collectors.toList());

        System.out.println(longNames);

        arraysString.stream().filter(p->p!=null).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

         arraysString.stream().map(name->name.toUpperCase()).collect(Collectors.toList()).forEach(new Consumer<String>() {
             @Override
             public void accept(String s) {
                 System.out.println(s);
             }
         });

        Map<Integer,String> practise = new HashMap<>();

        practise.put(getNumberId(),getFakeName());
        practise.put(getNumberId(),getFakeName());
        practise.put(getNumberId(),getFakeName());
        practise.put(getNumberId(),getFakeName());
        practise.put(getNumberId(),getFakeName());
        practise.put(getNumberId(),getFakeName());



    }


    public static String getFakeName (){
        return new Faker().name().firstName();
    }



    public static Integer getNumberId (){
        return new Faker().number().randomDigit();
    }
}
