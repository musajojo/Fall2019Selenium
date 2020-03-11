package com.officeHours;

import java.util.*;

public class SeleniumOH4_20200311 {

    public static void main(String[] args) {
        /*
            Under List Interface:
            - ArrayList (indexes, faster to read, slower when we
            do manipulations(remove or add elements))
            - Vector (same as ArrayList, but thread safe)
                - Stack (Last in First out (like a stack of paper))
            - LinkedList (node (each element reference to previous
            and next element in the list))
            (performance-sensitive, memory allocation)
            [2, 5, 3] -> [2, 3]
            [2] [5] [3]
         */
        /*
            Set Interface: (contain only unique values)
            HashSet: no indexes - faster because it is using hashing
            (it does not keep an order), allows 1 null
            TreeSet: sorted set - no nulls
            LinkedHashSet: keeps the order
         */
        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (String each : Arrays.asList("Value5", "Value1", "Value3")){
            hashSet.add(each);
            treeSet.add(each);
            linkedHashSet.add(each);
        }
        System.out.println("hashset: " + hashSet);
        System.out.println("treeset: " + treeSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        Iterator<String> iteratorSet = hashSet.iterator();
        while (iteratorSet.hasNext()){
            System.out.println(iteratorSet.next());
        }
        ArrayList<Integer> dropdown = new ArrayList<>();
        dropdown.add(1);
        dropdown.add(2);
        dropdown.add(3);
        dropdown.add(4);
        dropdown.add(5);
        dropdown.add(1);
        //[1, 2, 3, 4, 5, 1]
        System.out.println("list: " + dropdown);
        HashSet <Integer> optionsSet = new HashSet<>(dropdown);
        System.out.println("optionSet: " + optionsSet);
        if (optionsSet.size() == dropdown.size()){
            System.out.println("expected is the same as actual");
        }else {
            System.out.println("options contains duplicates");
        }
        //=========================
        /*
            Queue:
            - PriorityQueue - First in first out
                can accept duplicates, does not have index
            - ArrayDequeue - special in adding and removing
         */
        PriorityQueue <String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("John");
        priorityQueue.add("Kate");
        priorityQueue.add("Tom");
        System.out.println("Queue: " + priorityQueue);
        System.out.println("peek: " + priorityQueue.peek());
        //peeking (.peek()) - it will check and return the first in a queue
        System.out.println("queue after peek: " + priorityQueue);
        System.out.println("poll: "+priorityQueue.poll());
        System.out.println("queue after poll: " + priorityQueue);
        //polling will return the first value in a queue and remove it
        ArrayDeque <String> deque = new ArrayDeque<>();
    }
}

/*
Nurullah Durmaz
Locators -- Office Hour Notes 3/9/2020

Locators
​
<button class="btn btn-primary" onclick="button1()">Button 1</button>
​
(red) <button>  --> tags
​
(Orange) class, onclick, value  --> attributes
​
(Green) "btn btn-primary", "button1()" --> value
​
(Grey) Button 1 ---> Text
​
Example:
<div id="page-footer" class="row">
​
  Tags --> <div>
    Attributes --> id, class
    Values --> "page-footer", "row"
​
  ****  attribute = "value" ****
​
Most cases a locator will require to be unique.
​
Text is between the 'opening' and 'closing' tag
​
8 Locators:
 1. id  (attribute)
 2. tagName (tag)
 3. className (class)(attribute)
 4. name
 5. linkText
 6. partialLinkText
 7. Xpath
 8. cssSelector
​
 Which one to choose?
 1. id
 2. cssSelector
 3. Xpath
​
​
 LinkText {
   <a href="www.google.com">Autocomplete</a>
   Tag --> <a>
     Attribute --> href
     Value -->"/autocomplete"
     Text --> Autocomplete
​
     <a></a> --> This is the tag for link
     href --> url, endpoint for navigation
​
     For linkText we have to use the whole text --> "Autocomplete"

 }
​
 partialLinkText {
   <a href="www.google.com">Autocomplete</a>
   We only need a portion of the text
   Portion of text --> "Auto"
​
   <a href="/javascript_error">JavaScript onload event error</a>
​
   linkText --> "JavaScript onload event error"
   partialLinkText --> "onload"
   partialLinkText --> "JavaScript"
   partialLinkText --> "event"
 }
​
​
 className  vs name {
​
   <button class="btn btn-primary" onclick="button2()"
           name="button2">Button 2</button>
           Tag --> button
           Attributes --> class, onclick, name
           Value --> "button2", "button2()", "btn btn-primary"
​
           className Locator will find element with --> class attribute
           name locator will find the element with --> name attribute
 }
​
​
 Xpath {
   1. Absolute Xpath (this is not recommend)
    begin with single slash
        /
        Found the first button with absolute Xpath
        /html/body/div/div[2]/div/div[1]/button[1]

   2. Relative Xpath
      begins with double slash
      //

 }
 */
