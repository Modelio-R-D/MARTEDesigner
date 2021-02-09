package org.modelio.module.marte.profile.editors;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.modelio.module.marte.i18n.I18nMessageService;

public class StringListLabelProvider extends LabelProvider {
    public Image getImage(Object element) {
        return null;
    }

    @Override
    public String getText(Object element) {
        StringAdapter adapter = (StringAdapter)element;
        String value = adapter.getValue();
        
        if (value == null || value.equals("")) {
            value = I18nMessageService.getString("StringListEditionDialog.EnterParameterHere");
        }
        return value;
    }

}
