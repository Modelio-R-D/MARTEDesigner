package org.modelio.module.marte.profile.editors;

import java.util.List;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

public class RemoveButtonListener implements SelectionListener {
    private StringListEditionDialog dialog = null;

    public RemoveButtonListener(StringListEditionDialog dialog) {
        this.dialog = dialog;
    }

    @Override
    public void widgetDefaultSelected(SelectionEvent event) {
        removeAdpaters(event);
    }

    @Override
    public void widgetSelected(SelectionEvent event) {
        removeAdpaters(event);
    }

    private void removeAdpaters(SelectionEvent event) {
        List<StringAdapter> adapters = this.dialog.getSelectedAdapters();
        
        this.dialog.removeAdapters(adapters);
    }

}
