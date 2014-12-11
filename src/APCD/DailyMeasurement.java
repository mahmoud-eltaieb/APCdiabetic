package APCD;

import APCD.APCdiabetic;
import static APCD.APCdiabetic.databaseName;
import static APCD.APCdiabetic.xmlFile;
import APCD.TimeSetting;
import business.AlertThread;
import business.UserBusiness;
import java.awt.Component;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.xml.bind.JAXBException;
import utils.CustomException;
import utils.Util;
import utils.ValueContainer;
import xml.Users;
import xml.Users.UserInfo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Toshiba
 */
public class DailyMeasurement extends javax.swing.JFrame {
    /*swing*/

    /**
     * Creates new form DailyMeasurement
     */
    public static AlertThread alertThread = new AlertThread();

    static void correctMeasurementStructure(UserInfo.DailyMeasurement data) {

    }
    double totalformMeasurementBeforeEdition = 0;

    private static DailyMeasurement instance;

    private DailyMeasurement() {
        initComponents();
        initForm();
        loadFields();
        startAlertThread();

    }

    public static DailyMeasurement getInstance() {
        if (instance == null) {
            instance = new DailyMeasurement();
        }
         instance.loadFields();
         instance.loadUserDailyMeasurmentsIntoMap();
         return instance;
         
    }

    DailyMeasurement(String text, String text0) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        measurePanelMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ExitMeasurement = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        SaveMeasurement = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        timesettingButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        TableOfMeasurementsButton = new javax.swing.JButton();
        calculateButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        beforebreackfastMeasur = new javax.swing.JLabel();
        breackfastMeasur = new javax.swing.JLabel();
        lunchMeasur = new javax.swing.JLabel();
        dinerMeasur = new javax.swing.JLabel();
        beforeSleepMeasur = new javax.swing.JLabel();
        measurePanel = new javax.swing.JPanel();
        beforeBreakFast = new javax.swing.JTextField();
        breakfast = new javax.swing.JTextField();
        lunch = new javax.swing.JTextField();
        diner = new javax.swing.JTextField();
        beforeSleep = new javax.swing.JTextField();
        suddenDrop = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daily measurement");
        setPreferredSize(new java.awt.Dimension(405, 657));
        setResizable(false);

        measurePanelMain.setBackground(new java.awt.Color(255, 255, 255));
        measurePanelMain.setPreferredSize(new java.awt.Dimension(401, 630));

        ExitMeasurement.setBackground(new java.awt.Color(153, 0, 0));
        ExitMeasurement.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ExitMeasurement.setForeground(new java.awt.Color(255, 255, 0));
        ExitMeasurement.setText("Sign out");
        ExitMeasurement.setPreferredSize(new java.awt.Dimension(100, 30));
        ExitMeasurement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMeasurementActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/apc diabeticlogo DailyM.png"))); // NOI18N

