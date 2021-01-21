package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5b5a2da7-0b5e-4f55-99f2-cbeafaf3c353")
public class ConcurrencyResource_Attribute extends Resource_Attribute {
    @objid ("9b18d9f3-e4bb-4645-917f-3f697722cbde")
    public ConcurrencyResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONCURRENCYRESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("ConcurrencyResource_Attribute"));
    }

    @objid ("1bec6b37-e546-4b6c-9d4b-ea29a1a2790d")
    public ConcurrencyResource_Attribute(final Attribute element) {
        super(element);
    }

}
