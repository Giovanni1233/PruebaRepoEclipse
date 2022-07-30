import java.io.*;
import java.io.IOException;

public class PromedioArray {

	public static void main(String[] args) throws IOException {
		
		 // Creo el archivo
		File archivo = new File("src/directorio");
		 if(archivo.mkdirs()) {
		 File archivo2 = new File("src/directorio/texto.txt");
		 FileWriter fileW2 = new FileWriter(archivo2);
		 }
		 
	}
}
