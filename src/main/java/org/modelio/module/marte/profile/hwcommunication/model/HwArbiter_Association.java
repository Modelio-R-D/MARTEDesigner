package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("33322f5c-c718-4bc7-968f-4c986c3cdee8")
public class HwArbiter_Association {
    @objid ("493f2e31-6759-4679-92c0-c6bfdf2efb65")
    protected Association element;

    @objid ("7147e1b5-27cb-4fbd-8de2-14a65f312b3f")
    public HwArbiter_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWARBITER_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwArbiter_Association"));
    }

    @objid ("8d557279-d8b2-4473-970f-38c4fa5d0a03")
    public HwArbiter_Association(Association element) {
        this.element = element;
    }

    @objid ("75b27bae-daba-4a7d-a0c1-3064cc7c4e03")
    public void setParent(Classifier source, Classifier destination) {
        ModelUtils.attachAssociation(this.element, source, destination);
    }

    @objid ("302bccd3-5942-4d12-9376-b2ecb2dd4b7e")
    public Association getElement() {
        return this.element;
    }

    @objid ("d8270b21-0a92-410d-b606-b2ecc6028a29")
    public String getcontrolledMedias() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWARBITER_ASSOCIATION_HWARBITER_ASSOCIATION_CONTROLLEDMEDIAS, this.element);
    }

    @objid ("7a4afbfb-b61c-4c49-b7f8-cf81db96f49a")
    public void setcontrolledMedias(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWARBITER_ASSOCIATION_HWARBITER_ASSOCIATION_CONTROLLEDMEDIAS, value);
    }

}
