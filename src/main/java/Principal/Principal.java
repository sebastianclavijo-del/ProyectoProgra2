/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import GUI.Inicio;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Principal {

    public static void main(String[] args) {
        

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {

                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (Exception ex) {
                    System.err.println("No se pudo cargar el tema visual. Usando el diseño por defecto.");
                }

                
                Inicio pantallaPrincipal = new Inicio(); 
                pantallaPrincipal.setLocationRelativeTo(null); 
                pantallaPrincipal.setVisible(true); 
            }
        });
    }
}
