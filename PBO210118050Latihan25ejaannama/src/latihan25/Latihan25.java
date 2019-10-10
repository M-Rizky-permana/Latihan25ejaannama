/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan25;

import java.util.Scanner;

/**
 *
 * NAMA :Muhamad Rizky Permana
KELAS : IF-2
NIM : 10118050
Deskripsi Program :
 */
public class Latihan25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan nama depan anda untuk di eja : ");
		Scanner scanner = new Scanner(System.in);
		String namaLengkap = scanner.next();
		System.out.println("Ejaan untuk \"" + namaLengkap + "\" adalah : ");
		for(int i = 0; i < namaLengkap.length(); i ++)
			System.out.println("Huruf ke-" + (i+1) + " : " + namaLengkap.charAt(i));
    }
    
}
