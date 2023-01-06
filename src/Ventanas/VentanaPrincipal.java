
package Ventanas;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class VentanaPrincipal extends javax.swing.JFrame {
    private boolean casilla[][] = new boolean[3][3];
    private String turno = "usuario1";
    private int matriz[][] = new int[3][3];
    private String usuario1, usuario2;
    private int victoriasUsuario1=0, victoriasUsuario2=0, empates=0;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal(String usuario1, String usuario2) {
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        llenarCasillas();
        llenarMatriz();
        
        
    }
    
    private void dibujarX(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/RedX.png")));
    }
    
    private void dibujarO(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/BlueO.png")));
    }
    
    private void llenarCasillas() {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                casilla[i][j] = true;
            }
        }
    }
    
    private void llenarMatriz() {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j] = 0;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonArribaIzquierda = new javax.swing.JButton();
        botonArriba = new javax.swing.JButton();
        botonArribaDerecha = new javax.swing.JButton();
        botonIzquierda = new javax.swing.JButton();
        botonCentro = new javax.swing.JButton();
        botonDerecho = new javax.swing.JButton();
        botonAbajoizquierda = new javax.swing.JButton();
        botonAbajo = new javax.swing.JButton();
        botonAbajoDerecha = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        comenzardeNuevo = new javax.swing.JMenuItem();
        mostrarTablaResultados = new javax.swing.JMenuItem();
        SeparadorJuego = new javax.swing.JPopupMenu.Separator();
        botonSalir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.GridLayout(3, 3));

        botonArribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonArribaIzquierda);

        botonArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaActionPerformed(evt);
            }
        });
        panel.add(botonArriba);

        botonArribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaDerechaActionPerformed(evt);
            }
        });
        panel.add(botonArribaDerecha);

        botonIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonIzquierda);

        botonCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentroActionPerformed(evt);
            }
        });
        panel.add(botonCentro);

        botonDerecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDerechoActionPerformed(evt);
            }
        });
        panel.add(botonDerecho);

        botonAbajoizquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoizquierdaActionPerformed(evt);
            }
        });
        panel.add(botonAbajoizquierda);

        botonAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoActionPerformed(evt);
            }
        });
        panel.add(botonAbajo);

        botonAbajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoDerechaActionPerformed(evt);
            }
        });
        panel.add(botonAbajoDerecha);

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        comenzardeNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzardeNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restart.png"))); // NOI18N
        comenzardeNuevo.setText("Comenzar de nuevo");
        comenzardeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzardeNuevoActionPerformed(evt);
            }
        });
        menuJuego.add(comenzardeNuevo);

        mostrarTablaResultados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mostrarTablaResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/table.png"))); // NOI18N
        mostrarTablaResultados.setText("Mostrar tabla de resultados ");
        mostrarTablaResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTablaResultadosActionPerformed(evt);
            }
        });
        menuJuego.add(mostrarTablaResultados);
        menuJuego.add(SeparadorJuego);

        botonSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        menuJuego.add(botonSalir);

        BarraMenu.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        menuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAyudaMouseClicked(evt);
            }
        });
        menuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAyudaActionPerformed(evt);
            }
        });
        BarraMenu.add(menuAyuda);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comenzardeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzardeNuevoActionPerformed
        victoriasUsuario1=0; 
        victoriasUsuario2=0;
        empates=0;
        reiniciarJuego();
    }//GEN-LAST:event_comenzardeNuevoActionPerformed

    private void mostrarTablaResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTablaResultadosActionPerformed
        VentanaMostrarResultados results = new VentanaMostrarResultados(this, true, usuario1, usuario2, victoriasUsuario1, victoriasUsuario2, empates);
        results.setVisible(true);
    }//GEN-LAST:event_mostrarTablaResultadosActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
      System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonArribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaIzquierdaActionPerformed
        if(casilla[0][0] == true){
            if(turno.equals("usuario1")) {
                dibujarX(botonArribaIzquierda);
                turno = "usuario2";
                matriz[0][0] = 1;
                
                
            } else {
                dibujarO(botonArribaIzquierda);
                turno = "usuario1";
                matriz[0][0] = 2;
                
            }
            
            casilla[0][0] = false;
            comprobarGanador();
            
            
        }
    }//GEN-LAST:event_botonArribaIzquierdaActionPerformed

    private void botonArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaActionPerformed
        if(casilla[0][1] == true){//Verificando si aún no se ha hecho click en la casilla
            if(turno.equals("usuario1")) {//Verificamos el turno
                dibujarX(botonArriba);
                turno = "usuario2";
                matriz[0][1] = 1;
                
            } else {
                dibujarO(botonArriba);
                turno = "usuario1";
                matriz[0][1] = 2;
            }
            
            casilla[0][1] = false;
            comprobarGanador();
            
            
            
        }
    }//GEN-LAST:event_botonArribaActionPerformed

    private void botonArribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaDerechaActionPerformed
       if(casilla[0][2] == true){//Verificando si aún no se ha hecho click en la casilla
            if(turno.equals("usuario1")) {//Verificamos el turno
                dibujarX(botonArribaDerecha);
                turno = "usuario2";
                matriz[0][2] = 1;
                
                
            } else {
                dibujarO(botonArribaDerecha);
                turno = "usuario1";
                matriz[0][2] = 2;
                
            }
            
            casilla[0][2] = false;
            comprobarGanador();
            
            
        }
    }//GEN-LAST:event_botonArribaDerechaActionPerformed

    private void botonIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIzquierdaActionPerformed
        if(casilla[1][0] == true){//Verificando si aún no se ha hecho click en la casilla
            if(turno.equals("usuario1")) {//Verificamos el turno
                dibujarX(botonIzquierda);
                turno = "usuario2";
                matriz[1][0] = 1;
                
                
            } else {
                dibujarO(botonIzquierda);
                turno = "usuario1";
                matriz[1][0] = 2;
                
            }
            
            casilla[1][0] = false;
            comprobarGanador();
            
            
        }
    }//GEN-LAST:event_botonIzquierdaActionPerformed

    private void botonCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentroActionPerformed
       if(casilla[1][1] == true){//Verificando si aún no se ha hecho click en la casilla
            if(turno.equals("usuario1")) {//Verificamos el turno
                dibujarX(botonCentro);
                turno = "usuario2";
                matriz[1][1] = 1;
                
                
            } else {
                dibujarO(botonCentro);
                turno = "usuario1";
                matriz[1][1] = 2;
            }
            
            casilla[1][1] = false;
            comprobarGanador();
            
            
        }
    }//GEN-LAST:event_botonCentroActionPerformed

    private void botonDerechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDerechoActionPerformed
       if(casilla[1][2] == true){//Verificando si aún no se ha hecho click en la casilla
            if(turno.equals("usuario1")) {//Verificamos el turno
                dibujarX(botonDerecho);
                turno = "usuario2";
                matriz[1][2] = 1;
                
            } else {
                dibujarO(botonDerecho);
                turno = "usuario1";
                matriz[1][2] = 2;
            }
            
            casilla[1][2] = false;
            comprobarGanador();
            
            
        }
    }//GEN-LAST:event_botonDerechoActionPerformed

    private void botonAbajoizquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoizquierdaActionPerformed
        if(casilla[2][0] == true){//Verificando si aún no se ha hecho click en la casilla
            if(turno.equals("usuario1")) {//Verificamos el turno
                dibujarX(botonAbajoizquierda);
                turno = "usuario2";
                matriz[2][0] = 1;
                
                
            } else {
                dibujarO(botonAbajoizquierda);
                turno = "usuario1";
                matriz[2][0] = 2;
            }
            
            casilla[2][0] = false;
            comprobarGanador();
            
            
        }
    }//GEN-LAST:event_botonAbajoizquierdaActionPerformed

    private void botonAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoActionPerformed
        if(casilla[2][1] == true){//Verificando si aún no se ha hecho click en la casilla
            if(turno.equals("usuario1")) {//Verificamos el turno
                dibujarX(botonAbajo);
                turno = "usuario2";
                matriz[2][1] = 1;
                
                
            } else {
                dibujarO(botonAbajo);
                turno = "usuario1";
                matriz[2][1] = 2;
            }
            
            casilla[2][1] = false;
            comprobarGanador();
            
            
        }
    }//GEN-LAST:event_botonAbajoActionPerformed

    private void botonAbajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoDerechaActionPerformed
        if(casilla[2][2] == true){//Verificando si aún no se ha hecho click en la casilla
            if(turno.equals("usuario1")) {//Verificamos el turno
                dibujarX(botonAbajoDerecha);
                turno = "usuario2";
                matriz[2][2] = 1;
                
            } else {
                dibujarO(botonAbajoDerecha);
                turno = "usuario1";
                matriz[2][2] = 2;
            }
            
            casilla[2][2] = false;
            comprobarGanador();
            
            
        }
    }//GEN-LAST:event_botonAbajoDerechaActionPerformed

    private void menuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAyudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAyudaActionPerformed

    private void menuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAyudaMouseClicked
        try {
            try {
                Desktop.getDesktop().browse(new URI("https://www.cope.es/actualidad/vivir/juegos-tradicionales/noticias/juegos-para-aislamiento-las-tres-raya-20200522_730488#:~:text=En%20un%20papel%20se%20hacen,sea%20vertical%2C%20horizontal%20o%20diagonal."));
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuAyudaMouseClicked

    private void comprobarGanador() {
        boolean ganador1 = false;
        boolean ganador2 = false;
        int casillaEmpate = 0;
        
        //Comprobamos si el ganador es el usuario1
        ganador1 = comprobar(1);
        ganador2 = comprobar(2);
        
        if(ganador1 == true){
            VentanaGanador ventanaG = new VentanaGanador(this, true, usuario1);
            ventanaG.setVisible(true);
            victoriasUsuario1++;            
            reiniciarJuego();
            
        }
        else if(ganador2 == true){
            System.out.println("El ganador es "+usuario2);
            VentanaGanador ventanaG = new VentanaGanador(this, true, usuario2);
            ventanaG.setVisible(true);
            victoriasUsuario2++;
            reiniciarJuego();
            
        
    } 
        else {
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(matriz[i][j] != 0){ //Puede haber 1 o 2
                        casillaEmpate++;
                    }
                }
            }
            
            if(casillaEmpate == 9){
                VentanaEmpate ventanaE = new VentanaEmpate(this, true);
                ventanaE.setVisible(true);
                empates++;
                reiniciarJuego();
            }
            else {
                casillaEmpate = 0;
            }
        }
    
    
    }
    
    private boolean comprobar(int numero){
        boolean ganador = false;
        
        if(matriz[0][0] == numero && matriz[0][1]==numero && matriz[0][2] == numero){
            ganador = true;
        }
        else if(matriz[1][0] == numero && matriz[1][1] == numero && matriz[1][2] == numero) {
            ganador = true;
        } 
        else if(matriz[2][0] == numero && matriz[2][1] == numero && matriz[2][2] == numero) {
            ganador = true;
        }
        else if(matriz[0][0] == numero && matriz[1][1] == numero && matriz[2][2] == numero) {
            ganador = true;
        }
        else if(matriz[0][2] == numero && matriz[1][1] == numero && matriz[2][0] == numero) {
            ganador = true;
        }
        else if(matriz[0][0] == numero && matriz[1][0] == numero && matriz[2][0] == numero) {
            ganador = true;
        }
        else if(matriz[0][1] == numero && matriz[1][1] == numero && matriz[2][1] == numero) {
            ganador = true;
        }
        else if(matriz[0][2] == numero && matriz[1][2] == numero && matriz[2][2] == numero) {
            ganador = true;
        } 
        
        
        return ganador;
    }
    
    private void reiniciarJuego(){ 
    llenarCasillas();
    llenarMatriz();
    botonAbajo.setIcon(null);
    botonArriba.setIcon(null);
    botonAbajoDerecha.setIcon(null);
    botonAbajoizquierda.setIcon(null);
    botonArribaDerecha.setIcon(null);
    botonArribaIzquierda.setIcon(null);
    botonCentro.setIcon(null);
    botonDerecho.setIcon(null);
    botonIzquierda.setIcon(null);
    
    //Pregunta al usuario quien juega primero;
    quienJuegaPrimero();
    
    }
    
    private void quienJuegaPrimero() {
        ventanaEscogerTurno ventanaET = new ventanaEscogerTurno(this, true, usuario1,usuario2);
        ventanaET.setVisible(true);
        turno = ventanaET.getTurno();
        
    }
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JPopupMenu.Separator SeparadorJuego;
    private javax.swing.JButton botonAbajo;
    private javax.swing.JButton botonAbajoDerecha;
    private javax.swing.JButton botonAbajoizquierda;
    private javax.swing.JButton botonArriba;
    private javax.swing.JButton botonArribaDerecha;
    private javax.swing.JButton botonArribaIzquierda;
    private javax.swing.JButton botonCentro;
    private javax.swing.JButton botonDerecho;
    private javax.swing.JButton botonIzquierda;
    private javax.swing.JMenuItem botonSalir;
    private javax.swing.JMenuItem comenzardeNuevo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem mostrarTablaResultados;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
