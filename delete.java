import java.sql.*; 
  
public class delete  
{ 
    public static void main(String args[]) 
    { 
        String id = "id3"; 
        String pwd = "pwd3"; 
         System.out.println("Criminal Database Investigation");
        try
        { 
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
            Connection con = DriverManager.getConnection(" 
             jdbc:oracle:thin:@localhost:1521:orcl", "login1", "pwd1"); 
            Statement stmt = con.createStatement(); 
                   
            // Deleting from database 
            String q1 = "DELETE from userid WHERE id = '" + id +  
                    "' AND pwd = '" + pwd + "'"; 
                      
            int x = stmt.executeUpdate(q1); 
              
            if (x > 0)             
                System.out.println("User Successfully Deleted");
                                                       
            else
                System.out.println("ERROR OCCURED");   
            
            con.close(); 
                                                         
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        } 
    } 
} 
