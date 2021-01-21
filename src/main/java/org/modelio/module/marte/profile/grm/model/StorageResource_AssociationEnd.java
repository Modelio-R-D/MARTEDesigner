package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("34ab1d0a-edd5-4578-a6c1-2e637d692056")
public class StorageResource_AssociationEnd extends Resource_AssociationEnd {
    @objid ("34f6ce3f-1245-4115-b474-cce799488c43")
    public StorageResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.STORAGERESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("StorageResource_AssociationEnd"));
    }

    @objid ("3edffe14-4305-42e3-b132-d4b0642421cf")
    public StorageResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

    @objid ("ea237790-67f5-4885-8aa6-7fb5cdb9b732")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_ASSOCIATIONEND_STORAGERESOURCE_ASSOCIATIONEND_ELEMENTSIZE, this.element);
    }

    @objid ("e21e320b-3a84-4ad0-a762-754740cd755b")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.STORAGERESOURCE_ASSOCIATIONEND_STORAGERESOURCE_ASSOCIATIONEND_ELEMENTSIZE, value);
    }

}
