
package Tugas_3;

// membuat import atau scanner
import java.util.Scanner;

public class No2 {

    public static void main(String[]args){
        
        int Data[]= {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int cari;
        int indeks_awal = 0;    //0
        int indeks_akhir = Data.length-1;   //10
        int ketemu = 0;
        int point = 0;
        
        //menampilkan data dalam array
        System.out.println("Isi data adalah ");
        for( int i = 0; i < Data.length; i++ ){   //i=0; 0<10->T; print Data[0]; i++ i=1;1<10 ->T; maka print Data[1] dan seterusnya hingga i=10; 10<10-?F maka perulangan berhenti 
            System.out.print(Data[i] + " "); //print Data[0] = 2;print Data[1] = 4; dst
        }
        
        System.out.println(" ");
        System.out.println(" ");
        
        //membuat scanner
        System.out.print("Data yang dicari adalah : ");
        Scanner scan = new Scanner(System.in);
        cari = scan.nextInt();
        
        //membuat kondisi ketika indeks awal <= indeks akhir, akan ketemu = 0
        while ((indeks_awal <= indeks_akhir) && (ketemu == 0)) { 
        point = (indeks_awal + indeks_akhir) / 2; // 0+9=9/2=4.5; 
        System.out.println("Indeks pointer :" + point);
            if (cari == Data[point] ) {
                ketemu = 1;
                System.out.println ("Data " + cari + " Telah ditemukan pada indeks ke "+ point);                
            }
            
            else if (cari < Data[point]) {
               System.out.println("Cari di kiri ");
               indeks_akhir = point-1;
            }
            
            else if(cari > Data[point]){
                indeks_awal = point+1;
                System.out.println("Cari di kanan ");
            }
        }
            
    if (ketemu == 1)
        System.out.println("Kesimpulan: Data ditemukan ");
    else 
        System.out.println("Kesimpulan: Data tidak ditemukan");
    
    System.out.println("Desty Nurul Anitsa");
        }
}


