package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6cc94d87-00bd-4250-bdeb-e436de49bf59")
public class SharedDataComResource_BindableInstance extends SwCommunicationResource_BindableInstance {
    @objid ("45f83004-64bb-4268-8f76-2dd30d9cec4b")
    public SharedDataComResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SharedDataComResource_BindableInstance"));
    }

    @objid ("72d089d1-0181-4823-a0e0-19111a2206ed")
    public SharedDataComResource_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("77e4f41c-03a1-4f2f-be82-f51e92a35eed")
    public String getreadServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_INSTANCE_SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES, this.element);
    }

    @objid ("5771e6f8-922c-4176-8882-0d6d9bdb1426")
    public void setreadServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_INSTANCE_SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES, value);
    }

    @objid ("20d9d3a3-4135-483f-ac5b-63df62ea9abf")
    public String getwriteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_INSTANCE_SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES, this.element);
    }

    @objid ("ce0988fe-5be8-40dd-a5c3-971ffea316ce")
    public void setwriteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_INSTANCE_SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES, value);
    }

}
