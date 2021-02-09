package org.modelio.module.marte.profile.gqam.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaAnalysisContext_NodeProperty implements IPropertyContent {
    private static List<ModelElement> workloads = null;

    private static List<ModelElement> platforms = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_CONTEXTPARAMS, value);
        }  else if(row == 2){
            
            ModelUtils.manageMultipleOrientedLink(elt, 
                    workloads, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_WORKLOAD_GAANALYSISCONTEXT, 
        //                    MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_WORKLOAD,
                    value);
        }
        else  if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    platforms, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_PLATFORM_GAANALYSISCONTEXT, 
        //                    MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_PLATFORM,
                    value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_context = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_CONTEXTPARAMS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_CONTEXTPARAMS),value_context);
        
        
        workloads = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GAWORKLOADBEHAVIOR_MODELELEMENT);
        String[] tab_workload = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_WORKLOAD_GAANALYSISCONTEXT), workloads);
        String value_workload = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_WORKLOAD_GAANALYSISCONTEXT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_WORKLOAD), value_workload, tab_workload);
            
        
        platforms = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GASCENARIO_MODELELEMENT);
        String[] tab_platform = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_PLATFORM_GAANALYSISCONTEXT), platforms);
        String value_platform = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_PLATFORM_GAANALYSISCONTEXT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_PLATFORM),value_platform, tab_platform);
    }

}
