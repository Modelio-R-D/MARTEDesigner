package org.modelio.module.marte.profile.editors;

import java.util.ArrayList;
import java.util.List;
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
public class StringListEditionDialog extends ModelioDialog {
    private String title = "";

    private String message = "";

    private String detailedMessage = "";

    private int size = 0;

    private List<StringAdapter> content = null;

    private StringListCellEditor editor = null;

    private StringTextListener stringTextListener = null;

    private ContentTableListener contentTableListener = null;

    private AddButtonListener addButtonListener = null;

    private MoveUpButtonListener moveUpButtonListener = null;

    private MoveDownButtonListener moveDownButtonListener = null;

    private RemoveButtonListener removeButtonListener = null;

    private TableViewer contentTable = null;

    private Image addImage = null;

    private Image removeImage = null;

    private Button addParameterButton = null;

    private Button removeParameterButton = null;

    private Text addStringText = null;

    private Image moveUpImage = null;

    private Image moveDownImage = null;

    private Button moveUpParameterButton = null;

    private Button moveDownParameterButton = null;

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

    @Override
    public void addButtonsInButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, false);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

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

    @Override
    public void init() {
        setLogoImage(null);
        
        getShell().setText(this.title);
        setTitle(this.title);
        setMessage(this.message);
        
        Point minSize = new Point(440,270);
        getShell().setMinimumSize(minSize);
    }

    @Override
    protected void okPressed() {
        //        List<String> values = getValues(this.content);
                //        this.editionValidator.validate(values);
                this.editor.closeEditor(true);
                super.okPressed();
    }

    @Override
    public int open() {
        return super.open();
    }

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

    protected Image getBundleImage(String relativePath) {
        //        Bundle imageBundle = Platform.getBundle("com.modeliosoft.modelio.edition");
        //        IPath bitmapPath = new Path(relativePath);
        //        URL bitmapUrl = FileLocator.find(imageBundle, bitmapPath, null);
        //        ImageDescriptor desc = ImageDescriptor.createFromURL(bitmapUrl);
        //        return desc.createImage();
        return null;
    }

    @Override
    protected void cancelPressed() {
        this.editor.closeEditor(false);
        super.cancelPressed();
    }

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

    public TableViewer getContentTable() {
        return this.contentTable;
    }

    private List<StringAdapter> initContent(List<String> values) {
        List<StringAdapter> adapters = new ArrayList<StringAdapter>();
        for (String value : values) {
            adapters.add(new StringAdapter(value));
        }
        return adapters;
    }

    private List<String> getValues(List<StringAdapter> adapters) {
        List<String> values = new ArrayList<>();
        for (StringAdapter adapter : adapters) {
            values.add(adapter.getValue());
        }
        return values;
    }

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

    public void refresh() {
        this.contentTable.setInput(this.content);
        
        if (this.size != -1) {
            this.addStringText.setEnabled(this.content.size() < this.size);
        }
    }

    public Text getAddStringText() {
        return this.addStringText;
    }

    public Button getAddParameterButton() {
        return this.addParameterButton;
    }

    public Button getRemoveParameterButton() {
        return this.removeParameterButton;
    }

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

    public void addAdapter(StringAdapter adapter) {
        this.content.add(adapter);
        refresh();
    }

    public Button getMoveUpParameterButton() {
        return this.moveUpParameterButton;
    }

    public Button getMoveDownParameterButton() {
        return this.moveDownParameterButton;
    }

    private void createDetailedText(Composite area) {
        if (this.detailedMessage != null && !this.detailedMessage.equals("")) {
            Label detailText = new Label(area, SWT.NONE);
            detailText.setText(this.detailedMessage);
            GridData gd_detailText = new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1);
            gd_detailText.horizontalIndent = 3;
            detailText.setLayoutData(gd_detailText);
        }
    }

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

    public void removeAdapters(List<StringAdapter> adapters) {
        for (StringAdapter adapter : adapters) {
            this.content.remove(adapter);
        }
        refresh();
    }

    @SuppressWarnings("unchecked")
    public List<StringAdapter> getSelectedAdapters() {
        IStructuredSelection structuredSelection = (IStructuredSelection)this.contentTable.getSelection();
        return structuredSelection.toList();
    }

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

    private int getIndexUp(StringAdapter adapter, List<StringAdapter> list) {
        int index = list.indexOf(adapter);
        
        if (index < 1) {
            return -1;
        }
        
        index--;
        return index;
    }

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
