package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a8bb7920-19c2-459f-acbe-6a98046394a2")
public class CommunicationMedia_Parameter extends ProcessingResource_Parameter {
    @objid ("46e0009f-f801-43cb-ab60-781c4ec31989")
    public CommunicationMedia_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("CommunicationMedia_Parameter"));
    }

    @objid ("1fd9b0ed-3e6d-4fd5-886d-094b6ff48b26")
    public CommunicationMedia_Parameter(final Parameter element) {
        super(element);
    }

    @objid ("452178b0-d104-4e2a-9634-e3830dc2293e")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_PARAMETER_COMMUNICATIONMEDIA_PARAMETER_ELEMENTSIZE, this.element);
    }

    @objid ("5b341622-567c-4544-bdc8-2c98dc65ce45")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_PARAMETER_COMMUNICATIONMEDIA_PARAMETER_ELEMENTSIZE, value);
    }

    @objid ("d24d48be-905d-4b7c-9588-f4253b157838")
    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_PARAMETER_COMMUNICATIONMEDIA_PARAMETER_TRANSMMODE, this.element);
    }

    @objid ("794827b1-4dc8-4ee5-80b7-4ed8075dd531")
    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_PARAMETER_COMMUNICATIONMEDIA_PARAMETER_TRANSMMODE, value);
    }

    @objid ("78b713ac-150e-4be6-bc88-07d2cf51f57f")
    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_PARAMETER_COMMUNICATIONMEDIA_PARAMETER_BLOCKT, this.element);
    }

    @objid ("5e8a7cc2-9d01-4c2c-ad49-ed931b184581")
    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_PARAMETER_COMMUNICATIONMEDIA_PARAMETER_BLOCKT, value);
    }

    @objid ("235df734-f1ab-4dff-9b7c-726c9a850021")
    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_PARAMETER_COMMUNICATIONMEDIA_PARAMETER_PACKETT, this.element);
    }

    @objid ("11652536-4212-4781-8794-7f1c3b68605c")
    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_PARAMETER_COMMUNICATIONMEDIA_PARAMETER_PACKETT, value);
    }

    @objid ("b47fdfd1-c085-405f-a479-a48141e2e745")
    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_PARAMETER_COMMUNICATIONMEDIA_PARAMETER_CAPACITY, this.element);
    }

    @objid ("0b9c63db-d611-4f4a-9bbe-49f6f90f2f73")
    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_PARAMETER_COMMUNICATIONMEDIA_PARAMETER_CAPACITY, value);
    }

}
