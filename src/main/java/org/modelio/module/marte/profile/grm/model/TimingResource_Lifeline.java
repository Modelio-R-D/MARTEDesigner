package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a9de05eb-10d3-4c56-8cce-1609bc59c862")
public class TimingResource_Lifeline extends Resource_Lifeline {
    @objid ("a78d1143-2042-4145-9350-1f97fbb82dbb")
    public TimingResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMINGRESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("TimingResource_Lifeline"));
    }

    @objid ("852da658-c85f-4566-9c89-ac576cbb97e1")
    public TimingResource_Lifeline(final Lifeline element) {
        super(element);
    }

}
