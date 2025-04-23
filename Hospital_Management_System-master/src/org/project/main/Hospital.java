package org.project.main;
import org.project.domain.*;
import java.util.Scanner;
public class Hospital  {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
			Admin a = new Admin();
			Doctor d = new Doctor( );
			Patient p = new Patient();
			Appointment ap = new Appointment();
			
			a.initialize();
			p.initialize();
			
			System.out.println("\t------------------------------------------------------------------------------------------");
			System.out.println("\t\t***WELCOME TO HOSPITAL MANAGEMENT SYSTEM***");
			System.out.println("\t------------------------------------------------------------------------------------------");
			
			int ch,c;
			do {
				System.out.println("From Which Department are you belongs to  :   ");
				System.out.println("1. Admin\n2. Doctor\n3. Reception");
				ch = sc.nextInt();
				
				if(ch == 1) {
					System.out.println("Please Enter four Digit Password");
					int pw = sc.nextInt();
					if(pw == 2935) {
						do {
							System.out.println("1.Press 1 to view Doctors available in Hospital\n2.Press 2 to add new Doctor\n3.Press 3 to remove Doctor\n4.Press 4 to Search doctor\n5.Press 5 to View Patient\nPress 6. EXIT");
							c = sc.nextInt();
								switch(c) {
										case 1: 
											a.viewDoctors();
											break;
										case 2: 
											a.addDoctors();
											break;
										case 3:
											a.removeEntry();
											break;
										case 4:
											a.searchDoctor();
											break;
										case 5:
											a.ShowPatient();
											break;
										case 6:
											Hospital.main(args);
											break;
										default :
											System.out.println("Wrong Input...\nPlease try again");
											System.out.println();
								}
						} while (ch<=6);
					}
					else {
						System.out.println("Wrong Password...\nPlease try again");
					}
				}
				//Doctor Area
				else if(ch == 2) {
					System.out.println("Please Enter Password");
					int pd = sc.nextInt();
					if(pd == 1234) {
						do {
							System.out.println("1.Press 1 to check Appointment\n2.Press 2 to delete sucessful Appointment\n3. EXIT");
								c = sc.nextInt();
								switch(c) {
										case 1:
											d.chechAppointments();
											break;
										case 2:
											d.removeEntry();
											break;
										case 3:
											Hospital.main(args);
											break;
										default :
											System.out.println("Wrong Input...\nPlease try again");
											System.out.println();
								}
							
						} while (c<=3);
					}
					else {
						System.out.println("Wrong Password...\nPlease try again");
						System.out.println();
					}
					
				}
				//Receptionist Area
				else if(ch == 3) {
					do {
						System.out.println("1.Book Appointments\n2.Show Appointment\n3.EXIT");
						c = sc.nextInt();
						
						switch(c) {
								case 1:
									p.bookAppointment();
									break;
								case 2:
									ap.showAppointments();
									break;
								case 3:
									Hospital.main(args);
									break;
								default :
									System.out.println("Wrong Input...\nPlease try again");
									System.out.println();
							}
						} while (c<=3);
				}
				
			}while (ch<=3);
			System.out.println("Wrong Input...\n Please try again");
			Hospital.main(args);
			
			sc.close();
		}
}
