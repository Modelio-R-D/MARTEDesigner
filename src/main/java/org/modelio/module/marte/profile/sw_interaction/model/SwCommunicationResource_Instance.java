package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationMedia_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f2075f47-24e4-4944-84ce-4953ab6dfb69")
public class SwCommunicationResource_Instance extends CommunicationMedia_Instance {
    @objid ("8824ecb4-b495-4101-85fb-b11b653a199b")
    public SwCommunicationResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwCommunicationResource_BindableInstance"));
    }

    @objid ("c4bd73a0-e79b-41bc-b3fc-2206e73e7831")
    public SwCommunicationResource_Instance(Instance element) {
        super(element);
    }

}
