package pack1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OferteSejur {
	
	StringBuilder sb1 = citesteFisierul("OferteDubai.txt");
	
	// citim oferta de cazare din fisierul cu oferte
	
	public static StringBuilder citesteFisierul(String numeFisier) {
		File fisier = new File(numeFisier);
		StringBuilder sb1 = new StringBuilder();
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			 fr = new FileReader(fisier);
			 br = new BufferedReader(fr);

			String str;

			while ((str = br.readLine()) != null) {
				sb1.append(str);
				System.out.println(str);
			}
			return sb1;

		} catch (FileNotFoundException e) {
			System.out.println("Nu s-a gasit fisierul.");

			e.printStackTrace();

		} catch (IOException e) {
			System.out.println("Eroare la citire.");

			e.printStackTrace();
			
		} finally{
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		return null;
	
	}
	

}
