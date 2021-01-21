package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6e0f6330-5d34-4ee8-a7a8-d1fdf14574cb")
public class HwArbiter_AssociationEnd extends HwCommunicationResource_AssociationEnd {
    @objid ("a3bca5a9-6952-4b8b-8b3b-7f048be44768")
    public HwArbiter_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWARBITER_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwArbiter_AssociationEnd"));
    }

    @objid ("f95feff7-dbb9-4f5f-ab73-45eecde40521")
    public HwArbiter_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    @objid ("bf502e96-5f6d-42c2-a33c-ac8ce3bd76c6")
    public String getcontrolledMedias() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWARBITER_ASSOCIATIONEND_HWARBITER_ASSOCIATIONEND_CONTROLLEDMEDIAS, this.element);
    }

    @objid ("ab0231ea-e12b-49da-a591-addc4abb5cc2")
    public void setcontrolledMedias(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWARBITER_ASSOCIATIONEND_HWARBITER_ASSOCIATIONEND_CONTROLLEDMEDIAS, value);
    }

    @objid ("84759a47-af52-450a-94ec-0b3d0231e270")
    public AssociationEnd getElement() {
        return this.element;
    }

}
