package com.itsdigitalacademy.corsocyber.scaffale.business;
import java.io.*;
import java.util.*;
import com.itsdigitalacademy.corsocyber.scaffale.beans.Libro;

public class LeggiFile {
	 static File filein;
	static ArrayList<Libro> scaffale= new ArrayList<Libro>();
	public static void main(String[]a){
	try{
		Date inizio= new Date();
		LeggiFile leggiFile=new LeggiFile();
	LeggiFile.filein = new File("C://FORMAZIONE//ITS_2022//Java//titoli_gennaio_marzo.txt");
		FileReader reader = new FileReader(filein);
		BufferedReader bReader= new BufferedReader(reader);
		
		{
			String riga =bReader.readLine();
			while (riga!=null) {
			
				//String riga = bReader.readLine();
			Libro libro = creaLibro(riga);
			scaffale.add(libro);
			riga=bReader.readLine();
			//int cont=0;
			//cont++;	
			//System.out.print(cont+", ");
			System.out.println(libro);
			
			
			
			}
			System.out.println(scaffale.size());
		
		bReader.close();
		reader.close();
		Date fine=new Date();
		long differenza= fine.getTime()-inizio.getTime();
		System.out.println("differenza");
		{
			}
		}
	} catch(Exception e){
		System.err.println("si è verificato un errore:" +e.getMessage());
	}
	
	}
	private static Libro creaLibro(String riga) {
String[] tokens = riga.split(";");
	
libro=RiempiLibro(tokens);
		return libro;
	}
	private static void RiempiLibro(String[] tokens) {
		Libro libro = new Libro();
		libro.setCodiceSocieta(tokens[0]);
		libro.setSocieta(tokens[1]);
		libro.setIsbn(tokens[2]);
		libro.setCheckDigit(tokens[3]);
		libro.setEdizione(tokens[4]);
		libro.setAutore(tokens[5]);
		libro.setTitolo(tokens[6]);
	
	}

}

	

