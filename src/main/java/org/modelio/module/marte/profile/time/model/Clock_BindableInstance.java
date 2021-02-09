package org.modelio.module.marte.profile.time.model;

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

public class Clock_BindableInstance {
    protected BindableInstance element;

    public Clock_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCK_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("Clock_BindableInstance")+ModelUtils.getNbElement(BindableInstance.class, MARTEDesignerStereotypes.CLOCK_INSTANCE));
    }

    public Clock_BindableInstance(BindableInstance element) {
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

    public String getstandard() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_STANDARD, this.element);
    }

    public void setstandard(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_STANDARD, value);
    }

    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_TYPE, this.element);
    }

    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_TYPE, value);
    }

    public String getunit() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_UNIT, this.element);
    }

    public void setunit(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_UNIT, value);
    }

}
