package org.modelio.module.marte.profile.sw_brokering.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5c7c7570-0217-4c69-be72-95c3c1759cf8")
public class DeviceBroker_ClassifierProperty implements IPropertyContent {
    @objid ("dcf52a77-e08f-4e21-9584-a31b00eb2550")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ACCESSPOLICY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ISBUFFERED, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_DEVICES, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CLOSESERVICES, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CONTROLSERVICES, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_OPENSERVICES, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_READSERVICES, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_WRITESERVICES, value);
        }
    }

    @objid ("f16c0566-d9d6-4da6-bc1f-1e639d4f3cf0")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Device Broker
        //
        String [] tableAccessPolicyKind = {"Read", "Write", "ReadWrite", "Undef", "Other"};
        String value_accessPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ACCESSPOLICY, elt);
        if(value_accessPolicy.equals("")){
            value_accessPolicy = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ACCESSPOLICY),value_accessPolicy, tableAccessPolicyKind);
        
               
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ISBUFFERED),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ISBUFFERED, elt));
        
        
        String value_devices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_DEVICES, elt);
        if(value_devices.equals("")){
            value_devices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_DEVICES),value_devices);
        
        
        String value_closeServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CLOSESERVICES, elt);
        if(value_closeServices.equals("")){
            value_closeServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CLOSESERVICES),value_closeServices);
        
        
        String value_controlServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CONTROLSERVICES, elt);
        if(value_controlServices.equals("")){
            value_controlServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CONTROLSERVICES),value_controlServices);
        
        
        String value_openServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_OPENSERVICES, elt);
        if(value_openServices.equals("")){
            value_openServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_OPENSERVICES),value_openServices);
        
        
        String value_readServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_READSERVICES, elt);
        if(value_readServices.equals("")){
            value_readServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_READSERVICES),value_readServices);
        
        
        String value_writeServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_WRITESERVICES, elt);
        if(value_writeServices.equals("")){
            value_writeServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_WRITESERVICES),value_writeServices);
    }

}
