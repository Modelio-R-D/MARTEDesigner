package org.modelio.module.marte.profile.editors;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TreeEditor;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.utils.ListUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Provides a beautiful body tree page for the properties frame.
 * It allows the different table folder constructions according the tag type nature :
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
@objid ("6683d52f-042d-43a9-b4eb-7d9e4cc56ba2")
public abstract class BodyTreePage extends CompositeHandle implements IDialogPage {
    @objid ("ca5586d6-0157-4986-bc05-0a154039abcc")
    private String[] listTagTypes;

    @objid ("6dada627-d6ef-4ade-8116-e56ad6288675")
    private String[] listTagTypeNames;

    @objid ("f403b3df-3d12-4dc6-a264-6749d8c0f747")
    private String[] listDescriptions;

    @objid ("69eaa92c-7e9e-49d6-9a70-37498d6d9e9b")
    private TransformationDialog dialog;

    @objid ("255f3f7e-e5ed-445c-9f5d-5d5ddd3fa336")
    private AddRemoveList list;

    @objid ("45aa0600-dd36-490e-b34c-f314a8a6536e")
    private Tree[] tree;

    @objid ("2df2bb10-2e59-4dc2-b368-0d4dee3c8332")
    private Composite root;

    @objid ("ca396091-1c78-4c3c-a58c-157929dd0792")
    private TabFolder ongletsTab;

    @objid ("c2566cc3-fac4-4055-ad56-0c03c0b23c42")
    private TabItem[] tabItems;

    @objid ("739c0b16-e8f5-4e9a-81e6-4a83fc08da34")
    private Composite compositeTree;

    @objid ("e8bbd654-cc1f-4861-8e76-ca13af2947e5")
    private TreeColumn[][] treeCol;

    @objid ("1ed90bf6-a06b-40af-b7dd-353e39f508d4")
    protected ModelElement element;

    /**
     * Provides the page refreshing.
     */
    @objid ("1a029c7f-768b-4ab4-8097-1d01c925c681")
    @Override
    public void refresh() {
        // TODO Auto-generated method stub
        if (list != null) {
            list.setListSize();
        
        }
    }

    /**
     * Sets  the active status.
     * 
     * @param activity is the new activity.
     */
    @objid ("a2eafa1d-0e91-4bf2-b8fd-a7254a74a9cc")
    @Override
    public void setActive(boolean activity) {
        // TODO Auto-generated method stub
    }

    @objid ("1e281286-7118-44bc-8c80-ae2d6b685d86")
    public void setVisibleAllTree() {
        for (Tree t: tree) {
            t.setVisible(false);
        }
    }

    /**
     * Provides a beautiful GUI for the 0 tagged value parameter number.
     * -- WARNING : the data form is "tag type name" and the getting element is a check button.
     * 
     * @return the check button created for the boolean tag type.
     */
    @objid ("579c5f34-3095-4624-a024-41355fa97946")
    public Button setCompositeBoolean(String tagType, String description, int indTree) {
        // set the header with the tagged value name and the description
        dialog.getCompositeHeader().setText(MARTEResourceManager.getName(tagType), description);
        
        // item creation
        TreeItem item = new TreeItem(tree[indTree], SWT.NONE);
        item.setText(new String[] {MARTEResourceManager.getName(tagType), "", ""});
        
        // check box creation
        Button checkButton = new Button(tree[indTree], SWT.CHECK);
        checkButton.setData(tagType);
        checkButton.setAlignment(SWT.CENTER);
        if(ModelUtils.hasTaggedValue(tagType, element)) {
            checkButton.setSelection(true);
        }
        
        // check box editor
        final TreeEditor editor = new TreeEditor(tree[indTree]);
        editor.horizontalAlignment = SWT.CENTER;
        editor.minimumWidth = 20;
        editor.minimumHeight = 10;
        editor.setEditor(checkButton, item, 1);
        tabItems[indTree].setControl(compositeTree);
        return checkButton;
    }

