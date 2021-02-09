package org.modelio.module.marte.profile.editors;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Text;

public class StringTextListener implements ModifyListener, KeyListener {
    private StringListEditionDialog dialog = null;

    public StringTextListener(StringListEditionDialog dialog) {
        this.dialog = dialog;
    }

    @Override
    public void modifyText(ModifyEvent e) {
        Text addStringText = (Text)e.getSource();
        
        String text = addStringText.getText();
        if (text != null && !text.equals("")) {
            this.dialog.getAddParameterButton().setEnabled(true);
        } else {
            this.dialog.getAddParameterButton().setEnabled(false);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.keyCode == SWT.CR) {
            Text addStringText = (Text)e.getSource();
            String text = addStringText.getText();
            this.dialog.addAdapter(new StringAdapter(text));
            addStringText.setText("");
        }
    }

}
