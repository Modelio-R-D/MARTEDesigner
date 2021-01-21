package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e9a09f41-fb56-49c8-9b33-2d4b527c069a")
public class SharedDataComResource_Association {
    @objid ("964dd784-d1be-4c8f-bb6d-4d7176a8a2fe")
    protected Association element;

    @objid ("ea77eb82-d9c4-4159-bc44-abae5e4eaa67")
    public SharedDataComResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("SharedDataComResource_Association"));
    }

    @objid ("fadb5783-0091-4dab-975f-0e48498f6ec2")
    public SharedDataComResource_Association(Association element) {
        this.element = element;
    }

    @objid ("f963f977-8330-40eb-ad5b-55b2ed1577d6")
    public void setParent(Classifier source, Classifier destination) {
        ModelUtils.attachAssociation(element, source, destination);
    }

    @objid ("5f3d65a4-be86-410d-83f7-ca0ac26c101a")
    public Association getElement() {
        return this.element;
    }

    @objid ("25b6befc-1276-47f4-ac59-5b417c27ca20")
    public String getreadServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_ASSOCIATION_SHAREDDATACOMRESOURCE_ASSOCIATION_READSERVICES, this.element);
    }

    @objid ("522f515d-6c83-47b7-892c-aba62a834277")
    public void setreadServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_ASSOCIATION_SHAREDDATACOMRESOURCE_ASSOCIATION_READSERVICES, value);
    }

    @objid ("223c984a-c83c-4b0d-9d4c-ba3da5475f34")
    public String getwriteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_ASSOCIATION_SHAREDDATACOMRESOURCE_ASSOCIATION_WRITESERVICES, this.element);
    }

    @objid ("f72b3dcd-2fab-4733-9c7f-c0c414a4ddcc")
    public void setwriteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_ASSOCIATION_SHAREDDATACOMRESOURCE_ASSOCIATION_WRITESERVICES, value);
    }

}
