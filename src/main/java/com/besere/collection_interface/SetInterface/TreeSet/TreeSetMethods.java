
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.SetInterface.TreeSet;

import java.util.TreeSet;

/*
                
Method                                                              Description
add(Object o)                                               This method will add the specified element according to the same sorting order mentioned during the creation of the TreeSet. Duplicate entries will not get added.
addAll(Collection c)                                        This method will add all elements of the specified Collection to the set. Elements in the Collection should be homogeneous otherwise ClassCastException will be thrown. Duplicate Entries of Collection will not be added to TreeSet.
ceiling?(E e)                                               This method returns the least element in this set greater than or equal to the given element, or null if there is no such element.
clear()                                                     This method will remove all the elements.
clone()                                                     The method is used to return a shallow copy of the set, which is just a simple copied set.
Comparator comparator()                                     This method will return the Comparator used to sort elements in TreeSet or it will return null if the default natural sorting order is used.
contains(Object o)                                          This method will return true if a given element is present in TreeSet else it will return false.
descendingIterator?()                                       This method returns an iterator over the elements in this set in descending order.
descendingSet?()                                            This method returns a reverse order view of the elements contained in this set.
first()                                                     This method will return the first element in TreeSet if TreeSet is not null else it will throw NoSuchElementException.
floor?(E e)                                                 This method returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
headSet(Object toElement)                                   This method will return elements of TreeSet which are less than the specified element.
higher?(E e)                                                This method returns the least element in this set strictly greater than the given element, or null if there is no such element.
isEmpty()                                                   This method is used to return true if this set contains no elements or is empty and false for the opposite case.
Iterator iterator()                                         Returns an iterator for iterating over the elements of the set.
last()                                                      This method will return the last element in TreeSet if TreeSet is not null else it will throw NoSuchElementException.
lower?(E e)                                                 This method returns the greatest element in this set strictly less than the given element, or null if there is no such element.
pollFirst?()                                                This method retrieves and removes the first (lowest) element, or returns null if this set is empty.
pollLast?()                                                 This method retrieves and removes the last (highest) element, or returns null if this set is empty.
remove(Object o)                                            This method is used to return a specific element from the set.
size()                                                      This method is used to return the size of the set or the number of elements present in the set.
spliterator()                                               This method creates a late-binding and fail-fast Spliterator over the elements in this set.
subSet(Object fromElement, Object toElement)                This method will return elements ranging from fromElement to toElement. fromElement is inclusive and toElement is exclusive.
tailSet(Object fromElement)                                 This method will return elements of TreeSet which are greater than or equal to the specified element.

*/
public class TreeSetMethods {

    public static void main(String args[]) {
      TreeSet<Object> tree = new TreeSet<>();
      tree.add("Mouse");
      tree.add("Keyboard");
      
        System.out.println("tree => " + tree);
       
        TreeSet<Integer> tree2 = new TreeSet<>();
        tree2.add(1);
        tree2.add(2);
        System.out.println("addAll() => " + tree.addAll(tree2));

    }
}
