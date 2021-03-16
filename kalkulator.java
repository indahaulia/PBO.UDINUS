import java.util.Scanner;

class Operasi 
{

 public int operasiTambah(int nilai1, int nilai2){
  return nilai1 + nilai2;
 }

 public int operasiKurang(int nilai1, int nilai2){
  return nilai1 - nilai2;
 }
 
 public int operasiKali(int nilai1, int nilai2){
  return nilai1 * nilai2;
 }
 
 public double operasiBagi(int nilai1, int nilai2){
  return nilai1 /(double) nilai2;
 }
}

class KalkulatorMain
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukan nilai A : ");
        int nilai1 = x.nextInt();
        System.out.print("Masukan Nilai B : ");
        int nilai2 = x.nextInt();
        Operasi operasi = new Operasi();

        System.out.println("Tambah = " + operasi.operasiTambah(nilai1,nilai2));
        System.out.println("Kurang = " + operasi.operasiKurang(nilai1,nilai2));
        System.out.println("Kali = " + operasi.operasiKali(nilai1,nilai2));
        System.out.println("Bagi " + operasi.operasiBagi(nilai1,nilai2));
    }
}
