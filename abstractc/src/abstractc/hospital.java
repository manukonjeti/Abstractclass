package abstractc;

abstract class governHospital{
	
abstract  String patientDetails();
public String billing() {
	return "billing";
		
	}
	
}

//public class cityHosptial extends governHospital{
//	 @Override
//	 public String patientDetails() {
	//	 return "Patient information";
		//}
	//	
		
//}


public class hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CityHosptial Hospital = new CityHosptial();
		String billingInfo = Hospital.billing();
        System.out.println(billingInfo);
        
        // Call and print the patientDetails method
        String patientInfo = Hospital.patientDetails();
        System.out.println(patientInfo);
	}

}
