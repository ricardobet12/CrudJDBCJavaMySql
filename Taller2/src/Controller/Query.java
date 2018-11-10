package Controller;

import Model.Person;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author richy
 */
public class Query extends DB {

    private DB mysql = new DB();
    private Connection cn = mysql.conectar();
    private String sSql = "";
    public Integer totalRegistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"Nro Identificacion", "Nombres", "Apellidos", "Fecha Nacimiento","Lugar nacimiento", "Pais", "Departamento", "Ciudad", "Telefono Fijo", "Celular"};

        String[] registro = new String[10];

        totalRegistros = 0;

        modelo = new DefaultTableModel(null, titulos);

        sSql = "select * from registro where nro_id like '%" + buscar + "%' order by nro_id";

        try {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);

            while (rs.next()) {
                registro[0] = rs.getString("nro_id");
                registro[1] = rs.getString("nombres");
                registro[2] = rs.getString("apellidos");
                registro[3] = rs.getString("fecha_nacimiento");
                registro[4] = rs.getString("lugar_nacimiento");
                registro[5] = rs.getString("pais");
                registro[6] = rs.getString("departamento");
                registro[7] = rs.getString("ciudad");
                registro[8] = rs.getString("fijo");
                registro[9] = rs.getString("celular");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar(Person dts) {
        sSql = "insert into registro(nro_id,nombres,apellidos,fecha_nacimiento,lugar_nacimiento,pais,departamento,ciudad,fijo,celular)"
                + "values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSql);
            pst.setInt(1, dts.getNroIdentificacion());
            pst.setString(2, dts.getNombres());
            pst.setString(3, dts.getApellidos());
            pst.setString(4, dts.getFechaNacimiento());
            pst.setString(5, dts.getLugarNacimiento());
            pst.setString(6, dts.getPais());
            pst.setString(7, dts.getDept());
            pst.setString(8, dts.getCiudad());
            pst.setInt(9, dts.getFijo());
            pst.setInt(10, dts.getCelular());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Person dts) {
        sSql = "update registro set nombres=?,apellidos=?,fecha_nacimiento=?,lugar_nacimiento=?,pais=?,departamento=?,ciudad=?,fijo=?,celular=? where nro_id=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSql);
            //pst.setInt(1, dts.getNroIdentificacion());
            pst.setString(1, dts.getNombres());
            pst.setString(2, dts.getApellidos());
            pst.setString(3, dts.getFechaNacimiento());
            pst.setString(4, dts.getLugarNacimiento());
            pst.setString(5, dts.getPais());
            pst.setString(6, dts.getDept());
            pst.setString(7, dts.getCiudad());
            pst.setInt(8, dts.getFijo());
            pst.setInt(9, dts.getCelular());
            pst.setInt(10, dts.getNroIdentificacion());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Person dts) {
        sSql = "delete from registro where nro_id=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSql);
            pst.setInt(1, dts.getNroIdentificacion());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
