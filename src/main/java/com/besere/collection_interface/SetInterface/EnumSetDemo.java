/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.besere.collection_interface.SetInterface;

/*
    Method
	
EnumSet - is a specialized Set implementation in Java that is designed specifically for use with enum types. 
    - It is part of the java.util package and provides an efficient way to store and manipulate sets of enum constants.

Key Features of EnumSet:
    Optimized for Enums: - EnumSet is implemented using a bit-vector, making it much more efficient than other Set implementations like HashSet or TreeSet when dealing with enums.
    Fixed Elements: - It can only contain elements of a single enum type.
    Ordered: - Maintains elements in their natural order (as defined in the enum declaration).
    Not Thread-Safe: - It is not synchronized, so if multiple threads access it concurrently, you need external synchronization.

Action Performed:
    allOf(Class<E> elementType)             - Creates an enum set containing all of the elements in the specified element type.
    clone()                                 - Returns a copy of this set.
    complementOf(EnumSetDemo<E> s)              - Creates an enum set with the same element type as the specified enum set, initially containing all the elements of this type that are not contained in the specified set.
    copyOf(Collection<E> c)                 - Creates an enum set initialized from the specified collection. Copy froma another collection
    copyOf(EnumSetDemo<E> s)                    - Creates an enum set with the same element type as the specified enum set, initially containing the same elements (if any).
    noneOf(Class<E> elementType)            - Creates an empty enum set with the specified element type.
    of(E e)                                 - Creates an enum set initially containing the specified element.
    of(E e1, E e2)                          - Creates an enum set initially containing the specified elements.
    of(E first, E… rest)                    - Creates an enum set initially containing the specified elements.
    of(E e1, E e2, E e3)                    - Creates an enum set initially containing the specified elements.
    of(E e1, E e2, E e3, E e4)              - Creates an enum set initially containing the specified elements.
    of(E e1, E e2, E e3, E e4, E e5)        - Creates an enum set initially containing the specified elements.
    range(E from, E to)                     - Creates an enum set initially containing all of the elements in the range defined by the two specified endpoints.

    There are two different internal implementations of EnumSet which are listed below:

        - RegularEnumSet: It uses a single long object to store the elements of the EnumSet. Each bit in the long value represents an enum constant. The size of a long is 64 bits, RegularEnumSet can store up to 64 enum values.
        - JumboEnumSet: It uses an array of long values to store the elements of the EnumSet. The key difference is that JumboEnumSet allows atoring more than 63 values by using multiple long elements to represent a larger set of enum constants.

*/

import java.util.EnumSet;
import java.util.ArrayList;
import java.util.List;

enum Kape{
    ORIGINAL,
    BARAKO,
    CAPPUCCINO,
}

enum Gatas{
    BIRCHTREE,
    SWAK,
}

public class EnumSetDemo {

    public static void main(String args[]) {
      EnumSet<Kape> s1,s2,s3,s4;
      
      s1 = EnumSet.of(Kape.BARAKO,Kape.CAPPUCCINO,Kape.ORIGINAL);
      s2 = EnumSet.allOf(Kape.class);
      s3 = EnumSet.complementOf(s1);
      s4 = EnumSet.range(Kape.BARAKO,Kape.ORIGINAL);
      
        System.out.println("of() => : " + s1);
        System.out.println("allOf() => : " + s2);
        System.out.println("complementOf() => : " + s3);
        System.out.println("range() => : " + s4);
        
        List<Kape> copyOf = new ArrayList<>();
        copyOf.add(Kape.BARAKO);
        copyOf.add(Kape.ORIGINAL);
        
        EnumSet<Kape> s6 = EnumSet.copyOf(copyOf);
        System.out.println("copyOf(Collection) => : " + s6);
        
    }
}
