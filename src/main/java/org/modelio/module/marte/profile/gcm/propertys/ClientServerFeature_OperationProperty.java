package org.modelio.module.marte.profile.gcm.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ClientServerFeature_OperationProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.CLIENTSERVERFEATURE_OPERATION_CLIENTSERVERFEATURE_OPERATION_KIND, value);
        }
    }

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
