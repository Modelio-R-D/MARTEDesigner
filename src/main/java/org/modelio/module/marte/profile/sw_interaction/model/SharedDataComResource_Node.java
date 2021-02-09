package org.modelio.module.marte.profile.sw_interaction.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SharedDataComResource_Node extends SwCommunicationResource_Node {
    public SharedDataComResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_CLASSIFIER));
    }

    public SharedDataComResource_Node(Node element) {
        super(element);
    }

    public String getreadServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES, this.element);
    }

    public void setreadServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES, value);
    }

    public String getwriteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES, this.element);
    }

    public void setwriteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES, value);
    }

}
