package com.tutorial;

class Mahasiswa {
   String nama ;
   String NIM;
   String prodi;
}



public class Main {
 public static void main(String[] args) {

   // istansiasi pembuatan objek
   Mahasiswa mhs1 = new Mahasiswa();
   mhs1.nama="dols";
   mhs1.NIM="22241072";
   mhs1.prodi="pti";

   System.out.println ("Nama Mahasiswa ;" +mhs1.nama);
   System.out.println ("NIM"+mhs1.NIM);
   System.out.println ("prodi"+mhs1.prodi);

   Mahasiswa mhs2 =new Mahasiswa();

   mhs2.nama="dea";
   mhs2.NIM="22241072";
   mhs2.prodi="akuntansi";

   System.out.println ("Nama mahasiswa;"+mhs2.nama);
   System.out.println("NIM;"+mhs2.NIM);
   System.out.println("prodi;"+mhs2.prodi);
   
 }   
}