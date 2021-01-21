package org.modelio.module.marte.profile.alloc.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8c06d773-9ec1-44ab-b315-1c8c8cbcddf8")
public class Allocated_ModelElementProperty implements IPropertyContent {
    @objid ("4abf61a0-1d9b-48c8-b914-0cc47392e61b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ALLOCATED_MODELELEMENT_ALLOCATED_MODELELEMENT_ALLOCATEDTO, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ALLOCATED_MODELELEMENT_ALLOCATED_MODELELEMENT_ALLOCATEDFROM, value);
        }
        else if (row == 3) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ALLOCATED_MODELELEMENT_ALLOCATED_MODELELEMENT_KIND, value);
        }
    }

    @objid ("252d4d81-701e-4749-bb37-9006f9f4d085")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_to = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.ALLOCATE_DEPENDENCY, elt);
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ALLOCATED_MODELELEMENT_ALLOCATED_MODELELEMENT_ALLOCATEDTO),value_to);
        
        String value_from = ModelUtils.getSourceDependencyNames(elt, MARTEDesignerStereotypes.ALLOCATE_DEPENDENCY);
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ALLOCATED_MODELELEMENT_ALLOCATED_MODELELEMENT_ALLOCATEDFROM),value_from);        
        
        String[] types_EndKind = MARTEEnumerationUtils.getAllocationEndKind();
        String value_endkind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ALLOCATED_MODELELEMENT_ALLOCATED_MODELELEMENT_KIND, elt);
        if(!(MARTEEnumerationUtils.isAllocationEndKind(value_endkind))){
            value_endkind = types_EndKind[0];
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ALLOCATED_MODELELEMENT_ALLOCATED_MODELELEMENT_KIND),value_endkind, types_EndKind);
    }

}
