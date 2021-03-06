package sidlo64.translatorsHelper;

import java.awt.Cursor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileSystemView;

/**
 * Translators Helper.
 * For JMRI project.
 * It scans the properties files and looks for untranslated keys. 
 *
 * @author Petr Šídlo (c) 2021
 */
public class TranslatorsHelper extends javax.swing.JFrame {
    
    private File startDirectory ;
    private TableFile tableFile ;
    private CbmLanguage cbmLanguage ;
    private TableLanguage tableLanguage ;

    /**
     * Creates new form.
     */
    public TranslatorsHelper() {
        initComponents();
        
        URL iconURL = getClass().getResource("/sidlo64/translatorsHelper/jmri32x32.gif");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());

        startDirectory = FileSystemView.getFileSystemView().getHomeDirectory() ;
        jTFstartDirectory.setText(startDirectory.getAbsolutePath());
        
        cbmLanguage = new CbmLanguage() ;
        JLabel l = new JLabel("X") ;
        jCBlanguage.setRenderer(new LanguageRenderer());
        
        jTfiles.setRowHeight(l.getPreferredSize().height);
        
        tableFile = new TableFile(cbmLanguage) ;
        jTfiles.setModel(tableFile);
        tableFile.setColumns(jTfiles);
        tableFile.fireTableDataChanged();
        
        jTlanguages.setRowHeight(l.getPreferredSize().height);
        
