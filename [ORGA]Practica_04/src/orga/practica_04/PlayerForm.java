/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orga.practica_04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author aiyel
 */
public class PlayerForm extends javax.swing.JFrame {

    /**
     * Creates new form PlayerForm
     */
    public PlayerForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        System.out.println("___________________________________");
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
        tf_time = new javax.swing.JTextField();
        tf_score = new javax.swing.JTextField();
        tf_level = new javax.swing.JTextField();
        tf_user = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIBORITA");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(97, 208, 206));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(102, 200, 96));

        tf_time.setEditable(false);
        tf_time.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 13)); // NOI18N
        tf_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_timeActionPerformed(evt);
            }
        });

        tf_score.setEditable(false);
        tf_score.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 13)); // NOI18N

        tf_level.setEditable(false);
        tf_level.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 13)); // NOI18N

        tf_user.setEditable(false);
        tf_user.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 13)); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orga/practica_04/movil.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orga/practica_04/videojuego.png"))); // NOI18N
        jButton1.setText("Iniciar Juego");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orga/practica_04/juego-terminado.png"))); // NOI18N
        jButton2.setText("Fin del Juego");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orga/practica_04/informacion.png"))); // NOI18N
        jButton3.setText("Acerca De");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 13)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orga/practica_04/archivo.png"))); // NOI18N
        jButton4.setText("Ver Documentacion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 13)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orga/practica_04/error.png"))); // NOI18N
        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 13)); // NOI18N
        jLabel1.setText("Tiempo");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 13)); // NOI18N
        jLabel2.setText("Puntos");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 13)); // NOI18N
        jLabel3.setText("Nivel");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 13)); // NOI18N
        jLabel4.setText("Usuario");

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel6.setText("Bienvenido usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(62, 62, 62)
                                .addComponent(tf_time, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_level, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_score, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jButton1)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(138, 138, 138))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton3))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if(LogIn.loggedPlayer!=null){
            tf_user.setText(LogIn.loggedPlayer.getUsername());
            tf_time.setText(String.valueOf(LogIn.loggedPlayer.getTiempo()));
            tf_score.setText(String.valueOf(LogIn.loggedPlayer.getPuntos()));
            tf_level.setText(String.valueOf(LogIn.loggedPlayer.getNivel()));
            
            if(LogIn.loggedPlayer.getTiempo() > 0){
                AdminForm.tiempos[1][AdminForm.correlativo]=String.valueOf(LogIn.loggedPlayer.getTiempo());
                AdminForm.puntaje[1][AdminForm.correlativo]=String.valueOf(LogIn.loggedPlayer.getPuntos());
                AdminForm.tiempos[0][AdminForm.correlativo]=LogIn.loggedPlayer.getUsername(); 
                AdminForm.puntaje[0][AdminForm.correlativo]=LogIn.loggedPlayer.getUsername(); 
            }
        }else{
            LogIn login = new LogIn();
            this.dispose();
            login.setVisible(true);
        }
        
        
        
        if(AdminForm.correlativo ==9) 
                AdminForm.correlativo =0;
            else
                AdminForm.correlativo ++;
        
//  ORDENAMIENTO ---------------------------------------------------------------
     
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        LogIn login = new LogIn();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"                     VIBORITA 3.0       \n "
                                         + "      Universidad de San Carlos de Guatemala \n"
                                         + "             Organizacion Computacional \n  " 
                                         + "                     Practica 4     " );
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PantallaJuego gameboard = new PantallaJuego();
        this.dispose();
        gameboard.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_timeActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerForm().setVisible(true);
            }
        });
    }
    
    public static void tiempos(){
        double tiempo[] = new double[10];
        String user[] = new String[10];
        
        for (int i = 0; i < 10; i++) {
            if(AdminForm.tiempos[0][i] != null){
                tiempo[i] = Double.valueOf(String.valueOf(AdminForm.tiempos[1][i]));
            }
        }
        Arrays.sort(tiempo); 

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(AdminForm.tiempos[0][i] != null){
                    if(Double.valueOf(String.valueOf(AdminForm.tiempos[1][i]))== tiempo[j]){
                        user[j] = String.valueOf(AdminForm.tiempos[0][i]);
                    }
                }
            }
        }
        
        for (int i = 0; i < tiempo.length; i++) {
                System.out.print(tiempo[i] + " - ");
                System.out.println(user[i]);
        }
        reporte_tiempos(user, tiempo); 
