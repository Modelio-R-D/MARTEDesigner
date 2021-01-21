package org.modelio.module.marte.profile.editors;

import java.io.File;
import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TreeEditor;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;

/**
 * Provides functions which allows the complex tree construction.
 * the construction depends on the tag type nature :
 * - boolean > check button
 * - integer, real or String [0..1] > text field
 * - integer, real or String [*] > MultipleValueList
 * - kind [0..1] > combo box
 * - kind [*] > multiple check buttons
 * - model element [0..1] > combo box
 * - model element [*] > AddRemoveList
 * - complex structure > ComplexTree
 * @author ehouziaux
 */
@objid ("adf0f90e-cc4a-4853-924d-a36f99f3eee2")
public abstract class ComplexTree {
    @objid ("df7ecf97-2b05-45ed-ae2e-a17c01f61f69")
    private String tagType;

    @objid ("1fb0181c-5fe7-42c4-8185-265735a79fc4")
    private ArrayList<ArrayList<TreeItem>> listSubItem;

    @objid ("e7034b0e-9899-4da7-8f9e-a6fa39feb4f5")
    private ArrayList<ArrayList<TreeEditor>> listEditor;

    @objid ("ff3dcb4a-9d51-4213-8759-46c631978561")
    private ArrayList<TreeItem> listTreeItem;

    @objid ("d91aac25-151e-4cce-8d75-24eb685c3cf2")
    private ArrayList<Text> listText;

    @objid ("3661f97d-cd4a-4e50-8438-25afb0754fda")
    private ArrayList<Combo> listCombo;

    @objid ("c44a5140-e82e-4000-8a08-8cd329bd5cfd")
    private Button bDown;

    @objid ("5036a981-6fe4-43af-ae8b-a09445deb63a")
    private Button bUp;

    @objid ("7285e1f9-f1bf-49c7-b3ae-66f3e2ab5640")
    private Button bDel;

    @objid ("fa90c3ec-0c9f-48a3-89e2-e3f86ca9b30d")
    private Button bAdd;

    @objid ("de9b284c-5cfb-41b7-ae6d-cec757279b53")
    private Tree parent;

    /**
     * Provides the Complex Tree class initialization.
     * 
     * @param grandParent is the grand parent tree.
     * @param tagType is the tag type name.
     */
    @objid ("1a6b817f-8078-40ff-a379-9ceab1750c5d")
    public void init(Tree grandParent, String tagType) {
        this.tagType = tagType;
        
        // grnad parent setting
        grandParent.setLayout(new FormLayout());
        
        // parent setting
        parent = new Tree(grandParent, SWT.BORDER);
        attachFormData(parent, 10, 95, 5, 85);
        parent.setHeaderVisible(true);
        
        // columns setting
        TreeColumn treeCol[] = new TreeColumn[] {new TreeColumn(parent, SWT.LEFT), new TreeColumn(parent, SWT.CENTER)};
        treeCol[0].setText("Element name");
        treeCol[0].setWidth(250);
        treeCol[1].setText("Element value");
        treeCol[1].setWidth(160);
        
        // lists initialization
        listTreeItem = new ArrayList<TreeItem>();
        listText = new ArrayList<Text>();
        listCombo = new ArrayList<Combo>();
        listSubItem = new ArrayList<ArrayList<TreeItem>>();
        listEditor = new ArrayList<ArrayList<TreeEditor>>();
        
        // module getting
        IMARTEDesignerPeerModule module = (IMARTEDesignerPeerModule) Modelio.getInstance().getModuleService().getPeerModule(IMARTEDesignerPeerModule.class);
        
        // button initializations
        
        // up button
        String icUp = module.getConfiguration().getModuleResourcesPath()+ File.separator + "up.png";
        Image imgUp = new Image(null, icUp);
        bUp = new Button(grandParent, SWT.PUSH);
        bUp.setImage(imgUp);
        bUp.setToolTipText("move up the "+MARTEResourceManager.getName(tagType));
        attachFormData(bUp, 18, 28, 90, 95);
        bUp.addMouseListener(new MouseAdapter() {
            public void mouseUp(MouseEvent e) {
                upElement();
            }
        });
        
        // down button
        String icDown = module.getConfiguration().getModuleResourcesPath()+ File.separator + "down.png";
        Image imgDown = new Image(null, icDown); 
        bDown = new Button(grandParent, SWT.PUSH);
        bDown.setImage(imgDown);
        bDown.setToolTipText("move down the "+MARTEResourceManager.getName(tagType));
        attachFormData(bDown, 36, 46, 90, 95);
        bDown.addMouseListener(new MouseAdapter() {
            public void mouseUp(MouseEvent e) {
                downElement();
            }
        });
        
        // delete button
        String icDel = module.getConfiguration().getModuleResourcesPath()+ File.separator + "delete.png";
        Image imgDel = new Image(null, icDel);
        bDel = new Button(grandParent, SWT.PUSH);
        bDel.setImage(imgDel);
        bDel.setToolTipText("delete the "+MARTEResourceManager.getName(tagType));
        attachFormData(bDel, 54, 64, 90, 95);
        bDel.addMouseListener(new MouseAdapter() {
            public void mouseUp(MouseEvent e) {
                delete();
            }
        });
        
        // add button
        String icAdd = module.getConfiguration().getModuleResourcesPath()+ File.separator + "add.png";
        Image imgAdd = new Image(null, icAdd);
        bAdd = new Button(grandParent, SWT.PUSH);
        bAdd.setImage(imgAdd);
        bAdd.setToolTipText("add a new "+MARTEResourceManager.getName(tagType));
        attachFormData(bAdd, 72, 82, 90, 95);
        bAdd.addMouseListener(new MouseAdapter() {
            public void mouseUp(MouseEvent e) {
                addItem();
            }
        });
    }

