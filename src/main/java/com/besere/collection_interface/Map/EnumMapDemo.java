
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.Map;

import java.util.EnumMap;
import java.util.Map.Entry;


/*
    - EnumMap is a specialized Map in Java that is optimized for using enums as keys. It is faster and more memory-efficient than a HashMap because it internally uses an array indexed by the ordinal values of the enums.

    Breaking it Down with an Analogy
        - Imagine you run a school cafeteria that serves different meal types on specific days.

        You need a way to store the meal assigned to each day.
        Since there are only a fixed number of days in a week, we can use an enum as the key and store the meal name as the value.
        A normal HashMap<Day, String> would work, but an EnumMap<Day, String> is much better because it is optimized for enum keys.
        
        - EnumMap does not use hashing.

        - When Should You Use EnumMap?
        - When your keys are enums (e.g., days of the week, statuses, fee types, user roles).
        - When you need better performance than HashMap.
        - When you want to save memory.

*/

public class EnumMapDemo {
    
    enum Days{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY
    }
    
    public static void main(final String args[]) {
        
        final EnumMap<Days,String> enumSet = new EnumMap<>(Days.class);
        
        enumSet.put(Days.MONDAY, "It's Monday!");
        enumSet.put(Days.TUESDAY, "It's Tuesday!");
        enumSet.put(Days.WEDNESDAY, "It's Wednesday!");
        enumSet.put(Days.THURSDAY, "It's Thursday!");
        enumSet.put(Days.FRIDAY, "It's Friday!");
        
        for (final Entry<Days, String> entry : enumSet.entrySet()) {
            System.out.println("Key -> " + entry.getKey() + "=>"+ entry.getValue());
        }
        
        final EnumMap<Days,String> enumSet2 = new EnumMap<>(Days.class);
        enumSet2.put(Days.MONDAY,"Pasta");
        enumSet2.put(Days.TUESDAY,"Chicken Rice");
        enumSet2.put(Days.WEDNESDAY,"Vegetable Soup");
        enumSet2.put(Days.THURSDAY,"Fish Curry");
        enumSet2.put(Days.FRIDAY,"Burger");
       
        for (Entry<Days, String> entry : enumSet2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        
        
        
    }
}
