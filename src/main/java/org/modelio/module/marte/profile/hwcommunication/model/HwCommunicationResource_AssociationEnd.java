package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("717056c5-8206-4c2c-b803-1678542573f9")
public class HwCommunicationResource_AssociationEnd {
    @objid ("c444c664-fc06-49d8-8819-b8695be5c4c9")
    protected AssociationEnd element;

    @objid ("f80eaa42-660b-4202-8d46-5f283f603d07")
    public HwCommunicationResource_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMMUNICATIONRESOURCE_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName("HwCommunicationResource_AssociationEnd"));
    }

    @objid ("21774216-036d-4f38-ba30-fecd9130ea43")
    public HwCommunicationResource_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    @objid ("7872bcb1-37c8-4c54-907e-22f4875bc3ab")
    public void setParent(Classifier parent) {
        this.element.setSource(parent);
    }

    @objid ("a5cd99e6-1f45-4beb-b114-3a3c24c3123b")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("e0c8b2a0-b4f4-4765-913d-9fcfc79c429f")
    public AssociationEnd getElement() {
        return this.element;
    }

}