    /**
     * Allows the item suppression.
     */
    @objid ("5f6ad3c9-9766-4325-91b4-d2d71e24ea7b")
    private void delete() {
        // keys getting
        String keys[] = new String[parent.getSelection().length];
        // for each tree item selected, we get the key, remove the tree item, the sub items and the editors corresponding
        for (int i = 0; i <parent.getSelection().length; i++) {
            // init the key
            keys[i] = (String)parent.getSelection()[i].getData();
            
            // remove the tree item
            listTreeItem.remove(parent.getSelection()[i]);
            
            // remove the item group and the editor group at the index of the item
            listSubItem.remove(parent.indexOf(parent.getSelection()[i]));
            listEditor.remove(parent.indexOf(parent.getSelection()[i]));
            parent.getSelection()[i].dispose();
        }
        // elements removing
        for (int k=0; k < keys.length; k++) {
            // text disposing
            ArrayList<Text> tdel = new ArrayList<Text>();
            for (int j = 0; j < listText.size(); j++) {
                if(listText.get(j).getData().equals(keys[k])) {
                   // DEBUG Modelio.out.println("text deleting : "+listText.get(j).getData().toString());
                    tdel.add(listText.get(j));
                }
            }
            for (Text t:tdel) {
                listText.remove(t);
                t.dispose();
            }
            
            // combo disposing
            ArrayList<Combo> cdel = new ArrayList<Combo>();
            for (int h = 0; h < listCombo.size(); h++) {
                if (listCombo.get(h).getData().equals(keys[k])) {
                   //  DEBUG Modelio.out.println("combo deleting : "+listCombo.get(h).getData().toString());
                    listCombo.get(h).dispose();
                    cdel.add(listCombo.get(h));
                }
            }
            for (Combo c:cdel) {
                listCombo.remove(c);
                c.dispose();
            }
        }
        // this command allows the display refreshing
        parent.deselectAll();
    }

