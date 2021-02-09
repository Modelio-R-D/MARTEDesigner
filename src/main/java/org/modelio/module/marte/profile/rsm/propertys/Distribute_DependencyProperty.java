package org.modelio.module.marte.profile.rsm.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Distribute_DependencyProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DISTRIBUTE_DEPENDENCY_DISTRIBUTE_DEPENDENCY_PATTERNSHAPE, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.DISTRIBUTE_DEPENDENCY_DISTRIBUTE_DEPENDENCY_REPETITIONSPACE, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.DISTRIBUTE_DEPENDENCY_DISTRIBUTE_DEPENDENCY_FROMTILER, value);
        }
        if(row == 4){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.DISTRIBUTE_DEPENDENCY_DISTRIBUTE_DEPENDENCY_TOTILER, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_patternShape = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DISTRIBUTE_DEPENDENCY_DISTRIBUTE_DEPENDENCY_PATTERNSHAPE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DISTRIBUTE_DEPENDENCY_DISTRIBUTE_DEPENDENCY_PATTERNSHAPE),value_patternShape);
        
        String value_repetitionSpace = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DISTRIBUTE_DEPENDENCY_DISTRIBUTE_DEPENDENCY_REPETITIONSPACE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DISTRIBUTE_DEPENDENCY_DISTRIBUTE_DEPENDENCY_REPETITIONSPACE),value_repetitionSpace);
               
        String value_fromTiler = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DISTRIBUTE_DEPENDENCY_DISTRIBUTE_DEPENDENCY_FROMTILER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DISTRIBUTE_DEPENDENCY_DISTRIBUTE_DEPENDENCY_FROMTILER),value_fromTiler);
        
        String value_toTiler = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DISTRIBUTE_DEPENDENCY_DISTRIBUTE_DEPENDENCY_TOTILER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DISTRIBUTE_DEPENDENCY_DISTRIBUTE_DEPENDENCY_TOTILER),value_toTiler);
    }

}
