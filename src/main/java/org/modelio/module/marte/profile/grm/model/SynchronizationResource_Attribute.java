package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e81fbcb7-f44a-4868-af04-4317354f1a10")
public class SynchronizationResource_Attribute extends Resource_Attribute {
    @objid ("c3d3ba9d-4d05-43c4-805c-c7fa71ee7949")
    public SynchronizationResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SYNCHRONIZATIONRESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("SynchronizationResource_Attribute"));
    }

    @objid ("22541652-114d-42bd-ba5d-ab46a5be1117")
    public SynchronizationResource_Attribute(final Attribute element) {
        super(element);
    }

}
