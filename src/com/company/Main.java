package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s1=new Student("zhangsan");
        s1.setAge(12);
        s1.setGender("男");
        s1.setID_NO("12345");
        System.out.printf("%s %s %s %s","name="+s1.getName(),"ID_NO="+s1.getID_NO(),"gender="+s1.getGender(),"age="+s1.getAge());
    }
}
class Student {
    public String name; // member variable
    private int age; // member variable
    private String gender ;
    private String ID_NO;

    // constructor method
    public Student(String name) {
        this.name = name;
    }
    // member method
    public String getName() {
        return name;
    }

    // member method
    public void setName(int age) {
        this.name = name;
    }
    // member method
    public int getAge() {
        return age;
    }

    // member method
    public void setAge(int age) {
        this.age = age;
    }
    // member method
    public String getGender() {
        return gender;
    }

    // member method
    public void setGender(String gender) {
        this.gender = gender;
    }
    // member method
    public String getID_NO() {
        return ID_NO;
    }

    // member method
    public void setID_NO(String ID_NO) {
        this.ID_NO = ID_NO;
    }
}

