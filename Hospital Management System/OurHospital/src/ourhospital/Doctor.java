package ourhospital;
import java.util.*;

public class Doctor  implements myfunction
{
 Dbcon d=new Dbcon();
    public Doctor() {
       
    }
	
	ArrayList<Object[]> patlist = Patient.patlist;
	Scanner sc= new Scanner(System.in);
	//
	public void checkApp() //bwsl el id bt3 el doctor bl patient bta3o bitb30h
	{
		System.out.println("Enter ur ID");
		String sd = sc.next();
                d.checkapp(sd);
	
		}
	
		
	
	public void remEnt()
	{
		checkApp();
		System.out.println("Enter id of Patient who finished ur treatment");
		String  rd = sc.next();
                d.deletepat(rd);
                
                
		for(Object[] o : patlist)
		
		
				
				if(rd.equals(o[0]))
				{
					System.out.println("Patient removed Successfully");
					patlist.remove(o);
					break;
					
				}
			

		}
	}
	
	
	


