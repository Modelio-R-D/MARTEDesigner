package org.modelio.module.marte.profile.gcm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("afaaaadb-573d-4605-82e5-a2c8fbff91b2")
public class FlowProperty_Attribute {
    @objid ("f8dce6ab-2e74-4f0b-8f78-bc1ce1ed64d5")
    protected Attribute element;

    @objid ("48ae74d9-67f2-4ba9-ba4d-697d9805aafa")
    public FlowProperty_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.FLOWPROPERTY_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName("FlowProperty_Attribute"));
    }

    @objid ("9928a853-db9a-4d43-9675-58412b6a021e")
    public FlowProperty_Attribute(Attribute element) {
        this.element = element;
    }

    @objid ("4a42c7ba-d564-47c2-9121-dd81da405505")
    public Attribute getElement() {
        return this.element;
    }

    @objid ("aa9e605e-fdfe-4dab-9bee-a3fc0fb55ba1")
    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    @objid ("d334f707-1d50-45ae-9e51-400d7aa9496e")
    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("b900e6ee-0f28-4da8-a09d-f3445dc1db0a")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("9d951be3-75fe-447c-8d4a-52701bd5f8f8")
    public String getdirection() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.FLOWPROPERTY_ATTRIBUTE_FLOWPROPERTY_ATTRIBUTE_DIRECTION, this.element);
    }

    @objid ("c7161d83-1d03-4e28-b1b9-ba7d29477d0d")
    public void setdirection(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.FLOWPROPERTY_ATTRIBUTE_FLOWPROPERTY_ATTRIBUTE_DIRECTION, value);
    }

}
