
package Model;

import java.util.Date;

/**
 *
 * @author richy
 */
public class Person {
    
    private int nroIdentificacion;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String lugarNacimiento;
    private String pais;
    private String dept;
    private String ciudad;
    private int fijo;
    private int celular;

    public Person() {
    }

    public Person(int nroIdentificacion, String nombres, String apellidos, String fechaNacimiento, String lugarNacimiento, String pais, String dept, String ciudad, int fijo, int celular) {
        this.nroIdentificacion = nroIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.pais = pais;
        this.dept = dept;
        this.ciudad = ciudad;
        this.fijo = fijo;
        this.celular = celular;
    }
    
    
    public int getNroIdentificacion() {
        return nroIdentificacion;
    }

    public void setNroIdentificacion(int nroIdentificacion) {
        this.nroIdentificacion = nroIdentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }
    

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getFijo() {
        return fijo;
    }

    public void setFijo(int fijo) {
        this.fijo = fijo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    
    
}
