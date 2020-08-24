
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnthonyCee
 */
public class BankResheet extends javax.swing.JInternalFrame {
Connection con = myconnect.getConnection();
     //Connection con = myconnect2.ConnectDb();
        PreparedStatement ps;
        ResultSet rs;
        
  double  dt,out,Adj,bal,fina;
        
    /**
     * 
     * Creates new form BankResheet
     */
    public BankResheet() {
      
        initComponents();
        
    }

    public void bal(){
    
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        txtdeptr = new javax.swing.JTextField();
        txtoutche = new javax.swing.JTextField();
        txtadjcash = new javax.swing.JTextField();
        txtdate = new com.toedter.calendar.JDateChooser();
        txtbalreco = new javax.swing.JTextField();
        txtrec = new javax.swing.JTextField();
        txtintere = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtbala = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        txtnsf = new javax.swing.JTextField();
        txtcharge = new javax.swing.JTextField();
        txterror = new javax.swing.JTextField();
        txtot = new javax.swing.JTextField();
        txtadj = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtaccount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtfina = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel15.setText("Deduction: NSF Check");

        setClosable(true);
        setForeground(java.awt.Color.green);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("BANK RECONCILATION STATEMENT");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sunlog.png"))); // NOI18N

        jLabel1.setText("Bank Cash Balance");

        txtbal.setBackground(new java.awt.Color(240, 240, 240));
        txtbal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbal.setForeground(new java.awt.Color(255, 255, 255));
        txtbal.setEnabled(false);

        jLabel3.setText("Adjusted Cash Balance");

        jLabel4.setText("Outstanding Checks");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText("Balance as Per Depositor's Record, As Of ");

        dob.setToolTipText("Select the Date of this Reconcilation");

        txtdeptr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdeptrKeyReleased(evt);
            }
        });

        txtoutche.setForeground(new java.awt.Color(153, 0, 0));
        txtoutche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtoutcheKeyReleased(evt);
            }
        });

        txtadjcash.setForeground(new java.awt.Color(255, 0, 102));
        txtadjcash.setCaretColor(new java.awt.Color(102, 0, 51));
        txtadjcash.setEnabled(false);

        txtdate.setToolTipText("Select the Date of this Reconcilation");

        txtbalreco.setForeground(new java.awt.Color(0, 0, 51));

        txtrec.setForeground(java.awt.Color.green);

        txtintere.setForeground(java.awt.Color.green);
        txtintere.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtintereKeyReleased(evt);
            }
        });

        jLabel7.setText("Interest earned");

        txtbala.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbala.setEnabled(false);
        txtbala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtbalaMouseEntered(evt);
            }
        });
        txtbala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbalaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbalaKeyTyped(evt);
            }
        });

        txttotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttotal.setEnabled(false);
        txttotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txttotalMousePressed(evt);
            }
        });

        txtnsf.setForeground(java.awt.Color.green);

        txtcharge.setForeground(java.awt.Color.green);

        txterror.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txterrorKeyReleased(evt);
            }
        });

        txtot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtot.setEnabled(false);

        txtadj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtadj.setForeground(new java.awt.Color(255, 153, 153));
        txtadj.setEnabled(false);

        jLabel13.setText("Adjusted Cash Balance");

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtaccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtaccountKeyReleased(evt);
            }
        });

        jLabel8.setText("Account No");

        txtfina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtfina.setForeground(new java.awt.Color(255, 0, 153));
        txtfina.setEnabled(false);
        txtfina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfinaKeyReleased(evt);
            }
        });

        jLabel9.setText("Deduction: NSF Cheque");

        jLabel10.setText("Service Charges");

        jLabel11.setText("Error On Cheque");

        jLabel12.setText("Receivable Collected by Bank");

        jLabel6.setText("Deposit in Transit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtaccount)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtdeptr, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfina)
                                    .addComponent(txtbal)
                                    .addComponent(txtbalreco)
                                    .addComponent(txtbala)
                                    .addComponent(txttotal)
                                    .addComponent(txtot)
                                    .addComponent(txtadj)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtoutche, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addGap(4, 4, 4)
                                .addComponent(txtadjcash, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(txterror, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addComponent(txtnsf, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtintere, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtrec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 274, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdeptr, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtoutche, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtadjcash, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbalreco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtintere, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtbala, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnsf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txterror, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtadj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtaccountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaccountKeyReleased
        // TODO add your handling code here:
        
    try {
        String bal = "select * from Customertable where AccountNO = '"+txtaccount.getText()+"'";
        ps = con.prepareStatement(bal);
        rs = ps.executeQuery();
        while(rs.next()){
        String add1 = rs.getString("AccountBalance");
        txtbal.setText(add1);
        }
    } catch (SQLException ex) {
        Logger.getLogger(BankResheet.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_txtaccountKeyReleased

    private void txtoutcheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtoutcheKeyReleased
        // calculating the adjusted balance for bank
          
        double result = Double.valueOf(txtfina.getText()) - Double.valueOf(txtoutche.getText());
       txtadjcash.setText("" + result);   
          
    }//GEN-LAST:event_txtoutcheKeyReleased

    private void txtfinaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfinaKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtfinaKeyReleased

    private void txtdeptrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdeptrKeyReleased
        // TODO add your handling code here:
        double result = Double.valueOf(txtbal.getText()) + Double.valueOf(txtdeptr.getText());
       txtfina.setText("" + result);
          
    }//GEN-LAST:event_txtdeptrKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // clear
        
        txtaccount.setText("");
        txtbal.setText("");
        txtdeptr.setText("");
        txtfina.setText("");
        txtoutche.setText("");
        txtadjcash.setText("");
        txtbalreco.setText("");
        txtrec.setText("");
        txtintere.setText("");
        txtbala.setText("");
        txttotal.setText("");
        txtnsf.setText("");
        txtcharge.setText("");
        txterror.setText("");
        txtot.setText("");
        txtadj.setText("");
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtintereKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtintereKeyReleased
        // TODO add your handling code here:
         double result = Double.valueOf(txtrec.getText()) + Double.valueOf(txtintere.getText());
       txtbala.setText("" + result);
        double result2 = Double.valueOf(txtbalreco.getText()) + Double.valueOf(txtbala.getText());
       txttotal.setText("" + result2);
    }//GEN-LAST:event_txtintereKeyReleased

    private void txtbalaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbalaKeyReleased
        // TODO add your handling code here:
         
        
        
    }//GEN-LAST:event_txtbalaKeyReleased

    private void txtbalaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbalaKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtbalaKeyTyped

    private void txtbalaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbalaMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtbalaMouseEntered

    private void txttotalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttotalMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txttotalMousePressed

    private void txterrorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txterrorKeyReleased
        // TODO add your handling code here:
         double result = Double.valueOf(txtnsf.getText()) + Double.valueOf(txtcharge.getText()) + Double.valueOf(txterror.getText() );
       txtot.setText("" + result);
        double result2 = Double.valueOf(txttotal.getText()) + Double.valueOf(txtot.getText());
       txtadj.setText("" + result2);
    }//GEN-LAST:event_txterrorKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtaccount;
    private javax.swing.JTextField txtadj;
    private javax.swing.JTextField txtadjcash;
    private javax.swing.JTextField txtbal;
    private javax.swing.JTextField txtbala;
    private javax.swing.JTextField txtbalreco;
    private javax.swing.JTextField txtcharge;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextField txtdeptr;
    private javax.swing.JTextField txterror;
    private javax.swing.JTextField txtfina;
    private javax.swing.JTextField txtintere;
    private javax.swing.JTextField txtnsf;
    private javax.swing.JTextField txtot;
    private javax.swing.JTextField txtoutche;
    private javax.swing.JTextField txtrec;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
