package org.project.domain;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Admin extends Doctor implements myFunction{
	private static Scanner sc = new Scanner(System.in);
	public static List<Object []> docList = new ArrayList<Object []>();
	
	Object [] ob = new Object[5];     //Array of Objects
	static int flag = 1;
	
	public void initialize() {
		Object [] ob = new Object[5];
		ob[0] = "Doctor ID";
		ob[1] = "Name";
		ob[2] = "Speciality";
		ob[3] = "Speciality Number";
		ob[4] = "Availaibility";
		
		docList.add(ob);
		
		ob = new Object[5];
		ob[0] = "D101";
		ob[1] = "Dr. Shukla";
		ob[2] = "Cardiology";
		ob[3] = "1";
		ob[4] = "1";
		docList.add(ob);
		
		ob = new Object[5];
		ob[0] = "D102";
		ob[1] = "Dr. Khan";
		ob[2] = "Orthopedic";
		ob[3] = "2";
		ob[4] = "1";
		docList.add(ob);
		
		ob = new Object[5];
		ob[0] = "D103";
		ob[1] = "Dr. Vikas";
		ob[2] = "Oncology";
		ob[3] = "3";
		ob[4] = "1";
		docList.add(ob);
		
		 ob = new Object[5];
		 ob[0] = "D104";
		 ob[1] = "Dr. Kaif";
		 ob[2] = "Radiology";
		 ob[3] = "4";
		 ob[4] = "1";
		docList.add(ob);
		
		ob = new Object[5];
		ob[0] = "D105";
		ob[1] = "Dr. Anuj";
		ob[2] = "Orthopedic";
		ob[3] = "2";
		ob[4] = "1";
		docList.add(ob);
		
		 ob = new Object[5];
		 ob[0] = "D106";
		 ob[1] = "Dr. Shah";
		 ob[2] = "Cardiology";
		 ob[3] = "1";
		 ob[4] = "1";
		docList.add(ob);
		
	}

	public void viewDoctors() {
		
		for(Object [ ] o : docList) {
			
			System.out.print(o[0] + "\t\t" );
			System.out.print(o[1] + "\t\t" );
			System.out.print(o[2] + "\t\t" );
			System.out.print(o[3] + "\n" );
		
		}
		
	}

	public void addDoctors() {
		 	sc.nextLine();
			System.out.println("Enter ID of new Doctor");
			String id = sc.nextLine();
			
			try {
				if(id.charAt(0) == 'D') {
					System.out.println("Please Enter the Name of the Doctor");
					String name = sc.next();
					
					System.out.println("Enter Speciality No. of Doctor\n1. Cardiology\t2. Orthopedic\t3. Oncology\t 4. radiology");
					int sp = sc.nextInt();
					
					if(sp>4)
						throw new HospException();
					
					ob = new Object[4];
					ob[0] = id;
					ob[1] = name;
					if(sp==1)
					{
						ob[2]= "Cardiology";
						ob[3]= "1";
					}
					else if(sp==2)
					{
						ob[2]= "Orthopedic";
						ob[3]= "2";
					}
					else if(sp==3)
					{
						ob[2]= "Oncology";
						ob[3]= "3";
					}
					else if(sp==4)
					{
						ob[2]= "radiology";
						ob[3]= "4";
					}
					else
						System.out.println("Wrong Speciality Number...");
					docList.add(ob);
					System.out.println("New Doctor added sucessfully");
				}
				else
					throw new HospException();			
			}catch(HospException e)
			{
				System.out.println(e.getMessage2());
				System.out.println();
			}
			
	}
	@Override
	public void removeEntry() {
			System.out.println("Enter ID of doctors you want to remove");
			String rId = sc.next();
			try {
				if(rId.charAt(0) == 'D') {
					//int flag = 1;
					for (Object[] o : docList) {
						
						try{
							 	
								if(rId.equals(o[0])) {
									System.out.println("Doctor of ID no. "+rId+" is removed");
									docList.remove(o);
									flag = 1;
									break;
									}
									else 
										throw new HospException();
						
							}
							catch(HospException e) {
								flag = 0;
							}	
					}
					if(flag == 0){
						System.out.println("No Data Found");
						System.out.println();	
					}
									
				} else
					throw new HospException();
				
			}catch(HospException e) {
				System.out.println(e.getMessage2());
				System.out.println();
		}			
	}
	public void searchDoctor() {
		System.out.println("Enter the ID of the Doctor you want to search ");
		String sd = sc.next();
		try {
			if(sd.charAt(0) == 'D') {
				for (Object[] objects : docList) {
					
					try {
						if( sd.equals(objects[0] ) ) {
							
							System.out.println("Doctor is Found");
							System.out.println("Doctor ID : "+objects[0]+"\t");
							System.out.println("Doctor Name : "+objects[1]+"\t");
							System.out.println("Doctor Speciality : "+objects[2]+"\t");
							System.out.println("Doctor Speciality No : "+objects[3]+"\t"+"\n");
							flag = 1;
							break;
						}
						else
							throw new HospException();               
						
					} 
						catch (HospException e) {
							flag = 0;
								//System.out.println(e.getMessage1());	
						}
					
					}
				if(flag == 0) {
					System.out.println("No Data Found\n");	

					}
				}
				else
					throw new HospException();
			
			}
				catch(HospException e) {
				System.out.println(e.getMessage2());
				System.out.println();
			}			
	
	}

	public void ShowPatient() {
		
		Patient p = new Patient();
		
		List<Object []> patList = Patient.patList;
		for(Object [ ] o : patList) {
			
			System.out.print(o[0]+"\t");
			System.out.print(o[1] + "\t");
		    System.out.print(o[2] + "\t");
		    System.out.println(o[3] + "\n");
		    
		}
		
	}

}
