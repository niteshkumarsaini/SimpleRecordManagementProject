import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
public class DAO {
   static boolean flag=false;
   static ResultSet r;
   public static boolean insertData(DataClass st){
        try{
    Connection c=CP.createConnection();
    String query="insert into student (sid,sName,sCity,sPhone) values(?,?,?,?)";
   PreparedStatement ps= c.prepareStatement(query);
   ps.setInt(1, st.getterSid());
   ps.setString(2, st.getterSname());
   ps.setString(3, st.gettersCity());
   ps.setInt(4, st.gettersPhone());
   ps.executeUpdate();
   flag=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return flag;
       
    }
    public static boolean deleteData(int sid){
       try{
           Connection c=CP.createConnection();
           String query="delete from student where sid=?";
              PreparedStatement ps= c.prepareStatement(query);
              ps.setInt(1, sid);
              ps.executeUpdate();
              flag=true;
           
           
           
           
       }
       catch(Exception e){
           e.printStackTrace();
       }
       return flag;
    }
    public static ResultSet showData(){
        try{
        Connection c=CP.createConnection();
        String query="select * from student";
        Statement ss=c.createStatement();
       r=ss.executeQuery(query);
       
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return r;
    }
        
    
}
