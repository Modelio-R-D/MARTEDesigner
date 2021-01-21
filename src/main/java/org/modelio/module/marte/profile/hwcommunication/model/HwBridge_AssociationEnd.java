package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7ae01ae0-8ca4-49ea-8474-9917f39b0462")
public class HwBridge_AssociationEnd extends HwMedia_AssociationEnd {
    @objid ("2c7b906c-6190-4331-ad58-e57c4dab49f4")
    public HwBridge_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwBridge_AssociationEnd"));
    }

    @objid ("af6c2ea4-42f1-4a57-bfe4-c873f3282b17")
    public HwBridge_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    @objid ("30fe9835-085d-4700-a8b3-59fa99246111")
    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_ASSOCIATIONEND_HWBRIDGE_ASSOCIATIONEND_SIDES, this.element);
    }

    @objid ("93fbfe4a-6419-485e-9963-80c6b77b1703")
    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_ASSOCIATIONEND_HWBRIDGE_ASSOCIATIONEND_SIDES, value);
    }

    @objid ("451a0710-fcc4-4824-a02e-10381f6fef62")
    public AssociationEnd getElement() {
        return this.element;
    }

}
