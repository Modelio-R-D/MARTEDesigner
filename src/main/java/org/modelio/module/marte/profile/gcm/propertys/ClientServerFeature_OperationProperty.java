package org.modelio.module.marte.profile.gcm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9d99c75c-5253-4973-a860-b5e902338553")
public class ClientServerFeature_OperationProperty implements IPropertyContent {
    @objid ("aeb1b164-8ad6-41b0-b7b3-a7f299326f02")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.CLIENTSERVERFEATURE_OPERATION_CLIENTSERVERFEATURE_OPERATION_KIND, value);
        }
    }

    @objid ("caad48aa-c182-482b-8c05-03a612e0162e")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] tab_kind = MARTEEnumerationUtils.getClientServerKind();
        String value_kind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLIENTSERVERFEATURE_OPERATION_CLIENTSERVERFEATURE_OPERATION_KIND, elt);
        if(!(MARTEEnumerationUtils.isClientServerKind(value_kind))){
            value_kind = "proreq";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLIENTSERVERFEATURE_OPERATION_CLIENTSERVERFEATURE_OPERATION_KIND),value_kind, tab_kind);
    }

}
