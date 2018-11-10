
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author richy
 */
public class DB {
      
    public String db="bdTaller2";
    public String url="jdbc:mysql://localhost:3306/"+db;
    public String user="root";
    public String pass="ricardo12";

    public DB() {
    }
    
    public Connection conectar(){
        Connection link=null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link=(Connection) DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }
    
}
