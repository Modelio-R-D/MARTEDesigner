package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class StorageResource_Lifeline extends Resource_Lifeline {
    public StorageResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.STORAGERESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("StorageResource_Lifeline"));
    }

    public StorageResource_Lifeline(final Lifeline element) {
        super(element);
    }

    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_LIFELINE_STORAGERESOURCE_LIFELINE_ELEMENTSIZE, this.element);
    }

    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.STORAGERESOURCE_LIFELINE_STORAGERESOURCE_LIFELINE_ELEMENTSIZE, value);
    }

}
