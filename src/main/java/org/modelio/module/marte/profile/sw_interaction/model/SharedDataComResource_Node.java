package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ad76b3b3-df61-4b1e-bf40-98d9e85c4a02")
public class SharedDataComResource_Node extends SwCommunicationResource_Node {
    @objid ("5934c38b-f6b1-4e58-b1c0-f594c4917c10")
    public SharedDataComResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_CLASSIFIER));
    }

    @objid ("0f9e770a-10f0-4af9-96b2-a29e5d11d48b")
    public SharedDataComResource_Node(Node element) {
        super(element);
    }

    @objid ("a2133b8f-26a7-4287-8c39-a558e42d2b02")
    public String getreadServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES, this.element);
    }

    @objid ("efdac7c5-dc80-432c-ac29-d3aed17a8439")
    public void setreadServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES, value);
    }

    @objid ("cbbca3df-597b-4dae-a0e4-28288a7b7de9")
    public String getwriteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES, this.element);
    }

    @objid ("d0c2d947-1400-4154-a525-eacf158833db")
    public void setwriteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES, value);
    }

}
