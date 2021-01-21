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

@objid ("fe81d9bb-d71c-4fd1-bc93-062d55f61961")
public class MemoryPartition_AssociationProperty implements IPropertyContent {
    @objid ("ea5ea8a2-a621-446d-aab6-bb92b2c729f7")
    private static List<ModelElement> typedElement = null;

    @objid ("637ea9a4-27f6-47ec-ba88-23f0ea4445fc")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("8cb2c3ad-afac-46eb-9451-4fedcfb50075")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CONCURRENTRESOURCES_MEMORYPARTITION, 
        //                    MARTEDesignerTagTypes.MEMORYPARTITION_ASSOCIATION_MEMORYPARTITION_ASSOCIATION_CONCURRENTRESOURCES, 
                    value);
            
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MEMORYSPACES_MEMORYPARTITION, 
        //                    MARTEDesignerTagTypes.MEMORYPARTITION_ASSOCIATION_MEMORYPARTITION_ASSOCIATION_MEMORYSPACES, 
                    value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_FORK_MEMORYPARTITION, 
        //                    MARTEDesignerTagTypes.MEMORYPARTITION_ASSOCIATION_MEMORYPARTITION_ASSOCIATION_FORK, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_EXIT_MEMORYPARTITION, 
        //                    MARTEDesignerTagTypes.MEMORYPARTITION_ASSOCIATION_MEMORYPARTITION_ASSOCIATION_EXIT, 
                    value);
        }
    }

    @objid ("c068404f-2297-4f81-85ca-e8296ca966af")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Memory Partition
        //
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        
        String[] tab_concurrentResources = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CONCURRENTRESOURCES_MEMORYPARTITION), typedElement);
        String value_concurrentResources = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CONCURRENTRESOURCES_MEMORYPARTITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_ASSOCIATION_MEMORYPARTITION_ASSOCIATION_CONCURRENTRESOURCES),value_concurrentResources, tab_concurrentResources);
        
        String[] tab_memorySpaces = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MEMORYSPACES_MEMORYPARTITION), typedElement);
        String value_memorySpaces = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MEMORYSPACES_MEMORYPARTITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_ASSOCIATION_MEMORYPARTITION_ASSOCIATION_MEMORYSPACES),value_memorySpaces, tab_memorySpaces);
        
        
        String[] tab_fork = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_FORK_MEMORYPARTITION), behavioralFeature);
        String value_fork = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_FORK_MEMORYPARTITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_ASSOCIATION_MEMORYPARTITION_ASSOCIATION_FORK),value_fork, tab_fork);
          
        String[] tab_exit = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_EXIT_MEMORYPARTITION), behavioralFeature);
        String value_exit = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_EXIT_MEMORYPARTITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_ASSOCIATION_MEMORYPARTITION_ASSOCIATION_EXIT), value_exit, tab_exit);
    }

}
