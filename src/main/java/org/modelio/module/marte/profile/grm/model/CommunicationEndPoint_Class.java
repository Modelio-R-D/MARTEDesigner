package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0b2d9a05-0a4f-44df-b2d1-26b6d736765c")
public class CommunicationEndPoint_Class {
    @objid ("7130261c-172a-48aa-b3a7-149709755b83")
    protected Class element;

    @objid ("9cc43213-ec3d-4fc4-bfec-7c965266265d")
    public CommunicationEndPoint_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_CLASSIFIER));
    }

    @objid ("cf483990-c4f0-4225-9287-5b54f361b336")
    public CommunicationEndPoint_Class(final Class element) {
        this.element = element;
    }

    @objid ("4a1336d0-46aa-429b-8791-c814852251d3")
    public Class getElement() {
        return this.element;
    }

    @objid ("c9650273-b6d2-4659-a2d5-9e70edbedb0f")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("44532820-e8c8-4c04-bd6c-021f0d813a9a")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("9832cdfb-c8b9-4301-af0c-fc52d8b8f47b")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_CLASSIFIER_COMMUNICATIONENDPOINT_CLASSIFIER_PACKETSIZE, this.element);
    }

    @objid ("658b8485-8f66-461f-870b-3aa9ee194933")
    public void setpacketSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_CLASSIFIER_COMMUNICATIONENDPOINT_CLASSIFIER_PACKETSIZE, value);
    }

}
