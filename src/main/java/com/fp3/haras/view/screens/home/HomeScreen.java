package com.fp3.haras.view.screens.home;

import com.fp3.haras.utils.Colors;

public class HomeScreen extends javax.swing.JPanel {

    public HomeScreen() {
        initComponents();
        
        lblHeader.putClientProperty("FlatLaf.styleClass", "h00");
        
        pnlAnimalsToArrive.setBackground(new java.awt.Color(
                Colors.PRIMARYBG.getColor()[0],
                Colors.PRIMARYBG.getColor()[1],
                Colors.PRIMARYBG.getColor()[2]
        ));
        lblAnimalsToArriveTitle.putClientProperty("FlatLaf.styleClass", "h2");
        lblAnimalsToArriveAmount.putClientProperty("FlatLaf.styleClass", "h3");
        
        pnlAnimalsToGo.setBackground(new java.awt.Color(
                Colors.PRIMARYBG.getColor()[0],
                Colors.PRIMARYBG.getColor()[1],
                Colors.PRIMARYBG.getColor()[2]
        ));
        lblAnimalsToGoTitle.putClientProperty("FlatLaf.styleClass", "h2");
        lblAnimalsToGoAmount.putClientProperty("FlatLaf.styleClass", "h3");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlHeader = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        pnlAnimalsBalance = new javax.swing.JPanel();
        pnlAnimalsToArrive = new javax.swing.JPanel();
        lblAnimalsToArriveTitle = new javax.swing.JLabel();
        lblAnimalsToArriveAmount = new javax.swing.JLabel();
        btnAnimalsToArrive = new javax.swing.JButton();
        pnlAnimalsBalanceSeparator = new javax.swing.JPanel();
        pnlAnimalsToGo = new javax.swing.JPanel();
        lblAnimalsToGoTitle = new javax.swing.JLabel();
        lblAnimalsToGoAmount = new javax.swing.JLabel();
        btnAnimalsToGo = new javax.swing.JButton();
        pnlFooter = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 0));
        setLayout(new java.awt.BorderLayout(0, 36));

        pnlHeader.setOpaque(false);
        pnlHeader.setLayout(new javax.swing.BoxLayout(pnlHeader, javax.swing.BoxLayout.Y_AXIS));

        lblHeader.setText("Bem vindo!");
        pnlHeader.add(lblHeader);

        jLabel2.setText("Veja abaixo os destaques do dia no seu Haras");
        pnlHeader.add(jLabel2);

        add(pnlHeader, java.awt.BorderLayout.PAGE_START);

        pnlContent.setOpaque(false);
        pnlContent.setLayout(new javax.swing.BoxLayout(pnlContent, javax.swing.BoxLayout.Y_AXIS));

        pnlAnimalsBalance.setOpaque(false);
        pnlAnimalsBalance.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        pnlAnimalsToArrive.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));
        pnlAnimalsToArrive.setLayout(new java.awt.GridBagLayout());

        lblAnimalsToArriveTitle.setText("Animais a chegar hoje");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlAnimalsToArrive.add(lblAnimalsToArriveTitle, gridBagConstraints);

        lblAnimalsToArriveAmount.setForeground(new java.awt.Color(40, 167, 69));
        lblAnimalsToArriveAmount.setText("+7");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlAnimalsToArrive.add(lblAnimalsToArriveAmount, gridBagConstraints);

        btnAnimalsToArrive.setText("Ver detalhes");
        btnAnimalsToArrive.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        pnlAnimalsToArrive.add(btnAnimalsToArrive, gridBagConstraints);

        pnlAnimalsBalance.add(pnlAnimalsToArrive);

        pnlAnimalsBalanceSeparator.setFocusable(false);
        pnlAnimalsBalanceSeparator.setOpaque(false);
        pnlAnimalsBalanceSeparator.setPreferredSize(new java.awt.Dimension(16, 0));

        javax.swing.GroupLayout pnlAnimalsBalanceSeparatorLayout = new javax.swing.GroupLayout(pnlAnimalsBalanceSeparator);
        pnlAnimalsBalanceSeparator.setLayout(pnlAnimalsBalanceSeparatorLayout);
        pnlAnimalsBalanceSeparatorLayout.setHorizontalGroup(
            pnlAnimalsBalanceSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        pnlAnimalsBalanceSeparatorLayout.setVerticalGroup(
            pnlAnimalsBalanceSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlAnimalsBalance.add(pnlAnimalsBalanceSeparator);

        pnlAnimalsToGo.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));
        pnlAnimalsToGo.setLayout(new java.awt.GridBagLayout());

        lblAnimalsToGoTitle.setText("Animais a sair hoje");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlAnimalsToGo.add(lblAnimalsToGoTitle, gridBagConstraints);

        lblAnimalsToGoAmount.setForeground(new java.awt.Color(255, 193, 7));
        lblAnimalsToGoAmount.setText("-4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlAnimalsToGo.add(lblAnimalsToGoAmount, gridBagConstraints);

        btnAnimalsToGo.setText("Ver detalhes");
        btnAnimalsToGo.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        pnlAnimalsToGo.add(btnAnimalsToGo, gridBagConstraints);

        pnlAnimalsBalance.add(pnlAnimalsToGo);

        pnlContent.add(pnlAnimalsBalance);

        add(pnlContent, java.awt.BorderLayout.CENTER);

        pnlFooter.setOpaque(false);
        add(pnlFooter, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnimalsToArrive;
    private javax.swing.JButton btnAnimalsToGo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAnimalsToArriveAmount;
    private javax.swing.JLabel lblAnimalsToArriveTitle;
    private javax.swing.JLabel lblAnimalsToGoAmount;
    private javax.swing.JLabel lblAnimalsToGoTitle;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JPanel pnlAnimalsBalance;
    private javax.swing.JPanel pnlAnimalsBalanceSeparator;
    private javax.swing.JPanel pnlAnimalsToArrive;
    private javax.swing.JPanel pnlAnimalsToGo;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlHeader;
    // End of variables declaration//GEN-END:variables
}
