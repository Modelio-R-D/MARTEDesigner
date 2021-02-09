package org.modelio.module.marte.profile.gcm.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class FlowProperty_BindableInstance {
    protected BindableInstance element;

    public FlowProperty_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.FLOWPROPERTY_BINDABLEINSTANCE);
        this.element.setName(MARTEResourceManager.getName("FlowProperty_BindableInstance"));
    }

    public FlowProperty_BindableInstance(BindableInstance element) {
        this.element = element;
    }

    public BindableInstance getElement() {
        return this.element;
    }

    public void setParent(Instance parent) {
        this.element.setCluster(parent);
    }

    public void setParent(Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getdirection() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.FLOWPROPERTY_BINDABLEINSTANCE_FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION, this.element);
    }

    public void setdirection(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.FLOWPROPERTY_BINDABLEINSTANCE_FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION, value);
    }

}
