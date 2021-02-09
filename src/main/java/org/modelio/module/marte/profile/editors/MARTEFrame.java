package org.modelio.module.marte.profile.editors;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * Redefines the JOptionPane and allows a good look.
 * @author ehouziaux
 */
public class MARTEFrame extends JOptionPane {
    private static final long serialVersionUID = -3713544545550552546L;

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
