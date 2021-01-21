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

@objid ("5e9c9374-e5a6-4f3d-acde-156ced44209a")
public class MemoryPartition_AssociationEndProperty implements IPropertyContent {
    @objid ("7b60a896-9d07-417d-9b1e-26d9aa25c11c")
    private static List<ModelElement> typedElement = null;

    @objid ("2bdcffc6-42dc-418c-9f5d-ceaf1714051e")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("3ebb7d9b-726b-4a74-aa56-ea843be22066")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CONCURRENTRESOURCES_MEMORYPARTITION, 
        //                    MARTEDesignerTagTypes.MEMORYPARTITION_ASSOCIATIONEND_MEMORYPARTITION_ASSOCIATIONEND_CONCURRENTRESOURCES, 
                    value);
            
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MEMORYSPACES_MEMORYPARTITION, 
        //                    MARTEDesignerTagTypes.MEMORYPARTITION_ASSOCIATIONEND_MEMORYPARTITION_ASSOCIATIONEND_MEMORYSPACES, 
                    value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_FORK_MEMORYPARTITION, 
        //                    MARTEDesignerTagTypes.MEMORYPARTITION_ASSOCIATIONEND_MEMORYPARTITION_ASSOCIATIONEND_FORK, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_EXIT_MEMORYPARTITION, 
        //                    MARTEDesignerTagTypes.MEMORYPARTITION_ASSOCIATIONEND_MEMORYPARTITION_ASSOCIATIONEND_EXIT, 
                    value);
        }
    }

    @objid ("2a637a4a-80c2-415d-814c-55648b1fcda0")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Memory Partition
        //
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        
        String[] tab_concurrentResources = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CONCURRENTRESOURCES_MEMORYPARTITION), typedElement);
        String value_concurrentResources = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CONCURRENTRESOURCES_MEMORYPARTITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_ASSOCIATIONEND_MEMORYPARTITION_ASSOCIATIONEND_CONCURRENTRESOURCES),value_concurrentResources, tab_concurrentResources);
        
        String[] tab_memorySpaces = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MEMORYSPACES_MEMORYPARTITION), typedElement);
        String value_memorySpaces = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MEMORYSPACES_MEMORYPARTITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_ASSOCIATIONEND_MEMORYPARTITION_ASSOCIATIONEND_MEMORYSPACES),value_memorySpaces, tab_memorySpaces);
        
        
        String[] tab_fork = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_FORK_MEMORYPARTITION), behavioralFeature);
        String value_fork = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_FORK_MEMORYPARTITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_ASSOCIATIONEND_MEMORYPARTITION_ASSOCIATIONEND_FORK),value_fork, tab_fork);
          
        String[] tab_exit = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_EXIT_MEMORYPARTITION), behavioralFeature);
        String value_exit = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_EXIT_MEMORYPARTITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_ASSOCIATIONEND_MEMORYPARTITION_ASSOCIATIONEND_EXIT), value_exit, tab_exit);
    }

}
