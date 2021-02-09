package org.modelio.module.marte.profile.sw_concurrency.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class EntryPoint_DependencyProperty implements IPropertyContent {
    private static List<ModelElement> behavioralFeature = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ENTRYPOINT_DEPENDENCY_ENTRYPOINT_DEPENDENCY_ISREENTRANT, value);
        }
        else if(row == 2){
            ModelUtils.manageSingleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINE_ENTRYPOINT, 
        //                    MARTEDesignerTagTypes.ENTRYPOINT_DEPENDENCY_ENTRYPOINT_DEPENDENCY_ROUTINE, 
                    value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Entry Point
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ENTRYPOINT_DEPENDENCY_ENTRYPOINT_DEPENDENCY_ISREENTRANT),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ENTRYPOINT_DEPENDENCY_ENTRYPOINT_DEPENDENCY_ISREENTRANT, elt));
        
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        String[] tab_routine = ModelUtils.createListString(behavioralFeature);      
        String value_routine = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINE_ENTRYPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ENTRYPOINT_DEPENDENCY_ENTRYPOINT_DEPENDENCY_ROUTINE), value_routine, tab_routine);
    }

}
