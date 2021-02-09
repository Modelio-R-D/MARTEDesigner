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

public class DataPool_BindableInstance {
    protected BindableInstance element;

    public DataPool_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DATAPOOL_BINDABLEINSTANCE);
        this.element.setName(MARTEResourceManager.getName("DataPool_BindableInstance"));
    }

    public DataPool_BindableInstance(BindableInstance element) {
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

    public String getordering() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_ORDERING, this.element);
    }

    public void setordering(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_ORDERING, value);
    }

    public String getinsertion() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_INSERTION, this.element);
    }

    public void setinsertion(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_INSERTION, value);
    }

    public String getselection() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_SELECTION, this.element);
    }

    public void setselection(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_SELECTION, value);
    }

}
