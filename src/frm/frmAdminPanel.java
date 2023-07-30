/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;

import cls.DBConnect;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
/**
 *
 * @author muham
 */
public class frmAdminPanel extends javax.swing.JFrame {

    /**
     * Creates new form frmAdmin
     */
    public frmAdminPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnKorisnici = new javax.swing.JButton();
        btnKnjige = new javax.swing.JButton();
        btnPozajmnice = new javax.swing.JButton();
        btnDodaj = new javax.swing.JButton();
        btnUredi = new javax.swing.JButton();
        btnIzbrisi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrikaz = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOdjava = new javax.swing.JButton();
        txtPretrazi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnIzvjestaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnKorisnici.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnKorisnici.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-user-24.png"))); // NOI18N
        btnKorisnici.setText("Korisnici");
        btnKorisnici.setToolTipText("");
        btnKorisnici.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKorisnici.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKorisnici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKorisniciActionPerformed(evt);
            }
        });

        btnKnjige.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnKnjige.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-bookmark-24.png"))); // NOI18N
        btnKnjige.setText("Knjige");
        btnKnjige.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKnjige.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKnjige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKnjigeActionPerformed(evt);
            }
        });

        btnPozajmnice.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPozajmnice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-calendar-24.png"))); // NOI18N
        btnPozajmnice.setText("Pozajmnice");
        btnPozajmnice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPozajmnice.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPozajmnice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPozajmniceActionPerformed(evt);
            }
        });

        btnDodaj.setBackground(new java.awt.Color(0, 204, 0));
        btnDodaj.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.setEnabled(false);
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnUredi.setBackground(new java.awt.Color(204, 204, 0));
        btnUredi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnUredi.setText("Uredi");
        btnUredi.setEnabled(false);
        btnUredi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrediActionPerformed(evt);
            }
        });

        btnIzbrisi.setBackground(new java.awt.Color(255, 0, 0));
        btnIzbrisi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnIzbrisi.setText("Izbrisi");
        btnIzbrisi.setEnabled(false);
        btnIzbrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzbrisiActionPerformed(evt);
            }
        });

        tblPrikaz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPrikaz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPrikazMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPrikaz);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/library-icon-10.png"))); // NOI18N
        jLabel1.setText("Biblioteka");
        jLabel1.setIconTextGap(25);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("  ");

        btnOdjava.setText("Odjavi se");
        btnOdjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdjavaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOdjava)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOdjava))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        txtPretrazi.setEnabled(false);
        txtPretrazi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPretraziKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("PRETRAZI:");

        btnIzvjestaj.setText("Izvjestaj");
        btnIzvjestaj.setEnabled(false);
        btnIzvjestaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzvjestajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnKorisnici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPozajmnice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnKnjige, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnUredi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnIzbrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIzvjestaj, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPretrazi)))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnKorisnici, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnKnjige, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnPozajmnice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPretrazi, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUredi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIzbrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIzvjestaj, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection kon = null;
    PreparedStatement ps;
    ResultSet rs;
    
    String izabrani;
    String prijavljeniEmail, prijavljeniIme;
    
    String from, to, host, sub, content;

    String jrxmlFilePath;
    

    private void ucitajKnjige(){
        try {
            kon = DBConnect.uspostaviKonekciju();
            ps = kon.prepareStatement("SELECT knjige.ime, knjige.autor, knjige.kolicina, kategorije.naziv AS kategorija FROM knjige INNER JOIN kategorije ON knjige.kategorija = kategorije.id");
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tblPrikaz.getModel();
            model.setRowCount(0);
            model.setColumnCount(0);
            model.addColumn("Ime");
            model.addColumn("Autor");
            model.addColumn("Kategorija");
            model.addColumn("Kolicina");
            while(rs.next()){
                model.addRow(new String[]{rs.getString("ime"),rs.getString("autor"),rs.getString("kategorija"),rs.getString("kolicina")});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void ucitajKorisnike(){
        try {
            kon = DBConnect.uspostaviKonekciju();
            ps = kon.prepareStatement("SELECT * FROM korisnici");
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tblPrikaz.getModel();
            model.setRowCount(0);
            model.setColumnCount(0);
            model.addColumn("Ime");
            model.addColumn("Prezime");
            model.addColumn("Mail");
            model.addColumn("Admin");
            while(rs.next()){
                String isAdmin = "";
                if(rs.getString("isAdmin").equals("1")){
                    isAdmin = "Administrator";
                } else {
                    isAdmin = "Član";
                }
                model.addRow(new String[]{rs.getString("ime"),rs.getString("prezime"),rs.getString("email"),isAdmin});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void ucitajPozajmnice(){
        try {
            kon = DBConnect.uspostaviKonekciju();
            ps = kon.prepareStatement("SELECT pozajmnice.id, pozajmnice.korisnik_id, pozajmnice.knjiga_id, pozajmnice.datum, knjige.ime, knjige.autor, knjige.kategorija, knjige.kolicina, korisnici.ime, korisnici.prezime, korisnici.email, korisnici.sifra, korisnici.isAdmin\n" +
                "FROM pozajmnice\n" +
                "INNER JOIN knjige ON pozajmnice.knjiga_id = knjige.id\n" +
                "INNER JOIN korisnici ON pozajmnice.korisnik_id = korisnici.id;");
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tblPrikaz.getModel();
            model.setRowCount(0);
            model.setColumnCount(0);
            model.addColumn("Ime korisnika");
            model.addColumn("Email");
            model.addColumn("Ime knjige");
            model.addColumn("Autor");
            model.addColumn("Datum");
            while(rs.next()){
                model.addRow(new String[]{rs.getString("korisnici.ime")+" "+rs.getString("prezime"),rs.getString("email"),rs.getString("ime"),rs.getString("autor"),rs.getString("datum")});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void btnPocetniState(){
        btnDodaj.setEnabled(true);
        btnIzbrisi.setEnabled(false);
        btnUredi.setEnabled(false);
        txtPretrazi.setEnabled(true);
        txtPretrazi.setText("");
    }
    private void btnKorisniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKorisniciActionPerformed
        // TODO add your handling code here:
        btnPocetniState();
        izabrani = "korisnici";
        ucitajKorisnike();
        jrxmlFilePath = "C:\\Users\\muham\\JaspersoftWorkspace\\MyReports\\korisnici.jrxml";
        btnIzvjestaj.setEnabled(true);
    }//GEN-LAST:event_btnKorisniciActionPerformed

    private void btnKnjigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKnjigeActionPerformed
        // TODO add your handling code here:
        btnPocetniState();
        izabrani = "knjige";
        ucitajKnjige();
        jrxmlFilePath = "C:\\Users\\muham\\JaspersoftWorkspace\\MyReports\\knjige.jrxml";
        btnIzvjestaj.setEnabled(true);
    }//GEN-LAST:event_btnKnjigeActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        // TODO add your handling code here:
        switch (izabrani) {
            case "knjige":
                this.setVisible(false);
                new frmDodajKnjigu().setVisible(true);
                break;
            case "korisnici":
                this.setVisible(false);
                new frmDodajKorisnika().setVisible(true);
                break;
            case "pozajmnice":
                this.setVisible(false);
                new frmDodajPozajmnicu().setVisible(true);
                break;
            default:
                break;
        }
;
        
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnIzbrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzbrisiActionPerformed
        // TODO add your handling code here:
        if(izabrani.equals("korisnici")){
            DefaultTableModel rt = (DefaultTableModel)tblPrikaz.getModel();
            int sr = tblPrikaz.getSelectedRow();
            String mail = String.valueOf(tblPrikaz.getValueAt(sr, 2));       
            try {
            sr = JOptionPane.showConfirmDialog(null,"Da li zelite obrisati korisnika " + rt.getValueAt(sr, 0).toString()+ " " + rt.getValueAt(sr, 1).toString()+"?",
                        "Brisanje korisnika", JOptionPane.YES_NO_OPTION ,JOptionPane.WARNING_MESSAGE);
            if (sr == JOptionPane.YES_OPTION) {
                ps = kon.prepareStatement("DELETE FROM korisnici WHERE email = ?");
                ps.setString(1, mail);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Korisnik je obrisan","Brisanje korisnika",JOptionPane.INFORMATION_MESSAGE);
            }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
                btnKorisnici.doClick();
            
        } else if(izabrani.equals("knjige")) {
            DefaultTableModel rt = (DefaultTableModel)tblPrikaz.getModel();
            int sr = tblPrikaz.getSelectedRow();
            String ime = String.valueOf(tblPrikaz.getValueAt(sr, 0));
            String autor = String.valueOf(tblPrikaz.getValueAt(sr, 1));                        
            try {
            sr = JOptionPane.showConfirmDialog(null, "Da li zelite obrisati knjigu " +rt.getValueAt(sr, 0).toString()+ ", autora " + rt.getValueAt(sr, 1).toString()+"?",
                        "Brisanje knjige", JOptionPane.YES_NO_OPTION ,JOptionPane.WARNING_MESSAGE);
            if (sr == JOptionPane.YES_OPTION) {
                ps = kon.prepareStatement("DELETE FROM knjige WHERE ime = ? AND autor = ?");
                ps.setString(1, ime);
                ps.setString(2, autor);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Knjiga je obrisana","Brisanje knjige",JOptionPane.INFORMATION_MESSAGE);
            }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
                btnKnjige.doClick();
        } else if (izabrani.equals("pozajmnice")) {
            int izbor = JOptionPane.showConfirmDialog(null, "Da li zelite vratiti knjigu " + tblPrikaz.getValueAt(tblPrikaz.getSelectedRow(), 2) + " koja je pozajmljena korisniku "+tblPrikaz.getValueAt(tblPrikaz.getSelectedRow(), 1)+"?",
                        "Vracanje pozajmnice", JOptionPane.YES_NO_OPTION ,JOptionPane.WARNING_MESSAGE);

            if(izbor == 0){
                try {
                    ps = kon.prepareStatement("SELECT * FROM rezervacije INNER JOIN knjige ON rezervacije.knjiga_id = knjige.id INNER JOIN korisnici ON rezervacije.korisnik_id = korisnici.id WHERE knjige.ime = ?");
                    ps.setString(1, (String) tblPrikaz.getValueAt(tblPrikaz.getSelectedRow(), 2));
                    rs = ps.executeQuery();
                    while(rs.next()){
                        from = "softverskotest@gmail.com";
                        to = rs.getString("korisnici.email");
                        host = "localhost";
                        sub = "Knjiga opet dostupna";
                        content = rs.getString("knjige.ime");

                        Properties p = new Properties();
                        p.put("mail.smtp.auth", "true");
                        p.put("mail.smtp.starttls.enable", "true");
                        p.put("mail.smtp.host", "smtp.gmail.com");
                        p.put("mail.smtp.port", "587");

                        Session s = Session.getDefaultInstance(p, new javax.mail.Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication(){
                                return new PasswordAuthentication("softverskotest@gmail.com", "hciadmguqihvylsi");
                            }

                        });   

                        try {
                            MimeMessage m = new MimeMessage(s);
                            m.setFrom(from);
                            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                            m.setSubject(sub);
                            m.setText(content);

                            Transport.send(m);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                        try {
                            String knjigaId = null;
                            ps=kon.prepareStatement("SELECT id FROM knjige WHERE ime = ?");
                            ps.setString(1, String.valueOf(tblPrikaz.getValueAt(tblPrikaz.getSelectedRow(), 2)));
                            rs = ps.executeQuery();
                            if(rs.next()){
                                knjigaId = rs.getString("id");
                            };
                            System.out.println(knjigaId);
                            ps = kon.prepareStatement("DELETE FROM rezervacije WHERE knjiga_id = ?");
                            ps.setString(1, knjigaId);
                            ps.executeUpdate();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(frmAdminPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                        ps = kon.prepareStatement("UPDATE knjige SET kolicina = kolicina + 1 WHERE ime = ?");
                        ps.setString(1, (String) tblPrikaz.getValueAt(tblPrikaz.getSelectedRow(), 2));
                        ps.executeUpdate();
                        ps = kon.prepareStatement("DELETE FROM pozajmnice WHERE knjiga_id IN (SELECT knjige.id FROM knjige INNER JOIN korisnici ON pozajmnice.korisnik_id = korisnici.id WHERE knjige.ime = ? AND korisnici.email = ?)");
                        ps.setString(1, (String) tblPrikaz.getValueAt(tblPrikaz.getSelectedRow(), 2));
                        ps.setString(2, (String) tblPrikaz.getValueAt(tblPrikaz.getSelectedRow(), 1));
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Pozajmnica je vracena","Vracanje knjige",JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                btnPozajmnice.doClick();
            }
        }
    }//GEN-LAST:event_btnIzbrisiActionPerformed

    private void tblPrikazMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPrikazMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblPrikaz.getSelectedRow();
        if (selectedRow != -1) { 
            btnIzbrisi.setEnabled(true); 
            btnUredi.setEnabled(true); 
            
        } else {
            btnIzbrisi.setEnabled(false);
            btnUredi.setEnabled(false);
        }
    }//GEN-LAST:event_tblPrikazMouseClicked

    private void btnUrediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrediActionPerformed
            // TODO add your handling code here:
        if(izabrani.equals("knjige")){
            this.setVisible(false);
            new frmUrediKnjigu().setVisible(true);
        }
        else if(izabrani.equals("korisnici")) {
            this.setVisible(false);
            new frmUrediKorisnika().setVisible(true);
        }
        else if(izabrani.equals("pozajmnice")) {
            this.setVisible(false);
            new frmUrediPozajmnicu().setVisible(true);
        }
        ;
    }//GEN-LAST:event_btnUrediActionPerformed

    private void btnPozajmniceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPozajmniceActionPerformed
        // TODO add your handling code here:
        btnPocetniState();
        izabrani = "pozajmnice";
        ucitajPozajmnice();
        jrxmlFilePath = "C:\\Users\\muham\\JaspersoftWorkspace\\MyReports\\pozajmnice.jrxml";
        btnIzvjestaj.setEnabled(true);
    }//GEN-LAST:event_btnPozajmniceActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       prijavljeniEmail = frmLogin.emailTxtBox.getText();
       
       try {
            kon = DBConnect.uspostaviKonekciju();
            ps = kon.prepareStatement("SELECT ime FROM korisnici WHERE email = ?");
            ps.setString(1, prijavljeniEmail);
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tblPrikaz.getModel();
            if(rs.next()){
                prijavljeniIme = rs.getString("ime");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
       
       jLabel2.setText("Dobro dosli, " + prijavljeniIme);
    }//GEN-LAST:event_formWindowOpened

    private void btnOdjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdjavaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new frmLogin().setVisible(true);
        prijavljeniEmail = "";
        prijavljeniIme = "";
    }//GEN-LAST:event_btnOdjavaActionPerformed

    private void txtPretraziKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPretraziKeyReleased
        // TODO add your handling code here:
        if(izabrani.equals("knjige")){
            try {
            kon = DBConnect.uspostaviKonekciju();
            ps = kon.prepareStatement("SELECT knjige.ime, knjige.autor, knjige.kolicina, kategorije.naziv AS kategorija FROM knjige INNER JOIN kategorije ON knjige.kategorija = kategorije.id WHERE ime LIKE ? OR autor LIKE ?");
            ps.setString(1, "%" + txtPretrazi.getText() + "%"); 
            ps.setString(2, "%" + txtPretrazi.getText() + "%");
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tblPrikaz.getModel();
            model.setRowCount(0);
            model.setColumnCount(0);
            model.addColumn("Ime");
            model.addColumn("Autor");
            model.addColumn("Kategorija");
            model.addColumn("Kolicina");
            while(rs.next()){
                model.addRow(new String[]{rs.getString("ime"),rs.getString("autor"),rs.getString("kategorija"),rs.getString("kolicina")});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
        else if(izabrani.equals("korisnici")) {
            try {
            kon = DBConnect.uspostaviKonekciju();
            ps = kon.prepareStatement("SELECT * FROM korisnici WHERE ime LIKE ? or prezime LIKE ? or email LIKE ?");
            ps.setString(1, "%" + txtPretrazi.getText() + "%"); 
            ps.setString(2, "%" + txtPretrazi.getText() + "%");
            ps.setString(3, "%" + txtPretrazi.getText() + "%");
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tblPrikaz.getModel();
            model.setRowCount(0);
            model.setColumnCount(0);
            model.addColumn("Ime");
            model.addColumn("Prezime");
            model.addColumn("Mail");
            model.addColumn("Admin");
            while(rs.next()){
                String isAdmin = "";
                if(rs.getString("isAdmin").equals("1")){
                    isAdmin = "Administrator";
                } else {
                    isAdmin = "Član";
                }
                model.addRow(new String[]{rs.getString("ime"),rs.getString("prezime"),rs.getString("email"),isAdmin});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
        else if(izabrani.equals("pozajmnice")) {
            try {
            kon = DBConnect.uspostaviKonekciju();

            ps = kon.prepareStatement("SELECT pozajmnice.id, pozajmnice.korisnik_id, pozajmnice.knjiga_id, pozajmnice.datum, knjige.ime, knjige.autor, knjige.kategorija, knjige.kolicina, korisnici.ime, korisnici.prezime, korisnici.email, korisnici.sifra, korisnici.isAdmin\n" +
                "FROM pozajmnice\n" +
                "INNER JOIN knjige ON pozajmnice.knjiga_id = knjige.id\n" +
                "INNER JOIN korisnici ON pozajmnice.korisnik_id = korisnici.id WHERE knjige.ime LIKE ? OR knjige.autor LIKE ? OR korisnici.ime LIKE ? OR korisnici.prezime LIKE ? OR korisnici.email LIKE ?");
            ps.setString(1, "%" + txtPretrazi.getText() + "%"); 
            ps.setString(2, "%" + txtPretrazi.getText() + "%");
            ps.setString(3, "%" + txtPretrazi.getText() + "%");
            ps.setString(4, "%" + txtPretrazi.getText() + "%");
            ps.setString(5, "%" + txtPretrazi.getText() + "%");
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tblPrikaz.getModel();
            model.setRowCount(0);
            model.setColumnCount(0);
            model.addColumn("Ime korisnika");
            model.addColumn("Email");
            model.addColumn("Ime knjige");
            model.addColumn("Autor");
            model.addColumn("Datum");
            while(rs.next()){
                model.addRow(new String[]{rs.getString("korisnici.ime")+" "+rs.getString("prezime"),rs.getString("email"),rs.getString("ime"),rs.getString("autor"),rs.getString("datum")});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
        ; 
    }//GEN-LAST:event_txtPretraziKeyReleased

    private void btnIzvjestajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzvjestajActionPerformed
        // TODO add your handling code here:
        try {
            // Putanja do .jrxml fajla
            

            // Kompajliranje .jrxml fajla u .jasper fajl
            JasperReport jasperReport = JasperCompileManager.compileReport(jrxmlFilePath);

            // Generisanje izvještaja
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, DBConnect.uspostaviKonekciju());

            // Izvoz izvještaja u PDF format
            JasperExportManager.exportReportToPdfFile(jasperPrint, "izlaz.pdf");
            
            File file = new File("/C:/Users/muham/OneDrive/Documents/NetBeansProjects/BibliotekaSoftversko/izlaz.pdf");
            try {
                Desktop.getDesktop().open(file);
            } catch (IOException ex) {
                Logger.getLogger(frmAdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("Izvještaj je uspješno generisan.");

        } catch (JRException e) {
            e.printStackTrace();
            System.out.println("Greška prilikom generisanja izvještaja.");
        }
    }//GEN-LAST:event_btnIzvjestajActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnIzbrisi;
    private javax.swing.JButton btnIzvjestaj;
    public static javax.swing.JButton btnKnjige;
    public static javax.swing.JButton btnKorisnici;
    private javax.swing.JButton btnOdjava;
    public static javax.swing.JButton btnPozajmnice;
    private javax.swing.JButton btnUredi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblPrikaz;
    private javax.swing.JTextField txtPretrazi;
    // End of variables declaration//GEN-END:variables
}