/*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
*/

package Calculator;

public class Home extends javax.swing.JFrame {
    Double a;
    Double b;
    Double result;
    String operator;
    String FinalAnswer;
    public Home() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jbtnCos = new javax.swing.JButton();
        jbtnTan = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtndot = new javax.swing.JButton();
        jbtnSin = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn20 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtnPi = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jbtnDel = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtnDivide = new javax.swing.JButton();
        jbtnSub = new javax.swing.JButton();
        jbtnEquals = new javax.swing.JButton();
        jbtnCLR = new javax.swing.JButton();
        jbtnMul = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator\n");
        setBackground(java.awt.Color.orange);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jbtnCos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnCos.setText("cos");
        jbtnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCosActionPerformed(evt);
            }
        });

        jbtnTan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnTan.setText("tan");
        jbtnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTanActionPerformed(evt);
            }
        });

        jbtn4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtndot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtndot.setText(".");
        jbtndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndotActionPerformed(evt);
            }
        });

        jbtnSin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnSin.setText("sin");
        jbtnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSinActionPerformed(evt);
            }
        });

        jbtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtn6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtn20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn20.setText("00");
        jbtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn20ActionPerformed(evt);
            }
        });

        jbtn5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtnPi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnPi.setText("pi");
        jbtnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPiActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton16.setText("+");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jbtnDel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDel.setText("DEL");
        jbtnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDelActionPerformed(evt);
            }
        });

        jbtn7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtnDivide.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDivide.setText("/");
        jbtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivideActionPerformed(evt);
            }
        });

        jbtnSub.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnSub.setText("-");
        jbtnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubActionPerformed(evt);
            }
        });

        jbtnEquals.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnEquals.setText("=");
        jbtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualsActionPerformed(evt);
            }
        });

        jbtnCLR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnCLR.setText("CLR");
        jbtnCLR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCLRActionPerformed(evt);
            }
        });

        jbtnMul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnMul.setText("*");
        jbtnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn4)
                                .addGap(2, 2, 2)
                                .addComponent(jbtn5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn1)
                                .addGap(2, 2, 2)
                                .addComponent(jbtn2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn0)
                                .addGap(2, 2, 2)
                                .addComponent(jbtndot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnPi)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jbtn20, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn7)
                                .addGap(2, 2, 2)
                                .addComponent(jbtn8))
                            .addComponent(jbtnSin))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn9)
                                .addGap(10, 10, 10)
                                .addComponent(jbtnDel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnCLR))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jbtnCos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnTan)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSin)
                    .addComponent(jbtnCos)
                    .addComponent(jbtnTan))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn7)
                    .addComponent(jbtn8)
                    .addComponent(jbtn9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnCLR)
                        .addComponent(jbtnDel)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn4)
                    .addComponent(jbtn5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn6)
                        .addComponent(jbtnMul)
                        .addComponent(jbtnDivide)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn2)
                        .addComponent(jbtn3)
                        .addComponent(jButton16)
                        .addComponent(jbtnSub)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn0)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtndot)
                        .addComponent(jbtnPi)
                        .addComponent(jbtn20)
                        .addComponent(jbtnEquals)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jbtnTanActionPerformed(java.awt.event.ActionEvent evt) {                                        
        //tan code
        a = Double.parseDouble(jTextField1.getText());
        operator = "tan";
    } 
    private void jbtnSinActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // sin
        a = Double.parseDouble(jTextField1.getText());
        operator = "sin";
    }                                       

    private void jbtnCosActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // cos
        a = Double.parseDouble(jTextField1.getText());
        operator = "cos";
    }                                       
    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // 1
        String number = jTextField1.getText()+jbtn1.getText();  // textfield ma previously vayako rw aahile button le thicheko lai concatenate garxa
        jTextField1.setText(number); // concatenate vayako lai textfield ma shoe garxa
    }                                     

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // 2
        String number = jTextField1.getText()+jbtn2.getText();  
        jTextField1.setText(number);
    }                                     

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // 3
        String number = jTextField1.getText()+jbtn3.getText();  
        jTextField1.setText(number);
    }                                     

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // 4
        String number = jTextField1.getText()+jbtn4.getText();  
        jTextField1.setText(number);
    }                                     

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // 5
        String number = jTextField1.getText()+jbtn5.getText();  
        jTextField1.setText(number);
    }                                     

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // 6
        String number = jTextField1.getText()+jbtn6.getText();  
        jTextField1.setText(number);
    }                                     

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // 7
        String number = jTextField1.getText()+jbtn7.getText();  
        jTextField1.setText(number);
    }                                     

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // 8
        String number = jTextField1.getText()+jbtn8.getText();  
        jTextField1.setText(number);
    }                                     

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // 9
        String number = jTextField1.getText()+jbtn9.getText();  
        jTextField1.setText(number);
    }                                     

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // 0
        String number = jTextField1.getText()+jbtn0.getText();  
        jTextField1.setText(number);
    }                                     

    private void jbtn20ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // 00
        String number = jTextField1.getText()+jbtn20.getText();  
        jTextField1.setText(number);
    }                                      

    private void jbtndotActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // .
        String number = jTextField1.getText()+jbtndot.getText();  
        jTextField1.setText(number);
    }                                       

    private void jbtnPiActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // pi
        String number = jTextField1.getText()+ "3.14159";  
        jTextField1.setText(number);
    }                                      

    private void jbtnCLRActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // clear
        jTextField1.setText(null);
        jTextField1.setText("");
        a = null;
        b = null;
        operator = null;
    }                                       

    private void jbtnDelActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // del
        String backSpace = null;
        if(jTextField1.getText().length()>0)
        {
            StringBuilder str = new StringBuilder(jTextField1.getText());
            str.deleteCharAt(jTextField1.getText().length()-1);
            backSpace = str.toString();
            jTextField1.setText(backSpace);
        }
    }                                       

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // +
        a = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operator = "+";
    }                                         

    private void jbtnSubActionPerformed(java.awt.event.ActionEvent evt) {                                        
        //-
        a = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operator = "-";
    }                                       

    private void jbtnMulActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // *
        a = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operator = "*";
    }                                       

    private void jbtnDivideActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // /
        a = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operator = "/";
    }                                          

    private void jbtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // =
        switch (operator) 
        {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0)
                {
                    jTextField1.setText(" Math Error");
                    return;
                }
                result = a / b;
                break;
            case "sin":
                result = Math.sin(Math.toRadians(a));
                break;
            case "cos":
                result = Math.cos(Math.toRadians(a));
                break;
            case "tan":
                result = Math.tan(Math.toRadians(a));
                break;
            default:
                result = 0.0;
                break;
        }   
        FinalAnswer = String.format("%.2f", result);
        jTextField1.setText(FinalAnswer);
    }                                          

    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton16;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn20;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnCLR;
    private javax.swing.JButton jbtnCos;
    private javax.swing.JButton jbtnDel;
    private javax.swing.JButton jbtnDivide;
    private javax.swing.JButton jbtnEquals;
    private javax.swing.JButton jbtnMul;
    private javax.swing.JButton jbtnPi;
    private javax.swing.JButton jbtnSin;
    private javax.swing.JButton jbtnSub;
    private javax.swing.JButton jbtnTan;
    private javax.swing.JButton jbtndot;
    // End of variables declaration                   
}
