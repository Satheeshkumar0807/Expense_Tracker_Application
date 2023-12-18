package com.example.javapackage;
//import java.lang.Thread;
//import java.lang.Runnable;
//// A Java program for understanding
//// the joining of threads
//
//// import statement
//
//// The ThreadJoin class is the child class of the class Thread
///*class ThreadJoin extends Thread
//{
//    // overriding the run method
//    public void run()
//    {
//        for (int j = 0; j < 2; j++)
//        {
//            try
//            {
//// sleeping the thread for 300 milli seconds
//                Thread.sleep(300);
//                System.out.println("The current thread name is: " + Thread.currentThread().getName());
//            }
//// catch block for catching the raised exception
//            catch(Exception e)
//            {
//                System.out.println("The exception has been caught: " + e);
//            }
//            System.out.println( j );
//        }
//    }
//}
//
//public class ThreadJoinExample
//{
//    // main method
//    public static void main (String argvs[])
//    {
//
//// creating 3 threads
//        ThreadJoin th1 = new ThreadJoin();
//        ThreadJoin th2 = new ThreadJoin();
//        ThreadJoin th3 = new ThreadJoin();
//
//// thread th1 starts
//        th1.start();
//
//// starting the second thread after when
//// the first thread th1 has ended or died.
//        try
//        {
//            System.out.println("The current thread name is: "+ Thread.currentThread().getName());
//
//// invoking the join() method
//            th1.join();
//        }
//
//// catch block for catching the raised exception
//        catch(Exception e)
//        {
//            System.out.println("The exception has been caught " + e);
//        }
//
//// thread th2 starts
//        th2.start();
//
//// starting the th3 thread after when the thread th2 has ended or died.
//        try
//        {
//            System.out.println("The current thread name is: " + Thread.currentThread().getName());
//            th2.join();
//        }
//
//// catch block for catching the raised exception
//        catch(Exception e)
//        {
//            System.out.println("The exception has been caught " + e);
//        }
//
//// thread th3 starts
//        th3.start();
//    }
//}
//*/
//class First{
//    public void display(String msg) {
//        System.out.print ("["+msg);
//        try {
//            Thread.sleep(1000);
//        }
//        catch(InterruptedException e){
//            e.printStackTrace();
//        }
//        System.out.println ("]");
//    }
//}
//class Second extends Thread{
//    String msg;
//    First fobj;
//    Second (First fp,String str){
//        fobj = fp;
//        msg = str;
//        start();
//    }
//    public void run(){
//        synchronized(fobj) {
//            fobj.display(msg);
//        }
//    }
//}
//public class ThreadJoinExample{
//    public static void main (String[] args){
//        First fnew = new First();
//        Second ss = new Second(fnew, "welcome");
//        Second ss1= new Second(fnew,"new");
//        Second ss2 = new Second(fnew, "programmer");
//    }
//}
//
//
class InvalidAgeException  extends Exception
{
    public InvalidAgeException (String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}

// class that uses custom exception InvalidAgeException
public class ThreadJoinExample
{

    // method to check the age
    static void validate (int age){
        try {
            if (age < 18) {

                // throw an object of user defined exception
                throw new InvalidAgeException("age is not valid to vote");
            } else {
                System.out.println("welcome to vote");
            }
        }
        catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
    }

    // main method
    public static void main(String args[])
    {

            // calling the method
            validate(13);

        /*catch (InvalidAgeException ex)
        {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex.toString());
        }*/

        System.out.println("rest of the code...");
    }
}
