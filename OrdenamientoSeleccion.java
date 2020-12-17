
package ordenamientoseleccion;

import java.util.Scanner;

public class OrdenamientoSeleccion {

 
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int arreglo[]=new int[20];
        int a,i,j;
        System.out.println("ingrese el tamaño de arreglo");
        a=lector.nextInt();
        
        
        for(i=0;i<a;i++){
            arreglo[i]=lector.nextInt();
            System.out.println(", ");
            
        }
        
         for(i=0;i<a-1;i++){
           int posmenor=i;
           
             for ( j = i+1; j < a; j++) {
                 if(arreglo[j]<arreglo[posmenor])
                 {
                     posmenor=j;
                 }
             }
             int iaux=arreglo[i];
             
             arreglo[i]=arreglo[posmenor];
             arreglo[posmenor]=iaux;
            
        }
         
           System.out.println("orden seleccion");
         
        for ( i = 0; i < a; i++) {
            System.out.print(arreglo[i] + ",");

        }
        System.out.println("");
        
        
    }
    
}
