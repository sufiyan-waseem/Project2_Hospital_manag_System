package org.project.domain;
import java.util.Scanner;
import java.util.List;

public class Doctor extends Appointment implements myFunction{
	
	static Scanner sc = new Scanner(System.in);
	List<Object []> patList = Patient.patList;
	
	Appointment ap = new Appointment();
	static int flag = 1;
	public void chechAppointments() {
			System.out.println("Please Enter Your Dr. ID");
			String sd = sc.next();
			try {
				if(sd.charAt(0) == 'D') {
					
					for (Object[] o : patList) {
						try {
							
							if(sd.equals(o[3])){
								
								System.out.print(o[0] + "\t");
								System.out.print(o[1] + "\t");
								System.out.print(o[2] + "\t");
								System.out.print(o[3] + "\n");
								flag = 1;
								
							}
							else
								throw new HospException();
						}
						catch(HospException e) {
							flag =0;
						}
					}
					if(flag == 0){
						System.out.println("No Data Found\n");
						
					}
					
						
				}
				else
					throw new HospException();
				
				}	catch(HospException e) {
					System.out.println(e.getMessage2()+"\n");
			}
	}
	@Override
	public void removeEntry() {
		
		chechAppointments();
		
		System.out.println("Enter Id of the patient who finished your treatment : ");
		String rp = sc.next();
		
		for (Object[] o: patList) {
			try {
					if(rp.equals(o[0])) {
					
						System.out.println("**Patient Removed Sucessfully**");
						patList.remove(o);
						flag = 1;
						break;
					}
					else 
						throw new HospException();
					
					} catch (HospException e) {
						flag =0;
						}
				}
					if(flag == 0)
					System.out.println("No Data Found"+"\n");
		}

}