    /**
     * Provides a beautiful GUI for the 1 tagged value parameter number.
     * -- WARNING : the data form is "tag type name" and the getting element is a text field.
     */
    @objid ("13f8eea7-732a-4f76-bd8e-96e3fe61330a")
    public Text setCompositeSingleVal(String tagType, String description, int indTree) {
        // set the header with the tagged value name and the description
        dialog.getCompositeHeader().setText(MARTEResourceManager.getName(tagType), description);
        
        // item creation
        TreeItem item = new TreeItem(tree[indTree], SWT.NONE);
        item.setText(new String[] {MARTEResourceManager.getName(tagType), "", ""});
        
        // get the actual value
        String value = ModelUtils.getTaggedValue(tagType, this.element);
        
        // text field initialization
        Text txt = new Text(tree[indTree], SWT.BORDER);
        txt.setText(value);
        txt.setLayoutData(new FormLayout());
        txt.setData(tagType);      
        
        // text field editor
        final TreeEditor editor2 = new TreeEditor(tree[indTree]);
        editor2.horizontalAlignment = SWT.CENTER;
        editor2.grabHorizontal = true;
        editor2.setEditor(txt, item, 1);
        tabItems[indTree].setControl(compositeTree);
        return txt;
    }

    /**
     * Provides a beautiful GUI for the multiple tagged value parameter number.
     * -- WARNING : the data form is "tag type name" and the getting element is a text field.
     */
    @objid ("34bf84b5-820b-47fe-b257-4a2a10afd9f8")
    public org.eclipse.swt.widgets.List setCompositeMultipleVal(String tagType, String description, int indTree) {
        for (int i= 0; i < 3; i++) {
            treeCol[indTree][i].dispose();
        }
        
        // set the header with the tagged value name and the description
        dialog.getCompositeHeader().setText(MARTEResourceManager.getName(tagType), description);   
        String[] values = ModelUtils.getComplexTaggedValue(tagType,  this.element);    
        MultipleValuesList m = new MultipleValuesList(tree[indTree], tagType); 
        m.setList(values);
        tabItems[indTree].setControl(compositeTree);
        return m.getList();
    }

    /**
     * Provides a beautiful GUI for the kind tagged value (one parameter number).
     * -- WARNING : the data form is "tag type name" and the getting element is a combo box.
     */
    @objid ("79b6e993-e569-4bad-b0e0-e4d433111039")
    public Combo setCompositeSingleKind(String tagType, String description, int indTree) {
        // set the header with the tagged value name and the description
        dialog.getCompositeHeader().setText(MARTEResourceManager.getName(tagType), description); 
        
        // item creation
        TreeItem item = new TreeItem(tree[indTree], SWT.NONE);
        item.setText(new String[] {MARTEResourceManager.getName(tagType), "", ""});
        
        // combo creation
        Combo combo = new Combo(tree[indTree], SWT.READ_ONLY);
        
        // text field editor
        final TreeEditor editor2 = new TreeEditor(tree[indTree]);
        editor2.horizontalAlignment = SWT.CENTER;
        editor2.grabHorizontal = true;
        editor2.setEditor(combo, item, 1);   
        tabItems[indTree].setControl(compositeTree);
        return combo;
    }

    /**
     * Provides a beautiful GUI for the kind tagged value (multiple parameter number)
     * -- WARNING : the data form is "tag type name"_"kind name" and the getting elements are check buttons.
     */
    @objid ("917db746-4a3f-4b97-bd80-f293e3670a73")
    public ArrayList<Button> setCompositeMultipleKind(String tagType, String description, int indTree, String[] tabKind) {
        // set the header with the tagged value name and the description
        dialog.getCompositeHeader().setText(MARTEResourceManager.getName(tagType), description); 
        ArrayList<Button> listCheckButtons = new ArrayList<Button>();
        
        // item creation
        TreeItem item = new TreeItem(tree[indTree], SWT.NONE);
        item.setText(new String[] {MARTEResourceManager.getName(tagType), "", ""});
        
        // current values getting
        String[] currentValues = ModelUtils.getComplexTaggedValue(tagType,  this.element);
        
        // check buttons creation
        for (int p=0; p < tabKind.length; p++) {
            String s = tabKind[p];
            TreeItem subItem = new TreeItem(item, SWT.NONE);
            subItem.setText(new String[] {s, "", ""});
            Button b = new Button(tree[indTree], SWT.CHECK);
            b.setData(s);
            listCheckButtons.add(b);
            
            // check buttons checking
            for (int j=0; j < currentValues.length; j++) {
                if (currentValues[j].equals(tabKind[p])) {
                    listCheckButtons.get(listCheckButtons.indexOf(b)).setSelection(true);
                }
            }
            
            // checkButton editors
            final TreeEditor editor2 = new TreeEditor(tree[indTree]);
            editor2.horizontalAlignment = SWT.CENTER;
            editor2.grabHorizontal = true;
            editor2.setEditor(listCheckButtons.get(listCheckButtons.indexOf(b)), subItem, 1);
        }
        tabItems[indTree].setControl(compositeTree);
        return listCheckButtons;
    }

