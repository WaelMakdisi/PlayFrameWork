package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

     public static Result sse(Double a,Double b,Double c)
     {
 		double delta=Math.pow(b, 2)-4*a*c;
        double  []result=new double[2];
        result[0]=(-1*b+Math.sqrt(delta))/(2*a);
        result[1]=(-1*b-Math.sqrt(delta))/(2*a);
		return ok( "Result: x1= "+result[0]+"    ,x2 ="+result[1]);
    	 
    	 
     }

}