    /**
     * Allows the moving up in the list.
     */
    @objid ("61ef8be4-ffae-4879-b0a9-1da3f095fadd")
    private void upElement() {
        // index getting
        int ind1 = parent.indexOf(parent.getSelection()[0]);
        int ind2 = ind1-1;
        
        if (ind1 > 0) {
            // temporary List<MObject> creation for the controls
            ArrayList<Control> tmpList = new ArrayList<Control>();
        
            // temporary List<MObject> creation for the different items, sub items and editors
            ArrayList<TreeItem> newListItem = new ArrayList<TreeItem>();
            ArrayList<ArrayList<TreeItem>> newListSubItem = new ArrayList<ArrayList<TreeItem>>();
            ArrayList<ArrayList<TreeEditor>> newListEditor = new ArrayList<ArrayList<TreeEditor>>();
        
            // for each editor list, we search the good controls
            // the listEditor size corresponds to the item counts
            for (int i = 0; i < listEditor.size(); i++) {
                // if the index is ind1 we exchange with the ind2 controls
                if (i == ind1) {
                    for (TreeEditor te : listEditor.get(ind2)) {
                        tmpList.add(te.getEditor());
                    }
                }
                // if the index is ind2 we exchange with the ind1 controls
                else if (i == ind2) {
                    for (TreeEditor te : listEditor.get(ind1)) {
                        tmpList.add(te.getEditor());
                    }
                }
                // else, not exchange, just getting the old controls
                else {
                    for (TreeEditor te : listEditor.get(i)) {
                        tmpList.add(te.getEditor());
                    }
                }
        
                // new item creation
                TreeItem item = new TreeItem(parent, SWT.NONE);
                item.setText(new String[] {MARTEResourceManager.getName(ComplexTree.this.tagType), "", ""});
                String key = item.toString()+(newListItem.size());
                item.setData(key);
                newListItem.add(item);
                newListSubItem.add(new ArrayList<TreeItem>());    
                newListEditor.add(new ArrayList<TreeEditor>());
        
                // for each control, we create a sub item and a new editor
                for (Control c : tmpList) {
                    TreeItem subItem = new TreeItem(item, SWT.NONE);
                    subItem.setText(new String[] {c.getToolTipText(), "", ""});
                    newListSubItem.get(newListSubItem.size()-1).add(subItem);
                    //data editing
                    c.setData(key);
        
                    TreeEditor editor = new TreeEditor(parent);
                    editor.horizontalAlignment = SWT.CENTER;
                    editor.grabHorizontal = true;
                    editor.setEditor(c, subItem, 1);
                    newListEditor.get(newListEditor.size()-1).add(editor);
                }
                tmpList.clear();
            }
        
            clearAll();
            listTreeItem = new ArrayList<TreeItem>(newListItem);
            listSubItem = new ArrayList<ArrayList<TreeItem>>(newListSubItem);
            listEditor = new ArrayList<ArrayList<TreeEditor>>(newListEditor);
        }
    }