    /**
     * Provides a beautiful GUI for the 1 tagged value parameter number and when the tagged value is an this.element.
     * 
     * @param tagType is the tag type name
     * @param description is the tag type description
     * @param indTree is the index in the table
     * @param extendedClass is the searched extended class
     */
    @objid ("46ef7ec8-6329-4cf8-b12d-d0e9acff08b4")
    public Combo setCompositeSingleElt(String tagType, String description, int indTree, Class<? extends MObject> extendedClass) {
        // set the header with the tagged value name and the description
        dialog.getCompositeHeader().setText(MARTEResourceManager.getName(tagType), description); 
        
        // item creation
        TreeItem item = new TreeItem(tree[indTree], SWT.NONE);
        item.setText(new String[] {MARTEResourceManager.getName(tagType), "", ""});
        
        // combo creation
        Combo combo = new Combo(tree[indTree], SWT.READ_ONLY);
        ListUtils tabElt = ModelUtils.searchElementList(extendedClass);
        for (String s : tabElt.getListString()) {
            combo.add(s);
        }
        
        
        // text field editor
        final TreeEditor editor2 = new TreeEditor(tree[indTree]);
        editor2.horizontalAlignment = SWT.CENTER;
        editor2.grabHorizontal = true;
        editor2.setEditor(combo, item, 1);
        tabItems[indTree].setControl(compositeTree);
        return combo;
    }

    /**
     * Provides a beautiful GUI for the 1 tagged value parameter number and when the tagged value is an this.element.
     * @param extendedClass is the searched extended class
     * @param stereoName is the searched stereotype name
     * 
     * @param tagType is the tag type name
     * @param description is the tag type description
     * @param indTree is the index in the table
     */
    @objid ("fc893e7e-2a5e-47dd-9542-8a9ccadbfe6d")
    public Combo setCompositeSingleElt(String tagType, String description, int indTree) {
        // set the header with the tagged value name and the description
        dialog.getCompositeHeader().setText(MARTEResourceManager.getName(tagType), description); 
        
        // item creation
        TreeItem item = new TreeItem(tree[indTree], SWT.NONE);
        item.setText(new String[] {MARTEResourceManager.getName(tagType), "", ""});
        
        // combo creation
        Combo combo = new Combo(tree[indTree], SWT.READ_ONLY);
        
        // text field editor
        final TreeEditor editor2 = new TreeEditor(tree[indTree]);
        editor2.horizontalAlignment = SWT.CENTER;
        editor2.grabHorizontal = true;
        editor2.setEditor(combo, item, 1);
        tabItems[indTree].setControl(compositeTree);
        return combo;
    }

    /**
     * Provides a beautiful GUI for the 1 tagged value parameter number and when the tagged value is an this.element.
     * @param extendedClass is the searched extended class
     * @param stereoName is the searched stereotype name
     * 
     * @param tagType is the tag type name
     * @param description is the tag type description
     * @param indTree is the index in the table
     */
    @objid ("2d9fad1e-363e-4ccc-9b72-e692676935e8")
    public AddRemoveList<MObject> setCompositeMultipleElt(String tagType, String description, int indTree, String[] titles) {
        // set the header with the tagged value name and the description
        dialog.getCompositeHeader().setText(MARTEResourceManager.getName(tagType), description); 
        
        // GUI add remove List<MObject> creation
        list = new AddRemoveList(tree[indTree]);
        list.setTitles(titles[0], titles[1]); 
        tabItems[indTree].setControl(compositeTree);
        return list;
    }

    /**
     * Allows the complex composite setting.
     * 
     * @param tagType is the tag type name.
     * @param description is the tag type description.
     * @param indTree is the index in the tree.
     * @param complex is the complex structure kind.
     * @return a tree editor array List<MObject> which contains the different controls which contains the data.
     */
    @objid ("f54a3fb5-3ce0-4149-bb05-5e856f623799")
    public ArrayList<ArrayList<TreeEditor>> setCompositeComplex(String tagType, String description, int indTree, ComplexTree complex) {
        // set the header with the tagged value name and the description
        dialog.getCompositeHeader().setText(MARTEResourceManager.getName(tagType), description);
        for (int i= 0; i < 3; i++) {
            treeCol[indTree][i].dispose();
        }
        complex.init(tree[indTree], tagType);
        tabItems[indTree].setControl(compositeTree);
        return complex.getListEditor();
    }

