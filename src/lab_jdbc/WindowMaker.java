package lab_jdbc;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
/*import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.util.logging.Level;
 import java.util.logging.Logger;*/
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class WindowMaker extends javax.swing.JFrame {

    String result = new String();
    //private Object dataBase;
    public DataBaseHandler dataBase;

    public WindowMaker() {
        dataBase = new DataBaseHandler();
        initComponents();
        myInitComponents();

    }

    @SuppressWarnings({"unchecked", "Convert2Lambda"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbWhichBody = new javax.swing.ButtonGroup();
        rbGender = new javax.swing.ButtonGroup();
        pMainPanel = new javax.swing.JTabbedPane();
        pAsk = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pCalendar = new javax.swing.JPanel();
        lChooseDay = new javax.swing.JLabel();
        jCalendar = new com.toedter.calendar.JCalendar();
        pDailyUpdate = new javax.swing.JTabbedPane();
        pDailyDiet = new javax.swing.JPanel();
        pDailyTraining = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblExercises = new javax.swing.JTable();
        bSubmitSet = new javax.swing.JButton();
        lTrening = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        eTrainingName = new javax.swing.JTextField();
        cbChooseBodyPart = new javax.swing.JComboBox();
        lWhichBodyPart = new javax.swing.JLabel();
        cbChooseExercise = new javax.swing.JComboBox();
        lChooseExercise = new javax.swing.JLabel();
        sSetWeight = new javax.swing.JSpinner();
        sReps = new javax.swing.JSpinner();
        lSetWeight = new javax.swing.JLabel();
        lReps = new javax.swing.JLabel();
        jSubmitTraining = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pDailyMeasurement = new javax.swing.JPanel();
        lWeight = new javax.swing.JLabel();
        lWaist = new javax.swing.JLabel();
        lBiceps = new javax.swing.JLabel();
        lChest = new javax.swing.JLabel();
        lThigh = new javax.swing.JLabel();
        lCalf = new javax.swing.JLabel();
        lForearm = new javax.swing.JLabel();
        sWeight = new javax.swing.JSpinner();
        sBiceps = new javax.swing.JSpinner();
        sWaist = new javax.swing.JSpinner();
        sChest = new javax.swing.JSpinner();
        sThigh = new javax.swing.JSpinner();
        sCalf = new javax.swing.JSpinner();
        sForearm = new javax.swing.JSpinner();
        bSubmitDailyMeasurement = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        pAccount = new javax.swing.JTabbedPane();
        pTarget = new javax.swing.JPanel();
        bAdvanced = new javax.swing.JToggleButton();
        pAdvanced = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sTargetWeight = new javax.swing.JSpinner();
        sTargetBiceps = new javax.swing.JSpinner();
        sTargetWaist = new javax.swing.JSpinner();
        sTargetChest = new javax.swing.JSpinner();
        sTargetThigh = new javax.swing.JSpinner();
        sTargetCalf = new javax.swing.JSpinner();
        sTargetForearm = new javax.swing.JSpinner();
        bSubmitTarget = new javax.swing.JButton();
        iPudzian = new javax.swing.JLabel();
        iArnold = new javax.swing.JLabel();
        lChudzian = new javax.swing.JLabel();
        lSportowiec = new javax.swing.JLabel();
        lOwcaWK = new javax.swing.JLabel();
        lPudzian = new javax.swing.JLabel();
        lArnold = new javax.swing.JLabel();
        rbChudzian = new javax.swing.JRadioButton();
        rbChudzian.setVisible(false);
        rbOwcaWK = new javax.swing.JRadioButton();
        rbOwcaWK.setVisible(false);
        rbSportowiec = new javax.swing.JRadioButton();
        rbSportowiec.setVisible(false);

        rbPudzian = new javax.swing.JRadioButton();
        rbPudzian.setVisible(false);
        rbArnold = new javax.swing.JRadioButton();
        rbArnold.setVisible(false);
        iOwcaWK = new javax.swing.JLabel();
        iSportowiec = new javax.swing.JLabel();
        iChudzian = new javax.swing.JLabel();
        pPrivate = new javax.swing.JPanel();
        eFirstName = new javax.swing.JTextField();
        eLastName = new javax.swing.JTextField();
        eBirthDate = new com.toedter.calendar.JDateChooser();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        eHeight = new javax.swing.JSpinner();
        eBodyFat = new javax.swing.JSpinner();
        eNeed = new javax.swing.JSpinner();
        iBodyFat = new javax.swing.JLabel();
        bBodyFat = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bSubmitPrivate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setLocation(new java.awt.Point(10, 10));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 476));

        pMainPanel.setBackground(new java.awt.Color(153, 204, 255));
        pMainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pMainPanel.setToolTipText("");
        pMainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pMainPanel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pMainPanel.setMaximumSize(new java.awt.Dimension(900, 476));
        pMainPanel.setMinimumSize(new java.awt.Dimension(900, 476));
        pMainPanel.setPreferredSize(new java.awt.Dimension(900, 476));

        pAsk.setBackground(new java.awt.Color(153, 204, 255));
        pAsk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("jLabel2");

        jLabel4.setText("jLabel2");

        javax.swing.GroupLayout pAskLayout = new javax.swing.GroupLayout(pAsk);
        pAsk.setLayout(pAskLayout);
        pAskLayout.setHorizontalGroup(
            pAskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAskLayout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(147, 147, 147)
                .addComponent(jLabel4)
                .addGap(352, 352, 352))
        );
        pAskLayout.setVerticalGroup(
            pAskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAskLayout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addGroup(pAskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pMainPanel.addTab("", pAsk);

        pCalendar.setBackground(new java.awt.Color(153, 204, 255));
        pCalendar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pCalendar.setForeground(new java.awt.Color(153, 204, 255));
        pCalendar.setToolTipText("");
        pCalendar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lChooseDay.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lChooseDay.setText("Wybierz dzień w kalendarzu");

        jCalendar.setBackground(new java.awt.Color(255, 255, 255));
        jCalendar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCalendar.setDecorationBackgroundColor(new java.awt.Color(255, 255, 255));
        jCalendar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jCalendar.setWeekOfYearVisible(false);
        jCalendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarPropertyChange(evt);
            }
        });

        pDailyUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pDailyUpdate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pDailyUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pDailyUpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pDailyDietLayout = new javax.swing.GroupLayout(pDailyDiet);
        pDailyDiet.setLayout(pDailyDietLayout);
        pDailyDietLayout.setHorizontalGroup(
            pDailyDietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pDailyDietLayout.setVerticalGroup(
            pDailyDietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pDailyUpdate.addTab("Dieta", pDailyDiet);

        tblExercises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "asd",  new Integer(12),  new Integer(4)},
                { new Integer(2), "dsa",  new Integer(12), null}
            },
            new String [] {
                "Nr", "Ćwiczenie", "Obciążenie", "Liczba Powt."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblExercises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblExercisesMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblExercises);

        bSubmitSet.setText("Dodaj serię //TODO");
        bSubmitSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitSetActionPerformed(evt);
            }
        });

        lTrening.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lTrening.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTrening.setText("Uzupełnij swój dzisiejszy trening");

        jLabel1.setText("Nazwa treningu");

        cbChooseBodyPart.setModel(new javax.swing.DefaultComboBoxModel(initCbChooseBodyPart()));
        cbChooseBodyPart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChooseBodyPartActionPerformed(evt);
            }
        });

        lWhichBodyPart.setText("Wybierz partię ciała");

        cbChooseExercise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--wybierz partię--" }));
        cbChooseExercise.setEnabled(false);
        cbChooseExercise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChooseExerciseActionPerformed(evt);
            }
        });

        lChooseExercise.setForeground(new java.awt.Color(102, 102, 102));
        lChooseExercise.setText("Wybierz ćwiczenie");

        sSetWeight.setEnabled(false);

        sReps.setEnabled(false);

        lSetWeight.setForeground(new java.awt.Color(102, 102, 102));
        lSetWeight.setText("Obciążenie");

        lReps.setForeground(new java.awt.Color(102, 102, 102));
        lReps.setText("Liczba powtórzeń");

        jSubmitTraining.setText("Zatwierdź zmiany //TODO");
        jSubmitTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitTrainingActionPerformed(evt);
            }
        });

        jButton2.setText("Zmień nazwę//TODO");

        javax.swing.GroupLayout pDailyTrainingLayout = new javax.swing.GroupLayout(pDailyTraining);
        pDailyTraining.setLayout(pDailyTrainingLayout);
        pDailyTrainingLayout.setHorizontalGroup(
            pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDailyTrainingLayout.createSequentialGroup()
                .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDailyTrainingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lTrening, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pDailyTrainingLayout.createSequentialGroup()
                        .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lWhichBodyPart, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addComponent(cbChooseBodyPart, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbChooseExercise, 0, 162, Short.MAX_VALUE)
                                .addComponent(lChooseExercise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(39, 39, 39)
                        .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lSetWeight)
                            .addComponent(sSetWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lReps)
                            .addComponent(sReps, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 42, Short.MAX_VALUE)
                        .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bSubmitSet, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pDailyTrainingLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(eTrainingName, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))))
                        .addGap(11, 11, 11))
                    .addGroup(pDailyTrainingLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pDailyTrainingLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jSubmitTraining, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pDailyTrainingLayout.setVerticalGroup(
            pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDailyTrainingLayout.createSequentialGroup()
                .addComponent(lTrening, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eTrainingName))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDailyTrainingLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lWhichBodyPart, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lSetWeight, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbChooseBodyPart, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(sSetWeight)
                    .addComponent(jButton2))
                .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDailyTrainingLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lChooseExercise)
                            .addComponent(lReps))
                        .addGap(19, 19, 19)
                        .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbChooseExercise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sReps, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pDailyTrainingLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bSubmitSet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSubmitTraining, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pDailyUpdate.addTab("Trening", pDailyTraining);

        lWeight.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lWeight.setText("Waga");

        lWaist.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lWaist.setText("Pas");

        lBiceps.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lBiceps.setText("Biceps");

        lChest.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lChest.setText("Klatka");

        lThigh.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lThigh.setText("Udo");

        lCalf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lCalf.setText("Łydka");

        lForearm.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lForearm.setText("Przedramię");

        sWeight.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sBiceps.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sWaist.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sChest.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sThigh.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sCalf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sForearm.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        bSubmitDailyMeasurement.setText("Zatwierdź");
        bSubmitDailyMeasurement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitDailyMeasurementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pDailyMeasurementLayout = new javax.swing.GroupLayout(pDailyMeasurement);
        pDailyMeasurement.setLayout(pDailyMeasurementLayout);
        pDailyMeasurementLayout.setHorizontalGroup(
            pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(sThigh, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDailyMeasurementLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lThigh)
                        .addGap(46, 46, 46)))
                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                        .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lWaist)
                            .addComponent(sWaist, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(sCalf, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(lCalf)))
                        .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                                        .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sBiceps, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lBiceps))
                                        .addGap(65, 65, 65)
                                        .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lChest)
                                            .addComponent(sChest, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(sForearm, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(lForearm))))
                    .addComponent(bSubmitDailyMeasurement, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pDailyMeasurementLayout.setVerticalGroup(
            pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lWaist, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBiceps, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lChest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sBiceps, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sWaist, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sChest, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lThigh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCalf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lForearm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sThigh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sCalf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sForearm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(bSubmitDailyMeasurement, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pDailyUpdate.addTab("Pomiary", pDailyMeasurement);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.getAccessibleContext().setAccessibleDescription("");

        jButton1.setText("Read");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCalendarLayout = new javax.swing.GroupLayout(pCalendar);
        pCalendar.setLayout(pCalendarLayout);
        pCalendarLayout.setHorizontalGroup(
            pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCalendarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lChooseDay, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pDailyUpdate)
                .addContainerGap())
        );
        pCalendarLayout.setVerticalGroup(
            pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCalendarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCalendarLayout.createSequentialGroup()
                        .addComponent(lChooseDay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pDailyUpdate))
                .addContainerGap())
        );

        pMainPanel.addTab("", pCalendar);

        pAccount.setName("pAccount"); // NOI18N

        bAdvanced.setText("Zaawansowane");
        bAdvanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdvancedActionPerformed(evt);
            }
        });

        pAdvanced.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("Waga");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("Pas");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setText("Biceps");

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel15.setText("Klatka");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel16.setText("Udo");

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel17.setText("Łydka");

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel18.setText("Przedramię");

        sTargetWeight.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetBiceps.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetWaist.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetChest.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetThigh.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetCalf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetForearm.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout pAdvancedLayout = new javax.swing.GroupLayout(pAdvanced);
        pAdvanced.setLayout(pAdvancedLayout);
        pAdvancedLayout.setHorizontalGroup(
            pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAdvancedLayout.createSequentialGroup()
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(sTargetThigh, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sTargetCalf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(sTargetForearm, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sTargetChest, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdvancedLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(8, 8, 8)))
                .addGap(63, 63, 63)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sTargetBiceps)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sTargetWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sTargetWaist, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdvancedLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(23, 23, 23)))
                .addGap(30, 30, 30))
        );
        pAdvancedLayout.setVerticalGroup(
            pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAdvancedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sTargetWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sTargetWaist, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pAdvancedLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sTargetBiceps, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pAdvancedLayout.createSequentialGroup()
                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sTargetChest, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sTargetThigh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sTargetCalf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sTargetForearm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        bSubmitTarget.setText("Zatwierdź");
        bSubmitTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitTargetActionPerformed(evt);
            }
        });

        iPudzian.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\pudzian.jpg")); // NOI18N
        iPudzian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        iPudzian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iPudzian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iPudzianMouseReleased(evt);
            }
        });

        iArnold.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\arnold.jpg")); // NOI18N
        iArnold.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iArnold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iArnoldMouseReleased(evt);
            }
        });

        lChudzian.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lChudzian.setText("Chudzian");

        lSportowiec.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lSportowiec.setText("Sportowiec");

        lOwcaWK.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lOwcaWK.setText("Warszawski Koks");

        lPudzian.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lPudzian.setText("Pudzian");

        lArnold.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lArnold.setText("Mr. Olympia");

        rbWhichBody.add(rbChudzian);
        rbChudzian.setText("jRadioButton1");
        rbChudzian.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbChudzianStateChanged(evt);
            }
        });

        rbWhichBody.add(rbOwcaWK);
        rbOwcaWK.setText("jRadioButton3");
        rbOwcaWK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbOwcaWKStateChanged(evt);
            }
        });

        rbWhichBody.add(rbSportowiec);
        rbSportowiec.setText("jRadioButton2");
        rbSportowiec.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbSportowiecStateChanged(evt);
            }
        });

        rbWhichBody.add(rbPudzian);
        rbPudzian.setSelected(true);
        rbPudzian.setText("jRadioButton4");
        rbPudzian.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbPudzianStateChanged(evt);
            }
        });

        rbWhichBody.add(rbArnold);
        rbArnold.setText("jRadioButton5");
        rbArnold.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbArnoldStateChanged(evt);
            }
        });

        iOwcaWK.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\owcawk.jpg")); // NOI18N
        iOwcaWK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iOwcaWK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iOwcaWKMouseReleased(evt);
            }
        });

        iSportowiec.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\sportowiec.jpg")); // NOI18N
        iSportowiec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iSportowiec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iSportowiecMouseReleased(evt);
            }
        });

        iChudzian.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\chudzian.jpg")); // NOI18N
        iChudzian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iChudzian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iChudzianMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pTargetLayout = new javax.swing.GroupLayout(pTarget);
        pTarget.setLayout(pTargetLayout);
        pTargetLayout.setHorizontalGroup(
            pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTargetLayout.createSequentialGroup()
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lChudzian)
                        .addGap(90, 90, 90)
                        .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iOwcaWK, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pTargetLayout.createSequentialGroup()
                                .addComponent(lSportowiec)
                                .addGap(75, 75, 75)
                                .addComponent(lOwcaWK)))
                        .addGap(80, 80, 80)
                        .addComponent(lPudzian, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(bSubmitTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pAdvanced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pTargetLayout.createSequentialGroup()
                                .addComponent(iChudzian, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(iSportowiec, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bAdvanced)
                        .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pTargetLayout.createSequentialGroup()
                                .addGap(410, 410, 410)
                                .addComponent(iPudzian, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iArnold)
                                    .addGroup(pTargetLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(lArnold))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTargetLayout.createSequentialGroup()
                                .addGap(440, 440, 440)
                                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pTargetLayout.createSequentialGroup()
                                        .addComponent(rbSportowiec)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbArnold))
                                    .addGroup(pTargetLayout.createSequentialGroup()
                                        .addComponent(rbPudzian)
                                        .addGap(93, 93, 93)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbChudzian)
                                    .addComponent(rbOwcaWK))
                                .addGap(10, 10, 10)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pTargetLayout.setVerticalGroup(
            pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTargetLayout.createSequentialGroup()
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addComponent(rbSportowiec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbPudzian))
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbArnold)
                            .addComponent(bAdvanced)))
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rbOwcaWK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbChudzian)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSubmitTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lChudzian)
                    .addComponent(lSportowiec)
                    .addComponent(lOwcaWK)
                    .addComponent(lPudzian)
                    .addComponent(lArnold))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(iSportowiec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iOwcaWK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(iArnold)
                        .addComponent(iPudzian))
                    .addComponent(iChudzian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(pAdvanced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pAccount.addTab("Edytuj swój cel", pTarget);

        eLastName.setToolTipText("");

        rbGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rbMale.setSelected(true);
        rbMale.setText("Mężczyzna");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });

        rbGender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rbFemale.setText("Kobieta");

        eHeight.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        eBodyFat.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        eNeed.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        iBodyFat.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\bodyfat.jpg")); // NOI18N

        bBodyFat.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        bBodyFat.setText("Co to?");
        bBodyFat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBodyFatActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Imię");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Nazwisko");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Data urodzenia");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Wzrost");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Zapotrzebowanie kcal");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Bodyfat %");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("cm");

        bSubmitPrivate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        bSubmitPrivate.setText("Zatwierdź zmiany");
        bSubmitPrivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitPrivateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pPrivateLayout = new javax.swing.GroupLayout(pPrivate);
        pPrivate.setLayout(pPrivateLayout);
        pPrivateLayout.setHorizontalGroup(
            pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrivateLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addComponent(rbMale)
                        .addGap(18, 18, 18)
                        .addComponent(rbFemale))
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(eFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                            .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(eBirthDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                            .addGroup(pPrivateLayout.createSequentialGroup()
                                .addComponent(eHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bSubmitPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(eNeed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pPrivateLayout.createSequentialGroup()
                                .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(eBodyFat, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bBodyFat)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(iBodyFat, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        pPrivateLayout.setVerticalGroup(
            pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrivateLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eNeed, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(bBodyFat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eBodyFat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(11, 11, 11)
                        .addComponent(eBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbMale)
                            .addComponent(rbFemale))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eHeight, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(bSubmitPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrivateLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(iBodyFat, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pAccount.addTab("Edytuj dane osobowe", pPrivate);

        pMainPanel.addTab("", pAccount);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSubmitDailyMeasurementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitDailyMeasurementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSubmitDailyMeasurementActionPerformed

    private void bSubmitTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitTargetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSubmitTargetActionPerformed

    private void bAdvancedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdvancedActionPerformed
        boolean flag = true;
        if (bAdvanced.isSelected()) {
            flag = true;
        } else {
            flag = false;
        }
        pAdvanced.setVisible(flag);
    }//GEN-LAST:event_bAdvancedActionPerformed

    private void rbChudzianStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbChudzianStateChanged
        if (rbChudzian.isSelected()) {
            iChudzian.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED));
            sTargetBiceps.setValue(25);
            sTargetCalf.setValue(20);
            sTargetChest.setValue(70);
            sTargetForearm.setValue(20);
            sTargetThigh.setValue(30);
            sTargetWaist.setValue(50);
            sTargetWeight.setValue(45);
        } else {
            iChudzian.setBorder(null);
        }
    }//GEN-LAST:event_rbChudzianStateChanged

    private void rbSportowiecStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbSportowiecStateChanged
        if (rbSportowiec.isSelected()) {
            iSportowiec.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED));
            sTargetBiceps.setValue(40);
            sTargetCalf.setValue(40);
            sTargetChest.setValue(111);
            sTargetForearm.setValue(33);
            sTargetThigh.setValue(60);
            sTargetWaist.setValue(83);
            sTargetWeight.setValue(75);
        } else {
            iSportowiec.setBorder(null);
        }
    }//GEN-LAST:event_rbSportowiecStateChanged

    private void rbOwcaWKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbOwcaWKStateChanged
        if (rbOwcaWK.isSelected()) {
            iOwcaWK.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED));
            sTargetBiceps.setValue(45);
            sTargetCalf.setValue(42);
            sTargetChest.setValue(120);
            sTargetForearm.setValue(40);
            sTargetThigh.setValue(65);
            sTargetWaist.setValue(85);
            sTargetWeight.setValue(95);
        } else {
            iOwcaWK.setBorder(null);
        }
    }//GEN-LAST:event_rbOwcaWKStateChanged

    private void iPudzianMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iPudzianMouseReleased
        boolean flag = true;
        rbPudzian.setSelected(flag);
    }//GEN-LAST:event_iPudzianMouseReleased

    private void iArnoldMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iArnoldMouseReleased
        boolean flag = true;
        rbArnold.setSelected(flag);
    }//GEN-LAST:event_iArnoldMouseReleased

    private void iOwcaWKMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iOwcaWKMouseReleased
        boolean flag = true;
        rbOwcaWK.setSelected(flag);
    }//GEN-LAST:event_iOwcaWKMouseReleased

    private void iSportowiecMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iSportowiecMouseReleased
        boolean flag = true;
        rbSportowiec.setSelected(flag);
    }//GEN-LAST:event_iSportowiecMouseReleased

    private void iChudzianMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iChudzianMouseReleased
        boolean flag = true;
        rbChudzian.setSelected(flag);
    }//GEN-LAST:event_iChudzianMouseReleased

    private void rbPudzianStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbPudzianStateChanged
        if (rbPudzian.isSelected()) {
            iPudzian.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED));
            sTargetBiceps.setValue(56);
            sTargetCalf.setValue(50);
            sTargetChest.setValue(148);
            sTargetForearm.setValue(45);
            sTargetThigh.setValue(80);
            sTargetWaist.setValue(92);
            sTargetWeight.setValue(142);
        } else {
            iPudzian.setBorder(null);
        }
    }//GEN-LAST:event_rbPudzianStateChanged

    private void rbArnoldStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbArnoldStateChanged
        if (rbArnold.isSelected()) {
            iArnold.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED));
            sTargetBiceps.setValue(56);
            sTargetCalf.setValue(51);
            sTargetChest.setValue(147);
            sTargetForearm.setValue(45);
            sTargetThigh.setValue(73);
            sTargetWaist.setValue(86);
            sTargetWeight.setValue(115);
        } else {
            iArnold.setBorder(null);
        }
    }//GEN-LAST:event_rbArnoldStateChanged

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void bBodyFatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBodyFatActionPerformed
        boolean flag = true;
        if (bBodyFat.isSelected()) {
            flag = true;
        } else {
            flag = false;
        }

        iBodyFat.setVisible(flag);
    }//GEN-LAST:event_bBodyFatActionPerformed

    private void bSubmitPrivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitPrivateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSubmitPrivateActionPerformed

    private void printArray(ArrayList<String> list) {
        //System.out.println("list.size()");
        //System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("CLICK");
        String wynik = new String();
        wynik = dataBase.getAnswer("select * from cwiczenie");
        @SuppressWarnings("Convert2Diamond")
        ArrayList<String> list = dataBase.getAnswerList("select nazwa from cwiczenie");
        //ArrayList<String> list = new ArrayList<String>();
        //list = dataBase.getAnswerList("select nazwa from cwiczenie");

        System.out.println("WINDOWMAKER:");
        printArray(list);
        //System.out.println(wynik);
        jTextArea1.setText(wynik);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbChooseBodyPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChooseBodyPartActionPerformed
        String part = cbChooseBodyPart.getSelectedItem().toString();
        // initCbChooseExercise(part)
        cbChooseExercise.setEnabled(true);
        lChooseExercise.setForeground(Color.black);
        cbChooseExercise.setModel(new javax.swing.DefaultComboBoxModel(initCbChooseExercise(part)));
    }//GEN-LAST:event_cbChooseBodyPartActionPerformed

    private void cbChooseExerciseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChooseExerciseActionPerformed
        lSetWeight.setForeground(Color.black);
        lReps.setForeground(Color.black);
        sSetWeight.setEnabled(true);
        sReps.setEnabled(true);
    }//GEN-LAST:event_cbChooseExerciseActionPerformed

    private void bSubmitSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitSetActionPerformed
        //insert wszystko
        if (isReadyToSubmit()) {
            jTextArea1.setText("SUBMIT!");
        } else {
            jTextArea1.setText("NOPE!");
        }

        DefaultTableModel table = (DefaultTableModel) tblExercises.getModel();

        //czyszcze tabele
        table.setRowCount(0);
        @SuppressWarnings("UseOfObsoleteCollectionType")

        Vector vector = new Vector();
        vector.add(1);
        vector.add("asd");
        vector.add(2);
        vector.add(3);
        table.addRow(vector);

        /*
         na klik dodajemy do bazy danych i odświeżamy listę na tabelce, czyli usuwamy wszystkie wiersze i dodajemy je na nowo
         */
    }//GEN-LAST:event_bSubmitSetActionPerformed

    private void pDailyUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDailyUpdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pDailyUpdateMouseClicked

    private void fillTable(String date) {
        String dateString = date;
        System.out.println(dateString);
        String query = new String();
        query = "SELECT `NR`, `CWICZENIE`, `OBCIAZENIE`, `LICZBA_POWT` FROM `seria` WHERE data_treningu = " + dateString;

        @SuppressWarnings({"UseOfObsoleteCollectionType", "Convert2Diamond"})
        ArrayList<Vector<String>> arrayList = new ArrayList<Vector<String>>();
        arrayList = dataBase.getAnswerListofVector(query);

        DefaultTableModel table = (DefaultTableModel) tblExercises.getModel();
        table.setRowCount(0);

        for (int i = 0; i < arrayList.size(); i++) {
            @SuppressWarnings({"UseOfObsoleteCollectionType", "MismatchedQueryAndUpdateOfCollection"})
            Vector subVector = new Vector();
            for (int j = 0; j < arrayList.get(i).size(); j++) {
                subVector.add(arrayList.get(i).get(j));
            }
            table.addRow(subVector);

        }
        /*@SuppressWarnings("UseOfObsoleteCollectionType")
         Vector vector = new Vector();
         vector.add(1);
         vector.add("asd");
         vector.add(2);
         vector.add(3);
         table.addRow(vector);
         */
    }

    public enum Month {

        Jan("Jan"),
        Feb("Feb"),
        Mar("Mar"),
        Apr("Apr"),
        May("May"),
        Jun("Jun"),
        Jul("Jul"),
        Aug("Aug"),
        Sep("Sep"),
        Oct("Oct"),
        Nov("Nov"),
        Dec("Dec");

        private String text;

        Month(String text) {
            this.text = text;
        }

        public String getText() {
            return this.text;
        }

        public static Month fromString(String text) {
            if (text != null) {
                for (Month mon : Month.values()) {
                    if (text.equalsIgnoreCase(mon.text)) {
                        return mon;
                    }
                }
            }
            return null;
        }
    }

    private String castMonth(String month) {
        Month enumMonth = Month.fromString(month);
        System.out.println("wypluwam enummonth");
        System.out.println(enumMonth);
        //enumMonth
        String resultMonth = new String();
        switch (enumMonth) {
            case Jan:
                resultMonth = "01";
                break;
            case Feb:
                resultMonth = "02";
                break;
            case Mar:
                resultMonth = "03";
                break;
            case Apr:
                resultMonth = "04";
                break;
            case May:
                resultMonth = "05";
                break;
            case Jun:
                resultMonth = "06";
                break;
            case Jul:
                resultMonth = "07";
                break;
            case Aug:
                resultMonth = "08";
                break;
            case Sep:
                resultMonth = "09";
                break;
            case Oct:
                resultMonth = "10";
                break;
            case Nov:
                resultMonth = "11";
                break;
            case Dec:
                resultMonth = "12";
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }
        return resultMonth;
    }

    private String changeDateFormat(String date) {
        String resultDate = new String();

        String tmpDate = jCalendar.getDate().toString();
        System.out.println(tmpDate);
        String tmpYear = tmpDate.substring(tmpDate.length() - 4, tmpDate.length());
        String tmpMonth = castMonth(tmpDate.substring(4, 7));
        String tmpDay = tmpDate.substring(8, 10);
        resultDate = "'" + tmpYear + "-" + tmpMonth + "-" + tmpDay + "'";
        //System.out.println(tmpYear);

        //System.out.println(tmpDay);
        return resultDate; //resultDate
    }

    private void jCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarPropertyChange
        /*
         -opcjonalnie - jak nic nie ma to wyświetlamy komunikat, że nic nie ma
         kolorujemy te miejsca w kalendarzu, które mają jakiś trening lub dietę (obwódka i kolor)
         */
        System.out.println("ZACZYNAM PROPERTYCHANGE");
        String tmpDate = changeDateFormat(jCalendar.getDate().toString());
        
        String query = "select nazwa from trening where data_treningu like " + tmpDate;
        System.out.println(query);
        String trainingName = dataBase.getAnswer(query);
        System.out.println(trainingName);
        eTrainingName.setText(trainingName);

        System.out.println("KOŃCZĘ PROPERTYCHANGE");
        
        fillTable(tmpDate);
    }//GEN-LAST:event_jCalendarPropertyChange

    private void tblExercisesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExercisesMousePressed
        //List<Integer> colSize = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            System.out.print(i + ": ");
            System.out.print(tblExercises.getColumnModel().getColumn(i).getWidth());
            System.out.print("\t");
        }
        System.out.println("");
    }//GEN-LAST:event_tblExercisesMousePressed

    private void jSubmitTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitTrainingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSubmitTrainingActionPerformed

    private boolean isReadyToSubmit() {
        if ((Integer) sSetWeight.getValue() > 0 && (Integer) sReps.getValue() > 0) {
            return true;
        } else {
            return false;
        }
    }

    private String[] initCbChooseBodyPart() {
        @SuppressWarnings("Convert2Diamond")
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist = dataBase.getAnswerList("select distinct partia from cwiczenie");
        String[] list = new String[arraylist.size()];
        list = arraylist.toArray(list);
        return list;
    }

    private String[] initCbChooseExercise(String bodyPart) {
        String query = "'" + bodyPart + "'";
        @SuppressWarnings("Convert2Diamond")
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist = dataBase.getAnswerList("select nazwa from cwiczenie where partia like" + query);
        String[] list = new String[arraylist.size()];
        list = arraylist.toArray(list);
        return list;
    }

    private void initTblExercises(int[] columnSizes) {
        System.out.println("ustalam rozmiar tablicy");
        int columnCount = tblExercises.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            System.out.println(i + " = " + columnSizes[i]);
            tblExercises.getColumnModel().getColumn(i).setPreferredWidth(columnSizes[i]);
        }
    }

    private void myInitComponents() {
        // boolean fAdvanced = false;
        ImageIcon tab1 = new ImageIcon("img/b1.jpg");
        ImageIcon tab2 = new ImageIcon("img/b2.jpg");
        ImageIcon tab3 = new ImageIcon("img/b3.jpg");
        //jTabbedPane1.addTab("", jPanel2);
        //cbChooseExercise.setModel(new javax.swing.DefaultComboBoxModel(initCbChooseExercise()));
        pMainPanel.addTab("", tab1, pCalendar,
                "Does nothing");
        pMainPanel.addTab("", tab2, pAsk,
                "Does nothing");
        pMainPanel.addTab("", tab3, pAccount,
                "Does nothing");
        pAdvanced.setVisible(false);
        iBodyFat.setVisible(false);

        int sizes[] = {30, 150, 70, 70};
        initTblExercises(sizes);
        tblExercises.getColumnModel().getColumn(0).setPreferredWidth(10);
    }

    @SuppressWarnings({"Convert2Lambda", "static-access"})
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
            java.util.logging.Logger.getLogger(WindowMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        String tmp;

        /*try {
         tmp = dataBase.printResultSet(dataBase.rs);
         //jTextArea1.add(result, null);
         } catch (SQLException ex) {
         Logger.getLogger(WindowMaker.class.getName()).log(Level.SEVERE, null, ex);
         }*/
        //this.result = tmp;
        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new WindowMaker().setVisible(true);
            }
        });
        //
        //dataBase.closeEverything();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bAdvanced;
    private javax.swing.JToggleButton bBodyFat;
    private javax.swing.JButton bSubmitDailyMeasurement;
    private javax.swing.JButton bSubmitPrivate;
    private javax.swing.JButton bSubmitSet;
    private javax.swing.JButton bSubmitTarget;
    private javax.swing.JComboBox cbChooseBodyPart;
    private javax.swing.JComboBox cbChooseExercise;
    private com.toedter.calendar.JDateChooser eBirthDate;
    private javax.swing.JSpinner eBodyFat;
    private javax.swing.JTextField eFirstName;
    private javax.swing.JSpinner eHeight;
    private javax.swing.JTextField eLastName;
    private javax.swing.JSpinner eNeed;
    private javax.swing.JTextField eTrainingName;
    private javax.swing.JLabel iArnold;
    private javax.swing.JLabel iBodyFat;
    private javax.swing.JLabel iChudzian;
    private javax.swing.JLabel iOwcaWK;
    private javax.swing.JLabel iPudzian;
    private javax.swing.JLabel iSportowiec;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jSubmitTraining;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lArnold;
    private javax.swing.JLabel lBiceps;
    private javax.swing.JLabel lCalf;
    private javax.swing.JLabel lChest;
    private javax.swing.JLabel lChooseDay;
    private javax.swing.JLabel lChooseExercise;
    private javax.swing.JLabel lChudzian;
    private javax.swing.JLabel lForearm;
    private javax.swing.JLabel lOwcaWK;
    private javax.swing.JLabel lPudzian;
    private javax.swing.JLabel lReps;
    private javax.swing.JLabel lSetWeight;
    private javax.swing.JLabel lSportowiec;
    private javax.swing.JLabel lThigh;
    private javax.swing.JLabel lTrening;
    private javax.swing.JLabel lWaist;
    private javax.swing.JLabel lWeight;
    private javax.swing.JLabel lWhichBodyPart;
    private javax.swing.JTabbedPane pAccount;
    private javax.swing.JPanel pAdvanced;
    private javax.swing.JPanel pAsk;
    private javax.swing.JPanel pCalendar;
    private javax.swing.JPanel pDailyDiet;
    private javax.swing.JPanel pDailyMeasurement;
    private javax.swing.JPanel pDailyTraining;
    private javax.swing.JTabbedPane pDailyUpdate;
    private javax.swing.JTabbedPane pMainPanel;
    private javax.swing.JPanel pPrivate;
    private javax.swing.JPanel pTarget;
    private javax.swing.JRadioButton rbArnold;
    private javax.swing.JRadioButton rbChudzian;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.ButtonGroup rbGender;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JRadioButton rbOwcaWK;
    private javax.swing.JRadioButton rbPudzian;
    private javax.swing.JRadioButton rbSportowiec;
    private javax.swing.ButtonGroup rbWhichBody;
    private javax.swing.JSpinner sBiceps;
    private javax.swing.JSpinner sCalf;
    private javax.swing.JSpinner sChest;
    private javax.swing.JSpinner sForearm;
    private javax.swing.JSpinner sReps;
    private javax.swing.JSpinner sSetWeight;
    private javax.swing.JSpinner sTargetBiceps;
    private javax.swing.JSpinner sTargetCalf;
    private javax.swing.JSpinner sTargetChest;
    private javax.swing.JSpinner sTargetForearm;
    private javax.swing.JSpinner sTargetThigh;
    private javax.swing.JSpinner sTargetWaist;
    private javax.swing.JSpinner sTargetWeight;
    private javax.swing.JSpinner sThigh;
    private javax.swing.JSpinner sWaist;
    private javax.swing.JSpinner sWeight;
    private javax.swing.JTable tblExercises;
    // End of variables declaration//GEN-END:variables
}
