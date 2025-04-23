package org.project.domain;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Patient {
	
	static int tempnum = 100;
	List<Object []> docList = Admin.docList;
	public static List<Object []> patList = new ArrayList<Object []>();
	
	Object [] ob = new Object[4];
	public void initialize() {
		Object [] ob = new Object[4];
		ob[0] = "Petient ID";
		ob[1] = "Petient Name";
		ob[2] = "Doc Speciality No";
		ob[3] = "Doctor_ID";
		patList.add(ob);
		
		ob = new Object[4];
		ob[0] = tempnum++;
		ob[1] = "Rajat";
		ob[2] = "1";
		ob[3] = "D101";
		patList.add(ob);
		
		ob = new Object[4];
		ob[0] = tempnum++;
		ob[1] = "Ramesh";
		ob[2] = "2";
		ob[3] = "D102";
		patList.add(ob);
		
	}
	//AtomicInteger count = new AtomicInteger(100) ;
	public void bookAppointment() {
		List<Object[]> doclist = Admin.docList;
		
		System.out.println("Enter Your Desese type\n1.Cardiology\t2.Orthoped\t3.Oncology\t4.Radiology");
		Scanner sc = new Scanner (System.in);
		String d_type = sc.next();
		
		for(Object [] o : doclist){  //puchna
			
			if(o[3].equals(d_type)) {
				
				System.out.print(o[0] + "\t");
				System.out.print(o[1] + "\t");
				System.out.print(o[2] + "\t");
				System.out.println(o[3] + "\n");
			}
		}
		try {
			System.out.println("Enter ID from the available Doctor :- ");
			String d_id = sc.next();
			if(d_id.charAt(0) == 'D' && d_id.length()<5){
				System.out.println("Enter your name");
				String p_name = sc.next();
				
				//System.out.println("Enter new Petient ID");
				int p_id = tempnum++;
				Appointment a = new Appointment(p_id,p_name,d_type,d_id);
				Object [] ob = new Object[4];
			}
			else
				throw new HospException();		
				} catch (HospException h) {
				System.out.println(h.getMessage2());
			}
		
//		ob[0] = p_id;
//		ob[2] = p_name;
//		ob[3] = p_id;
//		ob[4] = p_id;
	}
		
}
