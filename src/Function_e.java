//create Function_e class inherit AbstractDrawFunction
public class Function_e extends AbstractDrawFunction {
	//new constructor Function_e
	public Function_e (){
		
	}
	@Override
	//concrete method
	double f(double x) {
		// TODO Auto-generated method stub
		return Math.cos(x)+5*Math.sin(x);
	}

}
