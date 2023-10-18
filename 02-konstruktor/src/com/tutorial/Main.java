package com.tutorial;

class Polos {
   String dataString;
   int dataInteger;
}

//class dengan konstruktor
class Mahasiswa {
   String nama;
   String nim;
   String prodi;

   // // Membuat konstruktor
   // Mahasiswa (){
   //    System.out.println("ini adalah konstruktor");
   
   // membuat konstruktor dengan prameter
   Mahasiswa (String inputNama, String inputNIM, String inputProdi){
      nama = inputNama;
      nim = inputNIM;
      prodi = inputProdi;

      System.out.println("Nama :" + nama);
      System.out.println("NIM :" + nim);
      System.out.println("Prodi :" + prodi);

   }
}

   
public class Main {
 public static void main(String[] args) {
    System.out.println("program JAVA pertama saya");

   //  //instansiasi objek dari class objek
   //   Polos pls = new Polos();

   //      //isi ciri pada objek pls
   // pls.dataString = "POLOS";
   // pls.dataInteger = 10;

   // //cetak data
   // System.out.println("isi data String" + pls.dataString);
   // System.out.println("isi data Integer" + pls.dataInteger);

    Mahasiswa mhs1 = new Mahasiswa("ivan", "22241072", "PTI");

    
   
   }
}


