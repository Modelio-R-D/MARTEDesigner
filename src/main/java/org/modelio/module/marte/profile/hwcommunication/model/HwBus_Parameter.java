package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a5558712-d9d3-4c6b-9400-b5834bd5acee")
public class HwBus_Parameter extends HwMedia_Parameter {
    @objid ("777fbd64-9461-4bb5-bf98-a8fe500f53ce")
    public HwBus_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBUS_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwBus_Parameter"));
    }

    @objid ("bc4e8768-f769-49d4-90db-85fb5abf5d4e")
    public HwBus_Parameter(Parameter element) {
        super(element);
    }

    @objid ("53db0536-070f-4815-a06d-fcfb964bf6a5")
    public String getadressWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ADRESSWIDTH, this.element);
    }

    @objid ("4b37b1a2-e4ab-47ad-9e23-f95e93c19cd8")
    public void setadressWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ADRESSWIDTH, value);
    }

    @objid ("e3c8eb90-400b-4ae1-8727-5f3b5bb32cdf")
    public String getwordWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_WORDWIDTH, this.element);
    }

    @objid ("f635b3b8-2944-4927-a0b6-61e13a2bbbd9")
    public void setwordWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_WORDWIDTH, value);
    }

    @objid ("ae771cf4-dbd7-45d7-ba3b-4464875f71ab")
    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ISSYNCHRONOUS, this.element);
    }

    @objid ("e2990cce-a503-4463-a5d3-7f9ae1662745")
    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ISSYNCHRONOUS,value);
    }

    @objid ("8490387f-d9c0-43fd-8743-752fb86820a8")
    public boolean isisSerial() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ISSERIAL, this.element);
    }

    @objid ("07911573-65bc-4d96-83bc-2a6fc9ddaa29")
    public void isisSerial(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ISSERIAL,value);
    }

    @objid ("86d23193-e952-4730-8ee1-e2bedcda6b5d")
    public Parameter getElement() {
        return this.element;
    }

}
