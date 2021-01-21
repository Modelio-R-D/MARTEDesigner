package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("79f07d48-33ba-45a3-91b3-2710950e7d6a")
public class TimingResource_Attribute extends Resource_Attribute {
    @objid ("76c95a1f-3d81-4c58-ba0c-fece222512df")
    public TimingResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMINGRESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("TimingResource_Attribute"));
    }

    @objid ("68b6ea73-c05e-443c-9e69-b48e8bc529f3")
    public TimingResource_Attribute(final Attribute element) {
        super(element);
    }

}
