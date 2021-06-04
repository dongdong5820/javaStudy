package com.oop;

public class EmployeeTest {
    public static void main(String[] args) {
        // 使用构造器创建两个对象
        Employee emp1 = new Employee("Jack");
        Employee emp2 = new Employee("Tom");

        // 调用这两个对象的成员方法
        emp1.empAge(26);
        emp1.empDesignation("高级程序员");
        emp1.empSalary(1000);
        emp1.printEmployee();

        emp2.empAge(21);
        emp2.empDesignation("菜鸟程序员");
        emp2.empSalary(500);
        emp2.printEmployee();
    }
}
