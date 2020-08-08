package com.example.sb21;

/**
 * @Author Jarvan
 * @create 2020/8/7 19:36
 * 1.如果访问父类的静态字段会 加载父类的静态代码块，然后执行父类的方法
 * 2. 如果访问子类的静态代码块，会先加载父类，【再加载子类】然后执行子类的方法，
 */
public class 父类静态代码块 {
    public static void main(String[] args) {
        System.out.println(Son.son);
    }
}
 class Parent{
    static {
        System.out.println("父类--静态代码块");
    }
    public static String parent = "父类--静态字段";
}

class  Son extends Parent {
    public static String son = "子类--静态字段";
    static {
        System.out.println("子类--静态代码块");
    }
}