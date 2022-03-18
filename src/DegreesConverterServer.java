import TemperatureApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import java.util.Properties;

public class DegreesConverterServer {
	
	public static void main(String[] args) {
		   
		try {
		      // create and initialize the ORB
		      ORB orb - ORB. init(args, null);
		      
		      // get reference to rootpoa & activate the POAManager
		      POA rootpoa POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
		      rootpoa.the_POAManager().activate();
		      
		      // create servant and register it with the ORD
		      DegreesConverterServant DegServ = new DegreesConverterServant();
		      DegServ.setORB(orb);
		      
		      //get object reference from the servant
		      org.omg.CORBA.Object ref = rootpoa.servant to_reference(DegServ);
		      //java file + java filehelper
		      Degrees href = DegreesAppHelper.narrow(ref);
		      
		      // get the root naming context
		      // NameService invokes the name service
		      org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
		      // Use NamingContextExt which is part of the Interoperable
		      // Naming Service (INS) specification.
		      NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
		      NameComponent path[] = ncRef.to_name("ABC");
		      ncRef.rebind(path, href);
		      System.out.println("Degrees Converter App Server ready and waiting ... ");
		     
		      //wait for invocation from clients
		      for(;;) {
		    	  orb.run();
		      }
		}catch (Exception e) {
		     System.err.println("Error: " + e);
		     e.printStackTrace(System.out);
		}
		System.out.println("Temperature App is exiting ...");
	}
}
