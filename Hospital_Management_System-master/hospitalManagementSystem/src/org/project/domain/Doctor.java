package org.project.domain;
import java.util.Scanner;
import java.util.List;

public class Doctor extends Appointment implements myFunction{
	
	static Scanner sc = new Scanner(System.in);
	List<Object []> patList = Patient.patList;
	Appointment ap = new Appointment();
	
	public void chechAppointments() {
			System.out.println("Please Enter Your Dr. ID");
			String sd = sc.next();
			
			for (Object[] o : patList) {
				
				if(sd.equals(o[3])){
				
					System.out.print(o[0] + "\t");
					System.out.print(o[1] + "\t");
					System.out.print(o[2] + "\t");
					System.out.println(o[3] + "\n");

				}
			}
	}
	@Override
	public void removeEntry() {
		
		chechAppointments();
		System.out.println("Enter Id of the patient who finished your treatment : ");
		String rp = sc.next();
		
		for (Object[] o: patList) {
			try {
					if(rp.equals(o)) {
					
						System.out.println("**Patient Removed Sucessfully**");
						patList.remove(o);
						break;
					}
					else 
						throw new HospException();
					
				} catch (HospException e) {
					System.out.println(e.getMessage1());
			}
			
		}
	}

}
