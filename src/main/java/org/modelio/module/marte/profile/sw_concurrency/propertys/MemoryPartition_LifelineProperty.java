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

@objid ("55071ee4-3e00-4422-aa83-118d6e408296")
public class MemoryPartition_LifelineProperty implements IPropertyContent {
    @objid ("49de432b-b28c-4442-9c6a-f7bd99481edd")
    private static List<ModelElement> typedElement = null;

    @objid ("d4135412-e4cb-454f-bf6a-76e0cc38c803")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("7b8de318-5256-4f15-85fb-21781cf1d6f2")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CONCURRENTRESOURCES_MEMORYPARTITION, 
        //                    MARTEDesignerTagTypes.MEMORYPARTITION_LIFELINE_MEMORYPARTITION_LIFELINE_CONCURRENTRESOURCES, 
                    value);
            
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MEMORYSPACES_MEMORYPARTITION, 
        //                    MARTEDesignerTagTypes.MEMORYPARTITION_LIFELINE_MEMORYPARTITION_LIFELINE_MEMORYSPACES, 
                    value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_FORK_MEMORYPARTITION, 
        //                    MARTEDesignerTagTypes.MEMORYPARTITION_LIFELINE_MEMORYPARTITION_LIFELINE_FORK, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_EXIT_MEMORYPARTITION, 
        //                    MARTEDesignerTagTypes.MEMORYPARTITION_LIFELINE_MEMORYPARTITION_LIFELINE_EXIT, 
                    value);
        }
    }

    @objid ("a11203e3-b75e-43d1-ac65-c19f9ee422e4")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Memory Partition
        //
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        
        String[] tab_concurrentResources = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CONCURRENTRESOURCES_MEMORYPARTITION), typedElement);
        String value_concurrentResources = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CONCURRENTRESOURCES_MEMORYPARTITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_LIFELINE_MEMORYPARTITION_LIFELINE_CONCURRENTRESOURCES),value_concurrentResources, tab_concurrentResources);
        
        String[] tab_memorySpaces = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MEMORYSPACES_MEMORYPARTITION), typedElement);
        String value_memorySpaces = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MEMORYSPACES_MEMORYPARTITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_LIFELINE_MEMORYPARTITION_LIFELINE_MEMORYSPACES),value_memorySpaces, tab_memorySpaces);
        
        
        String[] tab_fork = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_FORK_MEMORYPARTITION), behavioralFeature);
        String value_fork = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_FORK_MEMORYPARTITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_LIFELINE_MEMORYPARTITION_LIFELINE_FORK),value_fork, tab_fork);
          
        String[] tab_exit = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_EXIT_MEMORYPARTITION), behavioralFeature);
        String value_exit = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_EXIT_MEMORYPARTITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_LIFELINE_MEMORYPARTITION_LIFELINE_EXIT), value_exit, tab_exit);
    }

}
