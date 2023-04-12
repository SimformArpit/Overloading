package com.Employee;

public class OverloadingMain {
    public static void main(String[] args) {
        Employee Employee1 = new Employee();
        Employee1.empInfo("Arpit");
        Employee1.empInfo(21);
        Employee1.empInfo("Arpit" , 21 , 40000);

        System.out.println();
        Employee Employee2 = new Employee();
        Employee1.empInfo("Parth");
        Employee1.empInfo(23);
        Employee1.empInfo("Parth" , 23 , 40000);

    }
}
