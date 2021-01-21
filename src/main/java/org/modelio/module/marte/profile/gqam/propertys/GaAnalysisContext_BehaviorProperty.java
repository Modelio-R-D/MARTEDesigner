package org.modelio.module.marte.profile.gqam.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("939e88f9-a043-4fb5-a88f-cb07105372e0")
public class GaAnalysisContext_BehaviorProperty implements IPropertyContent {
    @objid ("c43d0f35-f598-4f80-9545-78dcc3854215")
    private static List<ModelElement> workloads = null;

    @objid ("23247e53-1987-4731-a3c1-de2fb686492d")
    private static List<ModelElement> platforms = null;

    @objid ("b14a1ca8-85ad-4a22-aa19-fdd4a13db079")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAANALYSISCONTEXT_BEHAVIOR_GAANALYSISCONTEXT_BEHAVIOR_CONTEXTPARAMS, value);
        }  else if(row == 2){
            
            ModelUtils.manageMultipleOrientedLink(elt, 
                    workloads, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_WORKLOAD_GAANALYSISCONTEXT, 
        //                    MARTEDesignerTagTypes.GAANALYSISCONTEXT_BEHAVIOR_GAANALYSISCONTEXT_BEHAVIOR_WORKLOAD,
                    value);
        }
        else  if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    platforms, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_PLATFORM_GAANALYSISCONTEXT, 
        //                    MARTEDesignerTagTypes.GAANALYSISCONTEXT_BEHAVIOR_GAANALYSISCONTEXT_BEHAVIOR_PLATFORM,
                    value);
        }
    }

    @objid ("c63f6618-f758-4c30-a4fa-76cc8743e5c1")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_context = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_BEHAVIOR_GAANALYSISCONTEXT_BEHAVIOR_CONTEXTPARAMS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAANALYSISCONTEXT_BEHAVIOR_GAANALYSISCONTEXT_BEHAVIOR_CONTEXTPARAMS),value_context);
        
        
        workloads = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GAWORKLOADBEHAVIOR_MODELELEMENT);
        String[] tab_workload = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_WORKLOAD_GAANALYSISCONTEXT), workloads);
        String value_workload = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_WORKLOAD_GAANALYSISCONTEXT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAANALYSISCONTEXT_BEHAVIOR_GAANALYSISCONTEXT_BEHAVIOR_WORKLOAD), value_workload, tab_workload);
            
        
        platforms = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GASCENARIO_MODELELEMENT);
        String[] tab_platform = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_PLATFORM_GAANALYSISCONTEXT), platforms);
        String value_platform = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_PLATFORM_GAANALYSISCONTEXT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAANALYSISCONTEXT_BEHAVIOR_GAANALYSISCONTEXT_BEHAVIOR_PLATFORM),value_platform, tab_platform);
    }

}
