package org.modelio.module.marte.profile.hwtiming.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.TimingResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("652f17c7-b7cf-4a0d-9ac2-dd0c23e6cd3b")
public class HwTimingResource_Node extends TimingResource_Node {
    @objid ("5ad0c0f1-1f13-4671-890e-3591a223902f")
    public HwTimingResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWTIMINGRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWTIMINGRESOURCE_CLASSIFIER));
    }

    @objid ("d4423004-f615-4979-85a0-6264724d57fd")
    public HwTimingResource_Node(Node element) {
        super(element);
    }

    @objid ("47b5dbdb-6875-497a-bd3e-df3fbe296d36")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION, this.element);
    }

    @objid ("c071c23b-6d0b-4de1-9ce7-eabf785e45d6")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION, value);
    }

    @objid ("2f11e4a8-46fd-4417-8cf9-7fb1286c54de")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES, this.element);
    }

    @objid ("c21d055c-dd8e-4b6a-b91b-d88ea3c3b254")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES, value);
    }

    @objid ("872f45af-922e-4f0e-9bc2-f4412dd46e49")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES, this.element);
    }

    @objid ("e294cf1a-dc26-43c8-b1b2-e546efaf28d1")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES, value);
    }

    @objid ("59cc7d5a-4f05-475e-bfd5-0a3e96c68a76")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW, this.element);
    }

    @objid ("af8bb70a-7902-4d19-b3f5-82db730c7c08")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW, value);
    }

    @objid ("8acf8244-876f-44ac-9198-2d5ce91aa801")
    public String getfrequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_FREQUENCY, this.element);
    }

    @objid ("80caff66-0411-404b-b8ba-3e553a91b315")
    public void setfrequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_FREQUENCY, value);
    }

    @objid ("1ecdba7a-f38e-4099-a2fd-8b16d8eed4b4")
    public String getHwTimingResource_Node_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS, this.element);
    }

    @objid ("9dbb9e8f-65cb-4f0f-a502-6e9882e8bb94")
    public void setHwTimingResource_Node_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS, value);
    }

}
