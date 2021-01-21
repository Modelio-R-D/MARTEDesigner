package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9d749100-0e8c-428d-826e-964ad9346106")
public class StorageResource_Lifeline extends Resource_Lifeline {
    @objid ("d5e346eb-036d-4aaf-9ca7-28a8e1990e96")
    public StorageResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.STORAGERESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("StorageResource_Lifeline"));
    }

    @objid ("7b840403-546b-4d20-8f9d-06e707dbfed1")
    public StorageResource_Lifeline(final Lifeline element) {
        super(element);
    }

    @objid ("6f3ddc0a-63cf-4cf8-9dd0-3a551971326f")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_LIFELINE_STORAGERESOURCE_LIFELINE_ELEMENTSIZE, this.element);
    }

    @objid ("5d17fae3-5ad9-40ba-8afe-37cc45ea70ca")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.STORAGERESOURCE_LIFELINE_STORAGERESOURCE_LIFELINE_ELEMENTSIZE, value);
    }

}
