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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "net.andlink.panels.Load"
)
@ActionRegistration(
        iconBase="net/andlink/panels/images/open_icon.png", 
        displayName = "#CTL_Load"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 0),
    @ActionReference(path = "Toolbars/File", position = 0)
})
@Messages("CTL_Load=Load")
public final class LoadAction implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e) {    
           net.andlink.panels.Load L = new net.andlink.panels.Load();
           L.loadxls();       
    }    
}
