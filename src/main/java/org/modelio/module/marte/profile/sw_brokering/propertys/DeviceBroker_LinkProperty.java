package org.modelio.module.marte.profile.sw_brokering.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6c164867-eb4b-4b80-8099-b32b55ee1496")
public class DeviceBroker_LinkProperty implements IPropertyContent {
    @objid ("f6b5bf5d-a1a9-499a-af5a-c4b51ef432fe")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_ACCESSPOLICY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_ISBUFFERED, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_DEVICES, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_CLOSESERVICES, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_CONTROLSERVICES, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_OPENSERVICES, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_READSERVICES, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_WRITESERVICES, value);
        }
    }

    @objid ("94a6d592-a700-4716-bd94-ba5add551cc5")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Device Broker
        //
        String [] tableAccessPolicyKind = {"Read", "Write", "ReadWrite", "Undef", "Other"};
        String value_accessPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_ACCESSPOLICY, elt);
        if(value_accessPolicy.equals("")){
            value_accessPolicy = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_ACCESSPOLICY),value_accessPolicy, tableAccessPolicyKind);
        
               
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_ISBUFFERED),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_ISBUFFERED, elt));
        
        
        String value_devices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_DEVICES, elt);
        if(value_devices.equals("")){
            value_devices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_DEVICES),value_devices);
        
        
        String value_closeServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_CLOSESERVICES, elt);
        if(value_closeServices.equals("")){
            value_closeServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_CLOSESERVICES),value_closeServices);
        
        
        String value_controlServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_CONTROLSERVICES, elt);
        if(value_controlServices.equals("")){
            value_controlServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_CONTROLSERVICES),value_controlServices);
        
        
        String value_openServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_OPENSERVICES, elt);
        if(value_openServices.equals("")){
            value_openServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_OPENSERVICES),value_openServices);
        
        
        String value_readServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_READSERVICES, elt);
        if(value_readServices.equals("")){
            value_readServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_READSERVICES),value_readServices);
        
        
        String value_writeServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_WRITESERVICES, elt);
        if(value_writeServices.equals("")){
            value_writeServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_LINK_DEVICEBROKER_LINK_WRITESERVICES),value_writeServices);
    }

}
