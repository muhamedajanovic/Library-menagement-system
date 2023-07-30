/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;

import cls.DBConnect;
import static frm.frmAdminPanel.tblPrikaz;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author muham
 */
public class frmUrediKnjigu extends javax.swing.JFrame {

    /**
     * Creates new form frmUrediKnjigu
     */
    public frmUrediKnjigu() {
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

        txtKolicina = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtIme = new javax.swing.JTextField();
        btnOdustani = new javax.swing.JButton();
        btnDodaj = new javax.swing.JButton();
        lblIme = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblKolicina = new javax.swing.JLabel();
        lblKategorija = new javax.swing.JLabel();
        comboboxKategorija = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtKolicina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKolicinaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKolicinaKeyTyped(evt);
            }
        });

        txtAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAutorKeyPressed(evt);
            }
        });

        txtIme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtImeKeyPressed(evt);
            }
        });

        btnOdustani.setText("Odustani");
        btnOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdustaniActionPerformed(evt);
            }
        });

        btnDodaj.setText("Uredi");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        lblIme.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblIme.setText("Ime");

        lblAutor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAutor.setText("Autor");

        lblKolicina.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblKolicina.setText("Kolicina");

        lblKategorija.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblKategorija.setText("Kategorija");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/library-icon-10.png"))); // NOI18N
        jLabel3.setText("Biblioteka");
        jLabel3.setIconTextGap(25);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIme)
                            .addComponent(lblAutor)
                            .addComponent(lblKategorija)
                            .addComponent(lblKolicina))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboboxKategorija, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIme)
                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboboxKategorija, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKategorija))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKolicina))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection kon = null;
    PreparedStatement ps;
    ResultSet rs;
    
    public static boolean validacijaUnosa(String ime, String autor, String kolicina){
        if (ime.isEmpty() || autor.isEmpty() || kolicina.isEmpty()) {
            return false;
        }
        return true;
    };
    
    public void popunjavanjePolja(JTextField trenutno, JTextField sljedece, java.awt.event.KeyEvent evt){
        trenutno.setBackground(Color.white);
        int key = evt.getKeyCode();
        if(key==10){
            if(trenutno.getText().isEmpty()){
                trenutno.requestFocus();
                trenutno.setBackground(Color.red);
            } else {
                sljedece.requestFocus();
            }
        }
    }
    private void btnOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new frmAdminPanel().setVisible(true);
        frmAdminPanel.btnKnjige.doClick();
    }//GEN-LAST:event_btnOdustaniActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        // TODO add your handling code here:
        txtIme.setBackground(Color.white);
        txtAutor.setBackground(Color.white);
        txtKolicina.setBackground(Color.white);

        String ime = txtIme.getText();
        String autor = txtAutor.getText();
        String kolicina = txtKolicina.getText();
        String kategorija = String.valueOf(comboboxKategorija.getSelectedItem());

        if(validacijaUnosa(ime, autor, kolicina)){
            try {
                kon = DBConnect.uspostaviKonekciju();
                ps = kon.prepareStatement("SELECT id FROM kategorije WHERE naziv=?");
                ps.setString(1, kategorija);
                rs = ps.executeQuery();
                while(rs.next()){
                    kategorija = rs.getString("id");
                    ps = kon.prepareStatement("UPDATE knjige SET ime=?, autor=?, kolicina=?, kategorija=? WHERE ime=? AND autor=?");
                    ps.setString(1, ime);
                    ps.setString(2, autor);
                    ps.setString(3, kolicina);
                    ps.setString(4, kategorija);
                    ps.setString(5, String.valueOf(tblPrikaz.getValueAt(tblPrikaz.getSelectedRow(), 0)));
                    ps.setString(6, String.valueOf(tblPrikaz.getValueAt(tblPrikaz.getSelectedRow(), 1)));
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Knjiga uspjesno dodana");
                    this.setVisible(false);
                    new frmAdminPanel().setVisible(true);
                    frmAdminPanel.btnKnjige.doClick();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            if(!validacijaUnosa(ime, autor, kolicina)){
                if(ime.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Polje za ime knjige je prazno");
                    txtIme.requestFocus();
                    txtIme.setBackground(Color.red);
                } else if (autor.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Polje za autora je prazno");
                    txtAutor.requestFocus();
                    txtAutor.setBackground(Color.red);
                } else if (kolicina.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Polje za kolicinu je prazno");
                    txtKolicina.requestFocus();
                    txtKolicina.setBackground(Color.red);
                }
            }
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            kon = DBConnect.uspostaviKonekciju();
            ps = kon.prepareStatement("SELECT naziv FROM kategorije");
            rs = ps.executeQuery();
            while(rs.next()){
                comboboxKategorija.addItem(rs.getString("naziv"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        try {
            int sr = tblPrikaz.getSelectedRow();
            String ime = String.valueOf(tblPrikaz.getValueAt(sr, 0));
            String autor = String.valueOf(tblPrikaz.getValueAt(sr, 1));
            kon = DBConnect.uspostaviKonekciju();
            ps = kon.prepareStatement("SELECT knjige.ime, knjige.autor, knjige.kolicina, kategorije.naziv AS kategorija FROM knjige INNER JOIN kategorije ON knjige.kategorija = kategorije.id WHERE ime = ? AND autor = ?");
            ps.setString(1, ime);
            ps.setString(2, autor);
            rs = ps.executeQuery();
            if(rs.next()){
                txtIme.setText(rs.getString("ime"));
                txtAutor.setText(rs.getString("autor"));
                txtKolicina.setText(rs.getString("kolicina"));
                comboboxKategorija.setSelectedItem(rs.getString("kategorija"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    }//GEN-LAST:event_formWindowOpened

    private void txtKolicinaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKolicinaKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume(); // Odbacuje unos ako nije broj
        }
    }//GEN-LAST:event_txtKolicinaKeyTyped

    private void txtImeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImeKeyPressed
        // TODO add your handling code here:
        popunjavanjePolja(txtIme, txtAutor, evt);
    }//GEN-LAST:event_txtImeKeyPressed

    private void txtAutorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorKeyPressed
        // TODO add your handling code here:
        popunjavanjePolja(txtAutor, txtKolicina, evt);
    }//GEN-LAST:event_txtAutorKeyPressed

    private void txtKolicinaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKolicinaKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if(key==10){
            if(txtKolicina.getText().isEmpty()){
                txtKolicina.requestFocus();
                txtKolicina.setBackground(Color.red);
            } else {
                btnDodaj.doClick();
            }
        }
    }//GEN-LAST:event_txtKolicinaKeyPressed

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
            java.util.logging.Logger.getLogger(frmUrediKnjigu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUrediKnjigu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUrediKnjigu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUrediKnjigu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUrediKnjigu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnOdustani;
    private javax.swing.JComboBox<String> comboboxKategorija;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblIme;
    private javax.swing.JLabel lblKategorija;
    private javax.swing.JLabel lblKolicina;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtKolicina;
    // End of variables declaration//GEN-END:variables
}