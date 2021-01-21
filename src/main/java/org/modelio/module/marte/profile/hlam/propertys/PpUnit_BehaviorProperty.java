package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b3f7cff7-9828-4504-8296-a2714e98f689")
public class PpUnit_BehaviorProperty implements IPropertyContent {
    @objid ("380872a6-b040-46d4-b9fe-6bdd7dc2dbc1")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PPUNIT_BEHAVIOR_PPUNIT_BEHAVIOR_CONCPOLICY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PPUNIT_BEHAVIOR_PPUNIT_BEHAVIOR_MEMORYSIZE, value);
        }
    }

    @objid ("6bf24c3c-b04f-41fb-b315-f8e2dea329b8")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] types = MARTEEnumerationUtils.getCallConcurrencyKind();
        String value_callConcurrencyKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_BEHAVIOR_PPUNIT_BEHAVIOR_CONCPOLICY, elt);
        if(!(MARTEEnumerationUtils.isCallConcurrencyKind(value_callConcurrencyKind))){
             value_callConcurrencyKind = "sequential";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PPUNIT_BEHAVIOR_PPUNIT_BEHAVIOR_CONCPOLICY),value_callConcurrencyKind, types);
        
        
        String value_memorySize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_BEHAVIOR_PPUNIT_BEHAVIOR_MEMORYSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PPUNIT_BEHAVIOR_PPUNIT_BEHAVIOR_MEMORYSIZE),value_memorySize);
    }

}