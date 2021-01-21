package org.modelio.module.marte.profile.editors;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Text;

@objid ("9d17e774-2916-4591-b892-cd659f337b75")
public class AddButtonListener implements SelectionListener {
    @objid ("99a302ef-98c3-4cb8-8feb-5d6e4652da38")
    private StringListEditionDialog dialog = null;

    @objid ("68695059-0fe4-430d-bfa2-573d1d96a5d6")
    public AddButtonListener(StringListEditionDialog dialog) {
        this.dialog = dialog;
    }

    @objid ("f95c42d0-6fc0-4b24-bc19-86d9e1e79cca")
    @Override
    public void widgetDefaultSelected(SelectionEvent event) {
        addString(event);
    }

    @objid ("07006e4a-e72e-4b42-83fb-b4d6c02ea75b")
    @Override
    public void widgetSelected(SelectionEvent event) {
        addString(event);
    }

    @objid ("a7451148-9cdf-4bd2-92b7-2d367ac2625a")
    private void addString(SelectionEvent event) {
        Text addStringText = this.dialog.getAddStringText();
        String text = addStringText.getText();
        this.dialog.addAdapter(new StringAdapter(text));
        addStringText.setText("");
    }

}
