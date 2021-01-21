package org.modelio.module.marte.profile.sw_brokering.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("97ffc332-469a-4f0d-b7e8-2fe8fb6402d3")
public class MemoryBroker_LifelineProperty implements IPropertyContent {
    @objid ("434976f0-b28e-4066-9059-8d7f72341514")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_ACCESSPOLICY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_MEMORIES, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_LOCKSERVICES, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_UNLOCKSERVICES, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_MAPSERVICES, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_UNMAPSERVICES, value);
        }
    }

    @objid ("50f39bf0-b13c-4534-a1f6-363047691daa")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Memory Broker
        //
        String [] tableAccessPolicyKind = {"Read", "Write", "ReadWrite", "Undef", "Other"};
        String value_accessPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_ACCESSPOLICY, elt);
        if(value_accessPolicy.equals("")){
            value_accessPolicy = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_ACCESSPOLICY),value_accessPolicy, tableAccessPolicyKind);
               
        
        String value_memories = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_MEMORIES, elt);
        if(value_memories.equals("")){
            value_memories = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_MEMORIES),value_memories);
        
        
        String value_memoryBlockAdressElements = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS, elt);
        if(value_memoryBlockAdressElements.equals("")){
            value_memoryBlockAdressElements = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS),value_memoryBlockAdressElements);
        
        
        String value_memoryBlockSizeElements = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS, elt);
        if(value_memoryBlockSizeElements.equals("")){
            value_memoryBlockSizeElements = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS),value_memoryBlockSizeElements);
        
        
        String value_lockServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_LOCKSERVICES, elt);
        if(value_lockServices.equals("")){
            value_lockServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_LOCKSERVICES),value_lockServices);
        
        
        String value_unlockServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_UNLOCKSERVICES, elt);
        if(value_unlockServices.equals("")){
            value_unlockServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_UNLOCKSERVICES),value_unlockServices);
        
        
        String value_mapServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_MAPSERVICES, elt);
        if(value_mapServices.equals("")){
            value_mapServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_MAPSERVICES),value_mapServices);
        
        
        String value_unMapServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_UNMAPSERVICES, elt);
        if(value_unMapServices.equals("")){
            value_unMapServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYBROKER_LIFELINE_MEMORYBROKER_LIFELINE_UNMAPSERVICES),value_unMapServices);
    }

}