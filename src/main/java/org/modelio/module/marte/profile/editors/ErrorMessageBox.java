package org.modelio.module.marte.profile.editors;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

@objid ("1da97133-ecf8-4a94-9c0f-72dc61014163")
public class ErrorMessageBox implements Runnable {
    @objid ("595dda1a-ab8b-4268-b1b3-315861cbdd9b")
    private String message = "";

    @objid ("9d4bb932-15a7-4787-87b7-7911150ebbe5")
    private Shell shell = null;

    @objid ("2f1c35b3-b6f7-4b83-8ae9-48a0e9b524f3")
    public void run() {
        MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR );
        messageBox.setMessage(message);
        messageBox.setText("Error");
        messageBox.open();
    }

    @objid ("5f6d8bf7-ef53-4e3c-8d1b-23511b775f5d")
    public ErrorMessageBox(Shell shell, String message) {
        this.shell = shell;
        this.message = message;
    }

}
