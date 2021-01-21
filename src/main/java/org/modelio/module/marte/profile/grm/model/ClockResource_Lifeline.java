package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d648404d-1680-405e-9004-ba5caeaaaebf")
public class ClockResource_Lifeline extends TimingResource_Lifeline {
    @objid ("54def8ec-6556-4581-aa25-4684cf2a7dec")
    public ClockResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKRESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("ClockResource_Lifeline"));
    }

    @objid ("e2218246-98f4-4472-8163-04178d14442c")
    public ClockResource_Lifeline(final Lifeline element) {
        super(element);
    }

}
