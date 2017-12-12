package com.mx.test2;

public class Count {
	private String title;
    private String content;
    
    public static int count = 0;
    public int number=0;
    public Count(){
        count++;
        number++;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Count c1=new Count();
			Count c2=new Count();
			System.out.println(count);
			System.out.println(c1.number);
			System.out.println(c2.number);
	}

}
