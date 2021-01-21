package org.modelio.module.marte.profile.editors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

@objid ("3cc6a735-a36e-487e-8062-9d928c35b4bd")
public class MoveDownButtonListener implements SelectionListener {
    @objid ("17c9db52-1b33-4a6b-89a4-5edc69d93b0a")
    private StringListEditionDialog dialog = null;

    @objid ("fb85ce36-9319-4a1e-bb1f-63fea134da57")
    public MoveDownButtonListener(StringListEditionDialog dialog) {
        this.dialog = dialog;
    }

    @objid ("328b18e1-6e48-4204-bb98-03ccef0e27a1")
    @Override
    public void widgetDefaultSelected(SelectionEvent event) {
        moveDown(event);
    }

    @objid ("38a6ec66-5e36-40be-8226-51f8f57a5753")
    @Override
    public void widgetSelected(SelectionEvent event) {
        moveDown(event);
    }

    @objid ("11d914ec-b75f-4186-bbba-dfc4b88604f8")
    private void moveDown(SelectionEvent event) {
        List<StringAdapter> adapters = this.dialog.getSelectedAdapters();
        
        this.dialog.moveDown(adapters);
    }

}
