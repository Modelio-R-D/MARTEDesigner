package org.modelio.module.marte.profile.editors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

@objid ("39ce398b-5875-4421-b88e-02c850df5268")
public class RemoveButtonListener implements SelectionListener {
    @objid ("3fce6493-7787-4653-bc89-4c8880102171")
    private StringListEditionDialog dialog = null;

    @objid ("417fab60-1513-453f-b288-77c4c5c71511")
    public RemoveButtonListener(StringListEditionDialog dialog) {
        this.dialog = dialog;
    }

    @objid ("f45c124f-8789-4ae8-86e6-00d43483bbd2")
    @Override
    public void widgetDefaultSelected(SelectionEvent event) {
        removeAdpaters(event);
    }

    @objid ("71c6bb9b-68e6-41c7-a01e-5de3ffc39286")
    @Override
    public void widgetSelected(SelectionEvent event) {
        removeAdpaters(event);
    }

    @objid ("10fc7e5c-85c8-460f-9d35-c76bdf2680e9")
    private void removeAdpaters(SelectionEvent event) {
        List<StringAdapter> adapters = this.dialog.getSelectedAdapters();
        
        this.dialog.removeAdapters(adapters);
    }

}
