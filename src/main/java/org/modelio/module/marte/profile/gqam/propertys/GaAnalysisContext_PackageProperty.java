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

@objid ("de0f4a65-a999-4e6a-aafc-cb8c71ec3f72")
public class GaAnalysisContext_PackageProperty implements IPropertyContent {
    @objid ("52f39bc5-04f5-45df-ac46-9443b79eb9f9")
    private static List<ModelElement> workloads = null;

    @objid ("a7c2adab-cbae-449c-8a6a-7d51bc0a3ab5")
    private static List<ModelElement> platforms = null;

    @objid ("70088f52-fe5f-4fa8-bc94-ec467f556c42")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_CONTEXTPARAMS, value);
        }  else if(row == 2){
            
            ModelUtils.manageMultipleOrientedLink(elt, 
                    workloads, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_WORKLOAD_GAANALYSISCONTEXT, 
        //                    MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_WORKLOAD,
                    value);
        }
        else  if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    platforms, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_PLATFORM_GAANALYSISCONTEXT, 
        //                    MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_PLATFORM,
                    value);
        }
    }

    @objid ("794873b1-d385-47cd-ac9a-c691f4d9d79b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_context = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_CONTEXTPARAMS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_CONTEXTPARAMS),value_context);
        
        
        workloads = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GAWORKLOADBEHAVIOR_MODELELEMENT);
        String[] tab_workload = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_WORKLOAD_GAANALYSISCONTEXT), workloads);
        String value_workload = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_WORKLOAD_GAANALYSISCONTEXT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_WORKLOAD), value_workload, tab_workload);
            
        
        platforms = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GASCENARIO_MODELELEMENT);
        String[] tab_platform = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_PLATFORM_GAANALYSISCONTEXT), platforms);
        String value_platform = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_PLATFORM_GAANALYSISCONTEXT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_PLATFORM),value_platform, tab_platform);
    }

}
