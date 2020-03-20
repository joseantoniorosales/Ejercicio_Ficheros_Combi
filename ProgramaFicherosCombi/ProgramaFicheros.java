package programaficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ProgramaFicheros {

	public static void main(String[] args) {

		try {

			BufferedReader br1 = new BufferedReader(new FileReader("fichero1.txt"));
			BufferedReader br2 = new BufferedReader(new FileReader("fichero2.txt"));
			BufferedWriter bw1 = new BufferedWriter(new FileWriter("mezcla.txt"));
			
			ArrayList<String> lista = new ArrayList<>();

			String linea1 = "";
			String linea2 = "";
			
			

			do {

				lista.add(linea1);
				linea1 = br1.readLine();

				lista.add(linea2);
				linea2 = br2.readLine();

			} while ((linea1 != null) || (linea2 != null));

			br1.close();
			br2.close();

			Collections.sort(lista);

			for (String string : lista) {

				bw1.write(string + "\n");

				System.out.println(string);
				

			}

			bw1.close();
			
			

		} catch (FileNotFoundException fnf) {

			System.out.println("No se han encontrado los archivos especificados");

		} catch (IOException ioe) {

			System.out.println("Error de lectura/escritura");

		}

	}

}
