/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author DELL
 */
public class StreamApiDemo {
    public static void main(String[] args) {
//        List<Integer> list1=List.of;
     List<Integer> list1=new ArrayList<>();
//        List<
list1.add(12);
list1.add(34);
list1.add(23);
list1.add(78);

List<Integer> list3=Arrays.asList(23,567,12,677,24);
   Stream<Integer> stream=list1.stream(); 
   List<Integer> newlist=stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newlist);
        
        Stream<Object> emptyStream=Stream.empty();
        emptyStream.forEach(e->{
            System.out.println(e);
        });
        
        Stream<Object> streambuilder=Stream.builder().build();
        IntStream intstream=Arrays.stream((new int[]{2,4,65,3,564}));
        intstream.forEach(e->{
            System.out.println(e);
        });
         
        intstream.forEach(System.out::println);
        
        Integer integer=list3.stream().max((x,y)-> x.compareTo(y)).get();
    }
}
