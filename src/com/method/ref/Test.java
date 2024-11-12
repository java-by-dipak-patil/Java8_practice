package com.method.ref;

public class Test {
public static void m2()
{
    System.out.println("test class m2");
}

    public  void m3()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {

  interf i=Test::m2;
  //i.m1();

  Test t=new Test();

  Runnable r=t::m3;
  Thread thread=new Thread(r);
  thread.start();

    }
}
