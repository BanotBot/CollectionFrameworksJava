
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/*
    Set Interface is present in java.util package and extends the Collection interface. It is an unordered collection of objects in which duplicate values cannot be stored. It is an interface that implements the mathematical set. This interface adds a feature that restricts the insertion of the duplicate elements.
       - No Specific Order: Does not maintain any specific order of elements (Exceptions: LinkedHashSet and TreeSet).
       - Allows One Null Element: Most Set implementations allow a single null element.
       - Implementation Classes: HashSet , LinkedHashSet and TreeSet.
       - Thread-Safe Alternatives: For thread-safe operations, use ConcurrentSkipListSet or wrap a set using Collections.synchronizedSet().

    Intersection: This operation returns all the common elements from the given two sets. For the above two sets, the intersection would be:
    Union: This operation adds all the elements in one set with the other. For the above two sets, the union would be: 
    Difference: This operation removes all the values present in one set from the other set. For the above two sets, the difference would be: 




1. HashSet
    Ordering: Unordered; does not maintain insertion order.
    Implementation: Uses a hash table for storage.
    Performance: Fastest for most operations (O(1) for add, remove, and contains in average case).
    Use Case: When you need a fast Set and don’t care about element order.
2. TreeSet
    Ordering: Sorted in natural order (or custom order if a Comparator is provided).
    Implementation: Uses a Red-Black tree (self-balancing binary search tree).
    Performance: O(log n) for add, remove, and contains.
    Use Case: When you need a sorted set of unique elements.
3. LinkedHashSet
    Ordering: Maintains insertion order.
    Implementation: Uses a hash table + doubly linked list.
    Performance: O(1) for add, remove, and contains (slightly slower than HashSet due to maintaining order).
    Use Case: When you need predictable iteration order while still having good performance.

*/

package com.besere.collection_interface.SetInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class SetSample {

    public static void main(String args[]) {
        // TODO code application logic here
        Set<String> set = new HashSet<>();
        set.add("Ivan Dave");
        set.add("Corolla");
        set.add("Mitsubishi");
        set.add("Honda");
       
        System.out.println(set);
        
        //Operations that can be used in the Set Interface
        System.out.println();
        
        // set 1
        Set<Integer> nset = new HashSet<>();
        nset.addAll(Arrays.asList(
                new Integer[]{1,2,3,4,5,6,7,10}
        ));
        // set 2
        Set<Integer> nset2 = new HashSet<>();
        nset2.addAll(Arrays.asList(
                new Integer[]{1,2,3,4,5,6,7,8}
        ));
        
        //Union
        Set<Integer> union = new HashSet<>(nset);
        union.addAll(nset2);
        System.out.println("Union of the Set : " + union);
        
        //Intersection
        Set<Integer> intersec = new HashSet<>(nset);
        intersec.retainAll(nset2);
        System.out.println("Intersection : " + intersec);
        
        //symmetric difference
        Set<Integer> diff = new HashSet<>(nset);
        diff.removeAll(nset2);
        System.out.println("The difference of the two set : " + diff);
        
        
    }
}
