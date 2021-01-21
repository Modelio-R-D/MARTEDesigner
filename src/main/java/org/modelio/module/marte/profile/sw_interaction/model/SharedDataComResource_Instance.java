package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9a6b51e2-144f-4299-9fab-4532a679e5c8")
public class SharedDataComResource_Instance extends SwCommunicationResource_Instance {
    @objid ("e9d3ffd3-3ada-41c7-82da-5541dc8e4281")
    public SharedDataComResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SharedDataComResource_BindableInstance"));
    }

    @objid ("039a21eb-f206-4a88-8d85-b89fd2e8b1b6")
    public SharedDataComResource_Instance(Instance element) {
        super(element);
    }

    @objid ("fd57f380-9c86-4733-9948-114b01964b42")
    public String getreadServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_INSTANCE_SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES, this.element);
    }

    @objid ("d4b0713f-3e14-44d9-b6cd-beaf9be34acd")
    public void setreadServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_INSTANCE_SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES, value);
    }

    @objid ("f1124c55-6507-4bc8-a737-5d41ad3cec89")
    public String getwriteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_INSTANCE_SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES, this.element);
    }

    @objid ("880cb859-3a87-4ee0-a16d-690eba1bd894")
    public void setwriteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_INSTANCE_SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES, value);
    }

}
