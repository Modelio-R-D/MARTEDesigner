package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("60c8a90b-1e36-49d9-a4d4-e8d9dfcee8fd")
public class PpUnit_ClassProperty implements IPropertyContent {
    @objid ("771a15e2-cf8f-4dc2-a5d2-6d248f031b4a")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PPUNIT_CLASS_PPUNIT_CLASS_CONCPOLICY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PPUNIT_CLASS_PPUNIT_CLASS_MEMORYSIZE, value);
        }
    }

    @objid ("7aa0597d-6590-4c5c-8b37-836e67cd4fd1")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] types = MARTEEnumerationUtils.getCallConcurrencyKind();
        String value_callConcurrencyKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_CLASS_PPUNIT_CLASS_CONCPOLICY, elt);
        if(!(MARTEEnumerationUtils.isCallConcurrencyKind(value_callConcurrencyKind))){
             value_callConcurrencyKind = "sequential";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PPUNIT_CLASS_PPUNIT_CLASS_CONCPOLICY),value_callConcurrencyKind, types);
        
        
        
        String value_memorySize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_CLASS_PPUNIT_CLASS_MEMORYSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PPUNIT_CLASS_PPUNIT_CLASS_MEMORYSIZE),value_memorySize);
    }

}
