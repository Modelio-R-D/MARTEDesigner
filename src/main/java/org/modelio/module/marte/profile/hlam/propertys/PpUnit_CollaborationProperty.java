package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4d023a3f-fc4d-42f9-af8f-365a241fd966")
public class PpUnit_CollaborationProperty implements IPropertyContent {
    @objid ("e2a89d42-7e95-421c-8d97-57100df0bb08")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PPUNIT_COLLABORATION_PPUNIT_COLLABORATION_CONCPOLICY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PPUNIT_COLLABORATION_PPUNIT_COLLABORATION_MEMORYSIZE, value);
        }
    }

    @objid ("7d5e34ee-329b-4c16-b5b2-017c6ea61874")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] types = MARTEEnumerationUtils.getCallConcurrencyKind();
        String value_callConcurrencyKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_COLLABORATION_PPUNIT_COLLABORATION_CONCPOLICY, elt);
        if(!(MARTEEnumerationUtils.isCallConcurrencyKind(value_callConcurrencyKind))){
             value_callConcurrencyKind = "sequential";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PPUNIT_COLLABORATION_PPUNIT_COLLABORATION_CONCPOLICY),value_callConcurrencyKind, types);
        
        String value_memorySize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_COLLABORATION_PPUNIT_COLLABORATION_MEMORYSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PPUNIT_COLLABORATION_PPUNIT_COLLABORATION_MEMORYSIZE),value_memorySize);
    }

}
