
package cursohilosculiacan.ClaseJueves;
//Ejercicio 6
//Imprimimos datos de dos archivos
import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamTest1 {
    
    public static void main (String [] args) throws Exception{
        FileInputStream fin1 = new FileInputStream("C:\\f1.txt");
        FileInputStream fin2 = new FileInputStream("C:\\f2.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
        
        int i;
        while((i=sis.read())!= -1) {
            System.out.println((char) i);
        } 
        sis.close();
        fin1.close();
        fin2.close();
    }
    
}
