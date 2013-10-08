package empleado;

public class EmpleadoAsalariado extends Empleado
{
    private double salarioSemanal;
    
    //Constructor
   public EmpleadoAsalariado(String nombre, String apellido, String numeroSeguroSocial, double salario)
   {
   super( nombre, apellido, numeroSeguroSocial );
   establecerSalarioSemanal( salario );
   }
   //Establecer salario del empleado asalareado
   public void establecerSalarioSemanal( double salario )
   {
       salarioSemanal = salario < 0.0 ? 0.0 : salario;
   }
   
   //devolve el salario de empleado asalareado
   public double obtenerSalarioSemanal()
   {
   return salarioSemanal;
   }
   
   //calcular el pago del empleado asalareado
   //sobreescribir el metodo abstracto ingresos de Empleado
   
   public double ingresos()
   {
   return obtenerSalarioSemanal();
   }
   
   //devolver la represenacion de String del objeto EmpleadoAsalariado
   public String toString()
   {
   return "\nempleado asalareado: " + super.toString();
   }
} //fin de la clase EmpleadoAsalareado