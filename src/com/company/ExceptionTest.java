package com.company;

public class ExceptionTest {
    public static void main(String[] args){
//        try{
//            new MyException();
//        }catch (Exception e){
//            System.out.println(e);
//        }
        ExceptionTest obj = new ExceptionTest();
        obj.throwTest();
    }
    public static void throwsTest() throws ArithmeticException{
        System.out.println("runtest running");
    }
    public void throwTest(){
        try {
            throw new Exception("This is my exception thrown here");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//class MyException extends Exception{
//    public MyException(){
//        throw new Exception("This is my exception thrown here");
//    }
//}
