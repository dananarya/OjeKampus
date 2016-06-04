import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 * Kelas untuk GUI OjeKampus
 * 
 * @author Danan Arya Pradana (1306368583)
 * @version 04/06/2016
 */
public class GUI extends JFrame implements ActionListener, ItemListener
{
    private JPanel registrasi;
    private JPanel pesan;
    private JPanel logLaporan;
    private JPanel logPesanan;
    private JPanel userForm;
    private JPanel ojekForm;
    private JPanel pesanForm;
    private JScrollPane scrollLog;
    private static JTextArea log;
    private JScrollPane scrollLaporan;
    private static JTextArea laporan;
    private JTextField userID;
    private JTextField username;
    private JTextField ojekID;
    private JTextField ojekname;
    private JTextField pesanID;
    private JTextField xAwal;
    private JTextField yAwal;
    private JTextField xTujuan;
    private JTextField yTujuan;
    private JTextField penerima;
    private JTextField biaya;
    private JLabel userIDLabel;
    private JLabel usernameLabel;
    private JLabel ojekIDLabel;
    private JLabel ojeknameLabel;
    private JLabel layananLabel;
    private JLabel pesanIDLabel;
    private JLabel xAwalLabel;
    private JLabel yAwalLabel;
    private JLabel xTujuanLabel;
    private JLabel yTujuanLabel;
    private JLabel penerimaLabel;
    private JLabel biayaLabel;
    private JButton userRegistration;
    private JButton ojekRegistration;
    private JButton pesanOjek;
    private JComboBox<Layanan> layanan;
    
    /**
     * Konstruktor dari kelas GUI
     */
    public GUI()
    {
        super("OjeKampus");
        
        registrasi = new JPanel();
        pesan = new JPanel();
        logPesanan = new JPanel();
        logLaporan = new JPanel();
        userForm = new JPanel();
        ojekForm = new JPanel();
        pesanForm = new JPanel();
        
        userID = new JTextField();
        username = new JTextField();
        ojekID = new JTextField();
        ojekname = new JTextField();
        pesanID = new JTextField();
        xAwal = new JTextField();
        yAwal = new JTextField();
        xTujuan = new JTextField();
        yTujuan = new JTextField();
        penerima = new JTextField();
        biaya = new JTextField();
        
        userIDLabel = new JLabel();
        usernameLabel = new JLabel();
        ojekIDLabel = new JLabel();
        ojeknameLabel = new JLabel();
        layananLabel = new JLabel();
        pesanIDLabel = new JLabel();
        xAwalLabel = new JLabel();
        yAwalLabel = new JLabel();
        xTujuanLabel = new JLabel();
        yTujuanLabel = new JLabel();
        penerimaLabel = new JLabel();
        biayaLabel = new JLabel();
        
        userRegistration = new JButton();
        ojekRegistration = new JButton();
        pesanOjek = new JButton();
        
        layanan = new JComboBox<Layanan>(Layanan.values());
        
        buildGUI();
    }
    
