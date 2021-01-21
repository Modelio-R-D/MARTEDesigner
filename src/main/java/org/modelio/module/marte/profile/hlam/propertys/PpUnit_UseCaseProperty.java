package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2d9305ef-fce7-4eea-952c-4ae1f95375cb")
public class PpUnit_UseCaseProperty implements IPropertyContent {
    @objid ("a576fc11-f5e7-4849-8829-e95ef45e69fc")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PPUNIT_USECASE_PPUNIT_USECASE_CONCPOLICY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PPUNIT_USECASE_PPUNIT_USECASE_MEMORYSIZE, value);
        }
    }

    @objid ("6dcfd867-d27a-41f9-93a2-81162afb194f")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] types = MARTEEnumerationUtils.getCallConcurrencyKind();
        String value_callConcurrencyKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_USECASE_PPUNIT_USECASE_CONCPOLICY, elt);
        if(!(MARTEEnumerationUtils.isCallConcurrencyKind(value_callConcurrencyKind))){
             value_callConcurrencyKind = "sequential";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PPUNIT_USECASE_PPUNIT_USECASE_CONCPOLICY),value_callConcurrencyKind, types);
        
        
        String value_memorySize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_USECASE_PPUNIT_USECASE_MEMORYSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PPUNIT_USECASE_PPUNIT_USECASE_MEMORYSIZE),value_memorySize);
    }

}
