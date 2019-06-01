package ourhospital;
import java.util.*;
import java.sql.*;


public class Admin  implements myfunction
{

   

	Scanner sc = new Scanner(System.in);
//	Patient p = new Patient();
	public static ArrayList<Object[]> doclist = new ArrayList<Object[]>();  
	Dbcon d=new Dbcon();
	Object[] ob = new Object[4];
	
	
	public void viewDoc()
	{        
		
                 d.viewdoc();
	

	}
	
	public void addDoc()
	{
		System.out.println("Enter new Doctor ID");
		String id = sc.next();
		try{
			
		if(id.charAt(0)=='D')
		{
		
		System.out.println("Enter Doc Name");
		String name = sc.next();
		System.out.println("Select Doctor Speciality\n1.CardioLogy\n2.Orthopedic\n3.Oncology\n4.Radiology");
		int sp = sc.nextInt();
		if(sp>4)
                    try{
			throw new HospException();
		}catch(HospException e)
		{
			System.out.println(e.getMessage1());
		}
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
		doclist.add(ob);
		System.out.println("New Doctor added successfully");
		}
		else
			throw new HospException();
		}catch(HospException e)
		{
			System.out.println(e.getMessage2());
		}
		
      
                d.insertdoctor((String) ob[0], (String) ob[1], (String) ob[2], (String) ob[3]);
		
		
	}
	public void viewPat()
                
	{
          
	
            d.viewpatient();
	}
	public void remEnt()
	{ 
		System.out.println("Enter id of Doc u want to remove");
		String rd = sc.next();
                  d.deletedoc(rd); 
	
             
                
                
	}
	public void searchDoc()
	{
		System.out.println("Enter id of Doc u want to search");
		String sd = sc.next();
                  d.searchdoc(sd);
	
        
      
        
        
	}
	
	
}
