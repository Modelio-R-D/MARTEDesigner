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

@objid ("7ec1fca1-ded8-43ac-a816-e1d2937a109c")
public class GaAnalysisContext_ClassProperty implements IPropertyContent {
    @objid ("8323fb54-496c-49f7-86f8-afa504b0bc8a")
    private static List<ModelElement> workloads = null;

    @objid ("dff1f667-7915-46d2-ba95-50e5219c6cc7")
    private static List<ModelElement> platforms = null;

    @objid ("52b6ad82-dbcf-4852-9ad4-59df74f7c29f")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_CONTEXTPARAMS, value);
        }  else if(row == 2){
            
            ModelUtils.manageMultipleOrientedLink(elt, 
                    workloads, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_WORKLOAD_GAANALYSISCONTEXT, 
        //                    MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_WORKLOAD,
                    value);
        }
        else  if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    platforms, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_PLATFORM_GAANALYSISCONTEXT, 
        //                    MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_PLATFORM,
                    value);
        }
    }

    @objid ("a3cb3ef7-4fe6-41fc-bb35-a053f7da87c5")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_context = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_CONTEXTPARAMS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_CONTEXTPARAMS),value_context);
        
        
        workloads = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GAWORKLOADBEHAVIOR_MODELELEMENT);
        String[] tab_workload = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_WORKLOAD_GAANALYSISCONTEXT), workloads);
        String value_workload = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_WORKLOAD_GAANALYSISCONTEXT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_WORKLOAD), value_workload, tab_workload);
            
        
        platforms = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GASCENARIO_MODELELEMENT);
        String[] tab_platform = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_PLATFORM_GAANALYSISCONTEXT), platforms);
        String value_platform = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_PLATFORM_GAANALYSISCONTEXT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_PLATFORM),value_platform, tab_platform);
    }

}
