package ourhospital;
import java.util.*;


public class Patient{

  
    
    
     Dbcon d=new Dbcon();
	
	
	public static ArrayList<Object[]> patlist = new ArrayList<Object[]>();

	
	

	
	public void creApp()
	{	
	
			
		System.out.println("Enter Your disease type\n1.Cardiology\n2.Orthoped\n3.Oncology\n4.Radiology");
		Scanner sc= new Scanner(System.in);
		String dtype = sc.next();//mdtra 23mloh String 3shan .equals 3shan ykarn bba2y el bianat
		
		
                
                d.searchdocwithdisease(dtype);
                
                
                
		try
		{
		System.out.println("Enter id  from the available Doctors\n");
		String did = sc.next();
		if(did.charAt(0)=='D')
		{
		
		
			System.out.println("Enter your name");
			String pname = sc.next();
			
			System.out.println("Enter room number");
			int room = sc.nextInt();
			System.out.println("Enter new Patient id");
			String pid= sc.next();
			Appointments a = new Appointments(pid,pname,dtype,did,room);//3ml obj appoint 3shan add in arraylist
		}
		else
			throw new HospException();
		}catch(HospException h)
		{
			System.out.println(h.getMessage2());
		}
	
		
	}

}
