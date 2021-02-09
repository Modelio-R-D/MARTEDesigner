package org.modelio.module.marte.profile.editors;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

public class ErrorMessageBox implements Runnable {
    private String message = "";

    private Shell shell = null;

    public void run() {
        MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR );
        messageBox.setMessage(message);
        messageBox.setText("Error");
        messageBox.open();
    }

    public ErrorMessageBox(Shell shell, String message) {
        this.shell = shell;
        this.message = message;
    }

}
