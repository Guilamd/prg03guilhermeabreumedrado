/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prg03guilhermeabreumedrado;

import br.com.ifba.atividade03.view.telaIdade;

/**
 *
 * @author guilh
 */
public class prg03guilhermeabreumedrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Pede pro Java rodar esse código na thread que cuida da parte gráfica
        java.awt.EventQueue.invokeLater(new Runnable()
        {
        // Aqui dentro vai o que a gente quer rodar
        public void run()
        {
        // Cria a janelinha 'telaIdade' e manda aparecer na tela
        new telaIdade().setVisible(true);
        }
    });

    }
    
}