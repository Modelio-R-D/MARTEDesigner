package org.modelio.module.marte.profile.sw_interaction.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SharedDataComResource_Instance extends SwCommunicationResource_Instance {
    public SharedDataComResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SharedDataComResource_BindableInstance"));
    }

    public SharedDataComResource_Instance(Instance element) {
        super(element);
    }

    public String getreadServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_INSTANCE_SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES, this.element);
    }

    public void setreadServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_INSTANCE_SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES, value);
    }

    public String getwriteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_INSTANCE_SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES, this.element);
    }

    public void setwriteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_INSTANCE_SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES, value);
    }

}
