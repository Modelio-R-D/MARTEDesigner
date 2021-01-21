package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("55965451-e778-4e42-aa72-429dbcbd8578")
public class ProcessingResource_Node extends Resource_Node {
    @objid ("ff7d7c5a-f9dd-4a8d-b28e-5c51c34aeba5")
    public ProcessingResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PROCESSINGRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PROCESSINGRESOURCE_CLASSIFIER));
    }

    @objid ("5e735e14-72a5-487e-abc5-c654b06369ae")
    public ProcessingResource_Node(final Node element) {
        super(element);
    }

    @objid ("08fadb89-2bb5-4cbe-bc6e-661caf35a64c")
    public String getspeedFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_SPEEDFACTOR, this.element);
    }

    @objid ("3e5b9e65-0108-484c-8ce6-76f868f78ac9")
    public void setspeedFactor(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_SPEEDFACTOR, value);
    }

}
