package org.modelio.module.marte.profile.editors;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.ui.ModelioDialog;

/**
 * This class displays the results of a search for model elements (see Searcher
 * class). The found elements are proposed to the end user in a List<MObject> where he
 * can select the element of his choice. Each time the user selects a different
 * element in the List<MObject> a NAVIGATION event is fired. Along with the results, the
 * dialog displays the current regular expression that produced the results.
 * This expression can be modified leading to an update of the displayed
 * results. This allows for search refinement when many elements have been
 * found.
 */
@objid ("c8824f7d-3435-41db-893e-02fce1799899")
public class StringListEditionDialog extends ModelioDialog {
    @objid ("0106d9fd-b9c3-4ef7-a5dc-bc5542f392a7")
    private String title = "";

    @objid ("92dc3241-49ff-4feb-9955-2b4e00d983cf")
    private String message = "";

    @objid ("bc5a2379-bcc3-48dc-b01e-018f5639987a")
    private String detailedMessage = "";

    @objid ("cb9dad78-80a8-492f-889f-b8435c754e99")
    private int size = 0;

    @objid ("b95cf974-f838-4b37-86c1-878f352d2b11")
    private List<StringAdapter> content = null;

    @objid ("7e0abd05-1153-41cf-b4df-4336b7061c4a")
    private StringListCellEditor editor = null;

    @objid ("055f17d7-35d2-4428-b1a7-6f152edcb090")
    private StringTextListener stringTextListener = null;

    @objid ("6f315dc8-4097-4b65-9e43-4ad777db2b7b")
    private ContentTableListener contentTableListener = null;

    @objid ("883cf36a-97fa-4186-a846-31e20112940b")
    private AddButtonListener addButtonListener = null;

    @objid ("09749ea9-6a95-4b48-9163-a20a593e8036")
    private MoveUpButtonListener moveUpButtonListener = null;

    @objid ("386f8f02-9fa4-48ee-9b14-f02ec3fcce97")
    private MoveDownButtonListener moveDownButtonListener = null;

    @objid ("3eb72a9d-a7ca-4a06-a15e-98b79c1e577b")
    private RemoveButtonListener removeButtonListener = null;

    @objid ("4bf084b8-ba6b-4e87-be1f-75781dc06188")
    private TableViewer contentTable = null;

    @objid ("f2e33664-bac6-4a3b-ac10-a228e2db117c")
    private Image addImage = null;

    @objid ("bc5e6b29-3138-443e-a507-fa56ee82e9cd")
    private Image removeImage = null;

    @objid ("c4868205-f64b-4694-9980-9551dd863ee4")
    private Button addParameterButton = null;

    @objid ("8a72b9e7-5383-476a-8a1b-0afb616653a6")
    private Button removeParameterButton = null;

    @objid ("eeb38519-d6a1-4f0a-8a22-688bb030c052")
    private Text addStringText = null;

    @objid ("9ea0078a-4ef2-46c4-bf34-f48292fa3bb0")
    private Image moveUpImage = null;

    @objid ("9f367966-fce4-48f6-a063-a754b99a5432")
    private Image moveDownImage = null;

    @objid ("af539b24-84f3-4d36-8993-2b7d07cc475e")
    private Button moveUpParameterButton = null;

    @objid ("b3165209-a6c1-4684-bae3-1f0d1d6fe600")
    private Button moveDownParameterButton = null;

    @objid ("fe64d612-1bb4-45e1-a593-2e776b73f8a5")
    public StringListEditionDialog(Shell parentShell, String title, String message, int size, String detailedMessage, IModelingSession session, StringListCellEditor editor, List<String> initialContent) {
        super(parentShell);
        this.title = title;
        this.message = message;
        this.size = size;
        this.detailedMessage = detailedMessage;
        this.content = initContent(initialContent);
        this.editor = editor;
        
        //        this.addImage = AbstractUIPlugin.imageDescriptorFromPlugin("com.modeliosoft.modelio.edition", "icons/add_16.png").createImage();
        //        this.removeImage = AbstractUIPlugin.imageDescriptorFromPlugin("com.modeliosoft.modelio.edition", "icons/remove_16.png").createImage();
        //        this.moveUpImage = AbstractUIPlugin.imageDescriptorFromPlugin("com.modeliosoft.modelio.edition", "icons/up_16.png").createImage();
        //        this.moveDownImage = AbstractUIPlugin.imageDescriptorFromPlugin("com.modeliosoft.modelio.edition", "icons/down_16.png").createImage();
    }

