package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationMedia_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0ca84c2d-81b8-42f0-b492-dc3bdaafd9d7")
public class SwCommunicationResource_Class extends CommunicationMedia_Class {
    @objid ("2130105a-f04c-4348-b4dc-b63257b39edd")
    public SwCommunicationResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER));
    }

    @objid ("055e47f8-07cf-4f48-9478-f5729847a131")
    public SwCommunicationResource_Class(Class element) {
        super(element);
    }

    @objid ("9ebadbdd-b907-433c-94b2-c0e6284a23ec")
    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
