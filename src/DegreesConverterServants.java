import DegreesApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming. NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg. PortableServer.*;
import org.omg. Portableserver.POA;
import java.util.Properties;
public class DegreesConverterServants extends DegreesAppPOA {
	
	private ORB orb;
	public void setORB (ORB orb_val) {
	    orb = orb_val;
	}
	
	@Override
	public String getCelcius(double input) {
	    double convert = 5/9.0* (input - 32);
	    return "Result: Temperture in Celcius = "+convert;
	}
	
	@Override
	public String getFahrenheit (double input) {
	    double convert = 9/5.0* input+32;
	    return "Result: Temperature in Fahrenheit "+convert;

	}
}
