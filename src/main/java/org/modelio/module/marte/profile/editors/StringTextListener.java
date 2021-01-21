package org.modelio.module.marte.profile.editors;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Text;

@objid ("c2105492-e626-4fbd-b5da-82269b91c3a6")
public class StringTextListener implements ModifyListener, KeyListener {
    @objid ("80668e5e-1bb1-48eb-a1c5-7ae057ccc2d8")
    private StringListEditionDialog dialog = null;

    @objid ("eab0b691-8e39-4041-a4a0-3cab740e6f7a")
    public StringTextListener(StringListEditionDialog dialog) {
        this.dialog = dialog;
    }

    @objid ("a9ae0995-dc6f-4052-8188-40a2515abcf8")
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

    @objid ("9c14419f-327b-418d-9918-ad349bec39d5")
    @Override
    public void keyPressed(KeyEvent e) {
    }

    @objid ("fbbd34fb-f176-49b6-84fc-ef217b7947b0")
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
