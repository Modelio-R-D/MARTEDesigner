package org.modelio.module.marte.profile.sw_resourcecore.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.Resource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwResource_BindableInstance extends Resource_BindableInstance {
    public SwResource_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWRESOURCE_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("SwResource_BindableInstance"));
    }

    public SwResource_BindableInstance(BindableInstance element) {
        this.element = element;
    }

    @Override
    public BindableInstance getElement() {
        return this.element;
    }

    @Override
    public void setParent(Instance parent) {
        this.element.setCluster(parent);
    }

    @Override
    public void setParent(Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @Override
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @Override
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getidentifierElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_IDENTIFIERELEMENTS, this.element);
    }

    public void setidentifierElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_IDENTIFIERELEMENTS, value);
    }

    public String getstateElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_STATEELEMENTS, this.element);
    }

    public void setstateElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_STATEELEMENTS, value);
    }

    public String getmemorySizeFootprint() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_MEMORYSIZEFOOTPRINT, this.element);
    }

    public void setmemorySizeFootprint(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_MEMORYSIZEFOOTPRINT, value);
    }

    public String getcreateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_CREATESERVICES, this.element);
    }

    public void setcreateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_CREATESERVICES, value);
    }

    public String getdeleteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_DELETESERVICES, this.element);
    }

    public void setdeleteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_DELETESERVICES, value);
    }

    public String getinitializeServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_INITIALIZESERVICES, this.element);
    }

    public void setinitializeServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_INITIALIZESERVICES, value);
    }

}
