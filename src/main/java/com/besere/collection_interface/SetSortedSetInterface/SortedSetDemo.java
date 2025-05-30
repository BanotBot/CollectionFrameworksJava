
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.SetSortedSetInterface;

/*
    - The SortedSetDemo interface in Java is a member of the Java Collections Framework and extends the Set interface.
    Important Key Points about the SortedSetDemo Interface

Here are some key points about the SortedSetDemo interface: 
Sorting: 
    SortedSetDemo is a Set that maintains its elements in ascending order. The sorting can be based on either natural order or it can be customized through a comparator at SortedSetDemo creation time. 
Ordering: 
    Elements inserted into the SortedSetDemo need to implement the Comparable interface. The elements are ordered by using their compareTo() method unless a Comparator is provided at set creation time. 
No Duplicates: 
    Just like any other set, SortedSetDemo doesn't allow duplicates. 
Methods: 
    In addition to standard Set operations, the SortedSetDemo interface provides operations for the following: Range view — allows arbitrary range operations on the sorted set. 
    Endpoints — returns the first or last element in the sorted set. 
Subinterfaces and Implementations: 
    The primary SortedSetDemo implementation in the Java Collections Framework is TreeSet. 
Null Elements: 
    SortedSetDemo implementations (like TreeSet) don't permit the use of null elements, because null is not comparable. 
Use-cases: 
    SortedSetDemo is ideal when you want to store unique elements in a sorted manner. 
Thread Safety: 
    SortedSetDemo implementations are not thread-safe, but you can make them thread-safe using synchronized wrappers obtained from the Collections utility class. 
Iterators: 
    The iterator provided in the SortedSetDemo interface iterates over the elements in the set in ascending order. 
    Head, Tail, and Subsets: 
    The SortedSetDemo interface provides methods to get subsets from the set, which are still sorted according to the set's ordering. 
    Remember, SortedSetDemo is an interface and you cannot instantiate interfaces. Therefore, you need to either use its subclass or a class that implements the SortedSetDemo interface to create an object.


Commonly used methods : 
    E first() – Returns the first (lowest) element.
    E last() – Returns the last (highest) element.
    SortedSetDemo<E> headSet(E toElement) – Returns a view of the portion of the set whose elements are strictly less than toElement.
    SortedSetDemo<E> tailSet(E fromElement) – Returns a view of the portion of the set whose elements are greater than or equal to fromElement.
    SortedSetDemo<E> subSet(E fromElement, E toElement) – Returns a view of the set within the given range. 
        - fromElement – The starting element (inclusive).
        - toElement – The ending element (exclusive).
*/  

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    
    public static void main(String args[]) {
        SortedSet<String> st = new TreeSet<>();
        st.add("x");
        st.add("T");
        st.add("y");
        st.add("K");
        
        System.out.println("st => " + st);
        System.out.println("first() : " + st.first());
        System.out.println("last() : " + st.last());
        System.out.println("headSet() : " + st.headSet("y")); // ija e return ang naka less than 5 , meaning na naka sorted man ang value so 1,3 is less than a 5 in order.
        System.out.println("tailSet() : " + st.tailSet("J")); // opposite in headSet()
       
        SortedSet<String> subset = st.subSet("x","y");
        System.out.println("subset => " + subset);
        
    }
}
