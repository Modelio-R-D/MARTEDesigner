package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f2cc76d2-b463-4679-81ca-e8adb68aa112")
public class HwComputingResource_Node extends ComputingResource_Node {
    @objid ("b4b03f27-b00b-4a24-a518-4ab9c77f6498")
    public HwComputingResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_CLASSIFIER));
    }

    @objid ("c38919c7-b074-44ae-b363-97833e98a6ef")
    public HwComputingResource_Node(Node element) {
        super(element);
    }

    @objid ("e2350741-3a98-43b5-bc6c-4cb3daf5b0cb")
    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_HWCOMPUTINGRESOURCE_CLASSIFIER_OP_FREQUENCIES, this.element);
    }

    @objid ("41b70079-166d-4898-b0f7-72d0835ec5e7")
    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_HWCOMPUTINGRESOURCE_CLASSIFIER_OP_FREQUENCIES, value);
    }

    @objid ("b585a2a1-4b56-4459-89e5-b370234c30cf")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_HWCOMPUTINGRESOURCE_CLASSIFIER_DESCRIPTION, this.element);
    }

    @objid ("3b3f2f27-2807-4e74-9713-a5bbc0baf6be")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_HWCOMPUTINGRESOURCE_CLASSIFIER_DESCRIPTION, value);
    }

}
