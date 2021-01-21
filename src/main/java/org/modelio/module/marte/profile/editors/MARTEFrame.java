package org.modelio.module.marte.profile.editors;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * Redefines the JOptionPane and allows a good look.
 * @author ehouziaux
 */
@objid ("74c2d9f4-f187-4a9a-a477-8d96a1d1407c")
public class MARTEFrame extends JOptionPane {
    @objid ("681caecc-5f71-41df-8529-10f17dadce12")
    private static final long serialVersionUID = -3713544545550552546L;

    @objid ("4f1883ae-d136-4fea-9bb0-75ee4cf30811")
    public MARTEFrame(String message, String title) {
        Shell modelioMother = Display.getDefault().getActiveShell();
        
        this.setMessage(message);
        this.setMessageType(JOptionPane.ERROR_MESSAGE);
        JDialog jdg = createDialog(null, title);
        
        
        int parentW = modelioMother.getBounds().width;
        int parentH = modelioMother.getBounds().height;
        int parentX = modelioMother.getBounds().x;
        int parentY = modelioMother.getBounds().y;
        int x = (parentW-jdg.getWidth())/2+parentX;
        int y = (parentH-jdg.getHeight())/2+parentY;
        
        jdg.setLocation(x, y);
        jdg.setVisible(true);
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        
        }
        catch (Exception e)
        { System.out.println("erreur setLookAndFeel");
        }
    }

}
