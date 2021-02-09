package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwCommunicationResource_AssociationEnd {
    protected AssociationEnd element;

    public HwCommunicationResource_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMMUNICATIONRESOURCE_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName("HwCommunicationResource_AssociationEnd"));
    }

    public HwCommunicationResource_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    public void setParent(Classifier parent) {
        this.element.setSource(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public AssociationEnd getElement() {
        return this.element;
    }

}