    /**
     * Allows the moving down in the list.
     */
    @objid ("d30a243c-fc78-4a77-b1d0-3aef832e3009")
    private void downElement() {
        // index getting
        int ind1 = parent.indexOf(parent.getSelection()[0]);
        int ind2 = ind1+1;
        
        if (ind1 < listTreeItem.size()-1) {
            // temporary List<MObject> creation for the controls
            ArrayList<Control> tmpList = new ArrayList<Control>();
        
            // temporary List<MObject> creation for the different items, sub items and editors
            ArrayList<TreeItem> newListItem = new ArrayList<TreeItem>();
            ArrayList<ArrayList<TreeItem>> newListSubItem = new ArrayList<ArrayList<TreeItem>>();
            ArrayList<ArrayList<TreeEditor>> newListEditor = new ArrayList<ArrayList<TreeEditor>>();
        
            // for each editor list, we search the good controls
            // the listEditor size corresponds to the item counts
            for (int i = 0; i < listEditor.size(); i++) {
                // if the index is ind1 we exchange with the ind2 controls
                if (i == ind1) {
                    for (TreeEditor te : listEditor.get(ind2)) {
                        tmpList.add(te.getEditor());
                    }
                }
                // if the index is ind2 we exchange with the ind1 controls
                else if (i == ind2) {
                    for (TreeEditor te : listEditor.get(ind1)) {
                        tmpList.add(te.getEditor());
                    }
                }
                // else, not exchange, just getting the old controls
                else {
                    for (TreeEditor te : listEditor.get(i)) {
                        tmpList.add(te.getEditor());
                    }
                }
        
                // new item creation
                TreeItem item = new TreeItem(parent, SWT.NONE);
                item.setText(new String[] {MARTEResourceManager.getName(ComplexTree.this.tagType), "", ""});
                String key = item.toString()+(newListItem.size());
                item.setData(key);
                newListItem.add(item);
                newListSubItem.add(new ArrayList<TreeItem>());    
                newListEditor.add(new ArrayList<TreeEditor>());
        
                // for each control, we create a sub item and a new editor
                for (Control c : tmpList) {
                    TreeItem subItem = new TreeItem(item, SWT.NONE);
                    subItem.setText(new String[] {c.getToolTipText(), "", ""});
                    newListSubItem.get(newListSubItem.size()-1).add(subItem);
                    //data editing
                    c.setData(key);
        
                    TreeEditor editor = new TreeEditor(parent);
                    editor.horizontalAlignment = SWT.CENTER;
                    editor.grabHorizontal = true;
                    editor.setEditor(c, subItem, 1);
                    newListEditor.get(newListEditor.size()-1).add(editor);
                }
                tmpList.clear();
            }
        
            clearAll();
            listTreeItem = new ArrayList<TreeItem>(newListItem);
            listSubItem = new ArrayList<ArrayList<TreeItem>>(newListSubItem);
            listEditor = new ArrayList<ArrayList<TreeEditor>>(newListEditor);
        }
    }

    /**
     * Allows the item creation, an item may contain some elements like text or combo
     */
    @objid ("fec1dfee-e828-493a-a825-3622cb92e357")
    public void createItem(String tagType) {
        TreeItem item = new TreeItem(parent, SWT.NONE);
        item.setText(new String[] {MARTEResourceManager.getName(tagType), "", ""});
        String key = item.toString()+(listTreeItem.size());
        item.setData(key);
        listTreeItem.add(item);
        listSubItem.add(new ArrayList<TreeItem>());    
        listEditor.add(new ArrayList<TreeEditor>());
    }

    /**
     * Allows the sub text element creation.
     * a sub element belongs to an item.
     * @param grandparent is the item owner
     * 
     * @param subTagType is the sub tag type name.
     */
    @objid ("1d0eaa14-2f1e-4f0c-bce5-dd9de58ec48c")
    public void createSubText(String subTagType) {
        TreeItem subItem = new TreeItem(listTreeItem.get(listTreeItem.size()-1), SWT.NONE);
        subItem.setText(new String[] {subTagType, "", ""});
        listSubItem.get(listSubItem.size()-1).add(subItem);
        
        listText.add(new Text(parent, SWT.BORDER));
        lastText().setText("");
        lastText().setLayoutData(new FormLayout());
        lastText().setData(getData());
        lastText().setToolTipText(subTagType);
        
        TreeEditor editor = new TreeEditor(parent);
        editor.horizontalAlignment = SWT.CENTER;
        editor.grabHorizontal = true;
        editor.setEditor(lastText(), subItem, 1);
        listEditor.get(listEditor.size()-1).add(editor);
    }

    /**
     * Allows the sub combo element creation.
     * a sub element belongs to an item.
     * @param grandparent is the item owner.
     * 
     * @param subTagType is the sub tag type name.
     * @param comboVal are the different combo values.
     */
    @objid ("3eca6963-cc72-43b4-baf4-0a2675c64dee")
    public void createSubCombo(String subTagType, String[] comboVal) {
        TreeItem subItem = new TreeItem(listTreeItem.get(listTreeItem.size()-1), SWT.NONE);
        subItem.setText(new String[] {subTagType, "", ""});
        listSubItem.get(listSubItem.size()-1).add(subItem);
        listCombo.add(new Combo(parent, SWT.BORDER | SWT.READ_ONLY));
        for(String s : comboVal) {
            lastCombo().add(s);
        }
        lastCombo().setLayoutData(new FormLayout());
        lastCombo().setData(getData());
        lastCombo().setToolTipText(subTagType);
        TreeEditor editor = new TreeEditor(parent);
        editor.horizontalAlignment = SWT.CENTER;
        editor.grabHorizontal = true;
        editor.setEditor(lastCombo(), subItem, 1);
        listEditor.get(listEditor.size()-1).add(editor);
    }

