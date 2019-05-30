
package myteamcalculator;

public class Calculator extends javax.swing.JFrame {
 double no1,no2,result;
 String opeartion;
     
 
    public Calculator() {
          super("YAHIA Calculator");
        initComponents();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_comma = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_adstraction = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        txt_display = new javax.swing.JTextField();
        btn_div = new javax.swing.JButton();
        btn_equal = new javax.swing.JButton();
        btn_tan = new javax.swing.JButton();
        btn_cos = new javax.swing.JButton();
        btn_sin = new javax.swing.JButton();
        btn_pow = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_AC = new javax.swing.JButton();
        btn_remainder = new javax.swing.JButton();
        btn_mul = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt_op = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(-16711681,true));
        jPanel1.setForeground(new java.awt.Color(-256,true));

        btn_1.setFont(new java.awt.Font("Dialog", 1, 12));
        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_2.setFont(new java.awt.Font("Dialog", 1, 12));
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_4.setFont(new java.awt.Font("Dialog", 1, 12));
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_add.setFont(new java.awt.Font("Dialog", 1, 14));
        btn_add.setText("+");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_comma.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_comma.setText(".");
        btn_comma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_commaActionPerformed(evt);
            }
        });

        btn_0.setFont(new java.awt.Font("Dialog", 1, 12));
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_5.setFont(new java.awt.Font("Dialog", 1, 12));
        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_adstraction.setFont(new java.awt.Font("Dialog", 1, 14));
        btn_adstraction.setText("-");
        btn_adstraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adstractionActionPerformed(evt);
            }
        });

        btn_6.setFont(new java.awt.Font("Dialog", 1, 12));
        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_3.setFont(new java.awt.Font("Dialog", 1, 12));
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_7.setFont(new java.awt.Font("Dialog", 1, 12));
        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_9.setFont(new java.awt.Font("Dialog", 1, 12));
        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_8.setFont(new java.awt.Font("Dialog", 1, 12));
        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        txt_display.setEditable(false);

        btn_div.setFont(new java.awt.Font("Dialog", 1, 14));
        btn_div.setText("/");
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });

        btn_equal.setFont(new java.awt.Font("Dialog", 1, 14));
        btn_equal.setText("=");
        btn_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalActionPerformed(evt);
            }
        });

        btn_tan.setFont(new java.awt.Font("Dialog", 1, 12));
        btn_tan.setText("tan");
        btn_tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tanActionPerformed(evt);
            }
        });

        btn_cos.setFont(new java.awt.Font("Dialog", 1, 12));
        btn_cos.setText("cos");
        btn_cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cosActionPerformed(evt);
            }
        });

        btn_sin.setFont(new java.awt.Font("Dialog", 1, 12));
        btn_sin.setText("sin");
        btn_sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sinActionPerformed(evt);
            }
        });

        btn_pow.setFont(new java.awt.Font("Dialog", 1, 12));
        btn_pow.setText("n^p");
        btn_pow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_powActionPerformed(evt);
            }
        });

        btn_back.setFont(new java.awt.Font("Dialog", 1, 12));
        btn_back.setText("Del");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_AC.setFont(new java.awt.Font("Dialog", 1, 12));
        btn_AC.setText("AC");
        btn_AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ACActionPerformed(evt);
            }
        });

        btn_remainder.setFont(new java.awt.Font("Dialog", 1, 14));
        btn_remainder.setText("%");
        btn_remainder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_remainderActionPerformed(evt);
            }
        });

        btn_mul.setFont(new java.awt.Font("Dialog", 1, 14));
        btn_mul.setText("*");
        btn_mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mulActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 1, 12));
        jButton5.setText("log10");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12));
        jButton1.setText("n!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_op.setText("operation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_1)
                        .addGap(10, 10, 10)
                        .addComponent(btn_2)
                        .addGap(18, 18, 18)
                        .addComponent(btn_3)
                        .addGap(18, 18, 18)
                        .addComponent(btn_div, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_8)
                        .addGap(18, 18, 18)
                        .addComponent(btn_9)
                        .addGap(18, 18, 18)
                        .addComponent(btn_mul, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_5)
                        .addGap(18, 18, 18)
                        .addComponent(btn_6)
                        .addGap(18, 18, 18)
                        .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_comma, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btn_adstraction, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_remainder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pow, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cos, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(btn_tan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(btn_sin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(btn_AC, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_display, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_equal, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_op, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_display, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_op, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_2)
                    .addComponent(btn_3)
                    .addComponent(btn_div)
                    .addComponent(btn_sin)
                    .addComponent(btn_1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_5)
                    .addComponent(btn_6)
                    .addComponent(btn_4)
                    .addComponent(btn_add)
                    .addComponent(btn_cos))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_8)
                    .addComponent(btn_9)
                    .addComponent(btn_7)
                    .addComponent(btn_mul)
                    .addComponent(btn_tan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_0)
                    .addComponent(btn_adstraction)
                    .addComponent(btn_AC)
                    .addComponent(jButton1)
                    .addComponent(btn_comma))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_remainder)
                        .addComponent(btn_pow))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(btn_back)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_equal)
                .addContainerGap(22, Short.MAX_VALUE))
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

