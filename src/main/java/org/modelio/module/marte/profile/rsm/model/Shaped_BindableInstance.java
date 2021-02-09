package org.modelio.module.marte.profile.rsm.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Shaped_BindableInstance {
    protected BindableInstance element;

    public Shaped_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,"Shaped_BindableInstance");
        this.element.setName(MARTEResourceManager.getName("Shaped_BindableInstance"));
    }

    public Shaped_BindableInstance(BindableInstance element) {
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

    public String getshape() {
        return ModelUtils.getTaggedValue("Shaped_BindableInstance_shape", this.element);
    }

    public void setshape(String value) {
        ModelUtils.addStringValue(this.element,"Shaped_BindableInstance_shape", value);
    }

}
