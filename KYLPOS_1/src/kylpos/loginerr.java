

package kylpos;
import java.sql.*;  
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Cecilio
 */
public class loginerr {
    String name = "4536";
    int wronglogin =0;
    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pst;
    
       public void err(){
        try {
            String host51 = "jdbc:mysql://YourDB_IP/sakila";
            String uName51 = "dbuser";
            String uPass51 = "YourPassword";
            con = DriverManager.getConnection(host51,uName51,uPass51);  
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            
                String sql = "select name from userinfo where name = '"+name+"'";
                rs = stmt.executeQuery(sql);
                
                            while(rs.next())
                                  {
                                   String name4 =  rs.getString(name);
				     
				    wronglogin = rs.getInt("logincount");
				
				  }
        pst = con.prepareStatement("update userinfo set logincount = ?");
        pst.setInt(1, wronglogin + 1);
        
        pst.executeUpdate();
                
                
        } catch (SQLException ex) {
            Logger.getLogger(loginerr.class.getName()).log(Level.SEVERE, null, ex);
        }
                                
       }
}
