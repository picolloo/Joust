/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Tabuleiro;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author Lucas
 */
public class InterfaceTabuleiro extends javax.swing.JFrame {
    
    Tabuleiro tabuleiro;

    public InterfaceTabuleiro(Tabuleiro taubleiro) throws HeadlessException {
        initComponents();
        this.tabuleiro = taubleiro;
        
        for (Component component : jPanel1.getComponents()) {
            if (component.getClass().equals(JButton.class)) {
                ((JButton)component).addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ClickInterface(evt);
                    }
                });
            }
        }
    }
    
    
    private void ClickInterface(ActionEvent evt) {                                
        ((JButton)evt.getSource()).setVisible(false);
    }     
   
    
    
    
    private void initComponents() {

        jLabel25 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        b71 = new javax.swing.JButton();
        b51 = new javax.swing.JButton();
        b41 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b61 = new javax.swing.JButton();
        b01 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b62 = new javax.swing.JButton();
        b52 = new javax.swing.JButton();
        b42 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b02 = new javax.swing.JButton();
        b63 = new javax.swing.JButton();
        b53 = new javax.swing.JButton();
        b43 = new javax.swing.JButton();
        b33 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b03 = new javax.swing.JButton();
        b64 = new javax.swing.JButton();
        b54 = new javax.swing.JButton();
        b44 = new javax.swing.JButton();
        b34 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b04 = new javax.swing.JButton();
        b65 = new javax.swing.JButton();
        b55 = new javax.swing.JButton();
        b45 = new javax.swing.JButton();
        b35 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b05 = new javax.swing.JButton();
        b66 = new javax.swing.JButton();
        b56 = new javax.swing.JButton();
        b46 = new javax.swing.JButton();
        b36 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b06 = new javax.swing.JButton();
        b67 = new javax.swing.JButton();
        b57 = new javax.swing.JButton();
        b473 = new javax.swing.JButton();
        b37 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        b173 = new javax.swing.JButton();
        b07 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        b70 = new javax.swing.JButton();
        b50 = new javax.swing.JButton();
        b40 = new javax.swing.JButton();
        b30 = new javax.swing.JButton();
        b60 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b00 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b77 = new javax.swing.JButton();
        b72 = new javax.swing.JButton();
        b73 = new javax.swing.JButton();
        b74 = new javax.swing.JButton();
        b75 = new javax.swing.JButton();
        b76 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textWin1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textWin2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        textTurno = new javax.swing.JTextField();
        textJ1 = new javax.swing.JTextField();
        textJ2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        textStatus = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        bConectar = new javax.swing.JButton();
        bDesconectar = new javax.swing.JButton();
        bNovoJogo = new javax.swing.JButton();
        bEncerrar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();

        jLabel25.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 900));
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        b71.setBackground(java.awt.Color.white);
        b71.setForeground(java.awt.Color.white);
        b71.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b71.setMaximumSize(new java.awt.Dimension(100, 100));
        b71.setMinimumSize(new java.awt.Dimension(100, 100));
        b71.setPreferredSize(new java.awt.Dimension(100, 100));

        b51.setBackground(java.awt.Color.white);
        b51.setForeground(java.awt.Color.white);
        b51.setMaximumSize(new java.awt.Dimension(100, 100));
        b51.setMinimumSize(new java.awt.Dimension(100, 100));
        b51.setPreferredSize(new java.awt.Dimension(100, 100));

        b41.setBackground(java.awt.Color.black);
        b41.setMaximumSize(new java.awt.Dimension(100, 100));
        b41.setMinimumSize(new java.awt.Dimension(100, 100));
        b41.setPreferredSize(new java.awt.Dimension(100, 100));

        b31.setBackground(java.awt.Color.white);
        b31.setForeground(java.awt.Color.white);
        b31.setMaximumSize(new java.awt.Dimension(100, 100));
        b31.setMinimumSize(new java.awt.Dimension(100, 100));
        b31.setPreferredSize(new java.awt.Dimension(100, 100));

        b61.setBackground(java.awt.Color.black);
        b61.setMaximumSize(new java.awt.Dimension(100, 100));
        b61.setMinimumSize(new java.awt.Dimension(100, 100));
        b61.setPreferredSize(new java.awt.Dimension(100, 100));

        b01.setBackground(new java.awt.Color(0, 0, 0));
        b01.setMaximumSize(new java.awt.Dimension(100, 100));
        b01.setMinimumSize(new java.awt.Dimension(100, 100));
        b01.setPreferredSize(new java.awt.Dimension(100, 100));

        b21.setBackground(java.awt.Color.black);
        b21.setMaximumSize(new java.awt.Dimension(100, 100));
        b21.setMinimumSize(new java.awt.Dimension(100, 100));
        b21.setPreferredSize(new java.awt.Dimension(100, 100));

        b62.setMaximumSize(new java.awt.Dimension(100, 100));
        b62.setMinimumSize(new java.awt.Dimension(100, 100));
        b62.setPreferredSize(new java.awt.Dimension(100, 100));

        b52.setBackground(java.awt.Color.black);
        b52.setMaximumSize(new java.awt.Dimension(100, 100));
        b52.setMinimumSize(new java.awt.Dimension(100, 100));
        b52.setPreferredSize(new java.awt.Dimension(100, 100));

        b42.setMaximumSize(new java.awt.Dimension(100, 100));
        b42.setMinimumSize(new java.awt.Dimension(100, 100));
        b42.setPreferredSize(new java.awt.Dimension(100, 100));

        b32.setBackground(new java.awt.Color(0, 0, 0));
        b32.setMaximumSize(new java.awt.Dimension(100, 100));
        b32.setMinimumSize(new java.awt.Dimension(100, 100));
        b32.setPreferredSize(new java.awt.Dimension(100, 100));

        b22.setMaximumSize(new java.awt.Dimension(100, 100));
        b22.setMinimumSize(new java.awt.Dimension(100, 100));
        b22.setPreferredSize(new java.awt.Dimension(100, 100));

        b12.setBackground(new java.awt.Color(0, 0, 0));
        b12.setMaximumSize(new java.awt.Dimension(100, 100));
        b12.setMinimumSize(new java.awt.Dimension(100, 100));
        b12.setPreferredSize(new java.awt.Dimension(100, 100));

        b02.setMaximumSize(new java.awt.Dimension(100, 100));
        b02.setMinimumSize(new java.awt.Dimension(100, 100));
        b02.setPreferredSize(new java.awt.Dimension(100, 100));

        b63.setBackground(java.awt.Color.black);
        b63.setMaximumSize(new java.awt.Dimension(100, 100));
        b63.setMinimumSize(new java.awt.Dimension(100, 100));
        b63.setPreferredSize(new java.awt.Dimension(100, 100));

        b53.setMaximumSize(new java.awt.Dimension(100, 100));
        b53.setMinimumSize(new java.awt.Dimension(100, 100));
        b53.setPreferredSize(new java.awt.Dimension(100, 100));

        b43.setBackground(java.awt.Color.black);
        b43.setMaximumSize(new java.awt.Dimension(100, 100));
        b43.setMinimumSize(new java.awt.Dimension(100, 100));
        b43.setPreferredSize(new java.awt.Dimension(100, 100));

        b33.setMaximumSize(new java.awt.Dimension(100, 100));
        b33.setMinimumSize(new java.awt.Dimension(100, 100));
        b33.setPreferredSize(new java.awt.Dimension(100, 100));

        b23.setBackground(new java.awt.Color(0, 0, 0));
        b23.setMaximumSize(new java.awt.Dimension(100, 100));
        b23.setMinimumSize(new java.awt.Dimension(100, 100));
        b23.setPreferredSize(new java.awt.Dimension(100, 100));

        b13.setMaximumSize(new java.awt.Dimension(100, 100));
        b13.setMinimumSize(new java.awt.Dimension(100, 100));
        b13.setPreferredSize(new java.awt.Dimension(100, 100));

        b03.setBackground(new java.awt.Color(0, 0, 0));
        b03.setMaximumSize(new java.awt.Dimension(100, 100));
        b03.setMinimumSize(new java.awt.Dimension(100, 100));
        b03.setPreferredSize(new java.awt.Dimension(100, 100));

        b64.setMaximumSize(new java.awt.Dimension(100, 100));
        b64.setMinimumSize(new java.awt.Dimension(100, 100));
        b64.setPreferredSize(new java.awt.Dimension(100, 100));

        b54.setBackground(java.awt.Color.black);
        b54.setMaximumSize(new java.awt.Dimension(100, 100));
        b54.setMinimumSize(new java.awt.Dimension(100, 100));
        b54.setPreferredSize(new java.awt.Dimension(100, 100));

        b44.setMaximumSize(new java.awt.Dimension(100, 100));
        b44.setMinimumSize(new java.awt.Dimension(100, 100));
        b44.setPreferredSize(new java.awt.Dimension(100, 100));
    
        b34.setBackground(new java.awt.Color(0, 0, 0));
        b34.setMaximumSize(new java.awt.Dimension(100, 100));
        b34.setMinimumSize(new java.awt.Dimension(100, 100));
        b34.setPreferredSize(new java.awt.Dimension(100, 100));

        b24.setMaximumSize(new java.awt.Dimension(100, 100));
        b24.setMinimumSize(new java.awt.Dimension(100, 100));
        b24.setPreferredSize(new java.awt.Dimension(100, 100));

        b14.setBackground(new java.awt.Color(0, 0, 0));
        b14.setMaximumSize(new java.awt.Dimension(100, 100));
        b14.setMinimumSize(new java.awt.Dimension(100, 100));
        b14.setPreferredSize(new java.awt.Dimension(100, 100));

        b04.setMaximumSize(new java.awt.Dimension(100, 100));
        b04.setMinimumSize(new java.awt.Dimension(100, 100));
        b04.setPreferredSize(new java.awt.Dimension(100, 100));

        b65.setBackground(java.awt.Color.black);
        b65.setMaximumSize(new java.awt.Dimension(100, 100));
        b65.setMinimumSize(new java.awt.Dimension(100, 100));
        b65.setPreferredSize(new java.awt.Dimension(100, 100));

        b55.setMaximumSize(new java.awt.Dimension(100, 100));
        b55.setMinimumSize(new java.awt.Dimension(100, 100));
        b55.setPreferredSize(new java.awt.Dimension(100, 100));

        b45.setBackground(java.awt.Color.black);
        b45.setMaximumSize(new java.awt.Dimension(100, 100));
        b45.setMinimumSize(new java.awt.Dimension(100, 100));
        b45.setPreferredSize(new java.awt.Dimension(100, 100));

        b35.setMaximumSize(new java.awt.Dimension(100, 100));
        b35.setMinimumSize(new java.awt.Dimension(100, 100));
        b35.setPreferredSize(new java.awt.Dimension(100, 100));

        b25.setBackground(new java.awt.Color(0, 0, 0));
        b25.setMaximumSize(new java.awt.Dimension(100, 100));
        b25.setMinimumSize(new java.awt.Dimension(100, 100));
        b25.setPreferredSize(new java.awt.Dimension(100, 100));

        b15.setMaximumSize(new java.awt.Dimension(100, 100));
        b15.setMinimumSize(new java.awt.Dimension(100, 100));
        b15.setPreferredSize(new java.awt.Dimension(100, 100));

        b05.setBackground(new java.awt.Color(0, 0, 0));
        b05.setMaximumSize(new java.awt.Dimension(100, 100));
        b05.setMinimumSize(new java.awt.Dimension(100, 100));
        b05.setPreferredSize(new java.awt.Dimension(100, 100));

        b66.setMaximumSize(new java.awt.Dimension(100, 100));
        b66.setMinimumSize(new java.awt.Dimension(100, 100));
        b66.setPreferredSize(new java.awt.Dimension(100, 100));

        b56.setBackground(java.awt.Color.black);
        b56.setMaximumSize(new java.awt.Dimension(100, 100));
        b56.setMinimumSize(new java.awt.Dimension(100, 100));
        b56.setPreferredSize(new java.awt.Dimension(100, 100));

        b46.setMaximumSize(new java.awt.Dimension(100, 100));
        b46.setMinimumSize(new java.awt.Dimension(100, 100));
        b46.setPreferredSize(new java.awt.Dimension(100, 100));

        b36.setBackground(new java.awt.Color(0, 0, 0));
        b36.setMaximumSize(new java.awt.Dimension(100, 100));
        b36.setMinimumSize(new java.awt.Dimension(100, 100));
        b36.setPreferredSize(new java.awt.Dimension(100, 100));

        b26.setMaximumSize(new java.awt.Dimension(100, 100));
        b26.setMinimumSize(new java.awt.Dimension(100, 100));
        b26.setPreferredSize(new java.awt.Dimension(100, 100));

        b16.setBackground(new java.awt.Color(0, 0, 0));
        b16.setMaximumSize(new java.awt.Dimension(100, 100));
        b16.setMinimumSize(new java.awt.Dimension(100, 100));
        b16.setPreferredSize(new java.awt.Dimension(100, 100));

        b06.setMaximumSize(new java.awt.Dimension(100, 100));
        b06.setMinimumSize(new java.awt.Dimension(100, 100));
        b06.setPreferredSize(new java.awt.Dimension(100, 100));

        b67.setBackground(java.awt.Color.black);
        b67.setMaximumSize(new java.awt.Dimension(100, 100));
        b67.setMinimumSize(new java.awt.Dimension(100, 100));
        b67.setPreferredSize(new java.awt.Dimension(100, 100));

        b57.setMaximumSize(new java.awt.Dimension(100, 100));
        b57.setMinimumSize(new java.awt.Dimension(100, 100));
        b57.setPreferredSize(new java.awt.Dimension(100, 100));

        b473.setBackground(java.awt.Color.black);
        b473.setMaximumSize(new java.awt.Dimension(100, 100));
        b473.setMinimumSize(new java.awt.Dimension(100, 100));
        b473.setPreferredSize(new java.awt.Dimension(100, 100));

        b37.setMaximumSize(new java.awt.Dimension(100, 100));
        b37.setMinimumSize(new java.awt.Dimension(100, 100));
        b37.setPreferredSize(new java.awt.Dimension(100, 100));

        b27.setBackground(new java.awt.Color(0, 0, 0));
        b27.setMaximumSize(new java.awt.Dimension(100, 100));
        b27.setMinimumSize(new java.awt.Dimension(100, 100));
        b27.setPreferredSize(new java.awt.Dimension(100, 100));

        b173.setMaximumSize(new java.awt.Dimension(100, 100));
        b173.setMinimumSize(new java.awt.Dimension(100, 100));
        b173.setPreferredSize(new java.awt.Dimension(100, 100));

        b07.setBackground(new java.awt.Color(0, 0, 0));
        b07.setMaximumSize(new java.awt.Dimension(100, 100));
        b07.setMinimumSize(new java.awt.Dimension(100, 100));
        b07.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel9.setText("1");

        jLabel11.setText("2");

        jLabel12.setText("3");

        jLabel13.setText("4");

        jLabel14.setText("5");

        jLabel15.setText("6");

        jLabel16.setText("7");

        jLabel17.setText("0");

        jLabel18.setText("1");

        jLabel19.setText("2");

        jLabel20.setText("7");

        jLabel21.setText("6");

        jLabel22.setText("5");

        jLabel23.setText("4");

        b70.setBackground(java.awt.Color.black);
        b70.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b70.setMaximumSize(new java.awt.Dimension(100, 100));
        b70.setMinimumSize(new java.awt.Dimension(100, 100));
        b70.setPreferredSize(new java.awt.Dimension(100, 100));

        b50.setBackground(java.awt.Color.black);
        b50.setMaximumSize(new java.awt.Dimension(100, 100));
        b50.setMinimumSize(new java.awt.Dimension(100, 100));
        b50.setPreferredSize(new java.awt.Dimension(100, 100));

        b40.setMaximumSize(new java.awt.Dimension(100, 100));
        b40.setMinimumSize(new java.awt.Dimension(100, 100));
        b40.setPreferredSize(new java.awt.Dimension(100, 100));

        b30.setBackground(new java.awt.Color(0, 0, 0));
        b30.setMaximumSize(new java.awt.Dimension(100, 100));
        b30.setMinimumSize(new java.awt.Dimension(100, 100));
        b30.setPreferredSize(new java.awt.Dimension(100, 100));

        b60.setMaximumSize(new java.awt.Dimension(100, 100));
        b60.setMinimumSize(new java.awt.Dimension(100, 100));
        b60.setPreferredSize(new java.awt.Dimension(100, 100));

        b10.setBackground(new java.awt.Color(0, 0, 0));
        b10.setMaximumSize(new java.awt.Dimension(100, 100));
        b10.setMinimumSize(new java.awt.Dimension(100, 100));
        b10.setPreferredSize(new java.awt.Dimension(100, 100));

        b20.setMaximumSize(new java.awt.Dimension(100, 100));
        b20.setMinimumSize(new java.awt.Dimension(100, 100));
        b20.setPreferredSize(new java.awt.Dimension(100, 100));

        b00.setBackground(java.awt.Color.white);
        b00.setForeground(java.awt.Color.white);
        b00.setMaximumSize(new java.awt.Dimension(100, 100));
        b00.setMinimumSize(new java.awt.Dimension(100, 100));
        b00.setPreferredSize(new java.awt.Dimension(100, 100));

        b11.setBackground(java.awt.Color.white);
        b11.setForeground(java.awt.Color.white);
        b11.setMaximumSize(new java.awt.Dimension(100, 100));
        b11.setMinimumSize(new java.awt.Dimension(100, 100));
        b11.setPreferredSize(new java.awt.Dimension(100, 100));

        b77.setBackground(java.awt.Color.white);
        b77.setMaximumSize(new java.awt.Dimension(100, 100));
        b77.setMinimumSize(new java.awt.Dimension(100, 100));
        b77.setPreferredSize(new java.awt.Dimension(100, 100));

        b72.setBackground(java.awt.Color.black);
        b72.setMaximumSize(new java.awt.Dimension(100, 100));
        b72.setMinimumSize(new java.awt.Dimension(100, 100));
        b72.setPreferredSize(new java.awt.Dimension(100, 100));

        b73.setBackground(java.awt.Color.white);
        b73.setMaximumSize(new java.awt.Dimension(100, 100));
        b73.setMinimumSize(new java.awt.Dimension(100, 100));
        b73.setPreferredSize(new java.awt.Dimension(100, 100));

        b74.setBackground(java.awt.Color.black);
        b74.setMaximumSize(new java.awt.Dimension(100, 100));
        b74.setMinimumSize(new java.awt.Dimension(100, 100));
        b74.setPreferredSize(new java.awt.Dimension(100, 100));

        b75.setBackground(java.awt.Color.white);
        b75.setMaximumSize(new java.awt.Dimension(100, 100));
        b75.setMinimumSize(new java.awt.Dimension(100, 100));
        b75.setPreferredSize(new java.awt.Dimension(100, 100));

        b76.setBackground(java.awt.Color.black);
        b76.setMaximumSize(new java.awt.Dimension(100, 100));
        b76.setMinimumSize(new java.awt.Dimension(100, 100));
        b76.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel24.setText("3");

        jLabel27.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel17))
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel24))
                                .addComponent(jLabel23))
                            .addComponent(jLabel22))
                        .addComponent(jLabel21))
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b50, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b40, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b60, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(b70, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(b51, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b41, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b61, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b62, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b42, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b52, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b63, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b43, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b53, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b03, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b64, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b44, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b34, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b54, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b04, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b65, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b45, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b35, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b55, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b05, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b66, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b46, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b36, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b56, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b06, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b72, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b73, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b74, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b75, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b76, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b67, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b473, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b37, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b57, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b07, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b173, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b77, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(86, 86, 86)
                .addComponent(jLabel9)
                .addGap(84, 84, 84)
                .addComponent(jLabel11)
                .addGap(86, 86, 86)
                .addComponent(jLabel12)
                .addGap(85, 85, 85)
                .addComponent(jLabel13)
                .addGap(83, 83, 83)
                .addComponent(jLabel14)
                .addGap(82, 82, 82)
                .addComponent(jLabel15)
                .addGap(81, 81, 81)
                .addComponent(jLabel16)
                .addGap(52, 52, 52))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {b01, b02, b03, b04, b05, b06, b07, b12, b13, b14, b15, b16, b173, b21, b22, b23, b24, b25, b26, b27, b31, b32, b33, b34, b35, b36, b37, b41, b42, b43, b44, b45, b46, b473, b51, b52, b53, b54, b55, b56, b57, b61, b62, b63, b64, b65, b66, b67, b71, b72, b73, b74, b75, b76, b77});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {b00, b10, b11, b20, b30, b40, b50, b60, b70});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel27)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b76, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b75, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b74, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b73, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b72, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b66, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b56, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b46, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b36, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b06, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b65, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b55, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b45, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b35, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b05, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b64, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b54, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b44, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b34, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b04, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b63, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b53, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b43, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b03, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(b62, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b52, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b42, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(b71, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b61, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b51, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b41, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel17)
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel18)
                                        .addGap(78, 78, 78)
                                        .addComponent(jLabel19)
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel24)
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel23)
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel22)
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(b70, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b60, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b50, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b40, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(36, 36, 36)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b67, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b57, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b473, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b37, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b173, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b07, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(b77, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(630, 630, 630)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {b01, b02, b03, b04, b05, b06, b07, b12, b13, b14, b15, b16, b173, b21, b22, b23, b24, b25, b26, b27, b31, b32, b33, b34, b35, b36, b37, b41, b42, b43, b44, b45, b46, b473, b51, b52, b53, b54, b55, b56, b57, b61, b62, b63, b64, b65, b66, b67, b71, b72, b73, b74, b75, b76, b77});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {b00, b10, b11, b20, b30, b40, b50, b60, b70});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Jogo"));

        jLabel1.setText("Jogador 1: ");

        jLabel2.setText("Cor:");

        jLabel3.setText("Jogador 2: ");

        jLabel4.setText("Cor:");

        jLabel5.setText("Número de vitórias:");

        textWin1.setEnabled(false);
        textWin1.setFocusable(false);
        textWin1.setHighlighter(null);

        jLabel6.setText("Número de vitórias:");

        textWin2.setEnabled(false);
        textWin2.setFocusable(false);
        textWin2.setHighlighter(null);

        jLabel7.setText("Branca");

        jLabel8.setText("Preta");

        jLabel10.setText("Turno:");

        textTurno.setEnabled(false);
        textTurno.setFocusable(false);

        textJ1.setEnabled(false);

        textJ2.setEnabled(false);

        jLabel28.setText("Status:");

        textStatus.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textWin2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textWin1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textJ2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textJ1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTurno)
                            .addComponent(textStatus))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(textStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(textTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textWin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textWin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Controles"));

        bConectar.setText("Conectar");
      
        bDesconectar.setText("Desconectar");

        bNovoJogo.setText("Novo Jogo");

        bEncerrar.setText("Encerrar partida");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEncerrar)
                    .addComponent(bNovoJogo)
                    .addComponent(bDesconectar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bConectar, bDesconectar, bEncerrar, bNovoJogo});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(bConectar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDesconectar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bNovoJogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEncerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bConectar, bDesconectar, bEncerrar, bNovoJogo});

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/joustLogo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))))
        );
        pack();
    }
        
    private javax.swing.JButton b00;
    private javax.swing.JButton b01;
    private javax.swing.JButton b02;
    private javax.swing.JButton b03;
    private javax.swing.JButton b04;
    private javax.swing.JButton b05;
    private javax.swing.JButton b06;
    private javax.swing.JButton b07;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b173;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b26;
    private javax.swing.JButton b27;
    private javax.swing.JButton b30;
    private javax.swing.JButton b31;
    private javax.swing.JButton b32;
    private javax.swing.JButton b33;
    private javax.swing.JButton b34;
    private javax.swing.JButton b35;
    private javax.swing.JButton b36;
    private javax.swing.JButton b37;
    private javax.swing.JButton b40;
    private javax.swing.JButton b41;
    private javax.swing.JButton b42;
    private javax.swing.JButton b43;
    private javax.swing.JButton b44;
    private javax.swing.JButton b45;
    private javax.swing.JButton b46;
    private javax.swing.JButton b473;
    private javax.swing.JButton b50;
    private javax.swing.JButton b51;
    private javax.swing.JButton b52;
    private javax.swing.JButton b53;
    private javax.swing.JButton b54;
    private javax.swing.JButton b55;
    private javax.swing.JButton b56;
    private javax.swing.JButton b57;
    private javax.swing.JButton b60;
    private javax.swing.JButton b61;
    private javax.swing.JButton b62;
    private javax.swing.JButton b63;
    private javax.swing.JButton b64;
    private javax.swing.JButton b65;
    private javax.swing.JButton b66;
    private javax.swing.JButton b67;
    private javax.swing.JButton b70;
    private javax.swing.JButton b71;
    private javax.swing.JButton b72;
    private javax.swing.JButton b73;
    private javax.swing.JButton b74;
    private javax.swing.JButton b75;
    private javax.swing.JButton b76;
    private javax.swing.JButton b77;
    private javax.swing.JButton bConectar;
    private javax.swing.JButton bDesconectar;
    private javax.swing.JButton bEncerrar;
    private javax.swing.JButton bNovoJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField textJ1;
    private javax.swing.JTextField textJ2;
    private javax.swing.JTextField textStatus;
    private javax.swing.JTextField textTurno;
    private javax.swing.JTextField textWin1;
    private javax.swing.JTextField textWin2;
}
