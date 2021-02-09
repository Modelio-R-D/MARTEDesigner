package org.modelio.module.marte.profile.hlam.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class RtService_OperationProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_CONCPOLICY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_EXEKIND, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_ISATOMIC, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_SYNCHKIND, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] concurrencyKind = MARTEEnumerationUtils.getConcurrencyKind();
        String value_concurrencyKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_CONCPOLICY, elt);
        if(!(MARTEEnumerationUtils.isConcurrencyKind(value_concurrencyKind))){
            value_concurrencyKind = "reader";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_CONCPOLICY),value_concurrencyKind, concurrencyKind);
        
        
        String[] executionKind = MARTEEnumerationUtils.getExecutionKind();
        String value_executionKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_EXEKIND, elt);
        if(!(MARTEEnumerationUtils.isExecutionKind(value_executionKind))){
            value_executionKind = "deferred";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_EXEKIND),value_executionKind, executionKind);
        
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_ISATOMIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_ISATOMIC, elt));
        
        String[] synchronisationKind = MARTEEnumerationUtils.getSynchronisationKind();
        String value_synchronisationKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_SYNCHKIND, elt);
        if(!(MARTEEnumerationUtils.isSynchronisationKind(value_synchronisationKind))){
            value_synchronisationKind = "other";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_SYNCHKIND),value_synchronisationKind, synchronisationKind);
    }

}