private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
String b1=txt_display.getText()+btn_1.getText();//get text from the button
txt_display.setText(b1);//display the number 
// TODO add your handling code here:
}//GEN-LAST:event_btn_1ActionPerformed

private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
// TODO add your handling code here:
    String b1=txt_display.getText()+btn_2.getText();//get text from the button
txt_display.setText(b1);//display the number 
}//GEN-LAST:event_btn_2ActionPerformed

private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
// TODO add your handling code here:
    String b1=txt_display.getText()+btn_3.getText();//get text from the button
txt_display.setText(b1);//display the number 
}//GEN-LAST:event_btn_3ActionPerformed

private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
// TODO add your handling code here:
    String b1=txt_display.getText()+btn_4.getText();//get text from the button
txt_display.setText(b1);//display the number 
}//GEN-LAST:event_btn_4ActionPerformed

private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
// TODO add your handling code here:
    String b1=txt_display.getText()+btn_5.getText();//get text from the button
txt_display.setText(b1);//display the number 
}//GEN-LAST:event_btn_5ActionPerformed

private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
// TODO add your handling code here:
    String b1=txt_display.getText()+btn_6.getText();//get text from the button
txt_display.setText(b1);//display the number 
}//GEN-LAST:event_btn_6ActionPerformed

private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
// TODO add your handling code here:
    String b1=txt_display.getText()+btn_7.getText();//get text from the button
txt_display.setText(b1);//display the number 
}//GEN-LAST:event_btn_7ActionPerformed

private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
// TODO add your handling code here:
    String b1=txt_display.getText()+btn_8.getText();//get text from the button
txt_display.setText(b1);//display the number 
}//GEN-LAST:event_btn_8ActionPerformed

private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
// TODO add your handling code here:
    String b1=txt_display.getText()+btn_9.getText();//get text from the button
txt_display.setText(b1);//display the number 
}//GEN-LAST:event_btn_9ActionPerformed

private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
String b1=txt_display.getText()+btn_0.getText();//get text from the button
txt_display.setText(b1);//display the number:
}//GEN-LAST:event_btn_0ActionPerformed

private void btn_commaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_commaActionPerformed
// TODO add your handling code here:
    String b1=txt_display.getText()+btn_comma.getText();//get text from the button
txt_display.setText(b1);//display the number 
}//GEN-LAST:event_btn_commaActionPerformed

private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

   no1=Double.parseDouble(txt_display.getText());
   txt_display.setText("");
    txt_op.setText("+");
 opeartion="+";
}//GEN-LAST:event_btn_addActionPerformed

private void btn_adstractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adstractionActionPerformed
// TODO add your handling code here:
     no1=Double.parseDouble(txt_display.getText());
   txt_display.setText("");
    txt_op.setText("-");
    opeartion="-";
}//GEN-LAST:event_btn_adstractionActionPerformed

private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
// TODO add your handling code here:
     no1=Double.parseDouble(txt_display.getText());
   txt_display.setText("");
    txt_op.setText("/");
    opeartion="/";
}//GEN-LAST:event_btn_divActionPerformed

private void btn_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalActionPerformed

       no2=Double.parseDouble( txt_display.getText( ));
