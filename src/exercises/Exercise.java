package exercises;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise {
    /*
    1.Write a static void method that accepts the int variable as a formal parameter.
     If the variable int has a value of 1, print the value "Monday",
     if it has a value of 2, print the value "Tuesday" , etc., so that we can display
     all the days of the week based on the numbers from 1 to 7.
     If the number is not in the range 1-7, then print the message "Invalid number
     of day!».
     */
    public static void getDay(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number of day!");
        }
    }
   /*
   2. Write a method that will take a String as a parameter and will print the value String,
    where for each character in the original there are three characters*/

    public static void tripleString(String original) {
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < original.length(); i++) {
            char x = original.charAt(i);
            newWord.append(String.valueOf(x).repeat(3));
        }
        System.out.println(newWord);
    }
    /*
    3.Given an int array, output true if the array contains 3 next to 3 somewhere.Use the for loop.*/

    public static boolean find33(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 3 && arr[i - 1] == 3) {
                return true;
            }
        }
        return false;
    }

    /*
    4. Given a map of food keys and topping values, modify and return the map as follows:
    if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread"
    to have the value "butter".*/

    public static Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }

    /*
    5.Modify and return the given map as follows: if the keys “a” and “b” are both in the map and have
    equal values, remove them both.*/
    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    /* 6. Given a list of integers, return a list where each integer is multiplied by 2.*/
    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    /* 7.
    Given a list of strings, return a list where each string is replaced by 3 copies of the string
    concatenated together.*/
    public static List<String> copies3(List<String> strings) {
        strings.replaceAll(n -> n + n + n);
        return strings;
    }

    /* 8.
    Given a list of non-negative integers, return an integer list of the rightmost digits. */
    public static List<Integer> rightDigit(List<Integer> num) {
        num.replaceAll(n -> n % 10);
        return num;
    }

    /* 9.Given a list of integers, return a list of the integers, omitting any that are less than 0.*/
    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(n -> n >= 0).collect(Collectors.toList());
    }
}