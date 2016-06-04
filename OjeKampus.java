import java.util.*;
/**
 * Kelas ini merupakan kelas utama dari program OjeKampus.
 * 
 * @author Danan Arya Pradana (1306368583)
 * @version 04/06/2016
 */
public class OjeKampus
{
    private static ArrayList<Ojek> daftarOjek;
    private static ArrayList<User> daftarUser;
    private static ArrayList<Pesanan> daftarPesanan;
    private static ArrayList<Pesanan> daftarDelay;
    
    /**
     * Konstruktor dari kelas OjeKampus
     */
    public OjeKampus()
    {
        daftarOjek = new ArrayList<Ojek>();
        daftarUser = new ArrayList<User>();
        daftarPesanan = new ArrayList<Pesanan>();
        daftarDelay = new ArrayList<Pesanan>();
    }
    
    /**
     * Method untuk mendapatkan Ojek berdasarkan nomor ID
     * @param id Nomor ID Ojek
     * @return Ojek yang dicari
     */
    public static Ojek getOjek(int id)
    {
        Ojek ojek = null;
        Iterator<Ojek> itr = daftarOjek.iterator();
        while(itr.hasNext()) {
            ojek = itr.next();
            if(ojek.getID() == id) {
                return ojek;
            }
            else {
                ojek = null;
            }
        }
        return ojek;
    }
    
    /**
     * Method untuk mendapatkan Ojek yang memiliki status Idle
     * @return Ojek dengan status Idle
     */
    public static Ojek getIdleOjek()
    {
        Ojek ojek = null;
        Iterator<Ojek> itr = daftarOjek.iterator();
        while(itr.hasNext()) {
            ojek = itr.next();
            if(ojek.getStatus() == Status.IDLE) {
                return ojek;
            }
            else {
                ojek = null;
            }
        }
        return ojek;
    }
    
    /**
     * Method untuk mendapatkan User berdasarkan nomor ID
     * @param id Nomor ID User
     * @return User yang dicari
     */
    public static User getUser(int id)
    {
        User user = null;
        Iterator<User> itr = daftarUser.iterator();
        while(itr.hasNext()) {
            user = itr.next();
            if(user.getID() == id) {
                return user;
            }
            else {
                user = null;
            }
        }
        return user;
    }
    
    /**
     * Method untuk menambahkan Ojek
     * @param ojek Ojek
     */
    public static void addOjek(Ojek ojek)
    {
        daftarOjek.add(ojek);
    }
    
    /**
     * Method untuk menambahkan User
     * @param user User
     */
    public static void addUser(User user)
    {
        daftarUser.add(user);
    }
    
    /**
     * Method untuk melakukan pesanan
     * @param pesanan Pesanan
     */
    public static void pesanOjek(Pesanan pesanan)
    {
        Ojek ojek = null;
        try {
            ojek = getIdleOjek();
            ojek.terimaPanggilan();
        } catch(NullPointerException e) {
            daftarDelay.add(pesanan);
        }
        daftarPesanan.add(pesanan);
        GUI.logPesanan(pesanan.toString());
        ojek.jemput(pesanan);
    }
    
    /**
     * Fungsi main dari program
     */
    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new OjeKampus();
                new GUI();
            }
        });
    }
}
