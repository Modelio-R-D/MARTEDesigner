package org.modelio.module.marte.profile.editors;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Text;

public class AddButtonListener implements SelectionListener {
    private StringListEditionDialog dialog = null;

    public AddButtonListener(StringListEditionDialog dialog) {
        this.dialog = dialog;
    }

    @Override
    public void widgetDefaultSelected(SelectionEvent event) {
        addString(event);
    }

    @Override
    public void widgetSelected(SelectionEvent event) {
        addString(event);
    }

    private void addString(SelectionEvent event) {
        Text addStringText = this.dialog.getAddStringText();
        String text = addStringText.getText();
        this.dialog.addAdapter(new StringAdapter(text));
        addStringText.setText("");
    }

}
