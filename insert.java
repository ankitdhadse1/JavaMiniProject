import java.sql.*; 
  
public class insert1 
{ 
    public static void main(String args[]) 
    { 
        String id = "id1"; 
        String pwd = "pwd1"; 
        String fullname = "employee1"; 
        String email = "employee1@gmail.com"; 
          
        try
        { 
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
            Connection con = DriverManager.getConnection(" 
             jdbc:oracle:thin:@localhost:1521:orcl", "login1", "pwd1"); 
            Statement stmt = con.createStatement(); 
              
            // Inserting data in database 
            String q1 = "insert into userid values('" +id+ "', '" +pwd+  
                                  "', '" +fullname+ "', '" +email+ "')"; 
            int x = stmt.executeUpdate(q1); 
            if (x > 0)             
                System.out.println("Successfully Inserted");             
            else            
                System.out.println("Insert Failed"); 
              
            con.close(); 
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        } 
    } 
} 
