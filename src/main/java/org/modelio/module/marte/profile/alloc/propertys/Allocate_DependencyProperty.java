package org.modelio.module.marte.profile.alloc.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ac29b9ee-dd07-421e-9fa7-1215f5e20348")
public class Allocate_DependencyProperty implements IPropertyContent {
    @objid ("ef4d691f-e155-4831-9bee-c805f0e13c81")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_KIND, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_NATURE, value);
        }
        else if (row == 3) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_IMPLIEDCONSTRAINT, value);
        }
    }

    @objid ("91c65daa-0f1f-4039-9e77-03dbad82bb86")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] typesKind = MARTEEnumerationUtils.getAllocationKind();
        String value_kind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_KIND, elt);
        if(!(MARTEEnumerationUtils.isAllocationKind(value_kind))){
            value_kind = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_KIND),value_kind, typesKind);
        
        String[] typesNature = MARTEEnumerationUtils.getAllocationNature();
        String value_nature = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_NATURE, elt);
        if(!(MARTEEnumerationUtils.isAllocationNature(value_nature))){
            value_nature = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_NATURE),value_nature, typesNature);
        
        String value_impliedConstraint = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_IMPLIEDCONSTRAINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_IMPLIEDCONSTRAINT),value_impliedConstraint);
    }

}
