package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class StorageResource_AssociationEnd extends Resource_AssociationEnd {
    public StorageResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.STORAGERESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("StorageResource_AssociationEnd"));
    }

    public StorageResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_ASSOCIATIONEND_STORAGERESOURCE_ASSOCIATIONEND_ELEMENTSIZE, this.element);
    }

    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.STORAGERESOURCE_ASSOCIATIONEND_STORAGERESOURCE_ASSOCIATIONEND_ELEMENTSIZE, value);
    }

}