    /**
     * Metode untuk melakukan inisiasi GUI
     */
    public void buildGUI()
    {
        super.setPreferredSize(new Dimension(600,700));
        super.setResizable(false);
        super.setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        
        userForm.setPreferredSize(new Dimension(300,100));
        userIDLabel.setPreferredSize(new Dimension(80,30));
        userIDLabel.setText("User ID");
        userIDLabel.setVisible(true);
        usernameLabel.setPreferredSize(new Dimension(80,30));
        usernameLabel.setText("Username");
        usernameLabel.setVisible(true);
        userID.setPreferredSize(new Dimension(150,30));
        userID.setVisible(true);
        username.setPreferredSize(new Dimension(150,30));
        username.setVisible(true);
        userForm.add(userIDLabel);
        userForm.add(userID);
        userForm.add(usernameLabel);
        userForm.add(username);
        
        ojekForm.setPreferredSize(new Dimension(300,100));
        ojekIDLabel.setPreferredSize(new Dimension(80,30));
        ojekIDLabel.setText("Ojek ID");
        ojekIDLabel.setVisible(true);
        ojeknameLabel.setPreferredSize(new Dimension(80,30));
        ojeknameLabel.setText("Ojek name");
        ojeknameLabel.setVisible(true);
        ojekID.setPreferredSize(new Dimension(150,30));
        ojekID.setVisible(true);
        ojekname.setPreferredSize(new Dimension(150,30));
        ojekname.setVisible(true);
        ojekForm.add(ojekIDLabel);
        ojekForm.add(ojekID);
        ojekForm.add(ojeknameLabel);
        ojekForm.add(ojekname);
        
        pesanForm.setPreferredSize(new Dimension(350,300));
        layananLabel.setPreferredSize(new Dimension(100,30));
        layananLabel.setText("Layanan");
        layananLabel.setVisible(true);
        pesanIDLabel.setPreferredSize(new Dimension(100,30));
        pesanIDLabel.setText("User ID");
        pesanIDLabel.setVisible(true);
        xAwalLabel.setPreferredSize(new Dimension(100,30));
        xAwalLabel.setText("Lokasi (x)");
        xAwalLabel.setVisible(true);
        yAwalLabel.setPreferredSize(new Dimension(100,30));
        yAwalLabel.setText("Lokasi (y)");
        yAwalLabel.setVisible(true);
        xTujuanLabel.setPreferredSize(new Dimension(100,30));
        xTujuanLabel.setText("Tujuan (x)");
        xTujuanLabel.setVisible(true);
        yTujuanLabel.setPreferredSize(new Dimension(100,30));
        yTujuanLabel.setText("Tujuan (y)");
        yTujuanLabel.setVisible(true);
        penerimaLabel.setPreferredSize(new Dimension(100,30));
        penerimaLabel.setText("Nama penerima");
        penerimaLabel.setVisible(false);
        biayaLabel.setPreferredSize(new Dimension(100,30));
        biayaLabel.setText("Harga barang");
        biayaLabel.setVisible(false);
        layanan.setPreferredSize(new Dimension(150,30));
        layanan.setVisible(true);
        layanan.addItemListener(this);
        pesanID.setPreferredSize(new Dimension(150,30));
        pesanID.setVisible(true);
        xAwal.setPreferredSize(new Dimension(150,30));
        xAwal.setVisible(true);
        yAwal.setPreferredSize(new Dimension(150,30));
        yAwal.setVisible(true);
        xTujuan.setPreferredSize(new Dimension(150,30));
        xTujuan.setVisible(true);
        yTujuan.setPreferredSize(new Dimension(150,30));
        yTujuan.setVisible(true);
        penerima.setPreferredSize(new Dimension(150,30));
        penerima.setVisible(false);
        biaya.setPreferredSize(new Dimension(150,30));
        biaya.setVisible(false);
        pesanForm.add(layananLabel);
        pesanForm.add(layanan);
        pesanForm.add(pesanIDLabel);
        pesanForm.add(pesanID);
        pesanForm.add(xAwalLabel);
        pesanForm.add(xAwal);
        pesanForm.add(yAwalLabel);
        pesanForm.add(yAwal);
        pesanForm.add(xTujuanLabel);
        pesanForm.add(xTujuan);
        pesanForm.add(yTujuanLabel);
        pesanForm.add(yTujuan);
        pesanForm.add(penerimaLabel);
        pesanForm.add(penerima);
        pesanForm.add(biayaLabel);
        pesanForm.add(biaya);
        
        registrasi.setPreferredSize(new Dimension(600,40));
        registrasi.setBorder(new TitledBorder(new EtchedBorder(), "Registrasi"));
        userRegistration.setPreferredSize(new Dimension(250,30));
        userRegistration.setText("User Registration");
        userRegistration.setVisible(true);
        userRegistration.addActionListener(this);
        ojekRegistration.setPreferredSize(new Dimension(250,30));
        ojekRegistration.setText("Ojek Registration");
        ojekRegistration.setVisible(true);
        ojekRegistration.addActionListener(this);
        registrasi.add(userRegistration);
        registrasi.add(ojekRegistration);
        
        pesan.setPreferredSize(new Dimension(600,40));
        pesan.setBorder(new TitledBorder(new EtchedBorder(), "Pesan Ojek"));
        pesanOjek.setPreferredSize(new Dimension(300,30));
        pesanOjek.setText("Pesan Ojek");
        pesanOjek.setVisible(true);
        pesanOjek.addActionListener(this);
        pesan.add(pesanOjek);
        
        logPesanan.setPreferredSize(new Dimension(600,220));
        logPesanan.setBorder(new TitledBorder(new EtchedBorder(), "Log Pesanan"));
        log = new JTextArea(13,50);
        log.setEditable(false);
        scrollLog = new JScrollPane(log);
        scrollLog.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        logPesanan.add(scrollLog);
        
        logLaporan.setPreferredSize(new Dimension(600,220));
        logLaporan.setBorder(new TitledBorder(new EtchedBorder(), "Log Laporan Ojek"));
        laporan = new JTextArea(13,50);
        laporan.setEditable(false);
        scrollLaporan = new JScrollPane(laporan);
        scrollLaporan.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        logLaporan.add(scrollLaporan);
        
        super.add(registrasi);
        super.add(pesan);
        super.add(logPesanan);
        super.add(logLaporan);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        super.pack();
        super.setVisible(true);
    }
    
