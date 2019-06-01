
package ourhospital;

import java.sql.Connection;
import java.sql.*;

/** *

 * @author select
 */
public class Dbcon {

     final String Driver ="com.mysql.jdbc.Driver";
    final String URL="jdbc:mysql://localhost/hospital";
    final String USER="root";
    final String PASSWORD="";
    Connection con;
    Statement stmt;
    String query;
        
    public Dbcon() {
      
     con=null;
        stmt=null;
          try{
        
    Class.forName(Driver);
   con=DriverManager.getConnection(URL,USER,PASSWORD);
    if(con!=null)System.out.println("Connected");
    stmt=con.createStatement();
   
}
 catch(Exception e){
  System.out.println("Not connected");
    
}   
        
        
    }
  
    public void insertdoctor( String id,String name,String sp, String Dspnum){
         try{
                 query="INSERT INTO doctor (D_ID,D_Name,sp,Dspnum) "
                         +"VALUES ('"+id+"' ,'"+name+"' , '"+sp+"' , '"+Dspnum+"')";
            
                 stmt.executeUpdate(query);
		  System.out.println("data Inserted");
	}
                 catch(Exception e){
                     
                     System.out.println(e);
                     
                     
                 }
        
        
    }
    
   
    
    
    
    
     public void insertpatient( String id,String name,String Dspnum,String did,int room){
         try{
             
             
         
             
           
                  query="INSERT INTO patient (P_ID,P_Name,Dspnum,D_ID,room) "
                         +"VALUES ('"+id+"' ,'"+name+"' , '"+Dspnum+"', '"+did+"' , '"+room+"')";
                 stmt.executeUpdate(query);
		  System.out.println("data Inserted");}
         
                 catch(Exception e){
                     
                     System.out.println(e);
                     
                     
                 }
        
        
    }
     
       public void viewdoc(){
         try{
                 query=" SELECT * FROM doctor";
                       
            ResultSet result=     stmt.executeQuery(query);
            while(result.next()){
		  System.out.println(result.getString("D_ID")+" - "+result.getString("D_Name")+" - "+result.getString("sp")+" - "+result.getString("Dspnum"));
                  
              
         }
            
	}
                 catch(Exception e){
                     
                     System.out.println(e);
                     
                     
                 }
        
        
    }
        public void viewpatient(){
         try{
                 query=" SELECT * FROM patient";
                       
            ResultSet result=     stmt.executeQuery(query);
            while(result.next()){
		  System.out.println(result.getString("P_ID")+" - "+result.getString("P_Name")+" - "+result.getString("Dspnum")+" - "+result.getString("D_ID")+" - "+result.getInt("room"));
                  
              
         }
            
	}
                 catch(Exception e){
                     
                     System.out.println(e);
                     
                     
                 }
        
        
    }
     public void deletedoc( String id){
         try{
                 query="DELETE FROM doctor WHERE D_ID='"+id+"'";
                       
       
              stmt.executeUpdate(query);
                System.out.println("doctor removed succesfully");
          
	}
                 catch(Exception e){
                     
                     System.out.println(e);
                     
                     
                 }
        
        
    }
  public void searchdoc( String id){
         try{
                  query=" SELECT * FROM doctor WHERE D_ID='"+id+"'";
                       
            ResultSet result=     stmt.executeQuery(query);
            while(result.next()){
		  System.out.println(result.getString("D_ID")+" - "+result.getString("D_Name")+" - "+result.getString("sp")+" - "+result.getString("Dspnum"));
                  
          
	}}
                 catch(Exception e){
                     
                     System.out.println(e);
                     
                     
                 }
        
        
    }
    public void searchdocwithdisease( String dtype){
         try{
                  query=" SELECT * FROM doctor WHERE Dspnum='"+dtype+"'";
                       
            ResultSet result=     stmt.executeQuery(query);
            while(result.next()){
		  System.out.println(result.getString("D_ID")+" - "+result.getString("D_Name")+" - "+result.getString("sp")+" - "+result.getString("Dspnum"));
                  
          
	}}
                 catch(Exception e){
                     
                     System.out.println(e);
                     
                     
                 }
        
        
    }  
      public void viewapp(String id){
         try{
                 query=" SELECT * FROM patient WHERE P_ID='"+id+"'";
                       
            ResultSet result=     stmt.executeQuery(query);
            while(result.next()){
		  System.out.println(result.getString("P_ID")+" - "+result.getString("P_Name")+" - "+result.getString("Dspnum")+" - "+result.getString("D_ID")+" - "+result.getInt("room"));
                  
              
         }
            
	}
                 catch(Exception e){
                     
                     System.out.println(e);
                     
                     
                 }
        
        
    }
       public void checkapp( String id){
         try{
                  query=" SELECT * FROM patient WHERE D_ID='"+id+"'";
                       
            ResultSet result=     stmt.executeQuery(query);
            while(result.next()){
		  System.out.println(result.getString("P_ID")+" - "+result.getString("P_Name")+" - "+result.getString("Dspnum")+" - "+result.getString("D_ID")+" - "+result.getString("room"));
                  
          
	}}
                 catch(Exception e){
                     
                     System.out.println(e);
                     
                     
                 }
        
        
    }
         public void deletepat( String id){
         try{
                 query="DELETE FROM patient WHERE P_ID='"+id+"'";
                       
       
              stmt.executeUpdate(query);
                System.out.println("patient removed succesfully");
          
	}
                 catch(Exception e){
                     
                     System.out.println(e);
                     
                     
                 }
        
        
    }
}


 