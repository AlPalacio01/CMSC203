package abc;

/**
 * This is a utility class that encrypts and decrypts a phrase using three
 * different approaches. 
 * 
 * The first approach is called the Vigenere Cipher.Vigenere encryption 
 * is a method of encrypting alphabetic text based on the letters of a keyword.
 * 
 * The second approach is Playfair Cipher. It encrypts two letters (a digraph) 
 * at a time instead of just one.
 * 
 * The third approach is Caesar Cipher. It is a simple replacement cypher. 
 * 
 * @author Huseyin Aygun
 * @version 8/3/2025
 */

public class CryptoManager { 

    private static final char LOWER_RANGE = ' ';
    private static final char UPPER_RANGE = '_';
    private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;
    // Use 64-character matrix (8X8) for Playfair cipher  
    private static final String ALPHABET64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_";

    public static boolean isStringInBounds(String plainText) {
        for (int i = 0; i < plainText.length(); i++) {
            if (!(plainText.charAt(i) >= LOWER_RANGE && plainText.charAt(i) <= UPPER_RANGE)) {
                return false;
            }
        }
        return true;
    }

	/**
	 * Vigenere Cipher is a method of encrypting alphabetic text 
	 * based on the letters of a keyword. It works as below:
	 * 		Choose a keyword (e.g., KEY).
	 * 		Repeat the keyword to match the length of the plaintext.
	 * 		Each letter in the plaintext is shifted by the position of the 
	 * 		corresponding letter in the keyword (A = 0, B = 1, ..., Z = 25).
	 */   

    public static String vigenereEncryption(String plainText, String key) {
    	
    	if (!isStringInBounds(plainText)) {
    		return ("The selected string is not in bounds, Try again.");
    	}
    	
    	StringBuilder stringbuilder = new StringBuilder();
    	
    	for (int i = 0; i < plainText.length(); i++) {
    		
    		char plainTextCharacter = plainText.charAt(i);
    		char keyCharacter = key.charAt(i % key.length());
    		
    		int encryptedLetterValue = (((plainTextCharacter - LOWER_RANGE) + (keyCharacter - LOWER_RANGE)) % RANGE);
    		
    		char encryptedCharacterValue = (char) (encryptedLetterValue + LOWER_RANGE);
    		
    		stringbuilder.append(encryptedCharacterValue);
    	}
    	
    	return stringbuilder.toString();
    }

    // Vigenere Decryption
    public static String vigenereDecryption(String encryptedText, String key) {
    	
    	if (!isStringInBounds(encryptedText)) {
    		return ("The selected string is not in bounds, Try again.");
    	}
    	
    	StringBuilder stringbuilder = new StringBuilder();
    	
    	for (int i = 0; i < encryptedText.length(); i++) {
    		
    		char encryptedCharacter = encryptedText.charAt(i);
    		char keyCharacter = key.charAt(i % key.length());
    		
    		int decryptedLetterValue = (((encryptedCharacter - LOWER_RANGE) - (keyCharacter - LOWER_RANGE) + RANGE) % RANGE);
    		
    		char decryptedCharacterValue = (char) (decryptedLetterValue + LOWER_RANGE);
    		
    		stringbuilder.append(decryptedCharacterValue);
    	}
    	
    	return stringbuilder.toString();
    }


	/**
	 * Playfair Cipher encrypts two letters at a time instead of just one.
	 * It works as follows:
	 * A matrix (8X8 in our case) is built using a keyword
	 * Plaintext is split into letter pairs (e.g., ME ET YO UR).
	 * Encryption rules depend on the positions of the letters in the matrix:
	 *     Same row: replace each letter with the one to its right.
	 *     Same column: replace each with the one below.
	 *     Rectangle: replace each letter with the one in its own row but in the column of the other letter in the pair.
	 */    

