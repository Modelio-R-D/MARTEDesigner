package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class CommunicationEndPoint_Node {
    protected Node element;

    public CommunicationEndPoint_Node() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_CLASSIFIER));
    }

    public CommunicationEndPoint_Node(final Node element) {
        this.element = element;
    }

    public Node getElement() {
        return this.element;
    }

    public void setParent(final ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_CLASSIFIER_COMMUNICATIONENDPOINT_CLASSIFIER_PACKETSIZE, this.element);
    }

    public void setpacketSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_CLASSIFIER_COMMUNICATIONENDPOINT_CLASSIFIER_PACKETSIZE, value);
    }

}
