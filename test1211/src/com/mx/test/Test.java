package com.mx.test;

public class Test {
	public static void main(String[] args) {
        //���常������
        Per[] per = new Per[2];
        //������������
        Sub sub = new Sub();
        Sup sup = new Sup();
        
        //���������������
        per[0] = sub;
        per[1] = sup;
        
        for(int i = 0 ; i < 2 ; i++){
            System.out.println(per[i].toString() + "--" + per[i].drink());
        }
        System.out.println("-------------------------------");

    }
}
