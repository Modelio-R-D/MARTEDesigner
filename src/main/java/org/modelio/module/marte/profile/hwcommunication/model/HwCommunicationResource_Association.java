package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwCommunicationResource_Association {
    protected Association element;

    public HwCommunicationResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMMUNICATIONRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwCommunicationResource_Association"));
    }

    public HwCommunicationResource_Association(Association element) {
        this.element = element;
    }

    public void setParent(Classifier source, Classifier destination) {
        ModelUtils.attachAssociation(element, source, destination);
    }

    public Association getElement() {
        return this.element;
    }

}
