package net.andlink.panels;

import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.filesystems.FileChooserBuilder;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

@ConvertAsProperties(
        dtd = "-//net.andlink.panels//MainPanelTC//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "MainPanelTC",
        //iconBase="net/andlink/panels/images/open_icon.png", 
        persistenceType = TopComponent.PERSISTENCE_NEVER 
)
@TopComponent.Registration(mode = "editor", openAtStartup = false)
@ActionID(category = "Window", id = "net.andlink.panels.MainPanelTC")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_CCpanelAction",
        preferredID = "MainPanelTC"
)
@Messages({
    "CTL_CCpanelAction=Main Panel",
    "CTL_MainPanelTC=Main Panel Window",
    "HINT_MainPanelTC=This is the Main Panel"
})
public final class MainPanelTC extends TopComponent {    
    
    public MainPanelTC() {
        initComponents();
        setName(Bundle.CTL_MainPanelTC());
        setToolTipText(Bundle.HINT_MainPanelTC());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCC = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAMN = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jBtnConvert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jT_rowstart = new javax.swing.JTextField();
        jT_rowend = new javax.swing.JTextField();
        jT_coldate = new javax.swing.JTextField();
        jT_coldesc = new javax.swing.JTextField();
        jT_colprice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jT_type = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jT_separator = new javax.swing.JTextField();
        jBtnSave = new javax.swing.JButton();

        jTableCC.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableCC);

        TAMN.setEditable(false);
        TAMN.setBackground(new java.awt.Color(204, 204, 204));
        TAMN.setColumns(20);
        TAMN.setRows(5);
        jScrollPane2.setViewportView(TAMN);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jBtnConvert.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jBtnConvert, org.openide.util.NbBundle.getMessage(MainPanelTC.class, "MainPanelTC.jBtnConvert.text")); // NOI18N
        jBtnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConvertActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(MainPanelTC.class, "MainPanelTC.jLabel1.text")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(MainPanelTC.class, "MainPanelTC.jLabel2.text")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(MainPanelTC.class, "MainPanelTC.jLabel3.text")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(MainPanelTC.class, "MainPanelTC.jLabel4.text")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(MainPanelTC.class, "MainPanelTC.jLabel5.text")); // NOI18N

        jT_rowstart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jT_rowstart.setText(org.openide.util.NbBundle.getMessage(MainPanelTC.class, "MainPanelTC.jT_rowstart.text")); // NOI18N

        jT_rowend.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jT_rowend.setText(org.openide.util.NbBundle.getMessage(MainPanelTC.class, "MainPanelTC.jT_rowend.text")); // NOI18N

        jT_coldate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jT_coldate.setText(org.openide.util.NbBundle.getMessage(MainPanelTC.class, "MainPanelTC.jT_coldate.text")); // NOI18N

        jT_coldesc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jT_coldesc.setText(org.openide.util.NbBundle.getMessage(MainPanelTC.class, "MainPanelTC.jT_coldesc.text")); // NOI18N

        jT_colprice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jT_colprice.setText(org.openide.util.NbBundle.getMessage(MainPanelTC.class, "MainPanelTC.jT_colprice.text")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(MainPanelTC.class, "MainPanelTC.jLabel6.text")); // NOI18N

        jT_type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jT_type.setText(org.openide.util.NbBundle.getMessage(MainPanelTC.class, "MainPanelTC.jT_type.text")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(MainPanelTC.class, "MainPanelTC.jLabel7.text")); // NOI18N

        jT_separator.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jT_separator.setText(org.openide.util.NbBundle.getMessage(MainPanelTC.class, "MainPanelTC.jT_separator.text")); // NOI18N

        jBtnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jBtnSave, org.openide.util.NbBundle.getMessage(MainPanelTC.class, "MainPanelTC.jBtnSave.text")); // NOI18N
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnConvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jT_coldesc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT_coldate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT_rowend, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(jT_rowstart, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT_colprice))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT_type, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(jT_separator)))
                    .addComponent(jBtnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jT_rowstart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jT_rowend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jT_coldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jT_coldesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jT_colprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jT_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jT_separator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jBtnConvert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnSave)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConvertActionPerformed
        String qiftxt = "!Type:" + jT_type.getText() + "\n";
        
        try {
            int coldate = Integer.parseInt(jT_coldate.getText()) - 1;
            int coldesc = Integer.parseInt(jT_coldesc.getText()) - 1;
            int colprice = Integer.parseInt(jT_colprice.getText()) - 1;
            int rowend = Integer.parseInt(jT_rowend.getText());
            int rowstart = Integer.parseInt(jT_rowstart.getText());
            
            if ( rowend <= rowstart ) {
                rowend = jTableCC.getRowCount();
            }
            
            for (int i = rowstart-1; i < rowend; i++) {
                String date = jTableCC.getValueAt(i, coldate).toString().replaceAll("[-./]", jT_separator.getText());
                qiftxt += "D" + date + "\n";
                
                qiftxt += "M" + jTableCC.getValueAt(i, coldesc).toString() + "\n";
                
                String price = jTableCC.getValueAt(i, colprice).toString().replaceAll("[€$£]", "");                                
                qiftxt += "T" + price + "\n";

                qiftxt += "^\n";
            }
            
        } catch (NumberFormatException nfe) { 
            qiftxt = "Please check input data";
        }
        
        TAMN.setText(qiftxt);                           
        
        
    }//GEN-LAST:event_jBtnConvertActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        
        FileFilter filterXRP = new FileFilter(){
            @Override public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".qif") | f.isDirectory();
            }
            @Override public String getDescription() { return "QIF file"; }
        };        

        FileChooserBuilder FCB = new FileChooserBuilder ("libraries-dir");        
        FCB.setFilesOnly(true);
        FCB.addFileFilter(filterXRP); 
        
        File fileQIF = FCB.showSaveDialog();             
        
        if (fileQIF != null) {
            if (!fileQIF.getAbsolutePath().endsWith(".qif")) { fileQIF = new File(fileQIF+".qif"); }
            int exist = JOptionPane.YES_OPTION;
            if (fileQIF.exists()) { 	
                exist = JOptionPane.showConfirmDialog(null, 
                        fileQIF.getName()+" already exist\nDo you want to reaplce it?", 
                        "File exist",                         
                        JOptionPane.YES_NO_OPTION);
            }
            if (exist == JOptionPane.YES_OPTION) { 
                net.andlink.panels.Save save = new net.andlink.panels.Save();
                save.saveqif(TAMN.getText(), fileQIF.getAbsolutePath()); 

            }
        }            

    }//GEN-LAST:event_jBtnSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea TAMN;
    private javax.swing.JButton jBtnConvert;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jT_coldate;
    private javax.swing.JTextField jT_coldesc;
    private javax.swing.JTextField jT_colprice;
    private javax.swing.JTextField jT_rowend;
    private javax.swing.JTextField jT_rowstart;
    private javax.swing.JTextField jT_separator;
    private javax.swing.JTextField jT_type;
    public javax.swing.JTable jTableCC;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        this.setVisible(false);        
    }

    void writeProperties(java.util.Properties p) {
        p.setProperty("version", "1.0");
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
    }
}
