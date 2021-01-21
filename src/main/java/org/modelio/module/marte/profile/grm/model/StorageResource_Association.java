package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("16baef89-a986-4c86-a5d8-095eef098a30")
public class StorageResource_Association {
    @objid ("4a956c94-433a-4043-b7d7-645316ef0c81")
    protected Association element;

    @objid ("34b97194-b0da-4d6a-a60e-0b55420b7b4e")
    public StorageResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.STORAGERESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("StorageResource_Association"));
    }

    @objid ("e8ef9726-7512-4e25-a6ae-db13d863eebb")
    public StorageResource_Association(final Association element) {
        this.element = element;
    }

    @objid ("d9a2b5ce-f0b5-45b5-9e5b-eef03e983236")
    public void setParent(final AssociationEnd source, final AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("1a003a82-2417-4139-9901-0a1aed8f7cd7")
    public Association getElement() {
        return this.element;
    }

    @objid ("5f8485b5-5910-491d-9911-73f1c1469103")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_ASSOCIATION_STORAGERESOURCE_ASSOCIATION_ELEMENTSIZE, this.element);
    }

    @objid ("41d2438a-9b07-482b-ba8f-8339ca377447")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.STORAGERESOURCE_ASSOCIATION_STORAGERESOURCE_ASSOCIATION_ELEMENTSIZE, value);
    }

}
