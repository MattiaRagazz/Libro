package com.itsdigitalacademy.corsocyber.scaffale.business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;

import com.itsdigitalacademy.corsocyber.scaffale.beans.Libro;
import com.itsdigitalacademy.corsocyber.scaffale.beans.RigheErrate;

public class LeggiFile {
	 static File filein;
	 File fileout;
	 static ArrayList<Libro> scaffale= new ArrayList<Libro>();
	ArrayList<RigheErrate> righeErrate = new ArrayList<RigheErrate>();
	public static void main(String[]a){
		LeggiFile leggiFile=new LeggiFile();
		try{
		Date inizio= new Date();
		
	LeggiFile.filein = new File("C://FORMAZIONE//ITS_2022//Java//titoli_gennaio_marzo.txt");
		FileReader reader = new FileReader(filein);
		BufferedReader bReader= new BufferedReader(reader);
		
		{
			String riga =bReader.readLine();
			while (riga!=null) {
		
			Libro libro = creaLibro(riga);
			scaffale.add(libro);
			riga=bReader.readLine();
			
			System.out.println(libro);	
			
			System.out.println(scaffale.size());
			
	    bReader.close();
		reader.close();
		Date fine=new Date();
		long differenza= fine.getTime()-inizio.getTime();
		System.out.println("differenza");
			}
		}
		leggi.fileout=new File("C://FORMAZIONE//ITS_2022//Java//rigaerrore.txt");
		FileWriter writer = new FileWriter(leggi.fileout);
		BufferedWriter bwriter = new BufferedWriter (write);
		bwriter.write("Queste sono le righe errate");
		bwriter.write("\n");
		bwriter.close();
		writer.close();
		System.out.println("Gli errori sono nel file "+leggi.fileout.getAbsolutePath());
	} catch(Exception e){
		System.err.println("si è verificato un errore:" +e.getMessage());
	}
	
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
leggi.righeErrate.add(riga);
