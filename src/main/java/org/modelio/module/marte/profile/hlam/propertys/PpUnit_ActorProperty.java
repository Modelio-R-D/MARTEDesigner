package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a5a5bb2b-63a6-4b68-acbe-969fe9889747")
public class PpUnit_ActorProperty implements IPropertyContent {
    @objid ("0caac41f-152d-43e0-9b46-f06e2c332c98")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PPUNIT_ACTOR_PPUNIT_ACTOR_CONCPOLICY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PPUNIT_ACTOR_PPUNIT_ACTOR_MEMORYSIZE, value);
        }
    }

    @objid ("c5db29d1-f8e2-4535-8571-12905b4fb87d")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] types = MARTEEnumerationUtils.getCallConcurrencyKind();
        String value_callConcurrencyKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_ACTOR_PPUNIT_ACTOR_CONCPOLICY, elt);
        if(!(MARTEEnumerationUtils.isCallConcurrencyKind(value_callConcurrencyKind))){
            value_callConcurrencyKind = "sequential";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PPUNIT_ACTOR_PPUNIT_ACTOR_CONCPOLICY),value_callConcurrencyKind, types);
        
        
        String value_memorySize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_ACTOR_PPUNIT_ACTOR_MEMORYSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PPUNIT_ACTOR_PPUNIT_ACTOR_MEMORYSIZE),value_memorySize);
    }

}
