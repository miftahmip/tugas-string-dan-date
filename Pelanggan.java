public class Pelanggan {
    protected String namaPelanggan;
    protected String noHP;
    protected String alamat;

public Pelanggan(String namaPelanggan, String noHP, String alamat){
    this.namaPelanggan = namaPelanggan;
    this.noHP = noHP;
    this.alamat = alamat;
}

public void tampilkanInfo(){
    System.out.println("Nama Pelanggan: " + namaPelanggan);
    System.out.println("No. HP: " + noHP);
    System.out.println("Alamat: " + alamat);
}

}
