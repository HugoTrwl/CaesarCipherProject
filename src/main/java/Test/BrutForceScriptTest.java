package Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import Scripts.Scripts;

public class BrutForceScriptTest {
	@Test
	public void testBrutForce() {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	    	String[] BruteForce;
	    	char[] decodedText;
	    	java.util.List<Character> alphabetList;
	    	String resultBF = "";
	    	String cipherText = "texte à \n dechiffrer"; // Retour à la ligne et accent pour déclencher ArrayIndexOutOfBoundsException

	    	alphabetList = java.util.Arrays.asList(alphabet);
	    	BruteForce = new String[alphabet.length];
	    	
	        char[] message = cipherText.toUpperCase().toCharArray();
	        
	        for (int key = 0; key < alphabet.length; key++) {
	            decodedText = new char[message.length];
	            
	            for (int i = 0; i < message.length; i++) {
	                if (message[i] != ' ') {
	                    decodedText[i] = alphabet[(alphabetList.indexOf(message[i]) + key) % alphabet.length];
	                }else{
	                    decodedText[i] = ' ';
	                }
	            }
	            BruteForce[key] = String.valueOf(decodedText);
	        }
	        
	        for(int i = 0; i < alphabet.length; i++) {
	        	resultBF = resultBF + BruteForce[i] + "\n";
	        }
	        
        	System.out.println(resultBF);
		});
	}

}

