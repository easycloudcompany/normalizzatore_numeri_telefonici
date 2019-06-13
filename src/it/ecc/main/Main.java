package it.ecc.main;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 try {
	            System.out.print("Enter the file name with extension : ");

	            Scanner tastiera = new Scanner(System.in);
	            File file = new File(tastiera.nextLine());
	            tastiera.close();

	            Scanner input = new Scanner(file);

	            List<String> errori = new ArrayList<>();
	            List<String> normalizzati = new ArrayList<>();
	            List<String> duplicati = new ArrayList<>();
	            Map<String,String> duplicatiHM = new HashMap<>();
	            
	            while (input.hasNextLine()) {
	                String line = normalizePhoneNumber(input.nextLine());
	                if(line.contains("ERROR")){
	                	errori.add(line);
	                }else{
	                	if(duplicatiHM.get(line) != null){
	                		duplicati.add(line);
	                	}else{
	                		normalizzati.add(line);
	                		duplicatiHM.put(line, line);
	                	}
	                }
	            }
	            
	            input.close();
	            
	            System.out.println("NUMERI ERRATI: " + errori.size());
	            for (String err : errori) {
					System.out.println(err);
				}

	            System.out.println("\n\nNUMERI DUPLICATI: " + duplicati.size());
	            for (String dup : duplicati) {
	            	System.out.println(dup);
	            }
	            
	            System.out.println("\n\nNUMERI OK: " + normalizzati.size());
	            for (String ok : normalizzati) {
					System.out.println(ok);
				}

	            
	            System.out.println("\n\n--------------------------");
	            System.out.println("NUMERI ERRATI: " + errori.size());
	            System.out.println("NUMERI DUPLICATI: " + duplicati.size());
	            System.out.println("NUMERI OK: " + normalizzati.size());
	            System.out.println("--------------------------");

	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
		
		
		
	}

	private static String normalizePhoneNumber(String number) {
		try{
			number = number.replaceAll("[^+0-9]", ""); // All weird characters such as /, -, ...
		    if(number.length()==10 || number.length()==9 ){
		    	number = "+39" + number;
		    }else if(number.substring(0, 3).contains("+39")){
		    	return number;
		    }else{	
		    	number = "ERROR " + number;
		    }
		}catch (Exception e) {
			if(number.length()>0){
				number = "ERROR " + number;
			}
		}

		if(number.equalsIgnoreCase("")){
			return "ERROR - Empty row " + number;
		}else{
			return number;
		}
	}

}
