
/**
 * Kelas ini merupakan kelas yang memodelkan User.
 * 
 * @author Danan Arya Pradana (1306368583)
 * @version 04/06/2016
 */
public class User
{
    private int id;
    private String nama;
    
    /**
     * Konstruktor dari kelas User
     * @param id Nomor ID User
     * @param nama Nama User
     */
    public User(int id, String nama)
    {
        this.id = id;
        this.nama = nama;
    }
    
    /**
     * Method untuk mendapatkan ID User
     * @return ID User
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Method untuk mendapatkan nama User
     * @return Nama User
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Method untuk memanggil ojek penumpang
     * @param xAwal Koordinat x awal
     * @param yAwal Koordinat y awal
     * @param xTujuan Koordinat x tujuan
     * @param yTujuan Koordinat y tujuan
     */
    public void panggilOjekPenumpang(double xAwal, double yAwal, double xTujuan, double yTujuan)
    {
        Lokasi awal = new Lokasi(xAwal, yAwal);
        Lokasi tujuan = new Lokasi(xTujuan, yTujuan);
        Pesanan pesanan = new Pesanan(awal, tujuan, getNama());
        OjeKampus.pesanOjek(pesanan);
    }
    
    /**
     * Method untuk memanggil ojek barang
     * @param xAwal Koordinat x awal
     * @param yAwal Koordinat y awal
     * @param xTujuan Koordinat x tujuan
     * @param yTujuan Koordinat y tujuan
     * @param penerima Nama penerima barang
     */
    public void panggilOjekBarang(double xAwal, double yAwal, double xTujuan, double yTujuan, String penerima)
    {
        Lokasi awal = new Lokasi(xAwal, yAwal);
        Lokasi tujuan = new Lokasi(xTujuan, yTujuan);
        Pesanan pesanan = new Pesanan(awal, tujuan, getNama(), penerima);
        OjeKampus.pesanOjek(pesanan);
    }
    
    /**
     * Method untuk memanggil ojek barang dengan nilai baran yang harus dibayar terlebih dahulu
     * @param xAwal Koordinat x awal
     * @param yAwal Koordinat y awal
     * @param xTujuan Koordinat x tujuan
     * @param yTujuan Koordinat y tujuan
     * @param penerima Nama penerima barang
     * @param biaya Biaya barang yang dibayar
     */
    public void panggilOjekBeli(double xAwal, double yAwal, double xTujuan, double yTujuan, String penerima, double biaya)
    {
        Lokasi awal = new Lokasi(xAwal, yAwal);
        Lokasi tujuan = new Lokasi(xTujuan, yTujuan);
        Pesanan pesanan = new Pesanan(awal, tujuan, getNama(), penerima, biaya);
        OjeKampus.pesanOjek(pesanan);
    }
}
