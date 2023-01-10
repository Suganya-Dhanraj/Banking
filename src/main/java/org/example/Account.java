package org.example;

public class Account {
     static String name;
     static int age;

    public static void main(String[] args) {
        Account a = new Account();
        a.setAge(30);
        a.setName("Suganya");
        System.out.println(a.getName());
        System.out.println(a.getAge());
        a.printDetails();

    }
    public void setName(String name) {
        this.name=name;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public static void printDetails() {
        System.out.println(name+","+age);
    }
}