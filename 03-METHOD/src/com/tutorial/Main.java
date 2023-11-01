package com.tutorial;

class Mahasiswa{
   //Data Member
   String nama;
   String nim;
   String prodi;
    
   // construktor dengan parameter
   Mahasiswa(String inputNama,String inputnim,String inputProdi){
      nama = inputNama;
      nim = inputnim;
      prodi = inputProdi;
   }

   // method tanpa parameter dan return
   void show(){
      System.out.println("nama :" + this.nama);
      System.out.println("nim :" + this.nim);
      System.out.println("prodi:" + this.prodi);
      
   }


   //method tanpa return dengan parameter
   void setnama (String nama){
      this.nama = nama;

   }
   //method dengan return tanpa parameter
   String getnama(){
      return this.nama;
   }
   // method dengan return dan parameter
   String sayHi(String pesan){
      return pesan + "aku adalah " + this.nama;

}
}

public class Main {
 public static void main(String[] args) {
    // instansiasi objek
    Mahasiswa mhs1   = new Mahasiswa("ivan", "22241072", "PTI");

    mhs1.show();
    mhs1.setnama("dols");
    mhs1.show();
    System.out.println(mhs1.getnama());

    String pesan = mhs1.sayHi("halo dea sayang");
    System.out.println(pesan);

 }
}
