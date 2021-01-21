package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c07955ea-7039-4c63-a3d1-1fb17d6b0c1c")
public class ProcessingResource_Lifeline extends Resource_Lifeline {
    @objid ("d637ccb6-a249-4044-b869-7b1e32e00258")
    public ProcessingResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PROCESSINGRESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("ProcessingResource_Lifeline"));
    }

    @objid ("a5008c3a-b189-42e6-94ff-afa466205b82")
    public ProcessingResource_Lifeline(final Lifeline element) {
        super(element);
    }

    @objid ("270e6b3a-1846-4c60-84ec-883bd86da24f")
    public String getspeedFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_LIFELINE_PROCESSINGRESOURCE_LIFELINE_SPEEDFACTOR, this.element);
    }

    @objid ("6cfb12f3-4e56-4133-b75e-21c18b6e1375")
    public void setspeedFactor(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_LIFELINE_PROCESSINGRESOURCE_LIFELINE_SPEEDFACTOR, value);
    }

    @objid ("c6eaa843-ac2f-40c6-b21d-da14756cbecc")
    public String getmainScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_LIFELINE_PROCESSINGRESOURCE_LIFELINE_MAINSCHEDULER, this.element);
    }

    @objid ("3c47ff7b-0d88-4487-b23f-d5d561e56610")
    public void setmainScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_LIFELINE_PROCESSINGRESOURCE_LIFELINE_MAINSCHEDULER, value);
    }

}
