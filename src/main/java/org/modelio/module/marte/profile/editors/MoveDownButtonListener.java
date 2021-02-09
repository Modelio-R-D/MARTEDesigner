package org.modelio.module.marte.profile.editors;

import java.util.List;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

public class MoveDownButtonListener implements SelectionListener {
    private StringListEditionDialog dialog = null;

    public MoveDownButtonListener(StringListEditionDialog dialog) {
        this.dialog = dialog;
    }

    @Override
    public void widgetDefaultSelected(SelectionEvent event) {
        moveDown(event);
    }

    @Override
    public void widgetSelected(SelectionEvent event) {
        moveDown(event);
    }

    private void moveDown(SelectionEvent event) {
        List<StringAdapter> adapters = this.dialog.getSelectedAdapters();
        
        this.dialog.moveDown(adapters);
    }

}
