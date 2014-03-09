import java.util.Scanner;

public class Test {
	
	/** Main method */
	public static void main(String[] args){
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter x
		double x = input.nextDouble();
		
		//Create seven objects 
		Function_a aaa = new Function_a();
		Function_b bbb = new Function_b();
		Function_c ccc = new Function_c();
		Function_d ddd = new Function_d();
		Function_e eee = new Function_e();
		Function_f fff = new Function_f();
		Function_g ggg = new Function_g();
		
		//Print out the seven functions answer
		System.out.println(aaa.f(x));
		System.out.println(bbb.f(x));
		System.out.println(ccc.f(x));
		System.out.println(ddd.f(x));
		System.out.println(eee.f(x));
		System.out.println(fff.f(x));
		System.out.println(ggg.f(x));
	}
}
