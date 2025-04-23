package org.project.domain;

import java.util.List;
import java.util.Scanner;

public class Appointment {
	
	static Scanner sc = new Scanner(System.in);
	Patient p = new Patient( );
	List<Object []> patList = Patient.patList;
	
	public Appointment() {
		//TODO
	}
	
	Appointment(String p_id,String p_name,String disease,String d_id)
	{
		
			Object[] ob = new Object[4];
			
			ob[0]= p_id;
			ob[1]=p_name;
			ob[2]=disease;
			ob[3]=d_id;
			patList.add(ob);
	}
	public void viewAppointment() {
		
		System.out.println("Enter Your Patient ID : ");
			String p_id = sc.next();
			
			for (Object[] o : patList) {
				
					if(p_id == o[0]) {
					System.out.println(o);
				}
			
			}
		}
	public void showAppointments() {
			for (Object[] o : patList) {
				
				System.out.print(o[1]+"\t");
				System.out.print(o[2]+"\t");
				System.out.println(o[3]+"\t");
				
			}
		
	}

}