    /**
     * tag types List<MObject> getting.
     * 
     * @return the tag types list.
     */
    @objid ("e3904258-0de2-4b96-8a1a-a82729cbfd65")
    public String[] getListTagTypes() {
        return listTagTypes;
    }

    /**
     * descriptions List<MObject> getting.
     * 
     * @return the descriptions list.
     */
    @objid ("1d86c14b-3ee3-4270-8f2c-066aff1aec24")
    public String[] getListDescriptions() {
        return listDescriptions;
    }

    /**
     * Is an abstract function to redefine. It allows the table folders construction.
     */
    @objid ("a9a26495-ecbf-4120-b6f2-c4668096c0cf")
    public abstract void buildTabFolder();

    /**
     * Allows the BodyTreePage initialization.
     * the init function has to call in the sub classes constructor.
     */
    @objid ("e4cfe67d-b7b5-4dd0-bb50-dfa33112aaea")
    public void init(final TransformationDialog dialog, ModelElement element, String[] listTagTypes, String[] listDescriptions) {
        this.dialog = dialog;
        
        // root initialization
        root = dialog.getPageComposite();
        root.setLayout(new FormLayout());
        
        // parameters initialization
        this.element = element;
        this.listTagTypes = listTagTypes;
        this.listDescriptions = listDescriptions;
        
        // tab creation
        ongletsTab = new TabFolder(root, SWT.TOP);
        listTagTypeNames = new String[listTagTypes.length];
        
        // tab name initialization
        for (int i =0; i < listTagTypes.length;i++) {
            listTagTypeNames[i] = MARTEResourceManager.getName(listTagTypes[i]);
        }
        
        // items tab initialization
        tabItems = new TabItem[listTagTypes.length];
        for (int i=0; i < tabItems.length; i++) {
            tabItems[i] = new TabItem(ongletsTab, SWT.NULL);
            tabItems[i].setText(listTagTypeNames[i]);
        }
        final FormData formDataOnglets = new FormData();
        formDataOnglets.left = new FormAttachment(0, 5);
        formDataOnglets.right = new FormAttachment(100, -5);
        formDataOnglets.bottom = new FormAttachment(100, 0);
        formDataOnglets.top = new FormAttachment(0, 5);
        ongletsTab.setLayoutData(formDataOnglets);
        
        // composite initialization
        compositeTree = new Composite(ongletsTab, SWT.NULL);
        compositeTree.setLayout(new FormLayout());
        
        // tree initialization
        tree = new Tree[listTagTypes.length];
        treeCol = new TreeColumn[listTagTypes.length][3];
        
        for (int i=0; i<tree.length;i++) {
            tree[i] = new Tree(compositeTree, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
            tree[i].setHeaderVisible(true);
            final FormData formData = new FormData();
            formData.bottom = new FormAttachment(100, 0);
            formData.right = new FormAttachment(100, 0);
            formData.top = new FormAttachment(0, 0);
            formData.left = new FormAttachment(0, 0);
            tree[i].setLayoutData(formData);
            
            // tree column initialization
            treeCol[i] = new TreeColumn[] {new TreeColumn(tree[i], SWT.LEFT), new TreeColumn(tree[i], SWT.CENTER), new TreeColumn(tree[i], SWT.RIGHT)};
            treeCol[i][0].setText("Element name");
            treeCol[i][0].setWidth(240);
            treeCol[i][1].setText("Element value");
            treeCol[i][1].setWidth(298);
            treeCol[i][2].setWidth(19);
        }
        
        
        
        buildTabFolder();
        root.setVisible(true);
        ongletsTab.addSelectionListener(new SelectionListener() {
            public void widgetSelected(SelectionEvent e) {
               // DEBUG Modelio.out.println("Selected item index = " + ongletsTab.getSelectionIndex());
        
                for (int j=0; j<BodyTreePage.this.listTagTypes.length; j++) {
                    if (ongletsTab.getSelectionIndex() == j) {
                        dialog.getCompositeHeader().setText(listTagTypeNames[j], BodyTreePage.this.listDescriptions[j]);
                        setVisibleAllTree();
                        tree[j].setVisible(true);
                    }
                }
                refresh();
            }
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });
    }

    @objid ("112d3726-44dd-469c-b6b2-abaf6f184cac")
    public TransformationDialog getDialog() {
        return dialog;
    }

}
