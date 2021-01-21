package org.modelio.module.marte.profile.editors;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.modelio.module.marte.i18n.I18nMessageService;

@objid ("3e61d085-a3b3-4cb0-9bbe-bf5f811f6f1e")
public class StringListLabelProvider extends LabelProvider {
    @objid ("911f5ffa-4d03-403e-9acc-a701680ea516")
    public Image getImage(Object element) {
        return null;
    }

    @objid ("5d4ed3ff-d464-4b63-9110-20cb0080ef45")
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