    public static String playfairEncryption(String plainText, String key) {
    	
    	if (!isStringInBounds(plainText) || !isStringInBounds(key)) {
    		return ("The selected string is not in bounds, Try again.");
    	}
    	
    	String fullKey = key + ALPHABET64 + " ";
    	StringBuilder stringbuilder1 = new StringBuilder(); 
    	StringBuilder stringbuilder2 = new StringBuilder(); 
    	StringBuilder stringbuilder3 = new StringBuilder(); 
    	
    	for (int i = 0; i < plainText.length(); i++) {
    		
    		stringbuilder3.append(plainText.charAt(i));
    		if (stringbuilder3.length() %2 == 1 && i + 1 < plainText.length() && plainText.charAt(i) == plainText.charAt(i +1)) {
    			
    			stringbuilder3.append("X");
    		}
    	}  
    	plainText = stringbuilder3.toString();
		
    	if (plainText.length() % 2 != 0) {
    		
    		plainText += "X";
    	}
  
    	
    	for (int i = 0; i < fullKey.length(); i++) {
    		
    		char character = fullKey.charAt(i);
    		boolean found = false;
    		
    		for (int j = 0; j < stringbuilder1.length(); j++) {
    			
    			if (stringbuilder1.charAt(j) == character) {
    				found = true;
    				break;
    			}
    		}
    		if (!found) {
    			stringbuilder1.append(character);
    		}
    		
    	}
    	
    	char[][] matrix = new char[8][8];
    	int matrixIndex = 0;
    	
    	for (int i = 0; i < 8; i++) {
    
    		for (int j = 0; j < 8; j++) {
    			
    			matrix[i][j]= stringbuilder1.charAt(matrixIndex);
    			matrixIndex++;
    		}
    	}
    	
    	for (int i = 0; i < plainText.length(); i+=2) {
    		
    		int rowOne = 0;
    		int rowTwo = 0;
    		int colOne = 0;
    		int colTwo = 0;
    		char charOne = plainText.charAt(i);
    		char charTwo = plainText.charAt(i+1);
    		
    		for (int j = 0; j < 8; j++) {
    		    
        		for (int k = 0; k < 8; k++) {
        			
        			if (matrix[j][k] == charOne) {
        				rowOne = j;
        				colOne = k;
        			}
        			if (matrix[j][k] == charTwo) {
        				rowTwo = j;
        				colTwo = k;
        			}
        			
        		}
        	}
    		
    		if (rowOne == rowTwo) {
    			
    			stringbuilder2.append(matrix[rowOne][(colOne + 1) % 8]);
    			stringbuilder2.append(matrix[rowTwo][(colTwo + 1) % 8]);
    			
    		} else if (colOne == colTwo){

    			stringbuilder2.append(matrix[(rowOne + 1) % 8][colOne]);
    			stringbuilder2.append(matrix[(rowTwo + 1) % 8][colTwo]);
    	
    		} else {
    			
    			stringbuilder2.append(matrix[rowOne][colTwo]);
    			stringbuilder2.append(matrix[rowTwo][colOne]);
    		}
    	}
    	
    	return stringbuilder2.toString();
    }

