  package tester;
  import java.util.HashSet;
  import com.app.core.Vehicle;

  public class TestVehicleSet {

	public static void main(String[] args) {
		//create empty HashSet to store vehicle details
		HashSet<Vehicle> vehicles=new HashSet<>();
        Vehicle v1=new Vehicle("mh-1234", "red", 234567,"Honda City");
        Vehicle v2=new Vehicle("mh-1234", "silver", 234567,"Honda City");
        Vehicle v3=new Vehicle("mh-1235", "red", 234567,"Honda City");
        Vehicle v4=new Vehicle("mh-1236", "white", 234567,"Honda City");
        Vehicle v5=new Vehicle("mh-1234", "red", 234567,"Honda City");
       System.out.println("Added "+vehicles.add(v1));//t
       System.out.println("Added "+vehicles.add(v2));//t:since color is different
       System.out.println("Added "+vehicles.add(v3));//t:since regNo is different
       System.out.println("Added "+vehicles.add(v4));//t:since both regNo and color are different
       System.out.println("Added "+vehicles.add(v5));//f:since both are same
       System.out.println("size of HS"+vehicles.size());//4
       vehicles.forEach(v-> System.out.println(v));
	}
  }
  
  