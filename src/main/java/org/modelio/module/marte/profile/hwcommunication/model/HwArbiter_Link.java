package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("49cf5798-2d83-4133-a0ce-a0682af19e60")
public class HwArbiter_Link {
    @objid ("7cba7815-4175-4f10-924d-edfc35770cc9")
    protected Link element;

    @objid ("9bae1470-9c00-436b-a852-4728b8eb27a0")
    public HwArbiter_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWARBITER_LINK);
        this.element.setName(MARTEResourceManager.getName("HwArbiter_Link"));
    }

    @objid ("b4f76c61-2a30-435e-a13e-dd55c2e8b68b")
    public HwArbiter_Link(Link element) {
        this.element = element;
    }

    @objid ("c4679060-cd2d-4ce9-bec3-e2101efec6ab")
    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachLink(this.element, source, destination);
    }

    @objid ("01af401e-dced-4259-905e-cb24624e3779")
    public Link getElement() {
        return this.element;
    }

    @objid ("af9a481b-91b6-4b3e-945e-5f1d6d44f7c3")
    public String getcontrolledMedias() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWARBITER_LINK_HWARBITER_LINK_CONTROLLEDMEDIAS, this.element);
    }

    @objid ("89b4f3eb-cc6d-43c4-b48e-f28a58f5037e")
    public void setcontrolledMedias(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWARBITER_LINK_HWARBITER_LINK_CONTROLLEDMEDIAS, value);
    }

}
