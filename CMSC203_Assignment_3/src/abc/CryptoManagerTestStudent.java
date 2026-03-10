package abc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {


    @Test
    public void testCaesar() {
    	
    	int caesarKey1 = 3;
        String plainText1 = "THIS IS A TEST!";
        int caesarKey2 = 24;
        String plainText2 = "HELLO WORLD, HOW ARE YOU!";
        int caesarKey3 = 27;
        String plainText3 = "HIIIIIIIIIIIIIIIIIIII";

        String encrypted1 = CryptoManager.caesarEncryption(plainText1, caesarKey1);
        String encrypted2 = CryptoManager.caesarEncryption(plainText2, caesarKey2);
        String encrypted3 = CryptoManager.caesarEncryption(plainText3, caesarKey3);
        
        String decrypted1 = CryptoManager.caesarDecryption(encrypted1, caesarKey1);
        String decrypted2 = CryptoManager.caesarDecryption(encrypted2, caesarKey2);
        String decrypted3 = CryptoManager.caesarDecryption(encrypted3, caesarKey3);
        

        assertEquals(plainText1, decrypted1);
        assertEquals(plainText2, decrypted2);
        assertEquals(plainText3, decrypted3);
    }
    

    @Test
    public void testVigenere() {
    	
    	String vigenereKey1 = "VIGENEREKEY1";
        String plainText1 = "VIGENERE PLAINTEXT";
        String vigenereKey2 = "BYE";
        String plainText2 = "GOOD MORNING";
        String vigenereKey3 = "123";
        String plainText3 = "456";

        String encrypted1 = CryptoManager.vigenereEncryption(plainText1, vigenereKey1);
        String encrypted2 = CryptoManager.vigenereEncryption(plainText2, vigenereKey2);
        String encrypted3 = CryptoManager.vigenereEncryption(plainText3, vigenereKey3);
        
        String decrypted1 = CryptoManager.vigenereDecryption(encrypted1, vigenereKey1);
        String decrypted2 = CryptoManager.vigenereDecryption(encrypted2, vigenereKey2);
        String decrypted3 = CryptoManager.vigenereDecryption(encrypted3, vigenereKey3);
        

        assertEquals(plainText1, decrypted1);
        assertEquals(plainText2, decrypted2);
        assertEquals(plainText3, decrypted3);
    }
    

    @Test
    public void testPlayfair() {
    	
    	String playfairKey1 = "PLAYFAIRKEY1";
        String plainText1 = "PLAINTEXT PLAYFAIR";
        String playfairKey2 = "TEST KEY";
        String plainText2 = "THIS IS A TEST!";
        String playfairKey3 = "GOOD THANK YOU";
        String plainText3 = "HELLO WORLD, HOW ARE YOU!";

        String encrypted1 = CryptoManager.playfairEncryption(plainText1, playfairKey1);
        String encrypted2 = CryptoManager.playfairEncryption(plainText2, playfairKey2);
        String encrypted3 = CryptoManager.playfairEncryption(plainText3, playfairKey3);
        
        String decrypted1 = CryptoManager.playfairDecryption(encrypted1, playfairKey1);
        String decrypted2 = CryptoManager.playfairDecryption(encrypted2, playfairKey2);
        String decrypted3 = CryptoManager.playfairDecryption(encrypted3, playfairKey3);
        

        assertEquals(plainText1, decrypted1);
        assertEquals(plainText2, decrypted2);
        assertEquals(plainText3, decrypted3);
    }
    
    
    @Test
    public void IsStringInBoundsTrue() {
        assertTrue(CryptoManager.isStringInBounds("THIS IS A TEST"));
        assertTrue(CryptoManager.isStringInBounds("HELLO"));
    }
    
    @Test
    public void IIsStringInBoundsFalse() {
        assertFalse(CryptoManager.isStringInBounds("this is a test"));
        assertFalse(CryptoManager.isStringInBounds("ThisIsAnotherTest"));
    }

}













