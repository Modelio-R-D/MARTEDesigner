package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("671551a8-2811-4e6c-b803-113a600f9520")
public class ComputingResource_Lifeline extends ProcessingResource_Lifeline {
    @objid ("b7b31b94-0a38-4dde-ba57-4ba4ed66493e")
    public ComputingResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMPUTINGRESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("ComputingResource_Lifeline"));
    }

    @objid ("5dc73b3b-4eab-49fa-9da7-d207246a55de")
    public ComputingResource_Lifeline(final Lifeline element) {
        super(element);
    }

}
