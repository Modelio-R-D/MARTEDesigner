package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationMedia_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("bb1c1c74-0b5a-47de-8957-bb9f0cfc5227")
public class SwCommunicationResource_BindableInstance extends CommunicationMedia_BindableInstance {
    @objid ("27b9aeee-d0f8-4b61-8af3-40e910150acd")
    public SwCommunicationResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwCommunicationResource_BindableInstance"));
    }

    @objid ("58db190a-6c51-48a5-9eae-f4516ac1b179")
    public SwCommunicationResource_BindableInstance(BindableInstance element) {
        super(element);
    }

}
