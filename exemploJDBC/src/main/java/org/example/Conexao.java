package org.example;

import javax.swing.*;
import java.sql.SQLException;

public class Conexao {

    public static Connection conectar() {
      try{
          return DriverManager.getConnection(
                  "jbdc:mysql://localhost:3306/escola",
                  "root",
                  "mysqlfatec"
          );

          catch (SQLException e){
              JOptionPane.showMessageDialog(null, "Erro na conexão!");
              return null;
          }
      }
    }

}
