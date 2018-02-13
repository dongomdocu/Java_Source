package sbs;

import mbc.Test01;
//import mbc.* // 하위 패키지를 제외하고 mbc패키지의 모든 클래스를 import함

public class TestEx04 {
	public static void main(String[] args) {
		//Test01 obj1 = new Test01();//패키지 안에서 Test01을 못찾았다. 직접 입력해주면 해결된다.
		//mbc.Test01 obj1 = new mbc.Test01();//패키지 안에서 Test01을 못찾았다. 직접 입력해주면 해결된다.
		Test01 obj1 = new Test01();//패키지 안에서 Test01을 못찾았다. import하면 해결 된다.
		Test05 obj2 = new Test05();

		System.out.println("a= " + obj1.a);
		//System.out.println("b= " + obj1.b);
		//System.out.println("c= " + obj1.c);
		//System.out.println("d= " + obj2.d);
		
		
		//System.out.println("d= " + obj2.d);
		System.out.println("d= " + obj2.getDdd());
		obj2.setDdd(1000);
		System.out.println("d= " + obj2.getDdd());
	}

}
