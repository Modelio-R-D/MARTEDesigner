package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2b9f04cd-b88e-497a-b9d9-10bbc86754ba")
public class HwDevice_Association {
    @objid ("5a4783b4-c18c-4cbd-bc36-02b4806bcac4")
    protected Association element;

    @objid ("124ffe87-bce9-42ae-bbf9-ea5272e0e105")
    public HwDevice_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDEVICE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwDevice_Association"));
    }

    @objid ("58a0adb0-b67c-4fc7-abd4-b8fe67b05869")
    public HwDevice_Association(Association element) {
        this.element = element;
    }

    @objid ("cffd26c8-1619-4609-81f9-c2892009ca4f")
    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("d5ee71aa-1652-4008-b538-b4f99efb867e")
    public Association getElement() {
        return this.element;
    }

}
