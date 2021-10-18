package HW4;

import java.util.*;

class HomeWork3 {

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Work", "Car", "Home",
                "Flour", "House", "Car",
                "Oleg", "Car", "Java",
                "Work", "Deadline", "Flour",
                "Max", "Beta", "Rat",
                "Cat", "Java", "Oleg", "Java"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("Ivanov", "8999123321");
        directory.add("Ivanov", "8912155326");
        directory.add("Petrov", "8917155552");
        directory.add("Petrov", "8913455672");
        directory.add("Ivanov", "899999999");
        directory.add("Sidorov", "899111111");
        directory.add("Petrov", "89923231999");
        directory.add("Vasechkin", "8888123113");
        directory.add("Sidorov", "8324325234");

        System.out.println(directory.get("Ivanov"));
        System.out.println(directory.get("Petrov"));
        System.out.println(directory.get("Sidorov"));
        System.out.println(directory.get("Vasechkin"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}