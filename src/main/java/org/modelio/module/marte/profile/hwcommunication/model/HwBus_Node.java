package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("accc05a3-aec4-4ce2-9733-32deb759dc68")
public class HwBus_Node extends HwMedia_Node {
    @objid ("c09fe235-8a06-42df-8048-9fe06da07c24")
    public HwBus_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBUS_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWBUS_CLASSIFIER));
    }

    @objid ("b756406a-6ac5-4c2a-aa4c-a01315e42dd8")
    public HwBus_Node(Node element) {
        super(element);
    }

    @objid ("bf7124d3-a9d0-4ba7-b9ce-4d23dca9a352")
    public String getadressWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_CLASSIFIER_HWBUS_CLASSIFIER_ADRESSWIDTH, this.element);
    }

    @objid ("7b34023a-3971-4a11-a8ff-28372e466ac3")
    public void setadressWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_CLASSIFIER_HWBUS_CLASSIFIER_ADRESSWIDTH, value);
    }

    @objid ("1de60694-35ed-4657-a03a-1f22c6e93ca2")
    public String getwordWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_CLASSIFIER_HWBUS_CLASSIFIER_WORDWIDTH, this.element);
    }

    @objid ("7786943e-0e09-400e-b8be-5dc151cc79ab")
    public void setwordWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_CLASSIFIER_HWBUS_CLASSIFIER_WORDWIDTH, value);
    }

    @objid ("112f645c-c83a-4d87-a05b-56b79bbdc2b7")
    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_CLASSIFIER_HWBUS_CLASSIFIER_ISSYNCHRONOUS, this.element);
    }

    @objid ("5e04902c-95db-4f23-8fc7-59cfd441ccd5")
    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_CLASSIFIER_HWBUS_CLASSIFIER_ISSYNCHRONOUS,value);
    }

    @objid ("2686e888-b52a-414e-8a9e-e99032d90f64")
    public boolean isisSerial() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_CLASSIFIER_HWBUS_CLASSIFIER_ISSERIAL, this.element);
    }

    @objid ("de929a69-47da-4910-90c3-ace847cc5d55")
    public void isisSerial(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_CLASSIFIER_HWBUS_CLASSIFIER_ISSERIAL,value);
    }

}
