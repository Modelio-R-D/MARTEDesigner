package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("03f86daa-e694-469f-a192-99490634476e")
public class CommunicationEndPoint_Node {
    @objid ("779f0217-1692-4ed5-ab0f-5b8169c08e65")
    protected Node element;

    @objid ("29cbd6bf-f43d-4ecd-89c5-dff7988a7060")
    public CommunicationEndPoint_Node() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_CLASSIFIER));
    }

    @objid ("66e60add-1f5c-43cb-bbb8-f3187cf18d8c")
    public CommunicationEndPoint_Node(final Node element) {
        this.element = element;
    }

    @objid ("9ef680e4-883d-4d98-82b6-cfcc7d771797")
    public Node getElement() {
        return this.element;
    }

    @objid ("3f37eb85-ac81-41bc-98a9-63bf2bd61a22")
    public void setParent(final ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("05723e84-ea9e-4797-96b8-8447e3f18447")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("a5aab4aa-ea63-4dbf-9db5-e5d87f66e128")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_CLASSIFIER_COMMUNICATIONENDPOINT_CLASSIFIER_PACKETSIZE, this.element);
    }

    @objid ("df18e3af-f12b-403f-9f22-d532338edc4a")
    public void setpacketSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_CLASSIFIER_COMMUNICATIONENDPOINT_CLASSIFIER_PACKETSIZE, value);
    }

}
