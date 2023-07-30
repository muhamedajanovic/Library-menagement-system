package cls;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author esad
 */
public class DBConnect {
  private static String konString   = "jdbc:mysql://localhost/dbBiblioteka";
  private static String konKorisnik = "root";
  private static String konSifra    = "";
  
  public static Connection uspostaviKonekciju(){
      try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection kon = DriverManager.getConnection(konString, konKorisnik, konSifra);
          //JOptionPane.showMessageDialog(null, "Veza sa bazom podataka je uspostavljena!");
          return kon;
      }catch (Exception e){
          JOptionPane.showMessageDialog(null, "Greška u komunikaciji sa serverom ->"+e.getMessage());
          return null;
      }
  }
}