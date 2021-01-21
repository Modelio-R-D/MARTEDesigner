package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0d4f971d-3fe0-4365-8405-ba6fac94147a")
public class HwArbiter_Class extends HwCommunicationResource_Class {
    @objid ("a18a6c0e-876b-4ca9-b96a-0a7f13f1d82f")
    public HwArbiter_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWARBITER_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWARBITER_CLASSIFIER));
    }

    @objid ("cdac8460-6b0b-4ecc-a092-f08529745048")
    public HwArbiter_Class(Class element) {
        super(element);
    }

    @objid ("a5146bb9-3a26-4260-b69f-851b80307a36")
    public String getcontrolledMedias() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWARBITER_CLASSIFIER_HWARBITER_CLASSIFIER_CONTROLLEDMEDIAS, this.element);
    }

    @objid ("f4b4ea05-6f62-46fa-bd68-6715df78a4f6")
    public void setcontrolledMedias(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWARBITER_CLASSIFIER_HWARBITER_CLASSIFIER_CONTROLLEDMEDIAS, value);
    }

}