//         File f;
//        f = new File("Top10_tiempo.txt");
//        try{
//            FileWriter filew = new FileWriter(f);
//            BufferedWriter escibiendo = new BufferedWriter(filew);
//            PrintWriter codigo = new PrintWriter(escibiendo);  
//                codigo.append("digraph G {\n");
//                codigo.append("node [shape=record];");
//                codigo.append("\nrankdir=TB;\n");
//                codigo.append("subgraph 1{\n");
//                codigo.append("struct1 [label=");
//                codigo.append(" \"<f"+0+"> "+0 );
//                
//                for (int i = 1; i < tiempo.length; i++) {
//                    codigo.append("| <f"+(i)+"> "+i +"\n"+tiempo[9-i]+"\n"+user[9-i]);
//                }
//                
//                
//                
//                codigo.append("\n}");
//                codigo.append("\n}");
//                codigo.close();
//        }
//        catch(IOException e){};
//        
//        
//        
//        try {
//
//            String cmd = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe -Tpng Top10_tiempo.txt -o t.jpg";
//            Runtime rt = Runtime.getRuntime();
//            rt.exec(cmd);
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        
//        try {
//            
//            String cmd = "cmd /C start t.jpg";
//            Runtime rt = Runtime.getRuntime();
//            rt.exec(cmd);
//            
//        } catch (Exception e) {
//            System.out.println(e);
//        }        
//        
        
    }
    
    public static void puntajes(){
        double puntos[] = new double[10];
        String user1[] = new String[10];
        
        for (int i = 0; i < 10; i++) {
            if(AdminForm.puntaje[0][i] != null){
                puntos[i] = Double.valueOf(String.valueOf(AdminForm.puntaje[1][i]));
            }
        }
        Arrays.sort(puntos); 

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(AdminForm.puntaje[0][i] != null){
                    if(Double.valueOf(String.valueOf(AdminForm.puntaje[1][i]))== puntos[j]){
                        user1[j] = String.valueOf(AdminForm.puntaje[0][i]);
                    }
                }
            }
        }
        
        for (int i = 0; i < puntos.length; i++) {
                System.out.print(puntos[i] + " - ");
                System.out.println(user1[i]);
        }
        reporte_puntos(user1, puntos); 
    }
    private static void reporte_tiempos(String a[], double b[]) {
    try {
        java.io.FileOutputStream archivo = new java.io.FileOutputStream("tiempos.html");
        archivo.write("<html> \n".getBytes());
        archivo.write("<head>\n".getBytes());
        archivo.write("<title> Reporte tiempos</title>\n".getBytes());
        archivo.write("<meta charset=\"UTF-8\">\n".getBytes());
        archivo.write("</head>\n".getBytes());
        archivo.write("<body background = src/orga/practica_04/1.png>\n".getBytes());
        archivo.write("<center>\n".getBytes());
        archivo.write("<h1>.</h1>\n".getBytes());
        archivo.write("<h2>.</h2>\n".getBytes());
        archivo.write("</center>\n".getBytes());
        
        archivo.write("<table align=center border = 1>\n".getBytes());
        archivo.write("<tr>\n".getBytes());
        archivo.write("<td>No.</td>\n".getBytes());
        archivo.write("<td>Nombre</td>\n".getBytes());
        archivo.write("<td>Tiempo</td>\n".getBytes());
        archivo.write("</tr>\n".getBytes());


        for (int i = 0; i <= 9; i++) {

                archivo.write(("<tr>\n").getBytes());

                archivo.write(("<td> "+ (i+1) + "</td>\n").getBytes());
                    archivo.write(("<td> "+ a[9-i] + "</td>\n").getBytes());
                
                archivo.write(("<td> "+b[9-i]+ "</td>\n").getBytes());

                archivo.write("</tr>\n".getBytes());

        }

        archivo.write("<center>\n.".getBytes());
        archivo.write("</center>\n.".getBytes());

        archivo.write("</table>\n".getBytes());
        archivo.write("</body>\n".getBytes());
        archivo.write("</html>".getBytes());
        Runtime.getRuntime().exec("explorer.exe tiempos.html");


    } catch (java.io.IOException e) {
        System.out.println(e);
    }
    }
    
    private static void reporte_puntos(String a[], double b[]) {
   try {
        java.io.FileOutputStream archivo = new java.io.FileOutputStream("puntaje.html");
        archivo.write("<html> \n".getBytes());
        archivo.write("<head>\n".getBytes());
        archivo.write("<title> Reporte Puntajes</title>\n".getBytes());
        archivo.write("<meta charset=\"UTF-8\">\n".getBytes());
        archivo.write("</head>\n".getBytes());
        archivo.write("<body background = src/orga/practica_04/2.png>\n".getBytes());
        archivo.write("<center>\n".getBytes());
        archivo.write("<h1>.</h1>\n".getBytes());
        archivo.write("<h2>.</h2>\n".getBytes());
        archivo.write("</center>\n".getBytes());
        
        archivo.write("<table align=center border = 1>\n".getBytes());
        archivo.write("<tr>\n".getBytes());
        archivo.write("<td>No.</td>\n".getBytes());
        archivo.write("<td>Nombre</td>\n".getBytes());
        archivo.write("<td>Puntaje</td>\n".getBytes());
        archivo.write("</tr>\n".getBytes());


        for (int i = 0; i <= 9; i++) {

                archivo.write(("<tr>\n").getBytes());

                archivo.write(("<td> "+ (i+1) + "</td>\n").getBytes());
                    archivo.write(("<td> "+ a[9-i] + "</td>\n").getBytes());
                
                archivo.write(("<td> "+b[9-i]+ "</td>\n").getBytes());

                archivo.write("</tr>\n".getBytes());

        }

        archivo.write("<center>\n.".getBytes());
        archivo.write("</center>\n.".getBytes());

        archivo.write("</table>\n".getBytes());
        archivo.write("</body>\n".getBytes());
        archivo.write("</html>".getBytes());
        Runtime.getRuntime().exec("explorer.exe puntaje.html");


    } catch (java.io.IOException e) {
        System.out.println(e);
    }
}
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_level;
    private javax.swing.JTextField tf_score;
    private javax.swing.JTextField tf_time;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}