        SaveMeasurement.setBackground(new java.awt.Color(153, 0, 0));
        SaveMeasurement.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        SaveMeasurement.setForeground(new java.awt.Color(255, 255, 0));
        SaveMeasurement.setText("Save");
        SaveMeasurement.setMaximumSize(new java.awt.Dimension(105, 35));
        SaveMeasurement.setMinimumSize(new java.awt.Dimension(105, 35));
        SaveMeasurement.setPreferredSize(new java.awt.Dimension(105, 35));
        SaveMeasurement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMeasurementActionPerformed(evt);
            }
        });

        timesettingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clock.png"))); // NOI18N
        timesettingButton.setToolTipText("Setting Notifications Times");
        timesettingButton.setName("Time Setting"); // NOI18N
        timesettingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesettingButtonActionPerformed(evt);
            }
        });

        TableOfMeasurementsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tabel.png"))); // NOI18N
        TableOfMeasurementsButton.setToolTipText("Measurements Report");
        TableOfMeasurementsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableOfMeasurementsButtonActionPerformed(evt);
            }
        });

        calculateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/predict.png"))); // NOI18N
        calculateButton.setToolTipText("Check Measurements");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 51));
        jLabel9.setText("Sudden drop ------------->");

        beforebreackfastMeasur.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        beforebreackfastMeasur.setForeground(new java.awt.Color(0, 153, 51));
        beforebreackfastMeasur.setText("Before Breackfast ----->");

        breackfastMeasur.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        breackfastMeasur.setForeground(new java.awt.Color(0, 153, 51));
        breackfastMeasur.setText("Breackfast ---------------->");

        lunchMeasur.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lunchMeasur.setForeground(new java.awt.Color(0, 153, 51));
        lunchMeasur.setText("Lunch ---------------------->");

        dinerMeasur.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        dinerMeasur.setForeground(new java.awt.Color(0, 153, 51));
        dinerMeasur.setText("Diner  ---------------------->");

        beforeSleepMeasur.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        beforeSleepMeasur.setForeground(new java.awt.Color(0, 153, 51));
        beforeSleepMeasur.setText("Before Sleep ------------>");

        measurePanel.setBackground(new java.awt.Color(255, 255, 255));

        beforeBreakFast.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        beforeBreakFast.setForeground(new java.awt.Color(0, 51, 255));
        beforeBreakFast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beforeBreakFastActionPerformed(evt);
            }
        });

        breakfast.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        breakfast.setForeground(new java.awt.Color(0, 51, 255));
        breakfast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breakfastActionPerformed(evt);
            }
        });

        lunch.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lunch.setForeground(new java.awt.Color(0, 51, 255));

        diner.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        diner.setForeground(new java.awt.Color(0, 51, 255));

        beforeSleep.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        beforeSleep.setForeground(new java.awt.Color(0, 51, 255));

        suddenDrop.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        suddenDrop.setForeground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout measurePanelLayout = new javax.swing.GroupLayout(measurePanel);
        measurePanel.setLayout(measurePanelLayout);
        measurePanelLayout.setHorizontalGroup(
            measurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(measurePanelLayout.createSequentialGroup()
                .addGroup(measurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(breakfast, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lunch, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diner, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beforeSleep, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suddenDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beforeBreakFast, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        measurePanelLayout.setVerticalGroup(
            measurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(measurePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(beforeBreakFast, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(breakfast, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lunch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(beforeSleep, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(suddenDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout measurePanelMainLayout = new javax.swing.GroupLayout(measurePanelMain);
        measurePanelMain.setLayout(measurePanelMainLayout);
        measurePanelMainLayout.setHorizontalGroup(
            measurePanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(measurePanelMainLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(measurePanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(measurePanelMainLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(timesettingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addGroup(measurePanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(measurePanelMainLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TableOfMeasurementsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(measurePanelMainLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(measurePanelMainLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(measurePanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(measurePanelMainLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(measurePanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(beforebreackfastMeasur, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(breackfastMeasur)
                            .addComponent(lunchMeasur, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dinerMeasur, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(beforeSleepMeasur, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(measurePanelMainLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(measurePanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(SaveMeasurement, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ExitMeasurement, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30)
                        .addComponent(measurePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        measurePanelMainLayout.setVerticalGroup(
            measurePanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(measurePanelMainLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(measurePanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(measurePanelMainLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(measurePanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timesettingButton)
                            .addComponent(calculateButton)
                            .addComponent(TableOfMeasurementsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(measurePanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(measurePanelMainLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(beforebreackfastMeasur)
                        .addGap(16, 16, 16)
                        .addComponent(breackfastMeasur)
                        .addGap(16, 16, 16)
                        .addComponent(lunchMeasur)
                        .addGap(16, 16, 16)
                        .addComponent(dinerMeasur)
                        .addGap(16, 16, 16)
                        .addComponent(beforeSleepMeasur)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel9)
                        .addGap(46, 46, 46)
                        .addComponent(SaveMeasurement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(measurePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(measurePanelMainLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExitMeasurement, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(measurePanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 409, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(measurePanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void breakfastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breakfastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_breakfastActionPerformed

    private void beforeBreakFastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beforeBreakFastActionPerformed
        String fast_value1 = beforeBreakFast.getText();
        int fast_value2 = Integer.parseInt(fast_value1);
    }//GEN-LAST:event_beforeBreakFastActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed

        // popUpMeasurementChanges();
        Map<String, String> checkingResultMap = doCheckesAndFetchResults();
        StringBuilder stringBuilder = new StringBuilder();
        for (String key : checkingResultMap.keySet()) {
            String checkingResut = checkingResultMap.get(key);
            stringBuilder.append(String.format("%s checking result :%s \n", Util.camelCasingStylingToNormal(key) ,checkingResut));
        }
        if(stringBuilder.toString().trim().length()!=0)
        {
            Util.displayMessage(this, stringBuilder.toString());
        }else
        {
            Util.displayMessage(this, Util.NO_CHANGES_HAPPEND);
        }
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void TableOfMeasurementsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableOfMeasurementsButtonActionPerformed
        TableOfMeasurements tm = TableOfMeasurements.getInstance();
        tm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TableOfMeasurementsButtonActionPerformed

    private void timesettingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesettingButtonActionPerformed
        TimeSetting time = TimeSetting.getInstance();
        time.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_timesettingButtonActionPerformed

    private void SaveMeasurementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMeasurementActionPerformed

        try {
            validateForm();

            boolean result = Util.displayDialogMessage(this, "Are you sure that you want to save changes ?");
            if (result) {
                addNewValuesIntoUserObject();
                persistObjectIntoDataBase();
                Util.hideAndShow(this, TableOfMeasurements.getInstance());
            } else {

            }

        } catch (CustomException ex) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String str : ex.getMessages()) {
                stringBuilder.append(String.format("%s \n", str));
            }
            Util.displayMessage(this, stringBuilder.toString());
        }

    }//GEN-LAST:event_SaveMeasurementActionPerformed

    private void ExitMeasurementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMeasurementActionPerformed
        APCdiabetic so = new APCdiabetic();
        so.setVisible(true);
        this.setVisible(false);//SingOut Button      System.exit(0);
    }//GEN-LAST:event_ExitMeasurementActionPerformed
    boolean changeHappendFlag = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitMeasurement;
    private javax.swing.JButton SaveMeasurement;
    private javax.swing.JButton TableOfMeasurementsButton;
    private javax.swing.JTextField beforeBreakFast;
    private javax.swing.JTextField beforeSleep;
    private javax.swing.JLabel beforeSleepMeasur;
    private javax.swing.JLabel beforebreackfastMeasur;
    private javax.swing.JLabel breackfastMeasur;
    private javax.swing.JTextField breakfast;
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextField diner;
    private javax.swing.JLabel dinerMeasur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField lunch;
    private javax.swing.JLabel lunchMeasur;
    private javax.swing.JPanel measurePanel;
    private javax.swing.JPanel measurePanelMain;
    private javax.swing.JTextField suddenDrop;
    private javax.swing.JButton timesettingButton;
    // End of variables declaration//GEN-END:variables

    private void initForm() {
        Util.initializeForm(this);
        for (Component c : measurePanelMain.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).addKeyListener(new KeyListener() {

                    @Override
                    public void keyTyped(KeyEvent e) {
                        if (e.getKeyChar() != '.') {
                            if (!Character.isDigit(e.getKeyChar())) {

                                {
                                    e.consume();
                                }
                            }
                        }
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }
                });
            }
        }

        calculateButton.setEnabled(Util.currentLoginUser.getDailyMeasurement() != null && Util.currentLoginUser.getDailyMeasurement().size() > 0);
        TableOfMeasurementsButton.setEnabled(Util.currentLoginUser.getDailyMeasurement() != null && Util.currentLoginUser.getDailyMeasurement().size() > 0);

    }

    Users.UserInfo.DailyMeasurement userDailyMeasurement = null;
    UserBusiness userBusiness = new UserBusiness();
    private Map<String, ValueContainer> measurementsMap = new HashMap();
    private Map<String, ValueContainer> newMeasurementMap = new HashMap();

    private void loadFields() {
        userDailyMeasurement = userBusiness.extractToDayUserDailyMeasurement();
        if (userDailyMeasurement != null) {
            loadUserDailyMeasurmentsIntoMap();
            setDataIntoFields();

        } else {
            constructUserDailyMeasurement();

        }
    }

    private void constructUserDailyMeasurement() {

        userDailyMeasurement = new Users.UserInfo.DailyMeasurement();
        if (userDailyMeasurement == null) {
            userDailyMeasurement = new Users.UserInfo.DailyMeasurement();
        }
    }

    private void loadUserDailyMeasurmentsIntoMap() {
        for (Users.UserInfo.DailyMeasurement.Measurement measurement : userDailyMeasurement.getMeasurement()) {
            measurementsMap.put(measurement.getTimeOfMeasurement(), new ValueContainer(measurement.getMeasurementValue()));
        }
    }

    private void setDataIntoFields() {
        totalformMeasurementBeforeEdition = 0;
        if (measurementsMap.get(Util.beforeBreakfast) != null) {
            beforeBreakFast.setText(measurementsMap.get(Util.beforeBreakfast).getValue() + "");
            totalformMeasurementBeforeEdition += measurementsMap.get(Util.beforeBreakfast).getValue();
        }
        if (measurementsMap.get(Util.breakfast) != null) {
            breakfast.setText(measurementsMap.get(Util.beforeBreakfast).getValue() + "");
            totalformMeasurementBeforeEdition += measurementsMap.get(Util.beforeBreakfast).getValue();
        }
        if (measurementsMap.get(Util.lunch) != null) {
            lunch.setText(measurementsMap.get(Util.lunch).getValue() + "");
            totalformMeasurementBeforeEdition += measurementsMap.get(Util.lunch).getValue();
        }
        if (measurementsMap.get(Util.dinner) != null) {
            diner.setText(measurementsMap.get(Util.dinner).getValue() + "");
            totalformMeasurementBeforeEdition += measurementsMap.get(Util.dinner).getValue();
        }
        if (measurementsMap.get(Util.beforeSleep) != null) {
            beforeSleep.setText(measurementsMap.get(Util.beforeSleep).getValue() + "");
            totalformMeasurementBeforeEdition += measurementsMap.get(Util.beforeSleep).getValue();
        }

        if (measurementsMap.get(Util.suddenDrop) != null) {
            suddenDrop.setText(measurementsMap.get(Util.suddenDrop).getValue() + "");
            totalformMeasurementBeforeEdition += measurementsMap.get(Util.suddenDrop).getValue();
        }
    }

    private void validateForm() throws CustomException {
        List<String> messages = new ArrayList();
        if ((beforeBreakFast.getText().trim().length() > 0 && Util.isDouble(beforeBreakFast.getText().trim())) == false) {
            messages.add("Before breakfast measure not valid");

        }

        if ((breakfast.getText().trim().length() > 0 && Util.isDouble(breakfast.getText().trim())) == false) {
            messages.add("Breakfast measure not valid");

        }

        if ((lunch.getText().trim().length() > 0 && Util.isDouble(lunch.getText().trim())) == false) {
            messages.add("Lunch measure not valid");

        }
        if ((diner.getText().trim().length() > 0 && Util.isDouble(diner.getText().trim())) == false) {
            messages.add("Dinner measure not valid");

        }
        if ((beforeSleep.getText().trim().length() > 0 && Util.isDouble(beforeSleep.getText().trim())) == false) {
            messages.add("Before Sleep measure not valid");

        }
        if ((suddenDrop.getText().trim().length() > 0 && Util.isDouble(suddenDrop.getText().trim())) == false) {
            messages.add("Sudden drop  measure not valid");

        }
        if (messages.size() > 0) {
            throw new CustomException(messages);
        }
    }

    private void reset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addNewValuesIntoUserObject() {

        Util.currentLoginUser.getDailyMeasurement().remove(userDailyMeasurement);
        if (userDailyMeasurement.getMeasurement() == null) {
            userDailyMeasurement = new UserInfo.DailyMeasurement();
            userDailyMeasurement.setMeasurementDate(Util.dateToXMLGregorianCalendar(new Date()));
        }
        userDailyMeasurement.getMeasurement().clear();
        userDailyMeasurement.setMeasurementDate(Util.dateToXMLGregorianCalendar(new Date()));
        if ((beforeBreakFast.getText().trim().length() > 0)) {
            userDailyMeasurement.getMeasurement().add(new Users.UserInfo.DailyMeasurement.Measurement(Util.beforeBreakfast, Double.parseDouble(beforeBreakFast.getText().trim())));
        }
        if ((breakfast.getText().trim().length() > 0)) {
            userDailyMeasurement.getMeasurement().add(new Users.UserInfo.DailyMeasurement.Measurement(Util.breakfast, Double.parseDouble(breakfast.getText().trim())));
        }

        if ((lunch.getText().trim().length() > 0)) {
            userDailyMeasurement.getMeasurement().add(new Users.UserInfo.DailyMeasurement.Measurement(Util.lunch, Double.parseDouble(lunch.getText().trim())));
        }

        if ((diner.getText().trim().length() > 0)) {
            userDailyMeasurement.getMeasurement().add(new Users.UserInfo.DailyMeasurement.Measurement(Util.dinner, Double.parseDouble(diner.getText().trim())));
        }

        if ((beforeSleep.getText().trim().length() > 0)) {
            userDailyMeasurement.getMeasurement().add(new Users.UserInfo.DailyMeasurement.Measurement(Util.beforeSleep, Double.parseDouble(beforeSleep.getText().trim())));
        }
        if ((suddenDrop.getText().trim().length() > 0)) {
            userDailyMeasurement.getMeasurement().add(new Users.UserInfo.DailyMeasurement.Measurement(Util.suddenDrop, Double.parseDouble(suddenDrop.getText().trim())));
        }

    }

    private void startAlertThread() {

        Util.restartThread(alertThread);
    }

    private void persistObjectIntoDataBase() {
        Util.currentLoginUser.getDailyMeasurement().remove(userDailyMeasurement);
        Util.currentLoginUser.getDailyMeasurement().add(userDailyMeasurement);
        userBusiness.saveUsersBackIntoFile();
    }

    private void popUpMeasurementChanges() {

        MeasurementsInfo measurementBeforeEditing = userBusiness.getMeasurementsInfo(Util.currentLoginUser);
        double measurementAvarageBeforeEditing = measurementBeforeEditing.getMeasurementsAvarage();

        List<UserInfo.DailyMeasurement> cloneCurrentUserMeasurements = cloneCurrentUserMeasurements();

        addNewValuesIntoUserObject();

        MeasurementsInfo measurementAfter = userBusiness.getMeasurementsInfo(Util.currentLoginUser);

        if ((totalformMeasurementBeforeEdition != measurementAfter.getTotal())) {
            double addedValue = measurementAfter.getTotal() - measurementBeforeEditing.getTotal();
            double variation = addedValue - measurementAvarageBeforeEditing;
            if (variation > 0) {
                Util.displayMessage(this, String.format("Last measurement is over avarage by %s %%", Math.abs(variation)));
            } else {
                Util.displayMessage(this, String.format("Last measurement is lower avarage by %s %%", Math.abs(variation)));
            }

        } else {
            Util.displayDialogMessage(this, String.format("Your measurements are in avarage"));

        }
        Util.currentLoginUser.setDailyMeasurement(cloneCurrentUserMeasurements);

        userDailyMeasurement = userBusiness.extractToDayUserDailyMeasurement();

    }

    private List<UserInfo.DailyMeasurement> cloneCurrentUserMeasurements() {

        UserInfo userInfo = (UserInfo) Util.currentLoginUser.clone();
        return userInfo.getDailyMeasurement();
    }

    private Map<String, String> doCheckesAndFetchResults() {

        return userBusiness.getModificationResults(beforeBreakFast.getText(), breakfast.getText(), lunch.getText(), diner.getText(), beforeSleep.getText(), suddenDrop.getText());

    }

}
