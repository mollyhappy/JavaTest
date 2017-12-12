package com.mx.test;

public class Test {
	public static void main(String[] args) {
        //定义父类数组
        Per[] per = new Per[2];
        //定义两个子类
        Sub sub = new Sub();
        Sup sup = new Sup();
        
        //父类引用子类对象
        per[0] = sub;
        per[1] = sup;
        
        for(int i = 0 ; i < 2 ; i++){
            System.out.println(per[i].toString() + "--" + per[i].drink());
        }
        System.out.println("-------------------------------");

    }
}
