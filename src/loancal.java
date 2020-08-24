/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author AnthonyCee
 */
public class loancal extends javax.swing.JInternalFrame {
double loan;
double interest;
double month;
double payment;
double monthlyPayment;

Connection con = myconnect.getConnection();
  //Connection con = myconnect2.ConnectDb();
        PreparedStatement ps;
        ResultSet rs;

    /**
     * Creates new form loancal
     */
    public loancal() {
        initComponents();
           sdate.setDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
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
        txtovdraft = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtactive = new javax.swing.JTextField();
        txtbal = new javax.swing.JTextField();
        txtacctype = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtadd = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtaccno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtadd2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        sdate = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayer = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtnopay = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtamt = new javax.swing.JTextField();
        txtint = new javax.swing.JTextField();
        txtmpay = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnrest = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btncal = new javax.swing.JButton();
        btnrest1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("LOAN CALCULATOR");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/sunlog.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        txtovdraft.setEnabled(false);

        jLabel2.setText("OverDraft");

        jLabel3.setText("Customer Name");

        jLabel5.setText("AccountType");

        jLabel6.setText("Account Balance");

        jLabel7.setText("AccountActiveness");

        txtname.setEnabled(false);

        txtactive.setEnabled(false);

        txtbal.setEnabled(false);

        txtacctype.setEnabled(false);

        txtphone.setEnabled(false);

        jLabel16.setText("Phone No");

        txtadd.setEnabled(false);

        jLabel17.setText("Address");

        txtaccno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtaccnoKeyReleased(evt);
            }
        });

        jLabel4.setText("Account No");

        jLabel18.setText(" Address 2");

        jLabel19.setText(" Due Date");

        jLabel20.setText("Start Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtphone)
                                    .addComponent(txtadd)
                                    .addComponent(txtovdraft, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtaccno)
                                    .addComponent(txtname)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtacctype)
                                    .addComponent(txtbal)
                                    .addComponent(txtactive)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtadd2))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4))
                    .addComponent(txtaccno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtacctype, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7))
                    .addComponent(txtactive, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(txtovdraft, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(txtadd2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("LOAN REQUEST");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        displayer.setEditable(false);
        displayer.setColumns(20);
        displayer.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        displayer.setRows(5);
        displayer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jScrollPane1.setViewportView(displayer);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel13)
                .addGap(166, 184, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel8.setText("Amount of Loan");

        jLabel9.setText("Interest Rate");

        jLabel10.setText("Number of Payment");

        jLabel11.setText("Monthly Payment");

        txtmpay.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(41, 41, 41)
                        .addComponent(txtmpay))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(29, 29, 29)
                        .addComponent(txtnopay, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtamt)
                            .addComponent(txtint))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtamt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9))
                    .addComponent(txtint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnopay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel11))
                    .addComponent(txtmpay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        btnrest.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnrest.setText("Reset");
        btnrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btncal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncal.setText("Load Calculator");
        btncal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalActionPerformed(evt);
            }
        });

        btnrest1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnrest1.setText("Submit");
        btnrest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrest1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btncal)
                .addGap(18, 18, 18)
                .addComponent(btnrest1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnrest, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrest1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrest, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtaccnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaccnoKeyReleased

        // TODO add your handling code here:
        String sql ="select * from customertable where AccountNO = ?";
        try {
            ps = con.prepareStatement(sql);
            ps . setString(1,txtaccno.getText());
            rs = ps.executeQuery();
            if (rs.next()){
                String add1 = rs.getString("Name");
                txtname.setText(add1);
                String add2 = rs.getString("AccountType");
                txtacctype.setText(add2);
                String add3 = rs.getString("CustomerActiveness");
                txtactive.setText(add3);
                String add4 = rs.getString("AccountBalance");
                txtbal.setText(add4);
                String add5 = rs.getString("MobileNo");
                txtphone.setText(add5);
                String add6 = rs.getString("Address");
                txtadd.setText(add6);
            }
        } catch (SQLException ex) {
            Logger.getLogger(loancal.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Variables declaration - do not modify
    }//GEN-LAST:event_txtaccnoKeyReleased

    private void btnrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestActionPerformed
        // TODO add your handling code here:
        displayer.setText("");
        txtname.setText("");
        txtaccno.setText("");
        txtacctype.setText("");
        txtactive.setText("");
        txtbal.setText("");
        txtovdraft.setText("");
        txtphone.setText("");
        txtadd.setText("");
        txtamt.setText("");
        txtint.setText("") ;
        txtnopay.setText("");
        txtmpay.setText("" );
    }//GEN-LAST:event_btnrestActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btncalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalActionPerformed

        String Balance = String.format(txtamt.getText());
        String iInterest = String.format(txtint.getText());
        String imonth = String.format(txtnopay.getText()) ;
        String ipayment = String.format(txtmpay.getText());

        if(txtamt.getText().equals("")|| txtint.getText().equals("")||txtnopay.getText().equals("")){

            JOptionPane.showMessageDialog(this, "Empty field detected please check the concerned \nfield and fill it to continue", "Warning", JOptionPane.INFORMATION_MESSAGE );

        }else{
            //payment computation
            loan = Double.parseDouble(txtamt.getText());
            interest = Double.parseDouble(txtint.getText());
            month = Double.parseDouble(txtnopay.getText());
            payment = loan + (( loan *interest )/100);
            monthlyPayment = payment/month;
            String paymonth = String.format("%.2f", monthlyPayment);
            txtmpay.setText(paymonth);

            //overdraft
            double acctbal = Double.parseDouble(txtbal.getText());

            double over ;

            String overes = null;

            double bal = Double.parseDouble(txtbal.getText());
            double amt = Double.parseDouble(txtamt.getText());
            if(bal >= amt){
                txtovdraft.setText("0.00");

            }else{
                over = acctbal - loan;
                overes = String.format("%.2f", over);
                txtovdraft.setText(overes);
            }

            //collecting the details of the loan collector
            String name = txtname.getText();
            String Accountno = txtaccno.getText();
            String acctype = txtacctype.getText();
            String active = txtactive.getText();
            //String acctbal = txtbal.getText();//
            String overdraft = txtovdraft.getText();

            String phoneno = txtphone.getText();
            String address = txtadd.getText();
            String address2 = txtadd2.getText();
            Date startdate = sdate.getDate();
            Date Duedate = jDateChooser2.getDate();
            //this will append of display the values of the text box
            displayer.append("\t\nORIENT BANK OF THE NATION :\n\n" +
                "\n============================================\n" +
                "Customer Name :\t\t\t " + name +
                "\nAccount No:\t\t\t " + Accountno +
                "\nAccount Type:\t\t\t " + acctype +
                "\nAccount Activeness:\t\t " + active +
                "\nAccount Balance:\t\t $" + acctbal +
                "\nOverdraft :\t\t\t $" + overes +
                "\nPhone No:\t\t\t " + phoneno +
                "\nAddress:\t\t\t " + address +
                "\nAddress:\t\t\t " + address2 +
                "\nAmount of Loan:\t\t\t $" + loan +
                "\nNumber of Payment:\t\t $" + interest +
                "\nNumber of Month for Payment:\t" + month +
                "\nPayment Per Month:\t\t $" + monthlyPayment +
                "\nTotal Loan Payment :\t\t $" + payment +
                "\nStarting Date:\t\t\t " + startdate +
                "\nDue Date :\t\t\t " + Duedate +
                "\n============================================\n" +
                "\n\nThanks for using ORIENT BANK OF THE NATION \nLOAN VENDOR ");

        }

    }//GEN-LAST:event_btncalActionPerformed

    private void btnrest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrest1ActionPerformed

        String name = txtname.getText();
        String Accountno = txtaccno.getText();
        String acctype = txtacctype.getText();
        String active = txtactive.getText();
        String acctbal = txtbal.getText();//
        String overdraft = txtovdraft.getText();

        String phoneno = txtphone.getText();
        String address = txtadd.getText();

        String loanamt = String.format(txtamt.getText());
        String Interest = String.format(txtint.getText());
        String imonth = String.format(txtnopay.getText()) ;
        String ipayment = String.format(txtmpay.getText());

        String date = ((JTextField)sdate.getDateEditor().getUiComponent()).getText();
        String Duedate = ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();
        // submit to data base
        int res = JOptionPane.showConfirmDialog(this,"Are you sure you want to submitt \nthis Loan request", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(txtamt.getText().equals("")|| txtint.getText().equals("")||txtnopay.getText().equals("") ||txtmpay.getText().equals("")|| name.equals("") ||
            Accountno.equals("") || acctype.equals("")|| active.equals("")||acctbal.equals("")|| overdraft.equals("")||phoneno.equals("") || address .equals("")||sdate.getDate().equals(null) ||jDateChooser2.getDate().equals(null)){

            JOptionPane.showMessageDialog(this, "Empty field detected please check the concerned \nfield and fill it to continue", "Warning", JOptionPane.INFORMATION_MESSAGE );

        }else{
            try{
                String sql = "INSERT INTO `loantable`( `CustomerName`, `AccountNo`, `Accountatype`, `CustomerActiveness`, `AccountBalance`, `Overdraft`, `PhoneNo`, `Address`,`Address2`, `LoanAmount`, `Interest`, `PaymentModel`, `MonthsforPaymenet`,StartDate,DueDate,`AmountRepaid`,`Date`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, txtname.getText());
                ps.setString(2, txtaccno.getText());
                ps.setString(3,  txtacctype.getText());
                ps.setString(4, txtactive.getText());
                ps.setString(5, txtbal.getText());
                ps.setString(6, txtovdraft.getText());
                ps.setString(7, txtphone.getText());
                ps.setString(8, txtadd.getText());
                ps.setString(9, txtadd2.getText());
                ps.setString(10, txtamt.getText());
                ps.setString(11,txtint.getText() );
                ps.setString(12,txtnopay.getText());
                ps.setString(13,txtmpay.getText() );

                ps.setString(14,date);
                ps.setString(15,Duedate );
                ps.setDouble(16,0 );
                ps.setString(17,date );
                if(res == JOptionPane.YES_OPTION){
                    int n1 = ps.executeUpdate();

                    if (n1>0){
                        JOptionPane.showMessageDialog(null,"Load Request Submitted Successfully");
                    }
                }else{}

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Load Request Submission failed");
                Logger.getLogger(loancal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        //adding the loan to the balance sheet
        try{

            String sql2 = "UPDATE `balancesheetable` SET `TotalLoan`= (`TotalLoan` +'"+txtamt.getText()+"') where Date = '"+date+"'";
            ps = con.prepareStatement(sql2);
            int q = ps.executeUpdate();

            if(q>0){

                // JOptionPane.showMessageDialog(this,"Updated was Successful");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Update failed");
            Logger.getLogger(Balsheet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnrest1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            displayer.print();
        } catch (PrinterException ex) {
            Logger.getLogger(loancal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncal;
    private javax.swing.JButton btnrest;
    private javax.swing.JButton btnrest1;
    private javax.swing.JTextArea displayer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser sdate;
    private javax.swing.JTextField txtaccno;
    private javax.swing.JTextField txtacctype;
    private javax.swing.JTextField txtactive;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtadd2;
    private javax.swing.JTextField txtamt;
    private javax.swing.JTextField txtbal;
    private javax.swing.JTextField txtint;
    private javax.swing.JTextField txtmpay;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnopay;
    private javax.swing.JTextField txtovdraft;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
