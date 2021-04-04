
package Tugas_3;

//membuat scanner
import java.util.Scanner;

public class No1 {
    public static void main(String[]args){
        String nama[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Desty", "Tesla"};
        int ketemu = 0;
        String cari;
        
        //mencetak Data array 
        System.out.println("Isi data A adalah: ");
            for (int i = 0; i <nama.length; i++){ //panjang data 6; 0<6->T; maka print nama[0]; lanjut terus hingga i=6, 6<6->F, looping berhenti, kemudian akan mencetak enter 2 kali
                System.out.print(nama[i]+ " "); // cetak nama[0] = Galileo; dan seterusnya
            }
        System.out.println("");
        System.out.println("");
            
        
        // mengambil input dari keyboard
        Scanner scan = new Scanner(System.in);        
        System.out.print("Data yang dicari ");
        cari = scan.nextLine(); 
        
        //membuat perulangan lagi untuk mencari data yang akan dicari dengan scanner
        for (int i=0; i<nama.length; i++){ //panjang data nama =6
            if (cari.equalsIgnoreCase (nama[i])){ 
            ketemu = 1;
            System.out.println("Data " + cari + " berada pada indeks ke-"+ i);
                    
            }
        }
        System.out.println("");
        System.out.println("");
            
        if (ketemu == 1) 
            System.out.println("Kesimpulan: Data ditemukan");
        else
            System.out.println("Kesimpulan: Data tidak ditemukan");
       
    System.out.println("Desty Nurul Anitsa");
    }
}


