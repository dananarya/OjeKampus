
/**
 * Kelas ini merupakan kelas yang memodelkan lokasi ojek dan pesanan user.
 * 
 * @author Danan Arya Pradana (1306368583)
 * @version 04/06/2016
 */
public class Lokasi
{
    private String nama;
    private double koordinatX;
    private double koordinatY;
    
    /**
     * Konstruktor dari kelas Lokasi
     * @param nama Nama lokasi
     * @param x Koordinat x
     * @param y Koordinat y
     */
    public Lokasi(String nama, double x, double y)
    {
        this.nama = nama;
        this.koordinatX = x;
        this.koordinatY = y;
    }
    
    /**
     * Konstruktor dari kelas Lokasi
     * @param x Koordinat x
     * @param y Koordinat y
     */
    public Lokasi(double x, double y)
    {
        this.nama = "";
        this.koordinatX = x;
        this.koordinatY = y;
    }
    
    /**
     * Method untuk mendapatkan nama Lokasi
     * @return Nama Lokasi
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Method untuk mendapatkan koordinat x Lokasi
     * @return Koordinat x Lokasi
     */
    public double getX()
    {
        return koordinatX;
    }
    
    /**
     * Method untuk mengubah koordinat x Lokasi
     * @param x Koordinat x
     */
    public void setX(double x)
    {
        this.koordinatX = x;
    }
    
    /**
     * Method untuk mengubah koordinat y Lokasi
     * @param y Koordinat y
     */
    public void setY(double y)
    {
        this.koordinatY = y;
    }
    
    /**
     * Method untuk mendapatkan koordinat y Lokasi
     * @return Koordinat y Lokasi
     */
    public double getY()
    {
        return koordinatY;
    }
    
    /**
     * Method untuk mengatur koordinat lokasi baru
     * @param x Koordinat x baru
     * @param y Koordinat y baru
     */
    public void setLokasiBaru(double x, double y)
    {
        this.koordinatX = x;
        this.koordinatY = y;
    }
}
