package org.modelio.module.marte.profile.editors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

@objid ("98140c66-a52d-4aa6-b9f6-f92a05b17d97")
public class ContentTableListener implements ISelectionChangedListener, KeyListener, ControlListener {
    @objid ("f7ac2a35-5cee-4ccf-a6a2-96f7fe44de0f")
    private StringListEditionDialog dialog = null;

    @objid ("e4cc0216-00d5-42cc-b166-8105c63c00e7")
    public ContentTableListener(StringListEditionDialog dialog) {
        this.dialog = dialog;
    }

    @objid ("a470b511-d74e-4d18-9617-ed1cf191cf3f")
    @Override
    public void selectionChanged(SelectionChangedEvent event) {
        List<StringAdapter> adapters = this.dialog.getSelectedAdapters();
        
        boolean enable = adapters.size() > 0;
        
        this.dialog.getMoveUpParameterButton().setEnabled(enable);
        this.dialog.getMoveDownParameterButton().setEnabled(enable);
        this.dialog.getRemoveParameterButton().setEnabled(enable);
    }

    @objid ("0ce26bdb-f1a7-4180-8f5c-f1c0685bf848")
    @Override
    public void keyPressed(KeyEvent event) {
    }

    @objid ("8ffe6078-948d-4df4-9196-de051357446b")
    @Override
    public void keyReleased(KeyEvent event) {
        if (event.keyCode == SWT.DEL) {
            List<StringAdapter> adapters = this.dialog.getSelectedAdapters();
            this.dialog.removeAdapters(adapters);
        } else if (event.keyCode == SWT.ARROW_UP && (event.stateMask & SWT.CTRL) != 0
                || event.keyCode == 'u' && (event.stateMask & SWT.CTRL) != 0
                || event.keyCode == 'U' && (event.stateMask & SWT.CTRL) != 0) {
            List<StringAdapter> adapters = this.dialog.getSelectedAdapters();
            this.dialog.moveUp(adapters);
        } else if (event.keyCode == SWT.ARROW_DOWN && (event.stateMask & SWT.CTRL) != 0
                || event.keyCode == 'd' && (event.stateMask & SWT.CTRL) != 0
                || event.keyCode == 'D' && (event.stateMask & SWT.CTRL) != 0) {
            List<StringAdapter> adapters = this.dialog.getSelectedAdapters();
            this.dialog.moveDown(adapters);
        }
    }

    @objid ("2309a00c-301d-4f01-a388-63541c1867f7")
    @Override
    public void controlMoved(ControlEvent e) {
    }

    @objid ("6f8bd786-802b-47c0-8fd2-db99c7cf5000")
    @Override
    public void controlResized(ControlEvent e) {
        Table table = (Table)e.getSource();
        int tableWidth = table.getSize().x - 5;
        
        TableColumn[] columns = table.getColumns();
        columns[0].setWidth(tableWidth);
    }

}
