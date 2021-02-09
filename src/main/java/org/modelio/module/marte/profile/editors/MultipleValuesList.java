package org.modelio.module.marte.profile.editors;

import java.io.File;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.modelio.api.modelio.Modelio;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;

/**
 * Provides a beautiful GUI for add/remove multiple values.
 * It uses the Modelio interface. Usually used for the String[*] configuration.
 * @author ehouziaux
 */
public class MultipleValuesList<MObject> {
    private org.eclipse.swt.widgets.List valuesList;

    private Button bDown;

    private Button bUp;

    private Button bDel;

    private Button bAdd;

    private Text textField;

    public MultipleValuesList(Composite grandparent, String tagType) {
        grandparent.setLayout(new FormLayout());
        Composite parent = new Composite(grandparent, SWT.NONE);
        parent.setLayout(new FormLayout());
        attachFormData(parent, 10, 90, 15, 85);
        // module init
        IMARTEDesignerPeerModule module = (IMARTEDesignerPeerModule) Modelio.getInstance().getModuleService().getPeerModule(IMARTEDesignerPeerModule.class);
        
        Label title = new Label(parent, SWT.NONE);
        title.setText(tagType+" : String[*]");
        attachFormData(title, 5, 15, 4, 84);
        
        // List<MObject> initialization
        valuesList = new org.eclipse.swt.widgets.List(parent, SWT.BORDER);
        attachFormData(valuesList, 15, 65, 4, 84);
        
        // button initializations
        String icUp = module.getConfiguration().getModuleResourcesPath()+ File.separator + "up.png";
        Image imgUp = new Image(null, icUp);
        bUp = new Button(parent, SWT.PUSH);
        bUp.setImage(imgUp);
        attachFormData(bUp, 20, 30, 88, 96);
        bUp.addMouseListener(new MouseAdapter() {
            public void mouseUp(MouseEvent e) {
                upValue();
            }
        });
        
        String icDown = module.getConfiguration().getModuleResourcesPath()+ File.separator + "down.png";
        Image imgDown = new Image(null, icDown); 
        bDown = new Button(parent, SWT.PUSH);
        bDown.setImage(imgDown);
        attachFormData(bDown, 35, 45, 88, 96);
        bDown.addMouseListener(new MouseAdapter() {
            public void mouseUp(MouseEvent e) {
                downValue();
            }
        });
        
        String icDel = module.getConfiguration().getModuleResourcesPath()+ File.separator + "delete.png";
        Image imgDel = new Image(null, icDel);
        bDel = new Button(parent, SWT.PUSH);
        bDel.setImage(imgDel);
        attachFormData(bDel, 50, 60, 88, 96);
        bDel.addMouseListener(new MouseAdapter() {
            public void mouseUp(MouseEvent e) {
                removeValue();
            }
        });
        
        String icAdd = module.getConfiguration().getModuleResourcesPath()+ File.separator + "forward.png";
        Image imgAdd = new Image(null, icAdd);
        bAdd = new Button(parent, SWT.PUSH);
        bAdd.setImage(imgAdd);
        attachFormData(bAdd, 80, 90, 88, 96);
        bAdd.addMouseListener(new MouseAdapter() {
            public void mouseUp(MouseEvent e) {
                addValue();
            }
        });
        
        // text field initialization
        textField = new Text(parent, SWT.SINGLE | SWT.BORDER);
        attachFormData(textField, 80, 90, 4, 84);
    }

    /**
     * setList<MObject> allows the List<MObject> modification
     */
    public void setList(String[] list) {
        for (String s:list) {
            valuesList.add(s);
        }
    }

    /**
     * Provides a fast FormData configuration.
     * 
     * @param elt where we want to attach a FormData
     * @param top is a percent value for a top attachment, the offset equals 0.
     * @param bottom is a percent value for a bottom attachment, the offset equals 0.
     * @param left is a percent value for a left attachment, the offset equals 0.
     * @param right is a percent value for a right attachment, the offset equals 0.
     */
    public void attachFormData(Control elt, int top, int bottom, int left, int right) {
        FormData fd = new FormData();
        fd.top = new FormAttachment(top,0);
        fd.bottom = new FormAttachment(bottom, 0);
        fd.left = new FormAttachment(left, 0);
        fd.right = new FormAttachment(right, 0);
        elt.setLayoutData(fd);
    }

    /**
     * Gets the values list.
     * 
     * @return the values list.
     */
    public org.eclipse.swt.widgets.List getList() {
        return valuesList;
    }

    /**
     * Sets the values list
     * @param valuesList<MObject> is the new values list.
     */
    public void setValuesList(org.eclipse.swt.widgets.List valuesList) {
        this.valuesList = valuesList;
    }

    public void upValue() {
        int ind1 = valuesList.getSelectionIndex();
        int ind2 = ind1 -1;
        
        if (ind2 >= 0) {
            String s1 = valuesList.getItem(ind1);
            String s2 = valuesList.getItem(ind2);
            valuesList.setItem(ind1, s2);
            valuesList.setItem(ind2, s1);
            valuesList.setSelection(ind2);
        }
    }

    public void downValue() {
        int ind1 = valuesList.getSelectionIndex();
        int ind2 = ind1 +1;
        
        if (ind2 < valuesList.getItemCount() && ind1 != -1) {
            String s1 = valuesList.getItem(ind1);
            String s2 = valuesList.getItem(ind2);
            valuesList.setItem(ind1, s2);
            valuesList.setItem(ind2, s1);
            valuesList.setSelection(ind2);
        }
    }

    public void removeValue() {
        int ind1 = valuesList.getSelectionIndex();
        if (ind1 != -1) {
            valuesList.remove(ind1);
        }
    }

    public void addValue() {
        String txt = textField.getText();
        if (!txt.equals("")) {
            valuesList.add(txt);
            textField.setText("");
        }
    }

}
