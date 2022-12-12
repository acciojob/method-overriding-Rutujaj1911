package com.driver;

public class Main {

    public static class A{
        public String meth(){
            return "Invoking methods from class A";
        }
    }
    public static class B extends A{
        @Override
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args){
        A obj=new A();
        obj.meth();
        B obj1 = new B();
        obj1.meth();
    }
}