        tableLanguage = new TableLanguage(cbmLanguage) ;
        jTlanguages.setModel(tableLanguage);
        tableLanguage.setColumns(jTlanguages);
        tableLanguage.fireTableDataChanged();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        fc = new javax.swing.JFileChooser();
        jToolBar1 = new javax.swing.JToolBar();
        jBopen = new javax.swing.JButton();
        jBrun = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTFtotalKeys = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTlanguages = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTfiles = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jCBlanguage = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFstartDirectory = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Translators Helper");
        setMinimumSize(new java.awt.Dimension(600, 356));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jBopen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sidlo64/translatorsHelper/folder.png"))); // NOI18N
        jBopen.setToolTipText("Open directory");
        jBopen.setBorderPainted(false);
        jBopen.setContentAreaFilled(false);
        jBopen.setFocusable(false);
        jBopen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBopen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBopen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBopenMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBopenMouseEntered(evt);
            }
        });
        jBopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBopenActionPerformed(evt);
            }
        });
        jToolBar1.add(jBopen);

        jBrun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sidlo64/translatorsHelper/runProject.png"))); // NOI18N
        jBrun.setToolTipText("Run");
        jBrun.setBorderPainted(false);
        jBrun.setContentAreaFilled(false);
        jBrun.setFocusable(false);
        jBrun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBrun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBrun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBrunMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBrunMouseEntered(evt);
            }
        });
        jBrun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrunActionPerformed(evt);
            }
        });
        jToolBar1.add(jBrun);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jToolBar1, gridBagConstraints);

        jTFtotalKeys.setEditable(false);
        jTFtotalKeys.setText("0");

        jLabel3.setText("Total keys:");

        jTlanguages.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTlanguages);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFtotalKeys))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFtotalKeys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Languages", jPanel2);

        jTfiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTfiles);

        jLabel2.setText("Localization:");

        jCBlanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBlanguageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBlanguage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBlanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Files", jPanel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jTabbedPane1, gridBagConstraints);
        jTabbedPane1.getAccessibleContext().setAccessibleName("Pane1");

        jLabel1.setText("Start directory:");

        jTFstartDirectory.setToolTipText("Enter JMRI/java/src directory");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFstartDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFstartDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel4, gridBagConstraints);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Open directory");
        jMenuItem1.setToolTipText("");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem2.setText("Run");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBopenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBopenMouseEntered
        jBopen.setContentAreaFilled(true);
    }//GEN-LAST:event_jBopenMouseEntered

    private void jBopenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBopenMouseExited
        jBopen.setContentAreaFilled(false);
    }//GEN-LAST:event_jBopenMouseExited

    private void jBrunMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBrunMouseEntered
        jBrun.setContentAreaFilled(true);
    }//GEN-LAST:event_jBrunMouseEntered

    private void jBrunMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBrunMouseExited
        jBrun.setContentAreaFilled(false);
    }//GEN-LAST:event_jBrunMouseExited

    private void jBopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBopenActionPerformed
        openDirectory() ;

    }//GEN-LAST:event_jBopenActionPerformed

    private void jBrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrunActionPerformed
        calculation() ;
    }//GEN-LAST:event_jBrunActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        openDirectory();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        calculation();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jCBlanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBlanguageActionPerformed
        int idx = jCBlanguage.getSelectedIndex() ;
        if (tableFile != null) {
            tableFile.setShowLanguage(idx);            
        }
    }//GEN-LAST:event_jCBlanguageActionPerformed

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
            boolean mamLaf = false ;
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    mamLaf = true ;
                    break;
                }
            }
            if (! mamLaf) {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }                
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TranslatorsHelper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TranslatorsHelper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TranslatorsHelper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TranslatorsHelper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TranslatorsHelper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fc;
    private javax.swing.JButton jBopen;
    private javax.swing.JButton jBrun;
    private javax.swing.JComboBox jCBlanguage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFstartDirectory;
    private javax.swing.JTextField jTFtotalKeys;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTfiles;
    private javax.swing.JTable jTlanguages;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    /**
     * 
     */
    private void calculation() {
        
        if (startDirectory == null) {
            return ;
        }
        
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        try { 
            // perform some work in event dispatch thread 
            // (block UI) 
            
            cbmLanguage.getData().clear();
            // list of language versions
            findLanguageVersion(startDirectory) ;
            // sort versions
            cbmLanguage.sort(); 
            
            jCBlanguage.setModel(cbmLanguage);
            if (jCBlanguage.getItemCount() > 0) {
                jCBlanguage.setSelectedIndex(0);                           
            }
            
            tableFile = new TableFile(cbmLanguage) ;
            jTfiles.setModel(tableFile);
            tableFile.setColumns(jTfiles);
            tableFile.fireTableDataChanged();
            
            tableLanguage = new TableLanguage(cbmLanguage) ;
            jTlanguages.setModel(tableLanguage);
            tableLanguage.setColumns(jTlanguages);
            tableLanguage.fireTableDataChanged(); 
            
            findAllLanguageVersions(startDirectory) ;
            // in cbmLanguage are all versions
            
            // list of default.properties files
            findFilesDefaultEnglish(startDirectory) ;
            tableFile.fireTableDataChanged();
            
            // calculation language versions
            countLanguageVersions() ;
            
            // sumarize translated keys
            countLanguageVersionTotal() ;
            
            
        } finally { 
            this.setCursor(null);
        } 
        
    }
    
    /**
     * Process one firectory.
     * 
     * @param directory 
     */
    private void findLanguageVersion(File directory) {
        
        File[] files = directory.listFiles() ;
        // files first
        for (int i = 0; i < files.length; i++) {
            File oneFile = files[i];
            if (oneFile.isFile()) {
                if (oneFile.getName().endsWith(".properties")) {
                    String name = oneFile.getAbsolutePath() ;
                    name = name.replace(startDirectory.getAbsolutePath(), ".") ;
                    String language ;
                    String country ;
                    
                    name = oneFile.getName() ;
                    
                    int start2 = name.length() - 17 ;
                    boolean hasUnderscore2 = name.startsWith("_", start2) ;
                    if (hasUnderscore2) {
                        language = name.substring(start2 + 1, start2 + 3) ;
                        country = name.substring(start2 + 4, start2 + 6) ;
                        addVersion(new LanguageVersion(language, country)) ;
                    } else {
                        int start1 = name.length() - 14 ;
                        boolean hasUnderscore1 = name.startsWith("_", start1) ;
                        if (hasUnderscore1) {
                            language = name.substring(start1 + 1, start1 + 3) ;
                            addVersion(new LanguageVersion(language)) ;
                        }                        
                    }
                }
            }
        }
        
        // then directories
        for (int i = 0; i < files.length; i++) {
            File oneDirectory = files[i];
            if (oneDirectory.isDirectory()) {
                findLanguageVersion(oneDirectory);
            }
        }
    }

    /***************************************************************************
     * Find properties files for default language.
     * @param directory start directory
     */
    private void findFilesDefaultEnglish(File directory) {
        
        File[] files = directory.listFiles() ;
        // files first
        for (int i = 0; i < files.length; i++) {
            File oneFile = files[i];
            if (oneFile.isFile()) {
                if (oneFile.getName().endsWith(".properties")) {
                    String wholeName = oneFile.getAbsolutePath() ;
                    String middleName = wholeName.replace(startDirectory.getAbsolutePath(), ".") ;
                    
                    String shortName = oneFile.getName() ;
                    
                    
                    int start2 = shortName.length() - 17 ;
                    boolean hasUnderscore2 = shortName.startsWith("_", start2) ;
                    if (hasUnderscore2) {
                        // nothing
                    } else {
                        int start1 = shortName.length() - 14 ;
                        boolean hasUnderscore1 = shortName.startsWith("_", start1) ;
                        if (hasUnderscore1) {
                            // nothing
                        } else {
                            // it is default file
                            RecordFile oneRecordFile = new RecordFile(middleName, cbmLanguage) ;
                            tableFile.addRow(oneRecordFile);
                        }
                    } 
                }
            }
        }
        
        // then directories
        for (int i = 0; i < files.length; i++) {
            File oneDirectory = files[i];
            if (oneDirectory.isDirectory()) {
                findFilesDefaultEnglish(oneDirectory);
            }
        }
    }

    /***************************************************************************
     * Finds all language versions.
     * @param directory start directory
     */
    private void findAllLanguageVersions(File directory) {
        
        File[] files = directory.listFiles() ;
        // files first
        for (int i = 0; i < files.length; i++) {
            File oneFile = files[i];
            if (oneFile.isFile()) {
                if (oneFile.getName().endsWith(".properties")) {
                    String wholeName = oneFile.getAbsolutePath() ;
                    String middleName = wholeName.replace(startDirectory.getAbsolutePath(), ".") ;
                    String language ;
                    String country ;
                    
                    String shortName = oneFile.getName() ;
                    
                    int start2 = shortName.length() - 17 ;
                    boolean hasUnderscore2 = shortName.startsWith("_", start2) ;
                    if (hasUnderscore2) {
                        language = shortName.substring(start2 + 1, start2 + 3) ;
                        country = shortName.substring(start2 + 4, start2 + 6) ;
                        addVersion(new LanguageVersion(language, country)) ;
                    } else {
                        int start1 = shortName.length() - 14 ;
                        boolean hasUnderscore1 = shortName.startsWith("_", start1) ;
                        if (hasUnderscore1) {
                            language = shortName.substring(start1 + 1, start1 + 3) ;
                            addVersion(new LanguageVersion(language)) ;
                        } else {
                            // nothing
                        }
                    } 
                }
            }
        }
        
        // then directories
        for (int i = 0; i < files.length; i++) {
            File oneDirectory = files[i];
            if (oneDirectory.isDirectory()) {
                findFilesDefaultEnglish(oneDirectory);
            }
        }
    }

    
    private void openDirectory() {
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setSelectedFile(startDirectory);
        int respVal = fc.showOpenDialog(this) ;
        if (respVal == JFileChooser.APPROVE_OPTION) {
            startDirectory = fc.getSelectedFile() ;
            jTFstartDirectory.setText(startDirectory.getAbsolutePath());
        } else {
            startDirectory = null ;
            jTFstartDirectory.setText("");
        }        
    }
    
    private void addVersion(LanguageVersion version) {

        boolean found = false ;
        for(LanguageVersion p:cbmLanguage.getData()) {
            if (p.getLocale().getDisplayName().equals(version.getLocale().getDisplayName())) {
                found = true ;
            }
        } 
        
        if (! found) {
            cbmLanguage.addRecord(version);
        }
    }
    
    private void countLanguageVersions() {
        
        int numberOfLanguageVersions = cbmLanguage.getData().size() ;

        for (int i = 0; i < tableFile.getRowCount(); i++) {
            
            RecordFile recordFile = tableFile.getRow(i) ;
            
            String nameDefaultFile = startDirectory + recordFile.getFileName().substring(1) ;
            
            File file = new File(nameDefaultFile) ;
            
            try {
                InputStream defaultInput = new FileInputStream(file) ;
                Properties defaultProperties = new Properties() ;

                defaultProperties.load(defaultInput);
                
                Set defaultKeys = defaultProperties.keySet() ;
                
                int numberOfDefaultKeys = defaultKeys.size() ;
                recordFile.setNumberOfKeys(numberOfDefaultKeys);
                recordFile.setDefaultKeys(defaultKeys) ;
                
                
                // go through language versions
                for (int j = 0; j < numberOfLanguageVersions; j++) {
                    LanguageVersion oneVersion = recordFile.getListOfLanguageVersions().getElementAt(j) ;

                    String suffix = oneVersion.getSuffix() ;
                    
                    String nameFileVersion = nameDefaultFile.substring(0, nameDefaultFile.length() - 11) + suffix + nameDefaultFile.substring(nameDefaultFile.length()- 11, nameDefaultFile.length());
                    
                    File fileVersion = new File(nameFileVersion) ;
                    try {
                        InputStream localeInput = new FileInputStream(fileVersion) ;
                        Properties localeProperties = new Properties() ;

                        localeProperties.load(localeInput);

                        Set localeKeys = localeProperties.keySet() ;

                        int numberOfVersionKeys = 0 ;
                        for (Object oneDefaultKeys : defaultKeys) {
                            if (localeKeys.contains(oneDefaultKeys)) {
                                numberOfVersionKeys++ ;
                            }
                        }
                        oneVersion.setTranslated(numberOfVersionKeys);
                        if (numberOfDefaultKeys > 0) {
                            oneVersion.setPercentTranslated(100f * numberOfVersionKeys / numberOfDefaultKeys);                            
                        }
                        
                    } catch (FileNotFoundException ex) {
                        // nothing, version properties file not exists
                    } catch (IOException ex) {
                        Logger.getLogger(TranslatorsHelper.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TranslatorsHelper.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TranslatorsHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void countLanguageVersionTotal() {
        
        int totalKeys = 0 ;
        for (int i = 0; i < tableFile.getRowCount(); i++) {
            RecordFile recordFile = tableFile.getRow(i) ;
            totalKeys = totalKeys + recordFile.getNumberOfKeys() ;
        }
        
        jTFtotalKeys.setText(String.format("%,d", totalKeys)) ;

        
        int numberOfLanguageVersions = cbmLanguage.getData().size() ;
        
        for (int i = 0; i < tableFile.getRowCount(); i++) {
            
            RecordFile recordFile = tableFile.getRow(i) ;
            
            // go through language versions
            for (int j = 0; j < numberOfLanguageVersions; j++) {
                
                LanguageVersion oneLanguageVersion = recordFile.getListOfLanguageVersions().getElementAt(j) ;
                
                Locale locale = oneLanguageVersion.getLocale() ;
                
                LanguageVersion jazykJednaMutace = tableLanguage.getRowLocale(locale) ;
                
                jazykJednaMutace.setTranslated(jazykJednaMutace.getTranslated() + oneLanguageVersion.getTranslated()) ;
                jazykJednaMutace.setPercentTranslated(100f * jazykJednaMutace.getTranslated() / totalKeys);
                
            }

            tableLanguage.fireTableDataChanged();

        }
    }
    
}
