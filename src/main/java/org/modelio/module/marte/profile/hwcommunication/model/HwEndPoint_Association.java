package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0b10759d-0958-4ed4-bce9-30815e499d5b")
public class HwEndPoint_Association {
    @objid ("3c5ddf77-01ed-45bd-b90e-1edd88e8b8d5")
    protected Association element;

    @objid ("6dc75b3c-c8dc-42df-9a5c-239b672c36b3")
    public HwEndPoint_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwEndPoint_Association"));
    }

    @objid ("189470ac-e550-4532-afc3-b596353f07f5")
    public HwEndPoint_Association(Association element) {
        this.element = element;
    }

    @objid ("4fef29bd-4d89-4821-add0-ea61c2f2668e")
    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("7b791352-858b-447e-b85c-4947b878c78e")
    public Association getElement() {
        return this.element;
    }

    @objid ("cdff7c94-34f2-47b6-9ef9-45c80e5968a1")
    public String getconnectedTo() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_ASSOCIATION_HWENDPOINT_ASSOCIATION_CONNECTEDTO, this.element);
    }

    @objid ("10a71ac5-b3c8-4995-b389-e2c1b926ba16")
    public void setconnectedTo(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWENDPOINT_ASSOCIATION_HWENDPOINT_ASSOCIATION_CONNECTEDTO, value);
    }

}
