package exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
        //1.
        Exercise.getDay(7);
        //2.
        Exercise.tripleString("Hello");
        //3.
        System.out.println(Exercise.find33(new int[]{23, 17, 5, 3, 3, 4, 8, 9, 15}));
        System.out.println(Exercise.find33(new int[]{23, 17, 5, 3, 4, 8, 9, 15}));
        //4.
        Map<String, String> map = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        map.put("ice cream", "peanuts");
        map2.put("pancake", "syrup");
        System.out.println(Exercise.topping1(map));
        System.out.println(Exercise.topping1(map2));
        //5.
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "aaa");
        map3.put("c", "cake");
        System.out.println(Exercise.mapAB2(map3));
        //6.
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(Exercise.doubling(nums));
        //7.
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("bb");
        strings.add("ccc");
        System.out.println(Exercise.copies3(strings));
        //8.
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(22);
        num.add(93);
        System.out.println(Exercise.rightDigit(num));
        //9.
        List<Integer> num2 = new ArrayList<>();
        num2.add(1);
        num2.add(-1);
        num2.add(0);
        num2.add(10);
        num2.add(-3);
        System.out.println(Exercise.noNeg(num2));
    }

}

