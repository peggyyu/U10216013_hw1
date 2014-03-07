//create Function_f class inherit AbstractDrawFunction
public class Function_f extends AbstractDrawFunction {
	//new constructor Function_f
	public Function_f (){
		
	}
	@Override
	//concrete method
	double f(double x) {
		// TODO Auto-generated method stub
		return 5*Math.cos(x)+Math.sin(x);
	}

}
