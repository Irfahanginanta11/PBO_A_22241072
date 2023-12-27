package com.tutorial;

class Pegawai {
   public String nama;
   public String jabatan;
   public float pajak;
   public float gajiPokok;
   private float gajiBersih;

   Pegawai(String nama, String jabatan, float pajak, float gajiPokok) {
      this.nama = nama;
      this.jabatan = jabatan;
      this.pajak = pajak/100;
      this.gajiPokok = gajiPokok;
   }

   public float setPajak(float Pajak) {
      return this.pajak = Pajak/100;
   }

   public float setgajiBersih(){
      return this.gajiPokok - (this.gajiPokok*this.pajak);
   }

   public void display(){
      System.out.println("Nama karyawan:" + this.nama);
      System.out.println("jabatan:" + this.jabatan);
      System.out.println("Gaji Bersih:" + this.setgajiBersih());
   }
}   


public class Main {
 public static void main(String[] args) {
   Pegawai gaji = new Pegawai("Adam", "Dosen", 10, 3500000);
   gaji.display();
   gaji.setPajak(10);
   gaji.display();
   
    
 }   
}
