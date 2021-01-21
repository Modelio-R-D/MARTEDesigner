package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_Lifeline;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f2cb429b-88ed-439e-b47f-712656f85d11")
public class HwComputingResource_Lifeline extends ComputingResource_Lifeline {
    @objid ("c52cc2cf-14ff-4b21-b0eb-15f19ba89a94")
    public HwComputingResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwComputingResource_Lifeline"));
    }

    @objid ("6f1f5561-e4ae-4b30-8660-2ee09be73062")
    public HwComputingResource_Lifeline(Lifeline element) {
        super(element);
    }

    @objid ("4572de3b-a7d2-48f4-b82b-c5359bf5c78d")
    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_OP_FREQUENCIES, this.element);
    }

    @objid ("6f04775e-4841-45a0-a636-65533b91cee1")
    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_OP_FREQUENCIES, value);
    }

    @objid ("423cec61-f0bc-48b3-a33e-ec841a81e931")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_DESCRIPTION, this.element);
    }

    @objid ("c72383b0-3b5a-4dec-b196-7953a26b8837")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_DESCRIPTION, value);
    }

    @objid ("77954eef-9895-4fa6-838c-c402981d85f9")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_P_HW_SERVICES, this.element);
    }

    @objid ("653a865e-52c5-4c89-90ef-7c1904487d7b")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_P_HW_SERVICES, value);
    }

    @objid ("f0c85015-7d32-4048-8839-0d9b766d4574")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_R_HW_SERVICES, this.element);
    }

    @objid ("aeb2ac7d-b8fd-40b6-985c-fd7b80fe7cd4")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_R_HW_SERVICES, value);
    }

    @objid ("18566194-dfd0-4176-96c2-fedc44eee984")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_OWNEDHW, this.element);
    }

    @objid ("49da9a13-863a-42a4-b7a7-1efed9e144ec")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_OWNEDHW, value);
    }

    @objid ("b54a64fb-c63d-46c3-8695-fd36f8c29adf")
    public String getHwComputingResource_Lifeline_frequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_FREQUENCY, this.element);
    }

    @objid ("5c833721-b8e6-40a7-b976-d9cbeffe6f94")
    public void setHwComputingResource_Lifeline_frequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_FREQUENCY, value);
    }

    @objid ("e88a7783-4e60-47e6-a065-e292ed6abfe5")
    public String getHwComputingResource_Lifeline_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_ENDPOINTS, this.element);
    }

    @objid ("35200a63-489d-4040-9e3d-0bb524f5f064")
    public void setHwComputingResource_Lifeline_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_ENDPOINTS, value);
    }

}
