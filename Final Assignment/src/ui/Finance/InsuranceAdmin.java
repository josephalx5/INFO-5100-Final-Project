/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Finance;

import model.Bank.Insurance.Insurance;
import model.Configuration;
import model.Freight.Truck;
import ui.LoginPage;

import javax.swing.*;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josephchakola
 */
public class InsuranceAdmin extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceAdmin
     */
    private final JSplitPane jsp;
    public InsuranceAdmin(JSplitPane jsp) {
        initComponents();
        populateTable();
        this.jsp = jsp;
    }
    private void populateTable(){
        ID.setEnabled(false);
        quote.setEnabled(false);
        ID.setText("");
        quote.setText("");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        updateInsurance.setEnabled(false);
        for(Truck truck : Configuration.getShippingNetwork().getTrucks()){
            Insurance insurance = truck.getInsurance();
            model.addRow(new Object[]{insurance.getInsuranceId(), insurance.getValueOfVehicle(), insurance.getAverageDriverScore(), insurance.getInsuranceQuote()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        UpdateInsuranceQuote = new javax.swing.JButton();
        quote = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        QuoteLabel = new javax.swing.JLabel();
        updateInsurance = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "value of vehicle", "Avg Driver Score", "Insurance Quote"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insurance Admin");

        UpdateInsuranceQuote.setText("Update Insurance Quote");
        UpdateInsuranceQuote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateInsuranceQuoteActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        QuoteLabel.setText("Quote");

        updateInsurance.setText("Update Insurance");
        updateInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInsuranceActionPerformed(evt);
            }
        });

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 71, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(UpdateInsuranceQuote)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(QuoteLabel)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(updateInsurance)
                                            .addComponent(quote, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(203, 203, 203))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateInsuranceQuote)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuoteLabel))
                .addGap(27, 27, 27)
                .addComponent(updateInsurance)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateInsuranceQuoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateInsuranceQuoteActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a row");
        } else {
            String id = jTable1.getValueAt(selectedRow, 0).toString();
            Insurance insurance = Configuration.getShippingNetwork().getTrucks().stream().filter(truck -> truck.getInsurance().getInsuranceId().equals(id)).findFirst().get().getInsurance();
            quote.setText(String.valueOf(insurance.getInsuranceQuote()));
            ID.setText(insurance.getInsuranceId());
            updateInsurance.setEnabled(true);
            quote.setEnabled(true);
        }
    }//GEN-LAST:event_UpdateInsuranceQuoteActionPerformed

    private void updateInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInsuranceActionPerformed
        // TODO add your handling code here:
        if(ID.getText().isEmpty() || quote.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill all the fields");
        } else {
            if(quote.getText().matches("[0-9]+")){
                Insurance insurance = Configuration.getShippingNetwork().getTrucks().stream().filter(truck -> truck.getInsurance().getInsuranceId().equals(ID.getText())).findFirst().get().getInsurance();
               insurance.setInsuranceQuote(Integer.parseInt(quote.getText()));
                JOptionPane.showMessageDialog(this, "Insurance Quote Updated");
                populateTable();
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a valid number");
            }
        }
    }//GEN-LAST:event_updateInsuranceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jsp.setRightComponent(new LoginPage(jsp));
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JLabel QuoteLabel;
    private javax.swing.JButton UpdateInsuranceQuote;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField quote;
    private javax.swing.JButton updateInsurance;
    // End of variables declaration//GEN-END:variables
}