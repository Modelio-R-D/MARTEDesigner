package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2122a510-bf40-4f15-8401-6bab1e5c5768")
public class ClockResource_Attribute extends TimingResource_Attribute {
    @objid ("5ff3694c-d587-455b-b1fc-946ac882437b")
    public ClockResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKRESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("ClockResource_Attribute"));
    }

    @objid ("200400b2-3197-4fb6-9686-af5759787aee")
    public ClockResource_Attribute(final Attribute element) {
        super(element);
    }

}
