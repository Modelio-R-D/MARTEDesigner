package org.modelio.module.marte.profile.hwcommunication.model;

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

public class HwEndPoint_BindableInstance {
    protected BindableInstance element;

    public HwEndPoint_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("HwEndPoint_BindableInstance"));
    }

    public HwEndPoint_BindableInstance(BindableInstance element) {
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

    public String getconnectedTo() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_INSTANCE_HWENDPOINT_INSTANCE_CONNECTEDTO, this.element);
    }

    public void setconnectedTo(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWENDPOINT_INSTANCE_HWENDPOINT_INSTANCE_CONNECTEDTO, value);
    }

}
