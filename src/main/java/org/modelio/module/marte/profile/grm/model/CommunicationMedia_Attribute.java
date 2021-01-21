package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5e5591cf-fe5d-4354-bf84-039963a8d603")
public class CommunicationMedia_Attribute extends ProcessingResource_Attribute {
    @objid ("46b7070c-43cc-4d92-82cd-d688b60ac131")
    public CommunicationMedia_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("CommunicationMedia_Attribute"));
    }

    @objid ("834baa29-38a9-4ddd-a5a5-deece6917e14")
    public CommunicationMedia_Attribute(final Attribute element) {
        super(element);
    }

    @objid ("2bc0a06a-fa26-4663-84f8-2d50626458c8")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_ELEMENTSIZE, this.element);
    }

    @objid ("25a698eb-df15-4562-8d71-6bd5c03173d9")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_ELEMENTSIZE, value);
    }

    @objid ("25a06313-331f-4a59-9286-62084a3a0da4")
    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_TRANSMMODE, this.element);
    }

    @objid ("1d6adaf6-3429-4970-8488-1dec768facbf")
    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_TRANSMMODE, value);
    }

    @objid ("05797e16-bf02-48d9-8ceb-d481e9b1bb82")
    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_BLOCKT, this.element);
    }

    @objid ("2dc9d61e-5002-4e90-9665-894e663ff6be")
    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_BLOCKT, value);
    }

    @objid ("1f28ab34-7dbd-4d45-b97e-4faf6832670f")
    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_PACKETT, this.element);
    }

    @objid ("94d72b4e-df4b-4f0a-9da7-612ff409593f")
    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_PACKETT, value);
    }

    @objid ("115c9eb5-4a94-4407-9d6e-ca10c3de245a")
    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_CAPACITY, this.element);
    }

    @objid ("1bc26649-c0b1-4c5d-81f3-519344dcddb8")
    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_CAPACITY, value);
    }

}
