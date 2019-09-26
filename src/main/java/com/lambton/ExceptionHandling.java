package com.lambton;

public class ExceptionHandling {
    public static void main(String[] args)
    {
        int a=100;
        int b=0;
        int  c ;
        int x[]={1,2,3};
        Student s1=new Student();

        System.out.println("START");
        try {
            System.out.println(s1.toString());
            x[2]=100;
            c= a/b;
            System.out.println("C  :" + c);
        }
        catch (ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Array X is trying access index not available");

        }
        catch (ArithmeticException ae)
        {
            System.out.println("Value of b = 0, Divisible by ZERO error");
        }
        catch (Exception ae)
        {
            System.out.println((ae.toString()));
        }
        finally {
            System.out.println("I am in finally block");
        }


        System.out.println("END");

    }
}