    /**
     * Is a private function who allows the data getting.
     * the data is used to identifier the owner this.element.
     * usually, the data key is an item.
     * 
     * @return an object : the data key, usually, a String
     */
    @objid ("18f87925-e77f-4e67-a128-03762e4a9bcb")
    private Object getData() {
        // DEBUG  Modelio.out.println("getData()"+listTreeItem.get(listTreeItem.size()-1).getData());
        return listTreeItem.get(listTreeItem.size()-1).getData();
    }

    /**
     * Gets the last text created.
     * 
     * @return the last Text added in the text list.
     */
    @objid ("c208d1ae-c5fc-40d6-a1f5-4f48efff4cb8")
    private Text lastText() {
        return listText.get(listText.size()-1);
    }

    /**
     * Gets the last Combo created.
     * 
     * @return the last Combo added in the combo list.
     */
    @objid ("15de8111-150b-4f64-8db5-7b4974e0449d")
    private Combo lastCombo() {
        return listCombo.get(listCombo.size()-1);
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
    @objid ("73e4e4d4-6739-487b-a086-198d19732b2b")
    public void attachFormData(Control elt, int top, int bottom, int left, int right) {
        FormData fd = new FormData();
        fd.top = new FormAttachment(top,0);
        fd.bottom = new FormAttachment(bottom, 0);
        fd.left = new FormAttachment(left, 0);
        fd.right = new FormAttachment(right, 0);
        elt.setLayoutData(fd);
    }

    /**
     * Clears (dispose and delete from the different lists) all items, sub items and editors.
     */
    @objid ("15802c2d-0d57-4974-aeee-c25c0eaa2a30")
    private void clearAll() {
        for (TreeItem ti : listTreeItem) {
            ti.dispose();
        }
        
        for (ArrayList<TreeItem> al : listSubItem) {
            for (TreeItem ti : al) {
                ti.dispose();
            }
        }
        
        for (ArrayList<TreeEditor> al : listEditor) {
            for (TreeEditor te : al) {
                te.dispose();
            }
        }
        
        /* DEBUG
        boolean a = listTreeItem.removeAll(listTreeItem);
        boolean b = listSubItem.removeAll(listSubItem);
        boolean c = listEditor.removeAll(listEditor);
        
        if ( a && b && c) {
            Modelio.out.println("All elements are been deleted");
        }*/
    }

    /**
     * Is not defined.
     * It allows the structure item creation.
     */
    @objid ("c2103fa6-b4b2-4e05-b345-dd412d28f532")
    public abstract void addItem();

    /**
     * Gets the tree editor list.
     * 
     * @return the tree editor list.
     */
    @objid ("e3ad1b13-2f4b-46b8-81b0-33cebc84dfae")
    public ArrayList<ArrayList<TreeEditor>> getListEditor() {
        return listEditor;
    }

    /**
     * Sets the tree editor list.
     * 
     * @param listEditor is the new tree editor list.
     */
    @objid ("203a3917-8f48-471c-941c-bccf955206a5")
    public void setListEditor(ArrayList<ArrayList<TreeEditor>> listEditor) {
        this.listEditor = listEditor;
    }

    @objid ("effe15d3-b3c4-4cfa-aff7-c815b460c48f")
    public abstract void update(ComplexTree c, String tagType, ModelElement element);

    /**
     * Gets the Text list.
     * 
     * @return the Text list.
     */
    @objid ("4d6e2807-6424-4779-b9a8-b68fbae25f6d")
    public ArrayList<Text> getListText() {
        return listText;
    }

    /**
     * Gets the Combo list.
     * 
     * @return the Combo list.
     */
    @objid ("9e780355-572f-4958-b89f-0548e5b9d465")
    public ArrayList<Combo> getListCombo() {
        return listCombo;
    }

}
