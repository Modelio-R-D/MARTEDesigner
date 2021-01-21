package org.modelio.module.marte.profile.sw_brokering.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f14f6241-a79f-4520-94d7-6c97391c1fdc")
public class MemoryBroker_AttributeProperty implements IPropertyContent {
    @objid ("df9d0c0c-e644-4c9d-80bc-39003665cbf4")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_ACCESSPOLICY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_MEMORIES, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKADRESSELEMENTS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKSIZEELEMENTS, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_LOCKSERVICES, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_UNLOCKSERVICES, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_MAPSERVICES, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_UNMAPSERVICES, value);
        }
    }

    @objid ("5776c4be-9dc2-4398-811b-25e02c438e61")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Memory Broker
        //
        String [] tableAccessPolicyKind = {"Read", "Write", "ReadWrite", "Undef", "Other"};
        String value_accessPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_ACCESSPOLICY, elt);
        if(value_accessPolicy.equals("")){
            value_accessPolicy = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_ACCESSPOLICY),value_accessPolicy, tableAccessPolicyKind);
               
        
        String value_memories = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_MEMORIES, elt);
        if(value_memories.equals("")){
            value_memories = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_MEMORIES),value_memories);
        
        
        String value_memoryBlockAdressElements = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKADRESSELEMENTS, elt);
        if(value_memoryBlockAdressElements.equals("")){
            value_memoryBlockAdressElements = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKADRESSELEMENTS),value_memoryBlockAdressElements);
        
        
        String value_memoryBlockSizeElements = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKSIZEELEMENTS, elt);
        if(value_memoryBlockSizeElements.equals("")){
            value_memoryBlockSizeElements = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKSIZEELEMENTS),value_memoryBlockSizeElements);
        
        
        String value_lockServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_LOCKSERVICES, elt);
        if(value_lockServices.equals("")){
            value_lockServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_LOCKSERVICES),value_lockServices);
        
        
        String value_unlockServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_UNLOCKSERVICES, elt);
        if(value_unlockServices.equals("")){
            value_unlockServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_UNLOCKSERVICES),value_unlockServices);
        
        
        String value_mapServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_MAPSERVICES, elt);
        if(value_mapServices.equals("")){
            value_mapServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_MAPSERVICES),value_mapServices);
        
        
        String value_unMapServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_UNMAPSERVICES, elt);
        if(value_unMapServices.equals("")){
            value_unMapServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBROKER_ATTRIBUTE_UNMAPSERVICES),value_unMapServices);
    }

}
