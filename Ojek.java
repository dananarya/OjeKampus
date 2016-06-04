
/**
 * Kelas ini merupakan kelas yang memodelkan Ojek.
 * 
 * @author Danan Arya Pradana (1306368583)
 * @version 04/06/2016
 */
public class Ojek
{
    private int id;
    private String nama;
    private Status status;
    private Lokasi lokasi;
    
    /**
     * Konstruktor kelas Ojek
     * @param id Nomor ID Ojek
     * @param nama Nama Ojek
     * @param x Koordinat x dari Ojek
     * @param y Koordinat y dari Ojek
     */
    public Ojek(int id, String nama, double x, double y)
    {
        this.id = id;
        this.nama = nama;
        this.status = Status.IDLE;
        lokasi = new Lokasi(x, y);
    }
    
    /**
     * Konstruktor kelas Ojek
     * @param id Nomor ID Ojek
     * @param nama Nama Ojek
     */
    public Ojek(int id, String nama)
    {
        this.id = id;
        this.nama = nama;
        this.status = Status.IDLE;
        lokasi = new Lokasi(0, 0);
    }
    
    /**
     * Method untuk mendapatkan ID
     * @return Nomor ID Ojek
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Method untuk mendapatkan nama
     * @return Nama Ojek
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Method untuk mendapatkan status Ojek
     * @return Status Ojek
     */
    public Status getStatus()
    {
        return status;
    }
    
    /**
     * Method untuk mendapatkan lokasi Ojek
     * @return Lokasi Ojek
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }
    
    /**
     * Method untuk mengeset Ojek untuk menerima panggilan
     */
    public void terimaPanggilan()
    {
        setStatus(Status.JEMPUT);
        laporStatus(status, this.getLokasi().getX(), this.getLokasi().getY());
    }
    
    /**
     * Method untuk mengeset status Ojek menjadi idle
     */
    public void selesaiPanggilan()
    {
        setStatus(Status.IDLE);
        laporStatus(status, this.getLokasi().getX(), this.getLokasi().getY());
    }
    
    /**
     * Method untuk mengubah status dari Ojek
     * @param status Status Ojek
     */
    public void setStatus(Status status)
    {
        this.status = status;
    }
    
    /**
     * Method untuk melaporkan status dan lokasi terakhir dari Ojek
     * @param status Status Ojek
     * @param x Koordinat x Ojek
     * @param y Koordinat y Ojek
     */
    public void laporStatus(Status status, double x, double y)
    {
        setStatus(status);
        lokasi.setLokasiBaru(x, y);
        GUI.logLaporan("Ojek ID: " + id + "\nStatus: " + status + "\nLokasi: " + x + ", " + y + "\n");
    }
    
    /**
     * Method untuk menjemput penumpang/barang sesuai pesanan
     * @param pesanan Pesanan
     */
    public void jemput(Pesanan pesanan)
    {
        do {
            if(this.getLokasi().getX() < pesanan.getLokasiAwal().getX()) {
                laporStatus(status, this.getLokasi().getX() + 1, this.getLokasi().getY());
            }
            else if(this.getLokasi().getX() > pesanan.getLokasiAwal().getX()) {
                laporStatus(status, this.getLokasi().getX() - 1, this.getLokasi().getY());
            }
        } while(this.getLokasi().getX() != pesanan.getLokasiAwal().getX());
        
        do {
            if(this.getLokasi().getY() < pesanan.getLokasiAwal().getY()) {
                laporStatus(status, this.getLokasi().getX(), this.getLokasi().getY() + 1);
            }
            else if(this.getLokasi().getY() > pesanan.getLokasiAwal().getY()) {
                laporStatus(status, this.getLokasi().getX(), this.getLokasi().getY() - 1);
            }
        } while (this.getLokasi().getY() != pesanan.getLokasiAwal().getY());
        
        antar(pesanan);
    }
    
    /**
     * Method untuk mengantar penumpang/barang ke lokasi tujuan
     * @param pesanan Pesanan
     */
    public void antar(Pesanan pesanan)
    {
        setStatus(Status.ANTAR);
        
        do {
            if(this.getLokasi().getX() < pesanan.getLokasiTujuan().getX()) {
                laporStatus(status, this.getLokasi().getX() + 1, this.getLokasi().getY());
            }
            else if(this.getLokasi().getX() > pesanan.getLokasiTujuan().getX()) {
                laporStatus(status, this.getLokasi().getX() - 1, this.getLokasi().getY());
            }
        } while(this.getLokasi().getX() != pesanan.getLokasiTujuan().getX());
        
        do {
            if(this.getLokasi().getY() < pesanan.getLokasiTujuan().getY()) {
                laporStatus(status, this.getLokasi().getX(), this.getLokasi().getY() + 1);
            }
            else if(this.getLokasi().getY() > pesanan.getLokasiTujuan().getY()) {
                laporStatus(status, this.getLokasi().getX(), this.getLokasi().getY() - 1);
            }
        } while (this.getLokasi().getY() != pesanan.getLokasiTujuan().getY());
        
        selesaiPanggilan();
    }
}
