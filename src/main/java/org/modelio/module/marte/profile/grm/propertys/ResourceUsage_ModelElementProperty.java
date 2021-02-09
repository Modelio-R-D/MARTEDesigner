package org.modelio.module.marte.profile.grm.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ResourceUsage_ModelElementProperty implements IPropertyContent {
    private static List<ModelElement> _resources = null;

    private static List<ModelElement> _resourceUsages = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_EXECTIME, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_ALLOCATEDMEMORY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_USEDMEMORY, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_POWERPEAK, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_ENERGY, value);
        }
        else if(row == 6){
             ModelUtils.manageMultipleOrientedLink(elt, 
                        _resourceUsages, 
                        MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBUSAGE_RESOURCEUSAGE, 
        //                        MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_SUBUSAGE, 
                        value);
        }
        else if(row == 7){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     _resources, 
                        MARTEDesignerStereotypes.PROFILEASSOCIATION_USEDRESOURCES_RESOURCEUSAGE_RESOURCE, 
        //                        MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_USEDRESOURCES, 
                        value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_MSGSIZE, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        _resources = MARTESearchUtils.searchResource();   
        _resourceUsages = MARTESearchUtils.searchResourceUsage();   
        
        String value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_EXECTIME, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_EXECTIME),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_ALLOCATEDMEMORY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_ALLOCATEDMEMORY),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_USEDMEMORY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_USEDMEMORY),value);
        
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_POWERPEAK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_POWERPEAK),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_ENERGY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_ENERGY),value);
        
        
        String[] tab_subUsage = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBUSAGE_RESOURCEUSAGE), _resourceUsages);
        String value_subUsage = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBUSAGE_RESOURCEUSAGE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_SUBUSAGE),value_subUsage, tab_subUsage);
         
               
        String[] tab_usedResources = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_USEDRESOURCES_RESOURCEUSAGE_RESOURCE), _resources);
        String value_usedResources = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_USEDRESOURCES_RESOURCEUSAGE_RESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_USEDRESOURCES),value_usedResources, tab_usedResources);
         
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_MSGSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCEUSAGE_MODELELEMENT_RESOURCEUSAGE_MODELELEMENT_MSGSIZE),value);
    }

}
