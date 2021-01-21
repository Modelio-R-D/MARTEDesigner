package org.modelio.module.marte.profile.sw_brokering.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("507b2760-3653-4dee-8a6d-db97bf393286")
public class MemoryBroker_InstanceProperty implements IPropertyContent {
    @objid ("7c654d21-8d29-4a5f-85e2-5f6a6d6b5e33")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_ACCESSPOLICY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORIES, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_LOCKSERVICES, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNLOCKSERVICES, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MAPSERVICES, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNMAPSERVICES, value);
        }
    }

    @objid ("c3a0e544-9df5-429d-b48a-ade773d9c182")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Memory Broker
        //
        String [] tableAccessPolicyKind = {"Read", "Write", "ReadWrite", "Undef", "Other"};
        String value_accessPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_ACCESSPOLICY, elt);
        if(value_accessPolicy.equals("")){
            value_accessPolicy = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_ACCESSPOLICY),value_accessPolicy, tableAccessPolicyKind);
               
        
        String value_memories = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORIES, elt);
        if(value_memories.equals("")){
            value_memories = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORIES),value_memories);
        
        
        String value_memoryBlockAdressElements = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS, elt);
        if(value_memoryBlockAdressElements.equals("")){
            value_memoryBlockAdressElements = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS),value_memoryBlockAdressElements);
        
        
        String value_memoryBlockSizeElements = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS, elt);
        if(value_memoryBlockSizeElements.equals("")){
            value_memoryBlockSizeElements = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS),value_memoryBlockSizeElements);
        
        
        String value_lockServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_LOCKSERVICES, elt);
        if(value_lockServices.equals("")){
            value_lockServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_LOCKSERVICES),value_lockServices);
        
        
        String value_unlockServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNLOCKSERVICES, elt);
        if(value_unlockServices.equals("")){
            value_unlockServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNLOCKSERVICES),value_unlockServices);
        
        
        String value_mapServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MAPSERVICES, elt);
        if(value_mapServices.equals("")){
            value_mapServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MAPSERVICES),value_mapServices);
        
        
        String value_unMapServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNMAPSERVICES, elt);
        if(value_unMapServices.equals("")){
            value_unMapServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNMAPSERVICES),value_unMapServices);
    }

}
