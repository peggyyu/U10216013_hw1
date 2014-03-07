//create Function_g class inherit AbstractDrawFunction
public class Function_g extends AbstractDrawFunction {
	//new constructor Function_g
	public Function_g (){
		
	}
	@Override
	//concrete method
	double f(double x) {
		// TODO Auto-generated method stub
		return Math.log10(x)+ Math.pow (x , 2);
	}

}
