package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("63a7db47-a496-42ad-839b-7e13413d8883")
public class HwCommunicationResource_Attribute {
    @objid ("4e2ce490-904e-4099-b92b-7fc6c497d8b8")
    protected Attribute element;

    @objid ("efdb78e2-efb4-4173-b3cc-2043c3033439")
    public HwCommunicationResource_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMMUNICATIONRESOURCE_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName("HwCommunicationResource_Attribute"));
    }

    @objid ("30b28c21-034e-4c3b-bb2b-21539c240d12")
    public HwCommunicationResource_Attribute(Attribute element) {
        this.element = element;
    }

    @objid ("a84f7e1e-2d51-4ee0-8e45-8b3dc682ecb6")
    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    @objid ("35baae64-9429-4a3d-ab34-9858606525c2")
    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("2f75c55a-7e1c-4e4c-9b81-482ca87aac82")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("37581911-5913-4845-a4eb-1ed105de6ca6")
    public Attribute getElement() {
        return this.element;
    }

}
