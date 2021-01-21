package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_Attribute;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("dcde2aee-8068-44be-9d51-2d2b8f45aa60")
public class HwComputingResource_Attribute extends ComputingResource_Attribute {
    @objid ("ba85f1bb-fbb5-461f-a6d0-b388072e2feb")
    public HwComputingResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwComputingResource_Attribute"));
    }

    @objid ("4b6ef012-0005-4f8c-80e7-2642b92bdd6c")
    public HwComputingResource_Attribute(Attribute element) {
        super(element);
    }

    @objid ("d0a49225-0685-4528-85ef-d1e4ba86d7dd")
    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_OP_FREQUENCIES, this.element);
    }

    @objid ("0343be17-fc07-40c0-b828-8deed05ff61f")
    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_OP_FREQUENCIES, value);
    }

    @objid ("e073fc2a-7afd-45f3-b292-5ba29aa19531")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_DESCRIPTION, this.element);
    }

    @objid ("ac484777-24b1-4fb9-81d3-096f804edb58")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_DESCRIPTION, value);
    }

    @objid ("6ddf1083-7e75-45f5-8e29-84e527672c19")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_P_HW_SERVICES, this.element);
    }

    @objid ("34827d24-5df4-4721-91ce-5829f2aae98e")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_P_HW_SERVICES, value);
    }

    @objid ("1b5de3fa-a6e8-4f01-89d6-4111592dcab7")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_R_HW_SERVICES, this.element);
    }

    @objid ("d4ff6287-32c6-41bf-9e59-e24c87b72db9")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_R_HW_SERVICES, value);
    }

    @objid ("63487610-409b-4b1b-bce7-136050f3d84d")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_OWNEDHW, this.element);
    }

    @objid ("7f401ec4-ea86-40e1-a154-26671dfc318f")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_OWNEDHW, value);
    }

    @objid ("2f917221-5ec3-4b24-83b3-5176d4e714a2")
    public String getHwComputingResource_Attribute_frequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_FREQUENCY, this.element);
    }

    @objid ("4faf3370-7b06-48c8-9222-841523ef9e86")
    public void setHwComputingResource_Attribute_frequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_FREQUENCY, value);
    }

    @objid ("36076535-9a6b-45c9-a6c2-0cc720bdf0b8")
    public String getHwComputingResource_Attribute_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_ENDPOINTS, this.element);
    }

    @objid ("82c52ae5-ec57-40d2-a1ef-14fba384398d")
    public void setHwComputingResource_Attribute_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_ENDPOINTS, value);
    }

}
