package org.modelio.module.marte.profile.sw_brokering.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c9b89150-5774-472b-9204-2ee97514fe73")
public class DeviceBroker_AttributeProperty implements IPropertyContent {
    @objid ("b2c6ec1c-06b0-4419-ae5a-59bbb06a6242")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_ACCESSPOLICY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_ISBUFFERED, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_DEVICES, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_CLOSESERVICES, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_CONTROLSERVICES, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_OPENSERVICES, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_READSERVICES, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_WRITESERVICES, value);
        }
    }

    @objid ("ac21447d-1482-4850-b151-18b756302c09")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Device Broker
        //
        String [] tableAccessPolicyKind = {"Read", "Write", "ReadWrite", "Undef", "Other"};
        String value_accessPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_ACCESSPOLICY, elt);
        if(value_accessPolicy.equals("")){
            value_accessPolicy = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_ACCESSPOLICY),value_accessPolicy, tableAccessPolicyKind);
        
               
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_ISBUFFERED),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_ISBUFFERED, elt));
        
        
        String value_devices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_DEVICES, elt);
        if(value_devices.equals("")){
            value_devices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_DEVICES),value_devices);
        
        
        String value_closeServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_CLOSESERVICES, elt);
        if(value_closeServices.equals("")){
            value_closeServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_CLOSESERVICES),value_closeServices);
        
        
        String value_controlServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_CONTROLSERVICES, elt);
        if(value_controlServices.equals("")){
            value_controlServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_CONTROLSERVICES),value_controlServices);
        
        
        String value_openServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_OPENSERVICES, elt);
        if(value_openServices.equals("")){
            value_openServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_OPENSERVICES),value_openServices);
        
        
        String value_readServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_READSERVICES, elt);
        if(value_readServices.equals("")){
            value_readServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_READSERVICES),value_readServices);
        
        
        String value_writeServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_WRITESERVICES, elt);
        if(value_writeServices.equals("")){
            value_writeServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_ATTRIBUTE_DEVICEBROKER_ATTRIBUTE_WRITESERVICES),value_writeServices);
    }

}