    /**
     * Metode override actionPerformed untuk menghandle event ketika mengklik button
     * @param e Action event
     */
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == userRegistration) {
            int ok = JOptionPane.showConfirmDialog(this, userForm, 
                    "User Registration", JOptionPane.OK_CANCEL_OPTION);
            if(ok == JOptionPane.OK_OPTION) {
                User user = new User(Integer.parseInt(userID.getText()), username.getText());
                OjeKampus.addUser(user);
            }
        }
        else if(e.getSource() == ojekRegistration) {
            int ok = JOptionPane.showConfirmDialog(this, ojekForm, 
                    "Ojek Registration", JOptionPane.OK_CANCEL_OPTION);
            if(ok == JOptionPane.OK_OPTION) {
                Ojek ojek = new Ojek(Integer.parseInt(ojekID.getText()), ojekname.getText());
                OjeKampus.addOjek(ojek);
            }
        }
        else if(e.getSource() == pesanOjek) {
            int ok = JOptionPane.showConfirmDialog(this, pesanForm, 
                    "Pesan Ojek", JOptionPane.OK_CANCEL_OPTION);
            if(ok == JOptionPane.OK_OPTION) {
                User user = null;
                try {
                    user = OjeKampus.getUser(Integer.parseInt(pesanID.getText()));
                } catch(NullPointerException npe) {
                    JOptionPane.showMessageDialog(pesanForm, "User not found", "Error", JOptionPane.ERROR_MESSAGE);
                }
                if(getLayanan().equals("ORANG")) {
                    double xa = Double.parseDouble(xAwal.getText());
                    double ya = Double.parseDouble(yAwal.getText());
                    double xt = Double.parseDouble(xTujuan.getText());
                    double yt = Double.parseDouble(yTujuan.getText());
                    user.panggilOjekPenumpang(xa, ya, xt, yt);
                }
                else if(getLayanan().equals("BARANG")) {
                    double xa = Double.parseDouble(xAwal.getText());
                    double ya = Double.parseDouble(yAwal.getText());
                    double xt = Double.parseDouble(xTujuan.getText());
                    double yt = Double.parseDouble(yTujuan.getText());
                    user.panggilOjekBarang(xa, ya, xt, yt, penerima.getText());
                }
                else if(getLayanan().equals("BELI")) {
                    double xa = Double.parseDouble(xAwal.getText());
                    double ya = Double.parseDouble(yAwal.getText());
                    double xt = Double.parseDouble(xTujuan.getText());
                    double yt = Double.parseDouble(yTujuan.getText());
                    double harga = Double.parseDouble(biaya.getText());
                    user.panggilOjekBeli(xa, ya, xt, yt, penerima.getText(), harga);
                }
            }
        }
    }
    
    /**
     * Metode override itemStateChanged untuk menghandle event dari JComboBox
     * @param e Item event
     */
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getStateChange() == ItemEvent.SELECTED) {
            if(getLayanan().equals("ORANG")) {
                penerimaLabel.setVisible(false);
                penerima.setVisible(false);
                biayaLabel.setVisible(false);
                biaya.setVisible(false);
                pesanForm.revalidate();
            }
            else if(getLayanan().equals("BARANG")) {
                penerimaLabel.setVisible(true);
                penerima.setVisible(true);
                biayaLabel.setVisible(false);
                biaya.setVisible(false);
                pesanForm.revalidate();
            }
            else if(getLayanan().equals("BELI")) {
                penerimaLabel.setVisible(true);
                penerima.setVisible(true);
                biayaLabel.setVisible(true);
                biaya.setVisible(true);
                pesanForm.revalidate();
            }
        }
    }
    
    /**
     * Metode untuk mendapatkan jenis layanan dari JComboBox
     * @return Jenis layanan
     */
    public String getLayanan()
    {
        return layanan.getSelectedItem().toString();
    }
    
    /**
     * Metode untuk menuliskan log laporan ojek pada JTextArea
     */
    public static void logLaporan(String text)
    {
        laporan.append(text);
    }
    
    /**
     * Metode untuk menuliskan log pesanan pada JTextArea
     */
    public static void logPesanan(String text)
    {
        log.append(text);
    }
}