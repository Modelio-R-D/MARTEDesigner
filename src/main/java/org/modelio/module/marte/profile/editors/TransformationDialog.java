package org.modelio.module.marte.profile.editors;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("550c1a43-dfcd-4945-b991-c38942fcb9ee")
public class TransformationDialog extends Dialog {
    @objid ("4436a8ad-5eb6-4cf3-9ba0-74b537eeb76f")
    protected boolean result;

    @objid ("3b1be76b-e341-4ae9-9f68-0d8c8c960c2e")
    protected BannerComposite headerComposite;

    @objid ("c02517aa-9208-4ee1-b221-6477be77bbad")
    protected Shell shell;

    @objid ("63b5264b-a596-446e-b56b-3e4d2f3d006f")
    private Button finishButton;

    @objid ("0be37072-6f55-46cf-a2c0-27caf7c18a06")
    private Button cancelButton;

    @objid ("8c1c9dd5-5e87-4304-9ab2-3dfca5225180")
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
    @objid ("307e8c17-4087-4c4a-8c6f-956bce3380d7")
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
    @objid ("36d0d222-f52e-493f-9b73-575bad6a81db")
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

    @objid ("2df025a3-7723-4089-b202-a3bc4bb71fad")
    public void dispose() {
        shell.dispose();
    }

    @objid ("532baf97-ba36-40de-9da0-95609c98267a")
    public void setResult(boolean res) {
        result = res;
    }

    /**
     * Create the dialog
     */
    @objid ("af033d3c-0bd5-421a-8cd7-6839d6085f91")
    public TransformationDialog(Shell parent, int style) {
        super(parent, style);
    }

    /**
     * Builds the transformation dialog.
     * 
     * @param parent the is parent shell.
     */
    @objid ("cae9050a-6569-4698-9627-6fdce69caadd")
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

    @objid ("01612a03-b47d-48ca-87a1-0665684aebb7")
    public BannerComposite getCompositeHeader() {
        return headerComposite;
    }

    @objid ("e3656cea-d4c1-4737-bca9-168f24b9d6f8")
    public Button getFinishButton() {
        return finishButton;
    }

    @objid ("a6addd9d-47bf-40e5-b782-bf63e4bc5831")
    public Button getCancelButton() {
        return cancelButton;
    }

    @objid ("af2a7855-8a42-4feb-a9b9-839efb7c25e5")
    public Shell getShell() {
        return shell;
    }

}
