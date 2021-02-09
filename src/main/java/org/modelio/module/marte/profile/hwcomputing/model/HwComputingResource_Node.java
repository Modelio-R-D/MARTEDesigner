package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwComputingResource_Node extends ComputingResource_Node {
    public HwComputingResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_CLASSIFIER));
    }

    public HwComputingResource_Node(Node element) {
        super(element);
    }

    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_HWCOMPUTINGRESOURCE_CLASSIFIER_OP_FREQUENCIES, this.element);
    }

    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_HWCOMPUTINGRESOURCE_CLASSIFIER_OP_FREQUENCIES, value);
    }

    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_HWCOMPUTINGRESOURCE_CLASSIFIER_DESCRIPTION, this.element);
    }

    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_HWCOMPUTINGRESOURCE_CLASSIFIER_DESCRIPTION, value);
    }

}
