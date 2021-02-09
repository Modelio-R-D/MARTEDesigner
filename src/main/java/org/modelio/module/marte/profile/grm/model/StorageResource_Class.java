package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class StorageResource_Class extends Resource_Class {
    public StorageResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.STORAGERESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.STORAGERESOURCE_CLASSIFIER));
    }

    public StorageResource_Class(final Class element) {
        super(element);
    }

    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_CLASSIFIER_STORAGERESOURCE_CLASSIFIER_ELEMENTSIZE, this.element);
    }

    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.STORAGERESOURCE_CLASSIFIER_STORAGERESOURCE_CLASSIFIER_ELEMENTSIZE, value);
    }

}
