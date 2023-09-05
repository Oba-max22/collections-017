package org.example;


import org.example.book.Book;
import org.example.book.BookPriceComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 2, 8, 3, 5, 6, 4, 7, 9, 1};
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        int k = 4;
        // get items at index
        System.out.println(arr[k]);

        // search items without index
        // linear search -> O(n) linear time complexity
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.println("k was found at index :: " + i);
            }
        }

        // Binary search -> (O log(n)) logarithmic time complexity

        // sort array
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, k));

        // copy / clone array
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        int[] otherArr = Arrays.copyOf(arr, arr.length);
        int[] subArr = Arrays.copyOfRange(arr, 0, 5);
        int[] subArr2 = new int[6];
        System.arraycopy(arr, 2, subArr2, 0, 6);

        int[] clonedArr = arr.clone();
        System.out.println("cloned :: " + Arrays.toString(clonedArr));
        System.out.println(Arrays.toString(subArr));
        System.out.println(Arrays.toString(subArr2));

        List<String> list = new ArrayList<>();

        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");

        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // getting items at index
        list.get(1);

        // searching for index of item provided
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase("wednesday")) {
                System.out.println(i);
            }
        }

        // sorting list
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, "Wednesday"));


        // convert an array into a list?
        Integer[] intArr = {0,1,4,6};
        List<Integer> convertedFromArr = Arrays.asList(intArr);

        // convert a list into an array?
//        Integer[] convertedFromList = (Integer[]) convertedFromArr.toArray();


        // What is the difference between a TreeSet, HashSet and LinkedHashSet?

        int[] oArr = { 0, 0, 8, 3, 3, 6, 1, 7, 9, 1}; // remove duplicates

        Set<Integer> set = new HashSet<>();

        // Hashset can accept only one null value
        set.add(null);

        for (int item: oArr) {
            set.add(item);
        }

        System.out.println(set);

        List<Integer> listFromSet = new ArrayList<>(set);
        System.out.println(listFromSet);


        Map<Integer, Integer> freqMap = new HashMap<>();
        // find the frequency of items in a given array : oArr above

//        freqMap.put(1, 3);
//        System.out.println(freqMap.get(1));

        for (int i = 0; i < oArr.length; i++) {
//            if (freqMap.containsKey(oArr[i])) {
//                freqMap.put(oArr[i], freqMap.get(oArr[i]) + 1);
//            } else  {
//                freqMap.put(oArr[i], 1);
//            }

            freqMap.put(oArr[i], freqMap.getOrDefault(oArr[i], 0) + 1);
        }

        freqMap.forEach((key, val) -> System.out.println(key + " :: " + val));

        for(Map.Entry<Integer, Integer> item: freqMap.entrySet()) {
            System.out.println(item.getKey() + " :: " + item.getValue());
        }

        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("kenneth", "08039841133");
        phonebook.put("ebube84", "09034988422");
        phonebook.put("ebube", "09034988431");
        phonebook.put("davinci", "07048482912");

        System.out.println(phonebook.get("ebube84"));

        GenericDataHolder<int[]> dataHolder = new GenericDataHolder<>("Holding an array with duplicates.", oArr);
        GenericDataHolder<?> anotherDataHolder = new GenericDataHolder<>("Holding a list.", listFromSet);

        System.out.println(dataHolder);
        System.out.println(anotherDataHolder);

        Stack<String> stack = new Stack<>(); // LIFO - FILO
        stack.push("Red");
        stack.push("Green");
        stack.push("Blue");

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        Queue<String> stringQueue = new PriorityQueue<>(); // FIFO
        stringQueue.add("White");
        stringQueue.add("Grey");
        stringQueue.add("Black");
        stringQueue.add("Yellow");

//        for (String item: stringQueue) {
//            int n = Arrays.stream(item.split("")).map(s -> s.toCharArray()[0])
//                    .reduce((a, b) -> (char) (a + b)).get();
//            System.out.println(item + " : " + n);
//        }

        System.out.println(stringQueue);

        // Comparable or Comparator
        Queue<Book> bookQueue = new PriorityQueue<>(new BookPriceComparator()); // FIFO

        Book firstBook = new Book("Chinua Achebe", "Things Fall Apart", 4999.99);
        Book secondBook = new Book("Frank Edwards", "Half Of A Yellow Sun", 5999.99);
        Book thirdBook = new Book( "Chimamanda Adichie",  "Purple Hibiscus", 3999.99);

        bookQueue.add(firstBook);
        bookQueue.add(secondBook);
        bookQueue.add(thirdBook);

        System.out.println(bookQueue);
    }
}