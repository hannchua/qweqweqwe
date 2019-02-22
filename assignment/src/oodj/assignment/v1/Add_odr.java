/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj.assignment.v1;

import Class.Product;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author New
 */
public class Add_odr extends javax.swing.JFrame {

    /**
     * Creates new form Add_odr
     */
    public Add_odr() {
        initComponents();
        
        
        
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
        ProductTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pdt_id_lab = new javax.swing.JLabel();
        productid_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pdt_name_txt = new javax.swing.JTextField();
        pdt_qtt_txt = new javax.swing.JTextField();
        pdt_prc_txt = new javax.swing.JTextField();
        pdt_ctg = new javax.swing.JTextField();
        ttl_pricetxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        add_cart_but = new javax.swing.JButton();
        back_but = new javax.swing.JButton();
        show_pdt_but = new javax.swing.JButton();
        cal_ttl_price_but = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "Product Name", "Product Quantity", "Product Price", "Product Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        jLabel1.setText("Order for product");

        pdt_id_lab.setText("Product ID:");

        productid_txt.setEditable(false);
        productid_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productid_txtActionPerformed(evt);
            }
        });

        jLabel2.setText("Product Name:");

        jLabel3.setText("Product Quantity:");

        jLabel4.setText("Price:");

        jLabel5.setText("Product Category:");

        pdt_name_txt.setEditable(false);

        pdt_prc_txt.setEditable(false);

        pdt_ctg.setEditable(false);

        ttl_pricetxt.setEditable(false);

        jLabel6.setText("Total Price:");

        add_cart_but.setText("Add to cart");
        add_cart_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_cart_butActionPerformed(evt);
            }
        });

        back_but.setText("Back");
        back_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_butActionPerformed(evt);
            }
        });

        show_pdt_but.setText("Show All Product");
        show_pdt_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_pdt_butActionPerformed(evt);
            }
        });

        cal_ttl_price_but.setText("Calculate Total Price");
        cal_ttl_price_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal_ttl_price_butActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 986, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(351, 351, 351)
                                .addComponent(show_pdt_but, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pdt_id_lab)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(productid_txt)
                            .addComponent(pdt_name_txt)
                            .addComponent(pdt_qtt_txt)
                            .addComponent(pdt_prc_txt)
                            .addComponent(pdt_ctg)
                            .addComponent(ttl_pricetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(add_cart_but, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(cal_ttl_price_but, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pdt_id_lab)
                            .addComponent(productid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(pdt_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pdt_qtt_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pdt_prc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(pdt_ctg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ttl_pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cal_ttl_price_but)
                        .addGap(62, 62, 62)
                        .addComponent(add_cart_but, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(show_pdt_but, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(back_but, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productid_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productid_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productid_txtActionPerformed

    private void back_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_butActionPerformed
        Mng_odr_cus moc = new Mng_odr_cus();
        moc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back_butActionPerformed

    private void show_pdt_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_pdt_butActionPerformed
        File file = new File("producttxt.txt");
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length; i++){
                String[] row = lines[i].toString().split(",");
                model.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Add_odr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_show_pdt_butActionPerformed

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int selectedRowIndex = ProductTable.getSelectedRow();
        productid_txt.setText(model.getValueAt(selectedRowIndex, 0).toString());
        pdt_name_txt.setText(model.getValueAt(selectedRowIndex, 1).toString());
        pdt_qtt_txt.setText(model.getValueAt(selectedRowIndex, 2).toString());
        pdt_prc_txt.setText(model.getValueAt(selectedRowIndex, 3).toString());
        pdt_ctg.setText(model.getValueAt(selectedRowIndex, 4).toString());
        
        
    }//GEN-LAST:event_ProductTableMouseClicked

    private void add_cart_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_cart_butActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_cart_butActionPerformed

    private void cal_ttl_price_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal_ttl_price_butActionPerformed
        Product pdt = new Product();
        double pdt_Price = Double.parseDouble(pdt_prc_txt.getText());
        int pdt_Qtt = Integer.parseInt(pdt_qtt_txt.getText());
        double total_price = pdt.calculate_total_price(pdt_Price, pdt_Qtt);
        ttl_pricetxt.setText(String.valueOf(total_price));    
    }//GEN-LAST:event_cal_ttl_price_butActionPerformed

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
            java.util.logging.Logger.getLogger(Add_odr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_odr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_odr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_odr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_odr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable ProductTable;
    private javax.swing.JButton add_cart_but;
    private javax.swing.JButton back_but;
    private javax.swing.JButton cal_ttl_price_but;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pdt_ctg;
    private javax.swing.JLabel pdt_id_lab;
    private javax.swing.JTextField pdt_name_txt;
    private javax.swing.JTextField pdt_prc_txt;
    private javax.swing.JTextField pdt_qtt_txt;
    private javax.swing.JTextField productid_txt;
    private javax.swing.JButton show_pdt_but;
    private javax.swing.JTextField ttl_pricetxt;
    // End of variables declaration//GEN-END:variables
}
