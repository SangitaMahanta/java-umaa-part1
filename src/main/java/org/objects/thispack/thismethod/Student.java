package org.objects.thispack.thismethod;

public class Student {
    private String name;
    private String address;
    private int rollNo;
    private String className;


    Student(String name)
    {
       //This constructor is called by using of this keyword
        System.out.println("The name of Student = " + name);
    }


    Student(String name, int rollNo, String className,String address)
    {
        this(name);
        this.name = name;
        this.rollNo = rollNo;
        this.className = className;
        this.address = address;
        studentInfo();
        studentInfo(this);
    }


    public void studentInfo()
    {
        System.out.println("Name = "+ name);
        System.out.println("RollNo = "+ rollNo);
        System.out.println("Class Name  = "+ className);
        System.out.println("Address  = "+ address);
    }

    public void studentInfo(Student t1)
    {
        System.out.println("Name of Student= "+ t1.name);
        System.out.println("Address  of Student= "+ t1.address);
    }
}
