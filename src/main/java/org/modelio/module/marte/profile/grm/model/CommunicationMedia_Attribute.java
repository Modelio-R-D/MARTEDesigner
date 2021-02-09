package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class CommunicationMedia_Attribute extends ProcessingResource_Attribute {
    public CommunicationMedia_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("CommunicationMedia_Attribute"));
    }

    public CommunicationMedia_Attribute(final Attribute element) {
        super(element);
    }

    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_ELEMENTSIZE, this.element);
    }

    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_ELEMENTSIZE, value);
    }

    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_TRANSMMODE, this.element);
    }

    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_TRANSMMODE, value);
    }

    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_BLOCKT, this.element);
    }

    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_BLOCKT, value);
    }

    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_PACKETT, this.element);
    }

    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_PACKETT, value);
    }

    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_CAPACITY, this.element);
    }

    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_CAPACITY, value);
    }

}
