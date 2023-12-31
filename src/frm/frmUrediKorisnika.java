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
public class frmUrediKorisnika extends javax.swing.JFrame {

    /**
     * Creates new form frmUrediKorisnika
     */
    public frmUrediKorisnika() {
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

        txtPrezime = new javax.swing.JTextField();
        txtIme = new javax.swing.JTextField();
        lblSifra = new javax.swing.JLabel();
        btnOdustani = new javax.swing.JButton();
        txtSifra = new javax.swing.JTextField();
        lblIme = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        lblPrezime = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        comboboxAdmin = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
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

        btnOdustani.setText("Odustani");
        btnOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdustaniActionPerformed(evt);
            }
        });

        txtSifra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSifraKeyPressed(evt);
            }
        });

        lblIme.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblIme.setText("Ime");

        btnDodaj.setText("Uredi");
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
                .addGap(75, 75, 75)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSifra)
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
                                .addComponent(lblAdmin))
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboboxAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSifra, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(lblSifra)
                    .addComponent(txtSifra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        String isAdmin = String.valueOf(comboboxAdmin.getSelectedIndex());
        if(validacijaUnosa(ime, prezime, email, sifra)){

            try {
                
                String sql = "UPDATE korisnici SET ime=?, prezime=?, email=?, sifra=?, isAdmin=? WHERE email=?";
                kon = DBConnect.uspostaviKonekciju();
                
                ps = kon.prepareStatement(sql);
                ps.setString(1, ime);
                ps.setString(2, prezime);
                ps.setString(3, email);
                ps.setString(4,sifra);
                ps.setString(5,isAdmin);
                ps.setString(6,String.valueOf(tblPrikaz.getValueAt(tblPrikaz.getSelectedRow(), 2)));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Kategorija je unijeta", "Kategorija unos", JOptionPane.INFORMATION_MESSAGE);

                this.setVisible(false);
                new frmAdminPanel().setVisible(true);
                frmAdminPanel.btnKorisnici.doClick();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Greška u komunikaciji sa serverom -> "+e.getMessage());
            }
        }

    }//GEN-LAST:event_btnDodajActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            int sr = tblPrikaz.getSelectedRow();
            String mail = String.valueOf(tblPrikaz.getValueAt(sr, 2));
            kon = DBConnect.uspostaviKonekciju();
            ps = kon.prepareStatement("SELECT ime, prezime, email, sifra, isAdmin FROM korisnici WHERE email = ?");
            ps.setString(1, mail);
            rs = ps.executeQuery();
            if(rs.next()){
                txtIme.setText(rs.getString("ime"));
                txtPrezime.setText(rs.getString("prezime"));
                txtEmail.setText(rs.getString("email"));
                txtSifra.setText(rs.getString("sifra"));
                comboboxAdmin.setSelectedIndex(Integer.valueOf(rs.getString("isAdmin")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    }//GEN-LAST:event_formWindowOpened

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
        popunjavanjePolja( txtEmail, txtSifra, evt);
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtSifraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSifraKeyPressed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(frmUrediKorisnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUrediKorisnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUrediKorisnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUrediKorisnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUrediKorisnika().setVisible(true);
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
    private javax.swing.JTextField txtSifra;
    // End of variables declaration//GEN-END:variables
}
