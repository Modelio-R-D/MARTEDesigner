package org.modelio.module.marte.profile.editors;

import java.util.List;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class ContentTableListener implements ISelectionChangedListener, KeyListener, ControlListener {
    private StringListEditionDialog dialog = null;

    public ContentTableListener(StringListEditionDialog dialog) {
        this.dialog = dialog;
    }

    @Override
    public void selectionChanged(SelectionChangedEvent event) {
        List<StringAdapter> adapters = this.dialog.getSelectedAdapters();
        
        boolean enable = adapters.size() > 0;
        
        this.dialog.getMoveUpParameterButton().setEnabled(enable);
        this.dialog.getMoveDownParameterButton().setEnabled(enable);
        this.dialog.getRemoveParameterButton().setEnabled(enable);
    }

    @Override
    public void keyPressed(KeyEvent event) {
    }

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

    @Override
    public void controlMoved(ControlEvent e) {
    }

    @Override
    public void controlResized(ControlEvent e) {
        Table table = (Table)e.getSource();
        int tableWidth = table.getSize().x - 5;
        
        TableColumn[] columns = table.getColumns();
        columns[0].setWidth(tableWidth);
    }

}
