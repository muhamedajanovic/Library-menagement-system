/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;

import cls.DBConnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Random;

/**
 *
 * @author muham
 */
public class frmDodajKorisnika extends javax.swing.JFrame {

    /**
     * Creates new form frmDodajKorisnika
     */
    public frmDodajKorisnika() {
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

        btnOdustani = new javax.swing.JButton();
        lblIme = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        lblPrezime = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        comboboxAdmin = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        txtIme = new javax.swing.JTextField();
        lblSifra = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSifra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOdustani.setText("Odustani");
        btnOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdustaniActionPerformed(evt);
            }
        });

        lblIme.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblIme.setText("Ime");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        lblPrezime.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPrezime.setText("Prezime");

        lblEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEmail.setText("Email");

        lblAdmin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAdmin.setText("Admin");

        comboboxAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Član", "Administrator" }));

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        txtPrezime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrezimeKeyPressed(evt);
            }
        });

        txtIme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtImeKeyPressed(evt);
            }
        });

        lblSifra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblSifra.setText("Šifra");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/library-icon-10.png"))); // NOI18N
        jLabel3.setText("Biblioteka");
        jLabel3.setIconTextGap(25);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        txtSifra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSifraKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(lblPrezime)
                            .addComponent(lblEmail)
                            .addComponent(lblAdmin)
                            .addComponent(lblSifra))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSifra)
                                .addComponent(comboboxAdmin, 0, 180, Short.MAX_VALUE)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIme)
                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrezime)
                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdmin)
                    .addComponent(comboboxAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSifra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSifra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
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
    
    public static boolean validacijaUnosa(String ime, String prezime, String email, String sifra){
        if (ime.isEmpty() || prezime.isEmpty() || email.isEmpty() || sifra.isEmpty()) {
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
        frmAdminPanel.btnKorisnici.doClick();
    }//GEN-LAST:event_btnOdustaniActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        // TODO add your handling code here:
        String ime = txtIme.getText();
        String prezime = txtPrezime.getText();
        String email = txtEmail.getText();
        String sifra = txtSifra.getText();
        String isAdmin;
        if(String.valueOf(comboboxAdmin.getSelectedItem()).equals("Administrator")){
            isAdmin = "1";
        } else {
            isAdmin = "0";
        }
        
        if(validacijaUnosa(ime, prezime, email, sifra)){
        
            try {
                String sql = "INSERT INTO korisnici(ime, prezime, email, sifra, isAdmin) VALUES (?,?,?,?,?)";
                kon = DBConnect.uspostaviKonekciju();
                ps = kon.prepareStatement(sql);
                ps.setString(1, ime);
                ps.setString(2, prezime);
                ps.setString(3, email);
                ps.setString(4,sifra);
                ps.setString(5,isAdmin);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Korisnik je dodan", "Dodavanje korisnika", JOptionPane.INFORMATION_MESSAGE);

                this.setVisible(false);
                new frmAdminPanel().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Greška u komunikaciji sa serverom -> "+e.getMessage());
            }
        } else {
            if(!validacijaUnosa(ime, prezime, sifra, email)){
                if(ime.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Polje za ime je prazno");
                    txtIme.requestFocus();
                    txtIme.setBackground(Color.red);
                } else if (prezime.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Polje za prezime je prazno");
                    txtPrezime.requestFocus();
                    txtPrezime.setBackground(Color.red);
                } else if (email.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Polje za email je prazno");
                    txtEmail.requestFocus();
                    txtEmail.setBackground(Color.red);
                } else if (sifra.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Polje za sifru je prazno");
                    txtSifra.requestFocus();
                    txtSifra.setBackground(Color.red);
                } 
            }
        }
        
    }//GEN-LAST:event_btnDodajActionPerformed

    private void txtImeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImeKeyPressed
        // TODO add your handling code here:
        popunjavanjePolja(txtIme, txtPrezime, evt);
    }//GEN-LAST:event_txtImeKeyPressed

    private void txtPrezimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrezimeKeyPressed
        // TODO add your handling code here:
        popunjavanjePolja(txtPrezime, txtEmail, evt);
    }//GEN-LAST:event_txtPrezimeKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
        popunjavanjePolja(txtEmail, txtSifra, evt);
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtSifraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSifraKeyPressed
        // TODO add your handling code here:
        txtSifra.setBackground(Color.white);
        int key = evt.getKeyCode();
        if(key==10){
            if(txtSifra.getText().isEmpty()){
                txtSifra.requestFocus();
                txtSifra.setBackground(Color.red);
            } else {
                btnDodaj.doClick();
            }
        }
    }//GEN-LAST:event_txtSifraKeyPressed

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
            java.util.logging.Logger.getLogger(frmDodajKorisnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDodajKorisnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDodajKorisnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDodajKorisnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDodajKorisnika().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnOdustani;
    private javax.swing.JComboBox<String> comboboxAdmin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIme;
    private javax.swing.JLabel lblPrezime;
    private javax.swing.JLabel lblSifra;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JPasswordField txtSifra;
    // End of variables declaration//GEN-END:variables
}
