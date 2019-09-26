package com.lambton;

public class Student {
    int studentID;
    String  nmae;
    public  Student()
    {
        this.studentID = 2;
        this.nmae= "NO Name";
    }
    public Student(int studentID , String name)
    {
        this.studentID=studentID;
        this.nmae=name;
    }

    @Override
    public String toString() {
        return "Student {"+"Student Id = "+studentID +"  Student name = "+ nmae +"}";
    }

    @Override
    public  void finalize() throws Throwable {
        super.finalize();
    }
}
