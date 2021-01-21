package org.modelio.module.marte.profile.editors;

import java.io.File;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
import org.modelio.module.marte.profile.utils.MARTEResourceManager;

/**
 * Provides a beautiful GUI for add/remove multiple values.
 * It uses the Modelio interface. Usually used for the String[*] configuration.
 * @author ehouziaux
 */
@objid ("cba46929-3f25-403a-8f4d-a9f993a9cdd3")
public class MultipleValuesList<MObject> {
    @objid ("7d18beaf-7075-45ae-a6db-4c63074d87c3")
    private org.eclipse.swt.widgets.List valuesList;

    @objid ("7d56b627-5f33-475d-b4a6-18467bf4238d")
    private Button bDown;

    @objid ("aef20c82-7d7e-4641-881c-a05aed39c6da")
    private Button bUp;

    @objid ("d40e3657-05bf-4bbd-bacb-a6a4c47012ac")
    private Button bDel;

    @objid ("9d3c9fd3-018e-4aab-916a-d929f418fcfd")
    private Button bAdd;

    @objid ("b3ed8724-8bf1-4b3d-94c7-ffeade81411a")
    private Text textField;

    @objid ("42bb4965-4c72-451e-a5cc-0d3524f65264")
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
    @objid ("09beb0f2-9c97-46ba-b9a1-2c7b4bf22255")
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
    @objid ("c00ed727-bfe1-4792-b6f9-2fb7dbcc5612")
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
    @objid ("eb20b25e-7a15-475b-b752-35e46cc4ebc0")
    public org.eclipse.swt.widgets.List getList() {
        return valuesList;
    }

    /**
     * Sets the values list
     * @param valuesList<MObject> is the new values list.
     */
    @objid ("356fd7b9-3efa-475e-8b2d-0bf5de8f139f")
    public void setValuesList(org.eclipse.swt.widgets.List valuesList) {
        this.valuesList = valuesList;
    }

    @objid ("d6ebb50c-406b-41be-a5ec-788c3f854050")
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

    @objid ("d7b08d36-4f4b-44d0-8054-19322238c1d4")
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

    @objid ("0bbca09b-f6c1-4957-af61-1385e3f52cc2")
    public void removeValue() {
        int ind1 = valuesList.getSelectionIndex();
        if (ind1 != -1) {
            valuesList.remove(ind1);
        }
    }

    @objid ("6f4ce91d-ccff-4e4f-be9e-5870ead00e63")
    public void addValue() {
        String txt = textField.getText();
        if (!txt.equals("")) {
            valuesList.add(txt);
            textField.setText("");
        }
    }

}
