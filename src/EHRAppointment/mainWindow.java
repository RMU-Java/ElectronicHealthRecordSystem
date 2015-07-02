/*
 * 
 * 
 */
package EHRAppointment;

import EHRAppointment.WelcomeInterface;
import EHRAppointment.DemographicInterface;
import EHRAppointment.MoreInterface;
import EHRAppointment.Patient;
import EHRAppointment.PatientInfoInterface;
import EHRAppointment.PrescriptionInterface;
import EHRAppointment.ScheduleInterface;
import EHRAppointment.SelectPatientInterface;
import EHRAppointment.Userinfo;
import EHRAppointment.VitalsInterface;
import EHRAppointment.login;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Austin, Olena, Daniel
 */
public class mainWindow extends javax.swing.JFrame {

    /**
     * Creates new form mainWindow
     */
    Session session;
    
    WelcomeInterface welcome;
    PatientInfoInterface patient;
    VitalsInterface vitals;
    PrescriptionInterface pres;
    ScheduleInterface schedule;

    private login log;
    Patient currentPatient = null;  //To store the current searched patient
    private Userinfo user;
    private MoreInterface moreInterface;    //To create only one more interface
            
    public mainWindow(login log,Session session,Userinfo user) {
        this.session = session;
        this.log = log;
        this.user = user;
        initComponents();
                                            //Instances of each seperate interface
        patient = new PatientInfoInterface(this.session,this);
        welcome = new WelcomeInterface();
        vitals = new VitalsInterface(this.session,user);
        pres = new PrescriptionInterface(this.session,user);
        schedule = new ScheduleInterface(this.session);
                                            //add them to main jframe
        this.add(patient);
        this.add(welcome);
        this.add(vitals);
        this.add(pres);
        this.add(schedule);

        
        
        viewVoid();                         //showing welcome screen


    }

    private void viewPatientInfo() {         //Showing patient info panal
        welcome.setVisible(false);
        vitals.setVisible(false);
        pres.setVisible(false);
        schedule.setVisible(false);


        patient.setBounds(0, 224, 1060, 445);   //Set size
        patient.setVisible(true);
        patient.updateInfo(currentPatient);

    }

    private void viewVitals() {             //View vital info interface and hide others
        welcome.setVisible(false);
        patient.setVisible(false);
        pres.setVisible(false);
        schedule.setVisible(false);


        vitals.setBounds(0, 224, 1060, 445);
        vitals.setVisible(true);
        vitals.updateInfo(currentPatient);

    }

    void viewVoid() {                //Show void screen at startup before search patient. To show after removing patient
        this.setPreferredSize(new Dimension(1000, 700));
        setSize(new Dimension(1000, 700));
        welcome.setBounds(0, 224, 1060, 445);
        patient.setVisible(false);
        vitals.setVisible(false);
        schedule.setVisible(false);

        pres.setVisible(false);
        welcome.setVisible(true);
         LogoutLabel.setText(user.getUsername()+":");
    }
    
    private void viewPresciptions() {       //View prescription interface and hide others
        welcome.setVisible(false);
        patient.setVisible(false);
        vitals.setVisible(false);
        schedule.setVisible(false);


        pres.setBounds(0, 224,1060, 445);
        pres.setVisible(true);
        pres.updateInfo(currentPatient);
    }

    private void viewSchedule() {       //View schedule interface and hide others
        welcome.setVisible(false);
        patient.setVisible(false);
        vitals.setVisible(false);
        pres.setVisible(false);


        schedule.setBounds(0, 224, 1060, 445);
        schedule.setVisible(true);
        schedule.updateInfo(currentPatient);

    }
    
    private void viewBilling(){             //View bill interface
        welcome.setVisible(false);
        patient.setVisible(false);
        vitals.setVisible(false);
        pres.setVisible(false);
        schedule.setVisible(false);
        
        
        
    }

