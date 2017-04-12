// Trevor Lowe

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		Set<Key> foundKeys = new HashSet<Key>();
		
		// Plaintext 
		int pA = 2; 	// Row 1, Col 1
		int pB = 14;	// Row 1, Col 2
		int pC = 17;	// Row 2, Col 1
		int pD = 4;		// Row 2. Col 2
		
		// Ciphertext
		int A = 14;		// Row 1, Col 1
		int B = 8;		// Row 1, Col 2
		int C = 17;		// Row 2, Col 1
		int D = 7;		// Row 2, Col 2
		
		int keyNum = 1;
		
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < 26; j++) {
				for (int k = 0; k < 26; k++) {
					for (int l = 0; l < 26; l++) {
						int kA = i;
						int kB = j;
						int kC = k;
						int kD = l;
						
						int cA = (kA * pA) + (kC * pB);
						int cB = (kB * pA) + (kD * pB);
						int cC = (kA * pC) + (kC * pD);
						int cD = (kB * pC) + (kD * pD);
						
						while (cA < 0) {
							cA += 26;
						}
						while (cA > 25) {
							cA -= 26;
						}
						while (cB < 0) {
							cB += 26;
						}
						while (cB > 25) {
							cB -= 26;
						}
						while (cC < 0) {
							cC += 26;
						}
						while(cC > 25) {
							cC -= 26;
						}
						while(cD < 0) {
							cD += 26;
						}
						while(cD > 25) {
							cD -= 26;
						}
						
//						System.out.println("Key Number: " + keyNum + "/456976" + "   Key: " + kA + " " + kB + " " + kC + " " + kD 
//										 + "   Cipher: " + cA + " " + cB + " " + cC + " " + cD + "	%" + 100 * (double)keyNum / 456976);
						
						keyNum++;
						
						if (cA == A && cB == B && cC == C && cD == D) {
//							System.out.println("Key Found!");
							Key foundKey = new Key(kA, kB, kC, kD);
							foundKeys.add(foundKey);
						}
					}
				}
			}
		}
		
		if (!foundKeys.isEmpty()) {
			System.out.println("Found Keys: ");
			for (Key k : foundKeys) {
				System.out.println("	Key: " + k.k11 + " " + k.k12 + " " + k.k21 + " " + k.k22);
			}
		} else {
			System.out.println("Keys Not Found!");
		}
	}
}


