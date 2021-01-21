package org.modelio.module.marte.profile.nfps.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b3740c75-192f-4c97-9475-153626538b76")
public class Nfp_Attribute {
    @objid ("badc0712-defb-4e6d-89c2-5995a1e88636")
    protected Attribute element;

    @objid ("9bd00128-ea99-4195-954e-ce73cb9c4db4")
    public Nfp_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.NFP_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName("Nfp_Attribute"));
    }

    @objid ("81c5f699-bc19-4c39-9858-cadf6ef1dc35")
    public Nfp_Attribute(Attribute element) {
        this.element = element;
    }

    @objid ("d9f0cd31-8169-4306-8477-fec33e9a6cf3")
    public Attribute getElement() {
        return this.element;
    }

    @objid ("2176398a-396d-42bb-8e32-8d2ff674795b")
    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    @objid ("4c44b761-850a-4ea5-b6e2-1cfda047bf74")
    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("2047d14e-4233-472c-9b7f-aff8e9c0c3cb")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
