package Scripts;

import java.util.Random;

/**
 * @author Hugo Turschwell / Quentin Galpin
 *
 */
public class Scripts {
	
	String shift;
	String textIn;

	public Scripts() {
		/**
		 * constructeur vide
		 */
		this.textIn = new String();
	}
	
	public Scripts(String shift, String textIn) {
		/**
		 * constructeur "plein"
		 */
		this.shift = shift;
		this.textIn = textIn;
	}
	
	
	public static String generateRandomChars(String candidateChars, int length) {
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < length; i++) {
	        sb.append(candidateChars.charAt(random.nextInt(candidateChars
	                .length())));
	    }

	    return sb.toString();
	}

	

	public static String randomUpper(String str, double p) {
	    int letters = 0;
	    for (int i = 0; i < str.length(); i++) {
	        if (Character.isLetter(str.charAt(i)))
	            letters++;
	    }

	    int toChoose = (int) (p * letters);
	    StringBuilder sb = new StringBuilder(str.length());
	    for (int i = 0; i < str.length(); i++) {
	        char c = str.charAt(i);
	        if (Character.isLetter(c)) {
	            if (Math.random() < (toChoose/(double)letters)) {
	                c = Character.toUpperCase(c);
	                toChoose--;
	            }
	            letters--;
	        }           
	        sb.append(c);
	    }
	    return sb.toString();
	}
	
	/**
     * Chiffrement basique
     */
	public static String Encryption(String shift, String textIn) {
		String EncrTextChiffr = "";
		
		try {
			int decalage = Integer.parseInt(shift);
			
	    	String EncrTextClair = textIn;
	        
	        char EncrAlphabet;
	        
	        for(int i=0; i < EncrTextClair.length(); i++) {
	             // Décalage d'un caractère à la fois
	        	EncrAlphabet = EncrTextClair.charAt(i);
	            
	            if(EncrAlphabet >= 'a' && EncrAlphabet <= 'z') {
		             // Décalage de l'alphabet
	            	EncrAlphabet = (char) (EncrAlphabet + decalage);
		
		             if(EncrAlphabet > 'z') {
		                // Re-décalage à la position initiale 
		            	 EncrAlphabet = (char) (EncrAlphabet+'a'-'z'- 1);
		             }
		             
		             EncrTextChiffr = EncrTextChiffr + EncrAlphabet;
	            } else if(EncrAlphabet >= 'A' && EncrAlphabet <= 'Z') {
	            	EncrAlphabet = (char) (EncrAlphabet + decalage);    
					    
					 if(EncrAlphabet > 'Z') {
						 EncrAlphabet = (char) (EncrAlphabet+'A'-'Z'- 1);
					 }
					 
					 EncrTextChiffr = EncrTextChiffr + EncrAlphabet;
	            } else {
	            	EncrTextChiffr = EncrTextChiffr + EncrAlphabet;   
	            }
	        }
	    } catch (NumberFormatException e) {
	    	e.printStackTrace();
	    }
		return EncrTextChiffr;
	}
	
	/**
     * Chiffrement avec lettres majuscules aléatoires
     */
	public static String EncryptionU(String shift, String textIn) {
		String EncrTextChiffr = "";
		
		try {
			int decalage = Integer.parseInt(shift);
			
	    	String EncrTextClair = textIn;
	        
	        char EncrAlphabet;
	        
	        for(int i=0; i < EncrTextClair.length(); i++) {
	             // Décalage d'un caractère à la fois
	        	EncrAlphabet = EncrTextClair.charAt(i);
	            
	            if(EncrAlphabet >= 'a' && EncrAlphabet <= 'z') {
		             // Décalage de l'alphabet
	            	EncrAlphabet = (char) (EncrAlphabet + decalage);
		
		             if(EncrAlphabet > 'z') {
		                // Re-décalage à la position initiale 
		            	 EncrAlphabet = (char) (EncrAlphabet+'a'-'z'- 1);
		             }
		             
		             EncrTextChiffr = EncrTextChiffr + EncrAlphabet;
	            } else if(EncrAlphabet >= 'A' && EncrAlphabet <= 'Z') {
	            	EncrAlphabet = (char) (EncrAlphabet + decalage);    
					    
					 if(EncrAlphabet > 'Z') {
						 EncrAlphabet = (char) (EncrAlphabet+'A'-'Z'- 1);
					 }
					 
					 EncrTextChiffr = EncrTextChiffr + EncrAlphabet;
	            } else {
	            	EncrTextChiffr = EncrTextChiffr + EncrAlphabet;   
	            }
	            EncrTextChiffr = randomUpper(EncrTextChiffr,0.5);
	        }
	    } catch (NumberFormatException e) {
	    	e.printStackTrace();
	    }
		return EncrTextChiffr;
	}
	
	/**
     * Chiffrement avec nombres aléatoires
     */
	public static String EncryptionN(String shift, String textIn) {
		String EncrTextChiffr = "";
		
		try {
			int decalage = Integer.parseInt(shift);
			
	    	String EncrTextClair = textIn;
	        
	        char EncrAlphabet;
	        
	        for(int i=0; i < EncrTextClair.length(); i++) {
	             // Décalage d'un caractère à la fois
	        	EncrAlphabet = EncrTextClair.charAt(i);
	            
	            if(EncrAlphabet >= 'a' && EncrAlphabet <= 'z') {
		             // Décalage de l'alphabet
	            	EncrAlphabet = (char) (EncrAlphabet + decalage);
		
		             if(EncrAlphabet > 'z') {
		                // Re-décalage à la position initiale 
		            	 EncrAlphabet = (char) (EncrAlphabet+'a'-'z'- 1);
		             }
		             
		             EncrTextChiffr = EncrTextChiffr + EncrAlphabet;
	            } else if(EncrAlphabet >= 'A' && EncrAlphabet <= 'Z') {
	            	EncrAlphabet = (char) (EncrAlphabet + decalage);    
					    
					 if(EncrAlphabet > 'Z') {
						 EncrAlphabet = (char) (EncrAlphabet+'A'-'Z'- 1);
					 }
					 
					 EncrTextChiffr = EncrTextChiffr + EncrAlphabet;
	            } else {
	            	EncrTextChiffr = EncrTextChiffr + EncrAlphabet;   
	            }
	           String RandomNumber = generateRandomChars("0123456789",2);
	           EncrTextChiffr = EncrTextChiffr + RandomNumber;
	        }
	    } catch (NumberFormatException e) {
	    	e.printStackTrace();
	    }
		return EncrTextChiffr;
	}
	
	/**
     * Chiffrement avec majuscules et nombres aléatoires
     */
	public static String EncryptionUN(String shift, String textIn) {
		String EncrTextChiffr = "";
		
		try {
			int decalage = Integer.parseInt(shift);
			
	    	String EncrTextClair = textIn;
	        
	        char EncrAlphabet;
	        
	        for(int i=0; i < EncrTextClair.length(); i++) {
	             // Décalage d'un caractère à la fois
	        	EncrAlphabet = EncrTextClair.charAt(i);
	            
	            if(EncrAlphabet >= 'a' && EncrAlphabet <= 'z') {
		             // Décalage de l'alphabet
	            	EncrAlphabet = (char) (EncrAlphabet + decalage);
		
		             if(EncrAlphabet > 'z') {
		                // Re-décalage à la position initiale 
		            	 EncrAlphabet = (char) (EncrAlphabet+'a'-'z'- 1);
		             }
		             
		             EncrTextChiffr = EncrTextChiffr + EncrAlphabet;
	            } else if(EncrAlphabet >= 'A' && EncrAlphabet <= 'Z') {
	            	EncrAlphabet = (char) (EncrAlphabet + decalage);    
					    
					 if(EncrAlphabet > 'Z') {
						 EncrAlphabet = (char) (EncrAlphabet+'A'-'Z'- 1);
					 }
					 
					 EncrTextChiffr = EncrTextChiffr + EncrAlphabet;
	            } else {
	            	EncrTextChiffr = EncrTextChiffr + EncrAlphabet;   
	            }
	            EncrTextChiffr = randomUpper(EncrTextChiffr,0.5);
	            String RandomNumber = generateRandomChars("0123456789",2);
		        EncrTextChiffr = EncrTextChiffr + RandomNumber;
	        }
	    } catch (NumberFormatException e) {
	    	e.printStackTrace();
	    }
		return EncrTextChiffr;
	}
	
	/**
     * Chiffrement avec symboles aléatoires
     */
	public static String EncryptionS(String shift, String textIn) {
		String EncrTextChiffr = "";
		
		try {
			int decalage = Integer.parseInt(shift);
			
	    	String EncrTextClair = textIn;
	        
	        char EncrAlphabet;
	        
	        for(int i=0; i < EncrTextClair.length(); i++) {
	             // Décalage d'un caractère à la fois
	        	EncrAlphabet = EncrTextClair.charAt(i);
	            
	            if(EncrAlphabet >= 'a' && EncrAlphabet <= 'z') {
		             // Décalage de l'alphabet
	            	EncrAlphabet = (char) (EncrAlphabet + decalage);
		
		             if(EncrAlphabet > 'z') {
		                // Re-décalage à la position initiale 
		            	 EncrAlphabet = (char) (EncrAlphabet+'a'-'z'- 1);
		             }
		             
		             EncrTextChiffr = EncrTextChiffr + EncrAlphabet;
	            } else if(EncrAlphabet >= 'A' && EncrAlphabet <= 'Z') {
	            	EncrAlphabet = (char) (EncrAlphabet + decalage);    
					    
					 if(EncrAlphabet > 'Z') {
						 EncrAlphabet = (char) (EncrAlphabet+'A'-'Z'- 1);
					 }
					 
					 EncrTextChiffr = EncrTextChiffr + EncrAlphabet;
	            } else {
	            	EncrTextChiffr = EncrTextChiffr + EncrAlphabet;   
	            }
	            String RandomSymbol = generateRandomChars("%$&+°-_,;!?",2);
		        EncrTextChiffr = EncrTextChiffr + RandomSymbol;
	        }
	    } catch (NumberFormatException e) {
	    	e.printStackTrace();
	    }
		return EncrTextChiffr;
	}
	
	/**
     * Chiffrement avec symboles et majuscules aléatoires
     */
	public static String EncryptionSU(String shift, String textIn) {
		String EncrTextChiffr = "";
		
		try {
			int decalage = Integer.parseInt(shift);
			
	    	String EncrTextClair = textIn;
	        
	        char EncrAlphabet;
	        
	        for(int i=0; i < EncrTextClair.length(); i++) {
	             // Décalage d'un caractère à la fois
	        	EncrAlphabet = EncrTextClair.charAt(i);
	            
	            if(EncrAlphabet >= 'a' && EncrAlphabet <= 'z') {
		             // Décalage de l'alphabet
	            	EncrAlphabet = (char) (EncrAlphabet + decalage);
		
		             if(EncrAlphabet > 'z') {
		                // Re-décalage à la position initiale 
		            	 EncrAlphabet = (char) (EncrAlphabet+'a'-'z'- 1);
		             }
		             
		             EncrTextChiffr = EncrTextChiffr + EncrAlphabet;
	            } else if(EncrAlphabet >= 'A' && EncrAlphabet <= 'Z') {
	            	EncrAlphabet = (char) (EncrAlphabet + decalage);    
					    
					 if(EncrAlphabet > 'Z') {
						 EncrAlphabet = (char) (EncrAlphabet+'A'-'Z'- 1);
					 }
					 
					 EncrTextChiffr = EncrTextChiffr + EncrAlphabet;
	            } else {
	            	EncrTextChiffr = EncrTextChiffr + EncrAlphabet;   
	            }
	            EncrTextChiffr = randomUpper(EncrTextChiffr,0.5);
	            String RandomSymbol = generateRandomChars("%$&+°-_,;!?",2);
		        EncrTextChiffr = EncrTextChiffr + RandomSymbol;
	        }
	    } catch (NumberFormatException e) {
	    	e.printStackTrace();
	    }
		return EncrTextChiffr;
	}
	
	/**
     * Chiffrement avec symboles et nombres aléatoires
     */
	public static String EncryptionSN(String shift, String textIn) {
		String EncrTextChiffr = "";
		
		try {
			int decalage = Integer.parseInt(shift);
			
	    	String EncrTextClair = textIn;
	        
	        char EncrAlphabet;
	        
	        for(int i=0; i < EncrTextClair.length(); i++) {
	             // Décalage d'un caractère à la fois
	        	EncrAlphabet = EncrTextClair.charAt(i);
	            
	            if(EncrAlphabet >= 'a' && EncrAlphabet <= 'z') {
		             // Décalage de l'alphabet
	            	EncrAlphabet = (char) (EncrAlphabet + decalage);
		
		             if(EncrAlphabet > 'z') {
		                // Re-décalage à la position initiale 
		            	 EncrAlphabet = (char) (EncrAlphabet+'a'-'z'- 1);
		             }
		             
		             EncrTextChiffr = EncrTextChiffr + EncrAlphabet;
	            } else if(EncrAlphabet >= 'A' && EncrAlphabet <= 'Z') {
	            	EncrAlphabet = (char) (EncrAlphabet + decalage);    
					    
					 if(EncrAlphabet > 'Z') {
						 EncrAlphabet = (char) (EncrAlphabet+'A'-'Z'- 1);
					 }
					 
					 EncrTextChiffr = EncrTextChiffr + EncrAlphabet;
	            } else {
	            	EncrTextChiffr = EncrTextChiffr + EncrAlphabet;   
	            }
	            String RandomSymbol = generateRandomChars("%$&+°-_,;!?",2);
		        EncrTextChiffr = EncrTextChiffr + RandomSymbol;
		        String RandomNumber = generateRandomChars("0123456789",2);
		        EncrTextChiffr = EncrTextChiffr + RandomNumber;
	        }
	    } catch (NumberFormatException e) {
	    	e.printStackTrace();
	    }
		return EncrTextChiffr;
	}
	
	/**
     * Chiffrement avec symboles, majuscules et nombres aléatoires
     */
	public static String EncryptionSUN(String shift, String textIn) {
		String EncrTextChiffr = "";
		
		try {
			int decalage = Integer.parseInt(shift);
			
	    	String EncrTextClair = textIn;
	        
	        char EncrAlphabet;
	        
	        for(int i=0; i < EncrTextClair.length(); i++) {
	             // Décalage d'un caractère à la fois
	        	EncrAlphabet = EncrTextClair.charAt(i);
	            
	            if(EncrAlphabet >= 'a' && EncrAlphabet <= 'z') {
		             // Décalage de l'alphabet
	            	EncrAlphabet = (char) (EncrAlphabet + decalage);
		
		             if(EncrAlphabet > 'z') {
		                // Re-décalage à la position initiale 
		            	 EncrAlphabet = (char) (EncrAlphabet+'a'-'z'- 1);
		             }
		             
		             EncrTextChiffr = EncrTextChiffr + EncrAlphabet;
	            } else if(EncrAlphabet >= 'A' && EncrAlphabet <= 'Z') {
	            	EncrAlphabet = (char) (EncrAlphabet + decalage);    
					    
					 if(EncrAlphabet > 'Z') {
						 EncrAlphabet = (char) (EncrAlphabet+'A'-'Z'- 1);
					 }
					 
					 EncrTextChiffr = EncrTextChiffr + EncrAlphabet;
	            } else {
	            	EncrTextChiffr = EncrTextChiffr + EncrAlphabet;   
	            }
	            EncrTextChiffr = randomUpper(EncrTextChiffr,0.5);
	            String RandomSymbol = generateRandomChars("%$&+°-_,;!?",2);
		        EncrTextChiffr = EncrTextChiffr + RandomSymbol;
		        String RandomNumber = generateRandomChars("0123456789",2);
		        EncrTextChiffr = EncrTextChiffr + RandomNumber;
	        }
	    } catch (NumberFormatException e) {
	    	e.printStackTrace();
	    }
		return EncrTextChiffr;
	}
	

	/**
     * Déchiffrement basique
     */
	public static String Decryption(String shift, String textIn) {
		String DecrTextClair = "";
		
		try {
			int decalage = Integer.parseInt(shift);

	        String DecrTextChiffr = textIn;
		    
		    for(int i=0; i < DecrTextChiffr.length(); i++) {
		        // Décalage d'un caractère à la fois
		        char DecrAlphabet = DecrTextChiffr.charAt(i);

		        if(DecrAlphabet >= 'a' && DecrAlphabet <= 'z') {
		            // Décalage de l'alphabet
		        	DecrAlphabet = (char) (DecrAlphabet - decalage);
		        
		            if(DecrAlphabet < 'a') {
		                // Re-décalage à la position initiale 
		            	DecrAlphabet = (char) (DecrAlphabet-'a'+'z'+ 1);
		            }
		            
		            DecrTextClair = DecrTextClair + DecrAlphabet;
		        } else if(DecrAlphabet >= 'A' && DecrAlphabet <= 'Z') {
		        	DecrAlphabet = (char) (DecrAlphabet - decalage);
		            
		            if (DecrAlphabet < 'A') {
		            	DecrAlphabet = (char) (DecrAlphabet-'A'+'Z'+ 1);
		            }
		            
		            DecrTextClair = DecrTextClair + DecrAlphabet;            
		        } else {
		        	DecrTextClair = DecrTextClair + DecrAlphabet;            
		        } 
		    }
	    } catch (NumberFormatException e) {
	    	e.printStackTrace();
	    }
		
		return DecrTextClair;
	}
    
	/**
     * Déchiffrement par force brute
     */
    public static String producePlaintext(String cipherText) {
        Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    	String[] BruteForce;
    	char[] decodedText;
    	java.util.List<Character> alphabetList;
    	String resultBF = "";
    	
    	alphabetList = java.util.Arrays.asList(alphabet);
    	BruteForce = new String[alphabet.length];
        
    	// Mettre toutes les lettres dans un tableau
        char[] message = cipherText.toUpperCase().toCharArray();
        
        // Tester tous les décalages disponibles
        for (int key = 0; key < alphabet.length; key++) {
            
        	// Mettre la meme valeur du tableau des valeurs déchiffrées que la longueur du texte chiffré
            decodedText = new char[message.length];
            
            // Boucler tous les caractères du texte chiffré
            for (int i = 0; i < message.length; i++) {
                
            	// Si le caractère n'est pas un espace
                if (message[i] != ' ') {
                    // Décaler les lettres
                    decodedText[i] = alphabet[(alphabetList.indexOf(message[i]) + key) % alphabet.length];
                }else{
                    decodedText[i] = ' ';
                }
            }
            BruteForce[key] = String.valueOf(decodedText);
        }
        
        // Afficher les résultats les uns en dessous des autres
        for(int i = 0; i < alphabet.length; i++) {
        	resultBF = resultBF + BruteForce[i] + "\n";
        }
        
        return resultBF;
    }
}