    @objid ("d81425d1-eeb6-4f2c-bbf2-d7a347a8d206")
    @Override
    public void addButtonsInButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, false);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

    @objid ("775acc2a-c3e1-4c49-9dd6-7730ada7ef82")
    @Override
    public Control createContentArea(Composite parent) {
        Composite area = new Composite(parent, 0);
        area.setLayout(new GridLayout(2, false));
        area.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        area.setFont(parent.getFont());
        
        createDetailedText(area);
        createListField(area);
        createListButtons(area);
        createAddStringField(area);
        
        initListeners();
        
        getShell().pack();
        return area;
    }

    @objid ("7926c14f-3557-4da4-82b2-32caf46d20fa")
    @Override
    public void init() {
        setLogoImage(null);
        
        getShell().setText(this.title);
        setTitle(this.title);
        setMessage(this.message);
        
        Point minSize = new Point(440,270);
        getShell().setMinimumSize(minSize);
    }

    @objid ("9823fb11-6b42-41ac-b9b3-ff92697b6a88")
    @Override
    protected void okPressed() {
        //        List<String> values = getValues(this.content);
                //        this.editionValidator.validate(values);
                this.editor.closeEditor(true);
                super.okPressed();
    }

    @objid ("778f7d7d-46d5-4164-a1fc-10f8075ec7a0")
    @Override
    public int open() {
        return super.open();
    }

    @objid ("8cf65390-534c-46c7-a112-7fbadcf1239c")
    @Override
    public boolean close() {
        if (this.moveUpButtonListener != null) {
            this.moveUpParameterButton.removeSelectionListener(this.moveUpButtonListener);
            this.moveUpButtonListener = null;
        }
        
        if (this.moveDownButtonListener != null) {
            this.moveDownParameterButton.removeSelectionListener(this.moveDownButtonListener);
            this.moveDownButtonListener = null;
        }
        
        if (this.removeButtonListener != null) {
            this.removeParameterButton.removeSelectionListener(this.removeButtonListener);
            this.removeParameterButton = null;
        }
        
        if (this.addButtonListener != null) {
            this.addParameterButton.removeSelectionListener(this.addButtonListener);
            this.addButtonListener = null;
        }
        
        if (this.stringTextListener != null) {
            this.addStringText.removeModifyListener(this.stringTextListener);
            this.addStringText.removeKeyListener(this.stringTextListener);
            this.stringTextListener = null;
        }
        
        if (this.contentTableListener != null) {
            this.contentTable.removeSelectionChangedListener(this.contentTableListener);
            this.contentTable.getTable().removeKeyListener(this.contentTableListener);
            this.contentTable.getTable().removeControlListener(this.contentTableListener);
            this.contentTableListener = null;
        }
        
        if (this.addImage != null) {
            this.addImage.dispose();
            this.addImage = null;
        }
        if (this.removeImage != null) {
            this.removeImage.dispose();
            this.removeImage = null;
        }
        if (this.moveUpImage != null) {
            this.moveUpImage.dispose();
            this.moveUpImage = null;
        }
        if (this.moveDownImage != null) {
            this.moveDownImage.dispose();
            this.moveDownImage = null;
        }
        return super.close();
    }

    @objid ("fa25490d-dff4-4d2f-95e3-9632b803d883")
    protected Image getBundleImage(String relativePath) {
        //        Bundle imageBundle = Platform.getBundle("com.modeliosoft.modelio.edition");
        //        IPath bitmapPath = new Path(relativePath);
        //        URL bitmapUrl = FileLocator.find(imageBundle, bitmapPath, null);
        //        ImageDescriptor desc = ImageDescriptor.createFromURL(bitmapUrl);
        //        return desc.createImage();
        return null;
    }

    @objid ("9232db45-b0f7-4075-8969-31939dbdbf38")
    @Override
    protected void cancelPressed() {
        this.editor.closeEditor(false);
        super.cancelPressed();
    }

    @objid ("b414e6aa-c741-4b98-a5db-b339e96ead5b")
    private void createListField(Composite area) {
        this.contentTable = new TableViewer(area);
        
        String columnNames[] = {"Value"};
        
        TableColumn column0 = new TableColumn(this.contentTable.getTable(), SWT.LEFT, 0);
        column0.setWidth(150);
        
        this.contentTable.setColumnProperties(columnNames);
        
        this.contentTable.setContentProvider(new StringListContentProvider());
        //        this.contentTable.setLabelProvider(new StringListLabelProvider());
        
        initEditor();
        
        this.contentTable.setInput(this.content);
        GridData gd_contentTree = new GridData(SWT.FILL, SWT.FILL, true, true);
        this.contentTable.getControl().setLayoutData(gd_contentTree);
    }

    @objid ("2e1e93f6-f644-4ae3-9575-ee6b503249ca")
    private void createListButtons(Composite area) {
        Composite buttonsComposite = new Composite(area, SWT.NONE);
        GridLayout gl_buttonComposite = new GridLayout(1, false);
        gl_buttonComposite.marginWidth = 0;
        gl_buttonComposite.marginHeight = 0;
        buttonsComposite.setLayout(gl_buttonComposite);
        GridData gd_buttonsComposite = new GridData(SWT.LEFT, SWT.TOP, false, false);
        buttonsComposite.setLayoutData(gd_buttonsComposite);
        
        this.moveUpParameterButton = new Button(buttonsComposite, SWT.NONE);
        this.moveUpParameterButton.setImage(this.moveUpImage);
        this.moveUpParameterButton.setEnabled(false);
        GridData gd_moveUpParameterButton = new GridData(SWT.LEFT, SWT.TOP, false, false);
        gd_moveUpParameterButton.heightHint = 21;
        gd_moveUpParameterButton.widthHint = 21;
        this.moveUpParameterButton.setLayoutData(gd_moveUpParameterButton);
        
        this.moveDownParameterButton = new Button(buttonsComposite, SWT.NONE);
        this.moveDownParameterButton.setImage(this.moveDownImage);
        this.moveDownParameterButton.setEnabled(false);
        GridData gd_moveDownParameterButton = new GridData(SWT.LEFT, SWT.TOP, false, false);
        gd_moveDownParameterButton.heightHint = 21;
        gd_moveDownParameterButton.widthHint = 21;
        this.moveDownParameterButton.setLayoutData(gd_moveDownParameterButton);
        
        this.removeParameterButton = new Button(buttonsComposite, SWT.NONE);
        this.removeParameterButton.setImage(this.removeImage);
        this.removeParameterButton.setEnabled(false);
        GridData gd_removeParameterButton = new GridData(SWT.LEFT, SWT.TOP, false, false);
        gd_removeParameterButton.heightHint = 21;
        gd_removeParameterButton.widthHint = 21;
        this.removeParameterButton.setLayoutData(gd_removeParameterButton);
    }

    @objid ("921af7a3-5890-43c8-b7f3-ab9c2ee5a919")
    public TableViewer getContentTable() {
        return this.contentTable;
    }

    @objid ("d4795a66-0537-4e00-a9ec-b3f4626ea506")
    private List<StringAdapter> initContent(List<String> values) {
        List<StringAdapter> adapters = new ArrayList<StringAdapter>();
        for (String value : values) {
            adapters.add(new StringAdapter(value));
        }
        return adapters;
    }

    @objid ("4c5a5888-268b-409d-b7db-08cfc525651b")
    private List<String> getValues(List<StringAdapter> adapters) {
        List<String> values = new ArrayList<>();
        for (StringAdapter adapter : adapters) {
            values.add(adapter.getValue());
        }
        return values;
    }

    @objid ("2eaa8593-1fb9-4480-b86e-fc59c71024c6")
    private void initEditor() {
        // Define cell editor:
        //--------------------
        TextCellEditor[] cellEditors = new TextCellEditor[1];
        cellEditors[0]  = new TextCellEditor(this.contentTable.getTable(), SWT.NONE);
        this.contentTable.setCellEditors(cellEditors);
        
        // Define ICellModifier:
        //----------------------
        String[] properties = new String[1];
        properties[0] = "name";
        this.contentTable.setColumnProperties(properties);
        
        //        this.contentTable.setCellModifier(this.stringAdapterModifier);
        //        this.contentTable.getTable().addKeyListener(this.stringAdapterModifier);
        
        // Define editor activation strategy:
        //-----------------------------------
        //        StringAdapterEditorActivationStrategy actSupport = new StringAdapterEditorActivationStrategy(this.contentTable);
        
        //        TableViewerEditor.create(this.contentTable, null, actSupport, ColumnViewerEditor.TABBING_HORIZONTAL
        //                | ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR
        //                | ColumnViewerEditor.TABBING_VERTICAL | ColumnViewerEditor.KEYBOARD_ACTIVATION);
        TableViewerEditor.create(this.contentTable, null, null, ColumnViewerEditor.TABBING_HORIZONTAL
                | ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR
                | ColumnViewerEditor.TABBING_VERTICAL | ColumnViewerEditor.KEYBOARD_ACTIVATION);
    }

    @objid ("130b4d4b-20ab-414f-b7f7-1f01787747dc")
    public void refresh() {
        this.contentTable.setInput(this.content);
        
        if (this.size != -1) {
            this.addStringText.setEnabled(this.content.size() < this.size);
        }
    }

    @objid ("81c321db-2ff7-442c-84f8-f1b9844dfc71")
    public Text getAddStringText() {
        return this.addStringText;
    }

    @objid ("bff7c68f-cf27-4e04-a371-54921b9a8f1d")
    public Button getAddParameterButton() {
        return this.addParameterButton;
    }

    @objid ("543c8e68-d004-458d-a884-12bdf7e9917e")
    public Button getRemoveParameterButton() {
        return this.removeParameterButton;
    }

    @objid ("1341efea-b4f8-436f-b179-c5197443f158")
    private void createAddStringField(Composite area) {
        this.addStringText = new Text(area, SWT.BORDER);
        if (this.size != -1) {
            this.addStringText.setEnabled(this.content.size() < this.size);
        }
        GridData gd_addStringText = new GridData(SWT.FILL, SWT.TOP, true, false);
        this.addStringText.setLayoutData(gd_addStringText);
        this.addStringText.forceFocus();
        
        this.addParameterButton = new Button(area, SWT.NONE);
        this.addParameterButton.setImage(this.addImage);
        this.addParameterButton.setEnabled(false);
        GridData gd_addParameterButton = new GridData(SWT.LEFT, SWT.TOP, false, false);
        gd_addParameterButton.heightHint = 21;
        gd_addParameterButton.widthHint = 21;
        this.addParameterButton.setLayoutData(gd_addParameterButton);
    }

    @objid ("14eca0c0-5658-4c3e-a094-c270066c940e")
    public void addAdapter(StringAdapter adapter) {
        this.content.add(adapter);
        refresh();
    }

    @objid ("3926611c-3092-4566-863c-ab3f5160badf")
    public Button getMoveUpParameterButton() {
        return this.moveUpParameterButton;
    }

    @objid ("5602b410-4b32-466c-a2ce-6c271bc3ffa3")
    public Button getMoveDownParameterButton() {
        return this.moveDownParameterButton;
    }

    @objid ("ae5e71b8-f581-48f6-a49a-f374da961384")
    private void createDetailedText(Composite area) {
        if (this.detailedMessage != null && !this.detailedMessage.equals("")) {
            Label detailText = new Label(area, SWT.NONE);
            detailText.setText(this.detailedMessage);
            GridData gd_detailText = new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1);
            gd_detailText.horizontalIndent = 3;
            detailText.setLayoutData(gd_detailText);
        }
    }

    @objid ("5f27ae50-fc7a-49e9-8deb-68fec7dfe808")
    private void initListeners() {
        this.contentTableListener = new ContentTableListener(this);
        this.contentTable.addSelectionChangedListener(this.contentTableListener);
        this.contentTable.getTable().addKeyListener(this.contentTableListener);
        this.contentTable.getTable().addControlListener(this.contentTableListener);
        
        this.moveUpButtonListener = new MoveUpButtonListener(this);
        this.moveUpParameterButton.addSelectionListener(this.moveUpButtonListener);
        
        this.moveDownButtonListener = new MoveDownButtonListener(this);
        this.moveDownParameterButton.addSelectionListener(this.moveDownButtonListener);
        
        this.removeButtonListener = new RemoveButtonListener(this);
        this.removeParameterButton.addSelectionListener(this.removeButtonListener);
        
        this.addButtonListener = new AddButtonListener(this);
        this.addParameterButton.addSelectionListener(this.addButtonListener);
        
        this.stringTextListener = new StringTextListener(this);
        this.addStringText.addModifyListener(this.stringTextListener);
        this.addStringText.addKeyListener(this.stringTextListener);
    }

    @objid ("36dae5aa-d7e0-4e8b-b860-05ffcf245fd7")
    public void removeAdapters(List<StringAdapter> adapters) {
        for (StringAdapter adapter : adapters) {
            this.content.remove(adapter);
        }
        refresh();
    }

    @objid ("75ba4d8f-f2df-492e-bf8d-93b7c6bab0aa")
    @SuppressWarnings("unchecked")
    public List<StringAdapter> getSelectedAdapters() {
        IStructuredSelection structuredSelection = (IStructuredSelection)this.contentTable.getSelection();
        return structuredSelection.toList();
    }

    @objid ("f792bbce-8370-4be2-bc18-6e6e667520c6")
    public void moveUp(List<StringAdapter> adapters) {
        for (StringAdapter adapter : adapters) {
            int index = getIndexUp(adapter, this.content);
        
            if (index != -1) {
                this.content.remove(adapter);
                this.content.add(index, adapter);
            } else {
                break;
            }
        }
        
        this.refresh();
    }

    @objid ("10abcc6b-126c-4132-a00b-ad590cdf6983")
    private int getIndexUp(StringAdapter adapter, List<StringAdapter> list) {
        int index = list.indexOf(adapter);
        
        if (index < 1) {
            return -1;
        }
        
        index--;
        return index;
    }

    @objid ("d49a2a61-6a18-4d0c-984d-f895fd0fe33a")
    private int getIndexDown(StringAdapter adapter, List<StringAdapter> list) {
        int index = list.indexOf(adapter);
        
        if (index == -1) {
            return -1;
        }
        
        index++;
        
        if (index >= list.size()) {
            return -1;
        }
        return index;
    }

    @objid ("dc85c8ba-ccf2-4ada-85da-e9e90469ce0d")
    public void moveDown(List<StringAdapter> adapters) {
        // We first move down the Last element of the list; This way the positions of other
        // selected elements are not affected by the move of the current this.element.
        for (int i = adapters.size() - 1; i > -1; i--) {
            StringAdapter adapter = adapters.get(i);
            
            // Retrieve the new index of the element
            int index = getIndexDown(adapter, this.content);
            
            if (index != -1) {
                // Move the element in the List<MObject> 
                this.content.remove(adapter);
                this.content.add(index, adapter);
            } else {
                break;
            }
        }
        
        refresh();
    }

}
