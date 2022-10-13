
import java.util.Scanner;
  
public class T3A1 {

    
    public static void main(String[] args) {
        procesar(); 
    }
    
   public static void procesar() {
    Scanner scanner = new Scanner (System.in);
    Calificaciones calificaciones = new Calificaciones ();
    
System.out.print("nombre");
String nombre = scanner.nextLine();
calificaciones.setNombre(nombre);

System.out.printf("Apellido Paterno:");
String apellidoPaterno = scanner .nextLine();
calificaciones.setApellidoPaterno(apellidoPaterno);

System.out.printf("Apellido Materno");
String apellidoMaterno = scanner.nextLine();
calificaciones.setApellidoMaterno(apellidoMaterno);




   
    