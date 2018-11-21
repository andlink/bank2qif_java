package net.andlink.panels;

/* Author: Andrea Gallotta
 * Website: http://andlink.net/
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 3 of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

 * Get the full text of the GPL here: http://www.gnu.org/licenses/gpl.txt
 */

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.filechooser.FileFilter;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openide.filesystems.FileChooserBuilder;
import org.openide.util.Exceptions;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class Load {
    private MainPanelTC panelCC;
    
    /**
     * Verify string is a valid date and convert in correct format
     * @param dateString
     * @return true if valid date format
     */
    private boolean isValidDate(String dateString) {        
        SimpleDateFormat df;
        boolean isValidate = false;
        try {
            df = new SimpleDateFormat("dd/mm/yyyy");
            df.parse(dateString);
            isValidate = true;
        } catch (java.text.ParseException e) { }
        try {
            df = new SimpleDateFormat("dd/mm/yy");
            df.parse(dateString);
            isValidate = true;
        } catch (java.text.ParseException e) { }
        
        return isValidate;
    }
    
    /**
     * load XLS and put data in MainPanelTC
     * 
     */
    public void loadxls () {
        FileFilter filterXRP = new FileFilter(){
            @Override public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".xls") | f.isDirectory();
            }
            @Override public String getDescription() { return "XLS file"; }
        };        

        FileChooserBuilder FCB = new FileChooserBuilder ("libraries-dir");        
        FCB.setFilesOnly(true);
        FCB.addFileFilter(filterXRP); 
        File fileXLS = FCB.showOpenDialog();        
                
        if (fileXLS != null) { 
            panelCC = new MainPanelTC();
            panelCC.open();
            Workbook workbook;
            try {
                workbook = Workbook.getWorkbook(fileXLS);
                Sheet sheet = workbook.getSheet(0);                                
                /* set jTable size based on XLS sheet */
                panelCC.jTableCC.setModel(new javax.swing.table.DefaultTableModel(sheet.getRows(), sheet.getColumns()));
                
                /* set column table header */
                JTableHeader th = panelCC.jTableCC.getTableHeader();  
                TableColumnModel tcm = th.getColumnModel();  
                for ( int i = 0; i < panelCC.jTableCC.getColumnCount(); i++ ) {
                    TableColumn tc = tcm.getColumn(i);  
                    tc.setHeaderValue( String.valueOf(i+1) );  
                }                
                th.repaint();                    
                
                int writeRow = 0;
                for (int j=0; j<sheet.getRows(); j++) {
                    /* check if row is empty */
                    boolean rowEmpty = true;
                    for (int i=0; i<sheet.getColumns(); i++) {       
                        if (!sheet.getCell(i,j).getContents().isEmpty()) {
                            rowEmpty = false;
                        }
                    }
                    /* write only not empty row */
                    if (!rowEmpty) { 
                        for (int i=0; i<sheet.getColumns(); i++) {       
                            panelCC.jTableCC.setValueAt(sheet.getCell(i,j).getContents(), writeRow, i);
                        } 
                        writeRow++;
                    }                    
                }
                /* remove empty rows */
                for (int i=sheet.getRows()-1; i>=writeRow; i--) {
                    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)panelCC.jTableCC.getModel();
                    model.removeRow(i);
                }
                
                
            } catch (IOException | BiffException ex) {
                Exceptions.printStackTrace(ex);
            }

        }
    }

}
