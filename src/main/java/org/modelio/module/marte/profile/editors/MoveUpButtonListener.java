package org.modelio.module.marte.profile.editors;

import java.util.List;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

public class MoveUpButtonListener implements SelectionListener {
    private StringListEditionDialog dialog = null;

    public MoveUpButtonListener(StringListEditionDialog dialog) {
        this.dialog = dialog;
    }

    @Override
    public void widgetDefaultSelected(SelectionEvent event) {
        moveUp(event);
    }

    @Override
    public void widgetSelected(SelectionEvent event) {
        moveUp(event);
    }

    private void moveUp(SelectionEvent event) {
        List<StringAdapter> adapters = this.dialog.getSelectedAdapters();
        
        this.dialog.moveUp(adapters);
    }

}
