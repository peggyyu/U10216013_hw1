import java.util.Scanner;

public class Test {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		
		Function_a aaa = new Function_a();
		Function_b bbb = new Function_b();
		Function_c ccc = new Function_c();
		Function_d ddd = new Function_d();
		Function_e eee = new Function_e();
		Function_f fff = new Function_f();
		Function_g ggg = new Function_g();
		
		System.out.println(aaa.f(x));
		System.out.println(bbb.f(x));
		System.out.println(ccc.f(x));
		System.out.println(ddd.f(x));
		System.out.println(eee.f(x));
		System.out.println(fff.f(x));
		System.out.println(ggg.f(x));
	}
}
