package ourhospital;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
interface myfunction
{
	void remEnt();
}


public class Appointments 
{

    public Appointments() {
    }
    
    
    
    
        Dbcon d=new Dbcon();	
	Scanner sc =new Scanner(System.in);
	
	ArrayList<Object[]> patlist = Patient.patlist;
	
	Appointments(String pid,String pname,String disease,String d_id,int room)
	{
		
		Object[] ob = new Object[5];
		
		ob[0]=pid;
		ob[1]=pname;
		ob[2]=disease;
		ob[3]=d_id;
                ob[4]=room;
                
		patlist.add(ob);
                d.insertpatient(pid, pname,disease, d_id, room);
	}
	public void vapp()//view appointment
	{
		System.out.println("Enter ur patient id");
		String pid = sc.next();
		
                d.viewapp(pid);
	}
	public void showapps()
	{
		
		
            d.viewpatient();
				

	}
	
}