char type=opeartion.charAt(0);
       switch( type){
       case '+':
result=no1+no2;
        txt_display.setText(Double.toString(result));
         txt_op.setText("");
           break;
          case '-':
        result=no1-no2;
        txt_display.setText(Double.toString(result));
         txt_op.setText("");
     break;
          case '*':
        result=no1*no2;
        txt_display.setText(Double.toString(result));
         txt_op.setText("");
    break;
        case '/':
      result=no1/no2;
    txt_display.setText(Double.toString(result));
     txt_op.setText("");
            break;
        case'%':
          result=no1%no2;
              txt_display.setText(Double.toString(result));
               txt_op.setText("");
           break;  
           
        case's':
             double r = Math.toRadians(no2);
              result=Math.sin(r);
        txt_display.setText(Double.toString(result));
         txt_op.setText("");
            break;
             case'c':
                 double ra = Math.toRadians(no2);
              result=Math.cos(Math.toRadians(ra));
        txt_display.setText(Double.toString(result));
         txt_op.setText("");
                 break;
                  case't':
                      double rad = Math.toRadians(no2);
              result=Math.tan(rad);
        txt_display.setText(Double.toString(result));
         txt_op.setText("");
                      break;
                       case'^':
              result=Math.pow(no1, no2);
        txt_display.setText(Double.toString(result));
                            txt_op.setText("");
                           
      case'l':
              result=Math.log10(no2);
        txt_display.setText(Double.toString(result));
         txt_op.setText("");
            break; 
           case'n':
             result=1;
             for(int i=(int) no2;i>0;i--){
             result*=i;}
              
        txt_display.setText(Double.toString(result));
         txt_op.setText("");
            break; 
           
           
    }
}//GEN-LAST:event_btn_equalActionPerformed

private void btn_remainderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_remainderActionPerformed
// TODO add your handling code here:
      no1=Double.parseDouble(txt_display.getText());
   txt_display.setText("");
    txt_op.setText("%");
    opeartion="%";
}//GEN-LAST:event_btn_remainderActionPerformed

private void btn_ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ACActionPerformed
txt_display.setText("");
 txt_op.setText("");
    
}//GEN-LAST:event_btn_ACActionPerformed

private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
// TODO add your handling code here:
    String text=txt_display.getText();
    int len =text.length();
    if(len!=0){
    text =text.substring(0,len-1);
    txt_display.setText(text);}
}//GEN-LAST:event_btn_backActionPerformed

private void btn_powActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_powActionPerformed
// TODO add your handling code here:
      no1=Double.parseDouble(txt_display.getText());
   txt_display.setText("");
    txt_op.setText("^");
    opeartion="^";
}//GEN-LAST:event_btn_powActionPerformed

private void btn_mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mulActionPerformed
 no1=Double.parseDouble(txt_display.getText());
   txt_display.setText("");
    txt_op.setText("*");
    opeartion="*";
}//GEN-LAST:event_btn_mulActionPerformed

private void btn_sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sinActionPerformed
// TODO add your handling code here:
   //  no1=Double.parseDouble(txt_display.getText());
   txt_display.setText(""); 
   txt_op.setText("sin()");
    opeartion="s";
}//GEN-LAST:event_btn_sinActionPerformed

private void btn_cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cosActionPerformed
// TODO add your handling code here:
  //  no1=Double.parseDouble(txt_display.getText());
  
   txt_display.setText("");
    txt_op.setText("cos()");
    opeartion="c";
}//GEN-LAST:event_btn_cosActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here:
     txt_display.setText("");
      txt_op.setText("log10");
   opeartion="l";
}//GEN-LAST:event_jButton5ActionPerformed

private void btn_tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tanActionPerformed
// TODO add your handling code here:
     //no1=Double.parseDouble(txt_display.getText());
   txt_display.setText("");
    txt_op.setText("tan()");
   opeartion="t";
}//GEN-LAST:event_btn_tanActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
     txt_display.setText("");
      txt_op.setText("!");
   opeartion="n";
}//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_AC;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_adstraction;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_comma;
    private javax.swing.JButton btn_cos;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_equal;
    private javax.swing.JButton btn_mul;
    private javax.swing.JButton btn_pow;
    private javax.swing.JButton btn_remainder;
    private javax.swing.JButton btn_sin;
    private javax.swing.JButton btn_tan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_display;
    private javax.swing.JTextField txt_op;
    // End of variables declaration//GEN-END:variables
}
