package org.modelio.module.marte.profile.sw_brokering.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5384771c-5465-4333-b63e-e68980b5336c")
public class DeviceBroker_AssociationEndProperty implements IPropertyContent {
    @objid ("6dd83f96-fa93-40ff-af19-ae03f07e9e16")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_ACCESSPOLICY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_ISBUFFERED, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_DEVICES, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_CLOSESERVICES, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_CONTROLSERVICES, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_OPENSERVICES, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_READSERVICES, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_WRITESERVICES, value);
        }
    }

    @objid ("8016db94-b983-4fa4-a142-f5129db4de21")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Device Broker
        //
        String [] tableAccessPolicyKind = {"Read", "Write", "ReadWrite", "Undef", "Other"};
        String value_accessPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_ACCESSPOLICY, elt);
        if(value_accessPolicy.equals("")){
            value_accessPolicy = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_ACCESSPOLICY),value_accessPolicy, tableAccessPolicyKind);
        
               
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_ISBUFFERED),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_ISBUFFERED, elt));
        
        
        String value_devices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_DEVICES, elt);
        if(value_devices.equals("")){
            value_devices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_DEVICES),value_devices);
        
        
        String value_closeServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_CLOSESERVICES, elt);
        if(value_closeServices.equals("")){
            value_closeServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_CLOSESERVICES),value_closeServices);
        
        
        String value_controlServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_CONTROLSERVICES, elt);
        if(value_controlServices.equals("")){
            value_controlServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_CONTROLSERVICES),value_controlServices);
        
        
        String value_openServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_OPENSERVICES, elt);
        if(value_openServices.equals("")){
            value_openServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_OPENSERVICES),value_openServices);
        
        
        String value_readServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_READSERVICES, elt);
        if(value_readServices.equals("")){
            value_readServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_READSERVICES),value_readServices);
        
        
        String value_writeServices = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_WRITESERVICES, elt);
        if(value_writeServices.equals("")){
            value_writeServices = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICEBROKER_ASSOCIATIONEND_WRITESERVICES),value_writeServices);
    }

}
