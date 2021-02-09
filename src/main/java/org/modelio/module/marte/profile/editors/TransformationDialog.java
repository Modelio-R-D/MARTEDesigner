package org.modelio.module.marte.profile.editors;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * Provides a beautiful container for the properties frame.
 * TranformationDialog contains a banner, a main composite and two buttons.
 * @author ehouziaux
 */
public class TransformationDialog extends Dialog {
    protected boolean result;

    protected BannerComposite headerComposite;

    protected Shell shell;

    private Button finishButton;

    private Button cancelButton;

    public Composite getPageComposite() {
        final Composite composite = new Composite(shell, SWT.None);
        final FormData formData = new FormData();
        formData.bottom = new FormAttachment(100, -64);
        formData.top = new FormAttachment(0, 50);
        formData.right = new FormAttachment(100, -5);
        formData.left = new FormAttachment(0, 5);
        composite.setLayoutData(formData);
        composite.setVisible(false);
        return composite;
    }

    /**
     * Opens the dialog
     * 
     * @return the result
     */
    public boolean open() {
        shell.open();
        shell.layout();
        Display display = getParent().getDisplay();
        
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        return result;
    }

    /**
     * Creates the dialog contents
     */
    protected void createContents() {
        shell = new Shell(getParent(), SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
        shell.setLayout(new FormLayout());
        shell.setSize(600, 480);
        shell.setText("Modelio");
        
        headerComposite = new BannerComposite(shell, SWT.BORDER);
        final FormData formData_h = new FormData();
        formData_h.bottom = new FormAttachment(0, 50);
        formData_h.right = new FormAttachment(100, 0);
        formData_h.top = new FormAttachment(0, 0);
        formData_h.left = new FormAttachment(0, 0);
        headerComposite.setLayoutData(formData_h);
        
        finishButton = new Button(shell, SWT.NONE);
        final FormData formData_1_2 = new FormData();
        formData_1_2.bottom = new FormAttachment(100, -14);
        formData_1_2.top = new FormAttachment(100, -39);
        formData_1_2.right = new FormAttachment(100, -104);
        formData_1_2.left = new FormAttachment(100, -189);
        finishButton.setLayoutData(formData_1_2);
        finishButton.setText("Finish");
        
        cancelButton = new Button(shell, SWT.NONE);
        final FormData formData_1_3 = new FormData();
        formData_1_3.bottom = new FormAttachment(100, -14);
        formData_1_3.top = new FormAttachment(100, -39);
        formData_1_3.right = new FormAttachment(100, -9);
        formData_1_3.left = new FormAttachment(100, -94);
        cancelButton.setLayoutData(formData_1_3);
        cancelButton.setText("Cancel");
        cancelButton.addMouseListener(new MouseAdapter() {
            public void mouseUp(MouseEvent e) {
                dispose();
            }
        });
        
        final Label label = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
        final FormData formData_2 = new FormData();
        formData_2.bottom = new FormAttachment(100, -54);
        formData_2.right = new FormAttachment(100, 0);
        formData_2.top = new FormAttachment(100, -59);
        formData_2.left = new FormAttachment(0, 0);
        label.setLayoutData(formData_2);
    }

    public void dispose() {
        shell.dispose();
    }

    public void setResult(boolean res) {
        result = res;
    }

    /**
     * Create the dialog
     */
    public TransformationDialog(Shell parent, int style) {
        super(parent, style);
    }

    /**
     * Builds the transformation dialog.
     * 
     * @param parent the is parent shell.
     */
    public TransformationDialog(Shell parent) {
        this(parent, SWT.NONE);
        setResult(true);
        createContents();
        
        Shell modelioMother = Display.getDefault().getActiveShell();
        
        int parentW = modelioMother.getBounds().width;
        int parentH = modelioMother.getBounds().height;
        int parentX = modelioMother.getBounds().x;
        int parentY = modelioMother.getBounds().y;
        int x = (parentW-shell.getSize().x) / 2 + parentX;
        int y = (parentH-shell.getSize().y) / 2 + parentY;
        
        shell.setLocation(x,y);
    }

    public BannerComposite getCompositeHeader() {
        return headerComposite;
    }

    public Button getFinishButton() {
        return finishButton;
    }

    public Button getCancelButton() {
        return cancelButton;
    }

    public Shell getShell() {
        return shell;
    }

}
