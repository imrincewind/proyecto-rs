package principal;
import java.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.StringTokenizer;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

 
public class LeerArchivo{
	Integer valor = 0;
	Integer ubicacion = 0;
	
	
    public Integer obtenerValor (ElementoMineral e, String urlArchivo) throws java.io.IOException
    {
    
 ubicacion = e.getUbicacion();
        String s1;
        String s2;
 
        // Cargamos el buffer con el contenido del archivo
        BufferedReader br = new BufferedReader (new FileReader (urlArchivo));
 
        // Leemos la primera linea
        s1 = br.readLine();
        String temp="";
        String bfRead;
        while((bfRead = br.readLine())!=null){
        //haz el ciclo, mientras bfRead tiene datos
        temp = temp + bfRead + "\n";
        }
        s1 = temp;
        System.out.println ("La primera linea del archivo es: " + s1);
        System.out.println ("La linea tiene " + s1.length() + " caracteres");
 
        System.out.println ();
        System.out.println ("Separando la linea en trozos tenemos las siguientes palabras:");
 
        Integer numTokens = 0;
        StringTokenizer st = new StringTokenizer (s1);
 
        // bucle por todas las palabras
        while (st.hasMoreTokens())
        {
            s2 = st.nextToken();
            if (numTokens.equals(ubicacion)){
            	
            	if(s2.length() == 6){
            		String c1=s2.substring(0,2);
            		String c2=s2.substring(3);
            		s2 = c1 + c2;
            		System.out.println("c1 = " +c1 +".c2 = " + c2 + ".s2 = " +s2 + ".");
            	}else if (s2.length() == 5) {
            		String c1=s2.substring(0,1);
            		String c2=s2.substring(2);
            		s2 = c1 + c2;
            		System.out.println("c1 = " +c1 +".c2 = " + c2 + ".s2 = " +s2 + ".");
				}
            	valor = Integer.parseInt(s2);}
            numTokens++;
            System.out.println ("    Palabra " + numTokens + " es: " + s2);
        
		
    }return valor;
}}