    void updateAllInterfaces() {            //Update all information in all seperate interfaces
        vitals.updateInfo(currentPatient);
        patient.updateInfo(currentPatient);
        pres.updateInfo(currentPatient);
        schedule.updateInfo(currentPatient);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        MainMenuPanel = new javax.swing.JPanel();
        FindPatientLabel = new javax.swing.JLabel();
        FindPatientButton = new javax.swing.JButton();
        FindPatientTextField = new javax.swing.JTextField();
        SystemTitleLabel = new javax.swing.JLabel();
        PatientButton = new javax.swing.JButton();
        VitalsButton = new javax.swing.JButton();
        PrescriptionsButton = new javax.swing.JButton();
        NewPatientButton = new javax.swing.JButton();
        ScheduleButton = new javax.swing.JButton();
        MoreButton = new javax.swing.JButton();
        LogoutLabel = new javax.swing.JLabel();
        TasksTree = new javax.swing.JScrollPane();
        TTree = new javax.swing.JTree();
        PatientMedicalRecordTree = new javax.swing.JScrollPane();
        PMRTree = new javax.swing.JTree();
        PatientInfoPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FreeMRS");
        setIconImage(new ImageIcon(getClass().getResource("/images/icon_transparent.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1060, 0));
        setResizable(false);

        MainMenuPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainMenuPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        FindPatientLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        FindPatientLabel.setText("Find patient:");

        FindPatientButton.setBackground(new java.awt.Color(204, 204, 255));
        FindPatientButton.setText("Find");
        FindPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindPatientButtonActionPerformed(evt);
            }
        });

        FindPatientTextField.setBackground(new java.awt.Color(204, 204, 255));

        SystemTitleLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SystemTitleLabel.setText("Electronic Health Record and Appointment System");

        PatientButton.setBackground(new java.awt.Color(255, 255, 255));
        PatientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/patient icon.jpg"))); // NOI18N
        PatientButton.setText("Patient");
        PatientButton.setToolTipText("");
        PatientButton.setAutoscrolls(true);
        PatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientButtonActionPerformed(evt);
            }
        });

        VitalsButton.setBackground(new java.awt.Color(255, 255, 255));
        VitalsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vitals icon.jpg"))); // NOI18N
        VitalsButton.setText("Vitals");
        VitalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VitalsButtonActionPerformed(evt);
            }
        });

        PrescriptionsButton.setBackground(new java.awt.Color(255, 255, 255));
        PrescriptionsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Prescription icon.jpg"))); // NOI18N
        PrescriptionsButton.setText("Prescriptions");
        PrescriptionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrescriptionsButtonActionPerformed(evt);
            }
        });

        NewPatientButton.setBackground(new java.awt.Color(153, 204, 255));
        NewPatientButton.setText("New");
        NewPatientButton.setToolTipText("Add new patient");
        NewPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPatientButtonActionPerformed(evt);
            }
        });

        ScheduleButton.setBackground(new java.awt.Color(255, 255, 255));
        ScheduleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scheduleEdt.jpg"))); // NOI18N
        ScheduleButton.setText("Schedule");
        ScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleButtonActionPerformed(evt);
            }
        });

        MoreButton.setBackground(new java.awt.Color(255, 255, 255));
        MoreButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_More .jpg"))); // NOI18N
        MoreButton.setText("More");
        MoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoreButtonActionPerformed(evt);
            }
        });

        LogoutLabel.setForeground(new java.awt.Color(51, 51, 255));
        LogoutLabel.setText("Logout  ");
        LogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MainMenuPanelLayout = new javax.swing.GroupLayout(MainMenuPanel);
        MainMenuPanel.setLayout(MainMenuPanelLayout);
        MainMenuPanelLayout.setHorizontalGroup(
            MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainMenuPanelLayout.createSequentialGroup()
                        .addComponent(PatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(VitalsButton)
                        .addGap(18, 18, 18)
                        .addComponent(PrescriptionsButton)
                        .addGap(18, 18, 18)
                        .addComponent(ScheduleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MoreButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MainMenuPanelLayout.createSequentialGroup()
                        .addComponent(SystemTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(FindPatientLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FindPatientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(FindPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutLabel)
                .addContainerGap())
        );
        MainMenuPanelLayout.setVerticalGroup(
            MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuPanelLayout.createSequentialGroup()
                .addComponent(LogoutLabel)
                .addGap(2, 2, 2)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FindPatientLabel)
                    .addComponent(FindPatientButton)
                    .addComponent(FindPatientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SystemTitleLabel)
                    .addComponent(NewPatientButton))
                .addGap(33, 33, 33)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VitalsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainMenuPanelLayout.createSequentialGroup()
                        .addComponent(ScheduleButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PrescriptionsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoreButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Tasks");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Notifications");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Appointments");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Search");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Telephone Consults");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("New Results");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Co-signs");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Sign Orders");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Consult Log");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Patient List");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Reporting");
        treeNode1.add(treeNode2);
        TTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        TTree.setAutoscrolls(true);
        TTree.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TasksTree.setViewportView(TTree);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Patient Medical Record");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Demographics");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Health History");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Problems");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Medications");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Allergy");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Wellness");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Immunizations");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Vital Signs Review");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Patient Questionnaire");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Lab");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Radiology");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Clinical Notes");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Past Encounters");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Flow Sheets");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Current Encounter");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Screening");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("S/O");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("AP");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Drawing");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Past Encounters");
        treeNode1.add(treeNode2);
        PMRTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        PMRTree.setToolTipText("");
        PatientMedicalRecordTree.setViewportView(PMRTree);

        PatientInfoPanel.setBackground(new java.awt.Color(51, 153, 255));
        PatientInfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PatientInfoPanelLayout = new javax.swing.GroupLayout(PatientInfoPanel);
        PatientInfoPanel.setLayout(PatientInfoPanelLayout);
        PatientInfoPanelLayout.setHorizontalGroup(
            PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PatientInfoPanelLayout.setVerticalGroup(
            PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TasksTree, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientMedicalRecordTree, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PatientInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PatientInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TasksTree, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PatientMedicalRecordTree, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientButtonActionPerformed
        //Enable patient info interface if no patient found inform that 
        if (this.currentPatient != null) {
            viewPatientInfo();
        } else {
            JOptionPane.showMessageDialog(null, "Please search a patient", "Search patient", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_PatientButtonActionPerformed

    private void VitalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VitalsButtonActionPerformed
        //Show vital interface
        if (this.currentPatient != null) {
            viewVitals();
        } else {
            JOptionPane.showMessageDialog(null, "Please search a patient", "Search patient", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_VitalsButtonActionPerformed

    private void PrescriptionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrescriptionsButtonActionPerformed
       //Show prescription interface 
        if (this.currentPatient != null) {
            viewPresciptions();
        } else {
            JOptionPane.showMessageDialog(null, "Please search a patient", "Search patient", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_PrescriptionsButtonActionPerformed

    private void FindPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindPatientButtonActionPerformed
        //Searching patient 
        session.beginTransaction();
        Query qr = session.createQuery("from Patient where name =:code");
        qr.setParameter("code", FindPatientTextField.getText());
        List<Patient> result = qr.list();
        session.getTransaction().commit();

        if (result.isEmpty()) {         //Check patiens are found or not
            JOptionPane.showMessageDialog(null, "Patient does not exist", "No patient found", JOptionPane.INFORMATION_MESSAGE);
        } else if (result.size() == 1) {
            this.currentPatient = result.get(0);

            updateAllInterfaces();  //After searching new patient updating all interfaces
            JOptionPane.showMessageDialog(this, ("Patient found"), "Search", JOptionPane.INFORMATION_MESSAGE);
            
        } else if (result.size() > 1) { //If multiple patients found show search window to select one
            new SelectPatientInterface(result,this).setVisible(true);
            if(currentPatient!=null){
                updateAllInterfaces();
            }
            
        }
    }//GEN-LAST:event_FindPatientButtonActionPerformed

    private void NewPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPatientButtonActionPerformed
        //Adding new patient 
        this.currentPatient = new Patient();

        DemographicInterface demographic = new DemographicInterface(session, currentPatient, true, this);
        demographic.setVisible(true);
    }//GEN-LAST:event_NewPatientButtonActionPerformed

    private void ScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleButtonActionPerformed
        //Enabling schedule interface
        if (this.currentPatient != null) {
            viewSchedule();
        } else {
            JOptionPane.showMessageDialog(this, "Please search a patient", "Search patient", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ScheduleButtonActionPerformed

    private void MoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoreButtonActionPerformed
            //Enabling more interface
            if (this.moreInterface==null){  //Check previously created a instance if not create new one
                this.moreInterface = new MoreInterface(session, currentPatient,user,this);
                this.moreInterface.setVisible(true);        
            }
            else{
                this.moreInterface.setVisible(false);
                this.moreInterface = new MoreInterface(session, currentPatient,user,this);        
                this.moreInterface.setVisible(true); 
            }
    }//GEN-LAST:event_MoreButtonActionPerformed

    private void LogoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLabelMouseClicked
        //logout action
        this.setVisible(false);
        this.log.setVisible(true);
    }//GEN-LAST:event_LogoutLabelMouseClicked

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
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Session s = null;
                login l = null;
                new mainWindow(l,s,null).setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FindPatientButton;
    private javax.swing.JLabel FindPatientLabel;
    private javax.swing.JTextField FindPatientTextField;
    private javax.swing.JLabel LogoutLabel;
    private javax.swing.JPanel MainMenuPanel;
    private javax.swing.JButton MoreButton;
    private javax.swing.JButton NewPatientButton;
    private javax.swing.JTree PMRTree;
    private javax.swing.JButton PatientButton;
    private javax.swing.JPanel PatientInfoPanel;
    private javax.swing.JScrollPane PatientMedicalRecordTree;
    private javax.swing.JButton PrescriptionsButton;
    private javax.swing.JButton ScheduleButton;
    private javax.swing.JLabel SystemTitleLabel;
    private javax.swing.JTree TTree;
    private javax.swing.JScrollPane TasksTree;
    private javax.swing.JButton VitalsButton;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}