import java.sql.Connection;
import java.sql.DriverManager;
public class CP {
   static Connection con;
   
    public static Connection createConnection(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/studentSys","root","root");
        
        
        
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
        return con;
    }
    
}
