/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olena
 */
public class UserInfoInterface extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;

    /**
     * Creates new customizer UserInfoInterface
     */
    public UserInfoInterface() {
        initComponents();
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserInformation = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        UserType = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Question = new javax.swing.JLabel();
        Answer = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        UserNameData = new javax.swing.JLabel();
        TypeData = new javax.swing.JLabel();
        AnswerData = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserInformation.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        UserInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserInformation.setText("User Information ");
        add(UserInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 290, 50));

        UserName.setText("User Name");
        add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 30));

        UserType.setText("Type");
        add(UserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 30));

        Password.setText("Password");
        add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 110, 30));

        Question.setText("Question");
        add(Question, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        Answer.setText("Answer");
        add(Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jPasswordField1.setText("jPasswordField1");
        add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 130, 30));

        jComboBox1.setBackground(new java.awt.Color(253, 252, 233));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What was the name of your elementary / primary school?", "In what city or town does your nearest sibling live?", "What is the name of your first pet?", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 310, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 530, 10));

        UserNameData.setText("jLabel1");
        UserNameData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(UserNameData, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 130, 30));

        TypeData.setText("jLabel2");
        TypeData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(TypeData, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 130, 30));

        AnswerData.setText("jLabel3");
        AnswerData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(AnswerData, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Answer;
    private javax.swing.JLabel AnswerData;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Question;
    private javax.swing.JLabel TypeData;
    private javax.swing.JLabel UserInformation;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel UserNameData;
    private javax.swing.JLabel UserType;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
