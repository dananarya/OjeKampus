
/**
 * Kelas ini merupakan kelas yang memodelkan pesanan dari user.
 * 
 * @author Danan Arya Pradana (1306368583)
 * @version 04/06/2016
 */
public class Pesanan
{
    private Lokasi lokasiAwal;
    private Lokasi lokasiTujuan;
    private String namaPenumpang;
    private String namaPenerima;
    private double nilaiBarang;
    private Layanan jenisPesanan;
    
    /**
     * Konstruktor dari kelas Pesanan untuk ojek barang yang harus dibayar terlebih dahulu
     * @param awal Lokasi awal
     * @param tujuan Lokasi tujuan
     * @param nama Nama pengirim
     * @param penerima Nama penerima
     * @param biaya Biaya dari barang
     */
    public Pesanan(Lokasi awal, Lokasi tujuan, String nama, String penerima, double biaya)
    {
        this.lokasiAwal = awal;
        this.lokasiTujuan = tujuan;
        this.namaPenumpang = nama;
        this.namaPenerima = penerima;
        this.nilaiBarang = biaya;
        this.jenisPesanan = Layanan.BELI;
    }
    
    /**
     * Konstruktor dari kelas Pesanan untuk ojek barang
     * @param awal Lokasi awal
     * @param tujuan Lokasi tujuan
     * @param nama Nama pengirim
     * @param penerima Nama penerima
     */
    public Pesanan(Lokasi awal, Lokasi tujuan, String nama, String penerima)
    {
        this.lokasiAwal = awal;
        this.lokasiTujuan = tujuan;
        this.namaPenumpang = nama;
        this.namaPenerima = penerima;
        this.jenisPesanan = Layanan.BARANG;
    }
    
    /**
     * Konstruktor dari kelas Pesanan untuk ojek penumpang
     * @param awal Lokasi awal
     * @param tujuan Lokasi tujuan
     * @param nama Nama pengirim
     */
    public Pesanan(Lokasi awal, Lokasi tujuan, String nama)
    {
        this.lokasiAwal = awal;
        this.lokasiTujuan = tujuan;
        this.namaPenumpang = nama;
        this.jenisPesanan = Layanan.ORANG;
    }
    
    /**
     * Method untuk mendapatkan lokasi awal
     * @return Lokasi awal pesanan
     */
    public Lokasi getLokasiAwal()
    {
        return lokasiAwal;
    }
    
    /**
     * Method untuk mendapatkan lokasi tujuan
     * @return Lokasi tujuan pesanan
     */
    public Lokasi getLokasiTujuan()
    {
        return lokasiTujuan;
    }
    
    /**
     * Method untuk mendapatkan nama penumpang
     * @return Nama penumpang
     */
    public String getNamaPenumpang()
    {
        return namaPenumpang;
    }
    
    /**
     * Method untuk mendapatkan nama penerima barang
     * @return Nama penerima
     */
    public String getNamaPenerima()
    {
        return namaPenerima;
    }
    
    /**
     * Method untuk mendapatkan nilai barang
     * @return Nilai barang
     */
    public double getNilaiBarang()
    {
        return nilaiBarang;
    }
    
    /**
     * Method untuk mendapatkan jenis layanan
     * @return Jenis pesanan (Beli, Barang, Orang)
     */
    public Layanan getJenisPesanan()
    {
        return jenisPesanan;
    }
    
    /**
     * Method toString objek Pesanan
     * @return Pesanan dalam bentuk String
     */
    public String toString()
    {
        return "Jenis pesanan: " + jenisPesanan 
            + "\nLokasi awal: " + lokasiAwal.getX() + ", " + lokasiAwal.getY()
            + "\nLokasi tujuan: " + lokasiTujuan.getX() + ", " + lokasiTujuan.getY()
            + "\nNama penumpang: " + namaPenumpang 
            + "\nNama penerima: " + namaPenerima
            + "\nNilai barang: " + nilaiBarang + "\n\n";
    }
}
