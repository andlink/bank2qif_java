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

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Save {    
    /**
     * Save file
     * @param str - String to save in the file
     * @param filename - the name of the file
     */
    public void saveqif(String str, String filename) {
        InputStream IS = new ByteArrayInputStream(str.getBytes());
        
        FileOutputStream fout;          
        try {  
            File file = new File(filename);
            fout = new FileOutputStream(file);              
            byte[] buf = new byte[1024];  
            int len;  
            while ((len = IS.read(buf)) != -1) {  fout.write(buf, 0, len);  }   
            if (IS != null) { IS.close(); }  
            if (fout != null) { fout.close(); }
                        
        } catch (Exception ex) {       }  
    }
    
}
