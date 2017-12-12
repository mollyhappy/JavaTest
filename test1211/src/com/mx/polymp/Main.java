package com.mx.polymp;

public class Main {
	//this.show(O)、
	//super.show(O)、
	//this.show((super)O)
	//super.show((super)O)
	public static void main(String[] args){ 
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        
        System.out.println("1--" + a1.show(b));//输出A-A
  
        
        System.out.println("2--" + a1.show(c));//输出A-A
      
        
        System.out.println("3--" + a1.show(d));//输出A-D

        System.out.println("4--" + a2.show(b));//输出B-A
    
        
        System.out.println("5--" + a2.show(c));//输出B-A

        
        System.out.println("6--" + a2.show(d));//输出A-D
   
        
        System.out.println("7--" + b.show(b));//输出B-B
    
        
        System.out.println("8--" + b.show(c));//输出B-B

        
        System.out.println("9--" + b.show(d));//输出A-D
    
        
    }

}
