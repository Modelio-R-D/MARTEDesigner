package org.modelio.module.marte.profile.editors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

@objid ("98a4e26a-5907-46df-a7ad-9ca5206f7d1d")
public class MoveUpButtonListener implements SelectionListener {
    @objid ("b7289c9d-9d0f-4ea7-9523-25d6297fc93e")
    private StringListEditionDialog dialog = null;

    @objid ("cb9e6e65-fdce-4150-9e92-412fc086a5e3")
    public MoveUpButtonListener(StringListEditionDialog dialog) {
        this.dialog = dialog;
    }

    @objid ("f5732e9a-d422-49e1-87dc-2e7aa40df4eb")
    @Override
    public void widgetDefaultSelected(SelectionEvent event) {
        moveUp(event);
    }

    @objid ("1cf3ae61-5658-4b28-8b70-50f48077ad21")
    @Override
    public void widgetSelected(SelectionEvent event) {
        moveUp(event);
    }

    @objid ("5c504d20-7ace-472f-98d7-ac9405fa112d")
    private void moveUp(SelectionEvent event) {
        List<StringAdapter> adapters = this.dialog.getSelectedAdapters();
        
        this.dialog.moveUp(adapters);
    }

}
