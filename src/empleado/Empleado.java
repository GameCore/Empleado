
package empleado;

/**
 *
 * @author Pablo
 */
public abstract class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
    //constructor
    public Empleado( String nombre, String apellido, String ssn )
    {
    primerNombre = nombre;
    apellidoPaterno = apellido;
    numeroSeguroSocial = ssn ;
    }
    
    //establecer primer nombre
    public void establecerPrimerNombre(String nombre)
    {
    primerNombre = nombre;    
    }
    
    //devuelve el primer nombre
    public String obtenerPrimerNombre()
    {
    return primerNombre;
    }
    
   //Establecer el apellido
    public void establecerApellidoPaterno( String apellido )
    {
      apellidoPaterno =  apellido;
    }   
    
    //devuelve el apellido
    public String obtenerApellidoPaterno()
    {
    return apellidoPaterno;
    }
    
    //establecer el numero de seguro social
    
    public void establecerNumeroSeguroSocial ( String numero )
    {
    numeroSeguroSocial = numero;
    }
    //devuelve el numero del seguro social
    public String obtenerNumeroSeguroSocial()
    {
    return numeroSeguroSocial;
    }
    //devolver representacion de String del Objeto empleado
    
    public String toString()
    {
    return obtenerPrimerNombre() + "" + obtenerApellidoPaterno() + "\nnúmero de seguro social: " + obtenerNumeroSeguroSocial();
    }
    
    //Metodo abstracto debe ser sobrescrito por las subclases
    public abstract double ingresos();
    
    
    
      
    
}
