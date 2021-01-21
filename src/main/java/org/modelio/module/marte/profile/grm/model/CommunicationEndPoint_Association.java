package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4184b0ea-eafb-4fb8-bb09-90320281d62b")
public class CommunicationEndPoint_Association {
    @objid ("6ef41eb5-88a5-4f8d-b282-792288c4de68")
    protected Association element;

    @objid ("a2e4068d-0a15-4692-b7e9-04e20ef8c8a5")
    public CommunicationEndPoint_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("CommunicationEndPoint_Association"));
    }

    @objid ("89fba93d-ac47-48e0-9e3d-2f308f2ed53d")
    public CommunicationEndPoint_Association(final Association element) {
        this.element = element;
    }

    @objid ("6aff4880-d6c2-44fd-bcca-4f789c7c547d")
    public void setParent(final AssociationEnd source, final AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("471abf74-c25d-497d-8ddf-681f36715664")
    public Association getElement() {
        return this.element;
    }

    @objid ("52e00951-6dbf-4205-9041-77d5401a5930")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ASSOCIATION_COMMUNICATIONENDPOINT_ASSOCIATION_PACKETSIZE, this.element);
    }

    @objid ("b94db345-51a0-497c-ba1d-1cda67ff6192")
    public void setpacketSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ASSOCIATION_COMMUNICATIONENDPOINT_ASSOCIATION_PACKETSIZE, value);
    }

}
