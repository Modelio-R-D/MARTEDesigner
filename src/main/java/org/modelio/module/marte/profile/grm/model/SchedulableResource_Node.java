package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("549ece74-ca8a-4462-b98f-f9e5bf98e92a")
public class SchedulableResource_Node extends Resource_Node {
    @objid ("103dd261-32ca-4860-800c-3bbc5a7f8d31")
    public SchedulableResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULABLERESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SCHEDULABLERESOURCE_CLASSIFIER));
    }

    @objid ("a23b0373-2098-4518-b9e7-e2c042f88ce4")
    public SchedulableResource_Node(final Node element) {
        super(element);
    }

    @objid ("cc591786-f0c8-407a-a455-5b6299290513")
    public String getschedParams() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_CLASSIFIER_SCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS, this.element);
    }

    @objid ("53af0a53-d56a-4efc-86c9-db9e24599968")
    public void setschedParams(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_CLASSIFIER_SCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS, value);
    }

}
