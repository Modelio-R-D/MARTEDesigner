package org.modelio.module.marte.profile.sw_concurrency.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e1d459f8-d18b-4b77-8421-f912a71aa173")
public class MemoryPartition_AttributeProperty implements IPropertyContent {
    @objid ("b894cab2-b78d-4572-87de-7a157ed74fdc")
    private static List<ModelElement> typedElement = null;

    @objid ("63d5b108-2c68-420c-a77d-7b4d70cf8f0a")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("f91e586d-8211-4429-ae3c-0eb759d2de82")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CONCURRENTRESOURCES_MEMORYPARTITION, 
        //                    MARTEDesignerTagTypes.MEMORYPARTITION_ATTRIBUTE_MEMORYPARTITION_ATTRIBUTE_CONCURRENTRESOURCES, 
                    value);
            
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MEMORYSPACES_MEMORYPARTITION, 
        //                    MARTEDesignerTagTypes.MEMORYPARTITION_ATTRIBUTE_MEMORYPARTITION_ATTRIBUTE_MEMORYSPACES, 
                    value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_FORK_MEMORYPARTITION, 
        //                    MARTEDesignerTagTypes.MEMORYPARTITION_ATTRIBUTE_MEMORYPARTITION_ATTRIBUTE_FORK, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_EXIT_MEMORYPARTITION, 
        //                    MARTEDesignerTagTypes.MEMORYPARTITION_ATTRIBUTE_MEMORYPARTITION_ATTRIBUTE_EXIT, 
                    value);
        }
    }

    @objid ("15fda5e6-8989-43f0-a275-9f69f658dae8")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Memory Partition
        //
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        
        String[] tab_concurrentResources = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CONCURRENTRESOURCES_MEMORYPARTITION), typedElement);
        String value_concurrentResources = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CONCURRENTRESOURCES_MEMORYPARTITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_ATTRIBUTE_MEMORYPARTITION_ATTRIBUTE_CONCURRENTRESOURCES),value_concurrentResources, tab_concurrentResources);
        
        String[] tab_memorySpaces = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MEMORYSPACES_MEMORYPARTITION), typedElement);
        String value_memorySpaces = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MEMORYSPACES_MEMORYPARTITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_ATTRIBUTE_MEMORYPARTITION_ATTRIBUTE_MEMORYSPACES),value_memorySpaces, tab_memorySpaces);
        
        
        String[] tab_fork = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_FORK_MEMORYPARTITION), behavioralFeature);
        String value_fork = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_FORK_MEMORYPARTITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_ATTRIBUTE_MEMORYPARTITION_ATTRIBUTE_FORK),value_fork, tab_fork);
          
        String[] tab_exit = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_EXIT_MEMORYPARTITION), behavioralFeature);
        String value_exit = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_EXIT_MEMORYPARTITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_ATTRIBUTE_MEMORYPARTITION_ATTRIBUTE_EXIT), value_exit, tab_exit);
    }

}