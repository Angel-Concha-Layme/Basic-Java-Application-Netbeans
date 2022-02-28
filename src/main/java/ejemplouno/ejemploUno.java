package ejemplouno; // orden dentro de nuestras clases - arbol
import java.util.Scanner;

/**
 *
 * @author aconcchal
 */
public class ejemploUno {
    public static void main(String args[]){
        String palabra = "", palabra_invertida ="";
        int longitud_palabra=0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una palabra: ");
        palabra = entrada.nextLine();
        
        longitud_palabra = palabra.length();

        while (longitud_palabra !=0){
            palabra_invertida += palabra.substring(longitud_palabra-1,longitud_palabra);
            longitud_palabra -=1;
        }
        System.out.println(palabra_invertida);                
    }
}
