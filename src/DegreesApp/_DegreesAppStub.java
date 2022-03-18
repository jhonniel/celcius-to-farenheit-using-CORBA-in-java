package DegreesApp;


/**
* DegreesApp/_DegreesAppStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/Programms/Eclipse_Java/eclipse-workspace/Exam_1/Degrees.idl
* Friday, March 18, 2022 8:43:03 AM CST
*/

public class _DegreesAppStub extends org.omg.CORBA.portable.ObjectImpl implements DegreesApp.DegreesApp
{

  public String getCelcius (double input)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getCelcius", true);
                $out.write_double (input);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getCelcius (input        );
            } finally {
                _releaseReply ($in);
            }
  } // getCelcius

  public String getFahrenheit (double input)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getFahrenheit", true);
                $out.write_double (input);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getFahrenheit (input        );
            } finally {
                _releaseReply ($in);
            }
  } // getFahrenheit

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:DegreesApp/DegreesApp:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _DegreesAppStub