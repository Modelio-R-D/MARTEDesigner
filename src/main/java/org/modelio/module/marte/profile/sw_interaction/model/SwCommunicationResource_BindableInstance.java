package org.modelio.module.marte.profile.sw_interaction.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationMedia_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwCommunicationResource_BindableInstance extends CommunicationMedia_BindableInstance {
    public SwCommunicationResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwCommunicationResource_BindableInstance"));
    }

    public SwCommunicationResource_BindableInstance(BindableInstance element) {
        super(element);
    }

}
