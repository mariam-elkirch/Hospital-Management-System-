
package ourhospital;

import java.util.Scanner;

public class OurHospital {

   
    public static void main(String[] args) {
   
		
		int ch,c;
		Admin a = new Admin();
		Doctor d = new Doctor();
		Patient p = new Patient();
		//d=a;
		Appointments ap = new Appointments();
	//	a.initialize();
	//	p.initialize();
		System.out.println("WHO ARE YOU?\n1.Admin \t 2.Doctor\t3.Receptionist");
				Scanner sc =new Scanner(System.in);
				ch=sc.nextInt();
				do{
					if(ch==1)
					{
						
						//ADMIN AREA
						do
						{
							System.out.println("1.View Doctors \t 2.View Patient \t 3.Add Doctor \t 4.Remove Doctor\t5.Search Doctor\t6.Exit");
							c =sc.nextInt();
							switch(c)
							{
								case 1 : a.viewDoc();break; 
								case 2 : a.viewPat();break;
								case 3 : a.addDoc();break;
								case 4 : a.remEnt();break;
								case 5 : a.searchDoc();break;
								case 6 : OurHospital.main(args);break;
						
							}	
						}while(c<4);
					}
					else if(ch==2)
					{
						//DOCTOR AREA
						do
						{
							System.out.println("1.Check Appointments\t2.Delete successful appointment \t 3.Exit");
							c=sc.nextInt();
							switch(c)
							{
								case 1: d.checkApp();
										break;
								case 2: d.remEnt();
										break;
								case 3 : OurHospital.main(args);
										break;
							}
						}while(c<3);
							

					}
					else if(ch==3)
					{
						//RECEPTIONIST AREA
						do
						{
							System.out.println("1.Create Appointment \t 2.Show Appointments \t 3.Exit");
							c=sc.nextInt();
							switch(c)
							{
								case 1: p.creApp();
										break;
								case 2: ap.showapps();
										break;
								case 3 : OurHospital.main(args);
						   				break;
							}
						}while(c<3);
					}
				}while(ch<4);

				
				
}
    }
    

