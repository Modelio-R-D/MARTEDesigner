package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("efc5c206-d0bf-415d-9bbb-cbce0b530e45")
public class ClockResource_Parameter extends TimingResource_Parameter {
    @objid ("5fd799d4-ecef-4161-b0fa-6cfb049c8df6")
    public ClockResource_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKRESOURCE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("ClockResource_Parameter"));
    }

    @objid ("bf08a2ff-c254-49a9-9e77-16ead55a0315")
    public ClockResource_Parameter(final Parameter element) {
        super(element);
    }

}
