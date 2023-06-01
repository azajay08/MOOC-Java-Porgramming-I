
public class MainHealthStation {

	public static void main(String[] args) {

		HealthStation childrensHospital = new HealthStation();
	
		PersonHS ethan = new PersonHS("Ethan", 1, 110, 7);
		PersonHS peter = new PersonHS("Peter", 33, 176, 85);
	
		System.out.println("weighings performed: " + childrensHospital.weighings());
	
		childrensHospital.weigh(ethan);
		childrensHospital.weigh(peter);
	
		System.out.println("weighings performed: " + childrensHospital.weighings());
	
		childrensHospital.weigh(ethan);
		childrensHospital.weigh(ethan);
		childrensHospital.weigh(ethan);
		childrensHospital.weigh(ethan);
	
		System.out.println("weighings performed: " + childrensHospital.weighings());
	}
}
