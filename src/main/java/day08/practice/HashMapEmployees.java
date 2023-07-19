package day08.practice;

import java.util.*;

public class HashMapEmployees {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, Set<String>> departmentEmployees = new TreeMap<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter input like: Hr,Name");
            String str = scan.nextLine();
            if (str == null || "".equals(str)) {
                throw new IllegalArgumentException("Input can't be Empty or Null");
            }

            String[] arrstr = str.split(",");

            if (arrstr.length != 2) {
                throw new IllegalArgumentException("Input must have department and employee name");
            }

            if (departmentEmployees.get(arrstr[0]) == null) {
                departmentEmployees.put(arrstr[0], new TreeSet<>());
                departmentEmployees.get(arrstr[0]).add(arrstr[1]);
            } else {
                departmentEmployees.get(arrstr[0]).add(arrstr[1]);
            }
        }

        System.out.println(departmentEmployees);
        System.out.println();
    }
}
