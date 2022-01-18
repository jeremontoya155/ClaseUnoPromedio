
//El package 
package Principal;

//Clase princial

import static java.lang.Double.parseDouble;
import java.util.Scanner;




public class Principal {

    //el main
    public static void main(String[] args) {
        
        //Scanner nombre= new Scanner(Sustem.in);
        Scanner capturaPantalla=new Scanner(System.in);
        System.out.println("Escriba el nombre del alumno:");
        
        
        //Recuperar de la pantalla con el nextLine();
        String n_alumno=capturaPantalla.nextLine();
        
        
        
        
        //Parsear 
        
        double n1 = cargarNumero("1");
        double n2 = cargarNumero("2");
        double n3 = cargarNumero("3");
        double n4 = cargarNumero("4");
        double n5 = cargarNumero("5");
        
        double mostrar=promediar(n1,n2,n3,n4,n5);
        
        System.out.println("Alumno:"+n_alumno);
        System.out.println("Nota:"+mostrar);
        
        System.out.println("La primera nota fue:"+n1);
        
 
    }
    
    
    
    //Metodo static (Si no hay retorno void/en caso de que si va el tipo de datos)
    public static double promediar(double n1,double n2 ,double n3 ,double n4 ,double n5 ){
        
        
        
        
        double resultado= n1+n2+n3+n4+n5;
        
        
        //Salida de pantalla 
        //print TODO JUNTO
        //println SEPARA POR LINEA
       
        
        double promedio = resultado/5;
        
        
        return promedio;
        
        
    
        
    }
    
    public static double cargarNumero(String valor ){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique la nota "+valor);
        String nota=leer.nextLine();
        double nta=Double.parseDouble(nota);
        
        return nta;
        
    
    }
    
    
    
    
    
    
    
    
}
