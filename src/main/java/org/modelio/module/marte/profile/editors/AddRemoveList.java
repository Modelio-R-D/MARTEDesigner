package org.modelio.module.marte.profile.editors;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

/**
 * Provides beautiful lists to add and remove some elements.
 * It uses for the model elements multiple selection.
 * AddRemoveList<MObject> contains both lists lAdd and lRem. lAdd allows the available model elements visualization. lRem allows the linked model elements.
 * The user is able to add or remove some elements from the linked model elements.
 * @author ehouziaux
 */
public class AddRemoveList<MObject> {
    private Group grAdd;

    private Group grRem;

    private org.eclipse.swt.widgets.List lAdd;

    private org.eclipse.swt.widgets.List lRem;

    private Button bAdd;

    private Button bRem;

    /**
     * Constructs beautiful lists to add and remove some elements.
     * @param availableValues are the different available values.
     * @param selectedValues are the different selected values by the user.
     * 
     * @param parent is the parent composite.
     */
    public AddRemoveList(Composite parent) {
        // parent setting
        parent.setSize(380, 220);
        parent.setLayout(new FormLayout());
        
        // group creation for the available values
        grAdd = new Group(parent, SWT.SHADOW_NONE);
        //grAdd.setText("Available Schedulable Resources");
        FormData formData = new FormData();
        formData.bottom = new FormAttachment(90, 0);
        formData.top = new FormAttachment(10, 0);
        formData.left = new FormAttachment(2,0);
        formData.right = new FormAttachment(42,0);
        grAdd.setLayoutData(formData);
        
        // available values List<MObject> creation
        lAdd = new org.eclipse.swt.widgets.List(grAdd, SWT.MULTI | SWT.V_SCROLL);
        lAdd.setLocation(5,15);
        lAdd.setBounds(5, 15, 140, 130);
        
        // adding button creation
        bAdd = new Button(parent, SWT.PUSH);
        bAdd.setText(">");
        bAdd.setAlignment(SWT.CENTER);
        FormData formData3 = new FormData();
        formData3.bottom = new FormAttachment(45, 0);
        formData3.top = new FormAttachment(35, 0);
        formData3.left = new FormAttachment(45,0);
        formData3.right = new FormAttachment(55,0);
        bAdd.setLayoutData(formData3);
        bAdd.addMouseListener(new MouseAdapter() {
            public void mouseUp(MouseEvent e) {
                for (String s : lAdd.getSelection()) {
                    lAdd.remove(s);
                    lRem.add(s);
                    
                }
            }
        });
        
        // group creation for the selected values
        grRem = new Group(parent, SWT.SHADOW_NONE);
        //grRem.setText("Schedulabled Resources");
        FormData formData4 = new FormData();
        formData4.bottom = new FormAttachment(90, 0);
        formData4.top = new FormAttachment(10, 0);
        formData4.left = new FormAttachment(58,0);
        formData4.right = new FormAttachment(98,0);
        grRem.setLayoutData(formData4);
        
        // selected values List<MObject> creation
        lRem = new org.eclipse.swt.widgets.List(grRem, SWT.MULTI);
        lRem.setLocation(5,15);
        lRem.setBounds(5, 15, 140, 130);
        
        // removing button creation
        bRem = new Button(parent, SWT.PUSH);
        bRem.setText("<");
        bRem.setAlignment(SWT.CENTER);
        FormData formData2 = new FormData();
        formData2.bottom = new FormAttachment(65, 0);
        formData2.top = new FormAttachment(55, 0);
        formData2.left = new FormAttachment(45,0);
        formData2.right = new FormAttachment(55,0);
        bRem.setLayoutData(formData2);
        bRem.addMouseListener(new MouseAdapter() {
            public void mouseUp(MouseEvent e) {
                
                for (String s : lRem.getSelection()) {
                    lRem.remove(s);
                    lAdd.add(s);
                }
            }
        });
    }

    /**
     * Gets the available model elements table String.
     * 
     * @return the available values
     */
    public String[] getAvailableValues() {
        return lAdd.getSelection();
    }

    /**
     * Sets both List<MObject> titles.
     * 
     * @param title1 is the available model elements List<MObject> title.
     * @param title2 is the selected model elements List<MObject> title.
     */
    public void setTitles(String title1, String title2) {
        grAdd.setText(title1);
        grRem.setText(title2);
    }

    /**
     * Sets the List<MObject> size.
     */
    public void setListSize() {
        lAdd.setBounds(5, 15, grAdd.getBounds().width-10, grAdd.getBounds().height-20);
        lRem.setBounds(5, 15, grRem.getBounds().width-10, grRem.getBounds().height-20);
    }

    /**
     * Gets the available model elements list.
     * 
     * @return the available elements list.
     */
    public org.eclipse.swt.widgets.List getlAdd() {
        return lAdd;
    }

    /**
     * Sets the available
     * @param lAdd is the new list.
     */
    public void setlAdd(String[] l) {
        lAdd.removeAll();
        for (String s : l) {
            lAdd.add(s);
        }
    }

    /**
     * Gets the selected model elements.
     * 
     * @return the selected elements list.
     */
    public org.eclipse.swt.widgets.List getlRem() {
        return lRem;
    }

    /**
     * Sets the selected model elements list.
     * @param lRem is the new list.
     */
    public void setlRem(String[] l) {
        lRem.removeAll();
        for (String s : l) {
            lRem.add(s);
        }
    }

}
