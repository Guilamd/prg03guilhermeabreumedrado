/*
 nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.atividade05.view;
import javax.swing.DefaultListModel;
/**
 *
 * @author guilh
 */
public class TelaContatador extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaContatador.class.getName());

   
    public TelaContatador() {
        initComponents();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sliInicio = new javax.swing.JSlider();
        sliFim = new javax.swing.JSlider();
        sliPasso = new javax.swing.JSlider();
        lblInicio = new javax.swing.JLabel();
        lblFim = new javax.swing.JLabel();
        lblPasso = new javax.swing.JLabel();
        btnCont = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCont = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Inicio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Fim");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Passo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        sliInicio.setMaximum(5);
        sliInicio.setValue(0);
        sliInicio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliInicioStateChanged(evt);
            }
        });
        getContentPane().add(sliInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        sliFim.setMaximum(20);
        sliFim.setMinimum(6);
        sliFim.setValue(6);
        sliFim.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliFimStateChanged(evt);
            }
        });
        getContentPane().add(sliFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        sliPasso.setMaximum(5);
        sliPasso.setMinimum(1);
        sliPasso.setValue(1);
        sliPasso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliPassoStateChanged(evt);
            }
        });
        getContentPane().add(sliPasso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        lblInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblInicio.setText("0");
        getContentPane().add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        lblFim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFim.setText("6");
        getContentPane().add(lblFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        lblPasso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPasso.setText("1");
        getContentPane().add(lblPasso, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        btnCont.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        btnCont.setText("Contar");
        btnCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContActionPerformed(evt);
            }
        });
        getContentPane().add(btnCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        lstCont.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(lstCont);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 90, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContActionPerformed
        //peganovamente os valores
        int inicio = sliInicio.getValue();
        int fim = sliFim.getValue();
        int passo = sliPasso.getValue();
        
        // Cria um novo objeto DefaultListModel
        DefaultListModel lista = new DefaultListModel();
        
        /*   
        Loop para preencher o modelo da lista:
        Conta de '0' até 'f' (fim), pulando de 'p' em 'p' (passo).
         Cada número é adicionado como um novo elemento na lista.
        */
        for(int cont = 0; cont <=fim; cont+=passo){
            lista.addElement(cont);
        }
        lstCont.setModel(lista);//linha para exibir a lista
    }//GEN-LAST:event_btnContActionPerformed

    //Primeiro slider(sliInicio)
    private void sliInicioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliInicioStateChanged
       int inicio = sliInicio.getValue();//pega o valor 
       lblInicio.setText(Integer.toString(inicio));// Define o texto do rótulo 'lblInicio' com o valor inteiro de 'i'.
    }//GEN-LAST:event_sliInicioStateChanged
    //segundo slider(sliFim)
    private void sliFimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliFimStateChanged
        int fim = sliFim.getValue();
        lblFim.setText(Integer.toString(fim));
    }//GEN-LAST:event_sliFimStateChanged
    //terceiro slider(sliPasso)
    private void sliPassoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliPassoStateChanged
        int passo = sliPasso.getValue();
        lblPasso.setText(Integer.toString(passo));
    }//GEN-LAST:event_sliPassoStateChanged

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new TelaContatador().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCont;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFim;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblPasso;
    private javax.swing.JList<String> lstCont;
    private javax.swing.JSlider sliFim;
    private javax.swing.JSlider sliInicio;
    private javax.swing.JSlider sliPasso;
    // End of variables declaration//GEN-END:variables
}