    // playffair Decryption
    public static String playfairDecryption(String encryptedText, String key) {
    	
    	if (!isStringInBounds(encryptedText) || !isStringInBounds(key)) {
    		return ("The selected string is not in bounds, Try again.");
    	}
    	
    	String fullKey = key + ALPHABET64 + " ";
    	StringBuilder stringbuilder1 = new StringBuilder(); 
    	StringBuilder stringbuilder2 = new StringBuilder(); 
    	
    	if (encryptedText.length() % 2 != 0) {
    		
    		return ("The encrypted text is invalid, Try again.");
    	}
    	
    	for (int i = 0; i < fullKey.length(); i++) {
    		
    		char character = fullKey.charAt(i);
    		boolean found = false;   
    		
    		for (int j = 0; j < stringbuilder1.length(); j++) {
    			
    			if (stringbuilder1.charAt(j) == character) {
    				found = true;
    				break;
    			}
    		}
    		if (!found) {
    			stringbuilder1.append(character);
    		}
    		
    	}
    	
    	char[][] matrix = new char[8][8];
    	int matrixIndex = 0; 
    	
    	for (int i = 0; i < 8; i++) {
    
    		for (int j = 0; j < 8; j++) {
    			 
    			matrix[i][j]= stringbuilder1.charAt(matrixIndex);
    			matrixIndex++;
    		}
    	}
    	
    	for (int i = 0; i < encryptedText.length(); i+=2) {
    		
    		int rowOne = 0;
    		int rowTwo = 0;
    		int colOne = 0;
    		int colTwo = 0;
    		char charOne = encryptedText.charAt(i);
    		char charTwo = encryptedText.charAt(i+1);
    		
    		for (int j = 0; j < 8; j++) {
    		    
        		for (int k = 0; k < 8; k++) {
        			
        			if (matrix[j][k] == charOne) {
        				rowOne = j;
        				colOne = k;
        			}
        			if (matrix[j][k] == charTwo) {
        				rowTwo = j;
        				colTwo = k;
        			}
        			
        		}
        	}
    		
    		if (rowOne == rowTwo) {
    			
    			stringbuilder2.append(matrix[rowOne][(colOne + 7) % 8]);
    			stringbuilder2.append(matrix[rowTwo][(colTwo + 7) % 8]);
    			
    		} else if (colOne == colTwo){

    			stringbuilder2.append(matrix[(rowOne + 7) % 8][colOne]);
    			stringbuilder2.append(matrix[(rowTwo + 7) % 8][colTwo]);
    	
    		} else {
    			
    			stringbuilder2.append(matrix[rowOne][colTwo]);
    			stringbuilder2.append(matrix[rowTwo][colOne]);
    		}
    	}
    	
    	for (int i = 1; i < stringbuilder2.length() - 1; i++) {
    		if (stringbuilder2.charAt(i) == 'X' && stringbuilder2.charAt(i- 1) == stringbuilder2.charAt(i + 1)) {
    			
    			stringbuilder2.deleteCharAt(i);
    			i--;
    		}
    	}
    	
    	if (stringbuilder2.length() > 0 && stringbuilder2.charAt(stringbuilder2.length()- 1) == 'X') {
    		stringbuilder2.deleteCharAt(stringbuilder2.length()- 1);
    	}
    	
    	return stringbuilder2.toString();
    }

    /**
     * Caesar Cipher is a simple substitution cipher that replaces each letter in a message 
     * with a letter some fixed number of positions down the alphabet. 
     * For example, with a shift of 3, 'A' would become 'D', 'B' would become 'E', and so on.
     */    
 
    public static String caesarEncryption(String plainText, int key) {

    	if (!isStringInBounds(plainText)) {
    		return ("The selected string is not in bounds, Try again.");
    	}
 
    	StringBuilder stringbuilder = new StringBuilder();
    	key = key % RANGE;
    	
    	for (int i = 0; i < plainText.length(); i++) {
    		
    		char plainTextletter = plainText.charAt(i);
    		
    		int encryptedLetter = (int) plainTextletter + key;
    		
    		while (encryptedLetter > UPPER_RANGE) {
    			
    			encryptedLetter -= RANGE;
    		}
    		while (encryptedLetter < LOWER_RANGE) {
    			
    			encryptedLetter += RANGE;
    		}
    		
    		stringbuilder.append((char) encryptedLetter);
    
    	}
    	
    	return stringbuilder.toString();
    }

    // Caesar Decryption
    public static String caesarDecryption(String encryptedText, int key) {
    	

 
    	StringBuilder stringbuilder = new StringBuilder();
    	key = key % RANGE;
    	
    	for (int i = 0; i < encryptedText.length(); i++) {
    		
    		char plainTextletter = encryptedText.charAt(i);
    		
    		int encryptedLetter = (int) plainTextletter - key;
    		
    		while (encryptedLetter > UPPER_RANGE) {
    			
    			encryptedLetter -= RANGE;
    		}
    		while (encryptedLetter < LOWER_RANGE) {
    			
    			encryptedLetter += RANGE;
    		}
    		
    		stringbuilder.append((char) encryptedLetter);
    
    	}
    	
    	return stringbuilder.toString();
    }  


}





















