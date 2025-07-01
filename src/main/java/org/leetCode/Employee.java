package org.leetCode;

import java.util.List;

public class Employee {

    public int id;
    public String name;
    public Double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public String department;

    public String getDepartment() {
        return department;
    }

    public Employee(String department, Double salary, String name, int id) {
        this.department = department;
        this.salary = salary;
        this.name = name;
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(String name, int id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public List<String> address;
}
