package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3a9a3fbc-0bea-4da3-9c65-f28409746fec")
public class HwMedia_Lifeline extends HwCommunicationResource_Lifeline {
    @objid ("86a7d18b-dffb-4ae3-8062-4fc05ec9c48e")
    public HwMedia_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEDIA_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwMedia_Lifeline"));
    }

    @objid ("457e3d08-8af0-4a21-aba4-24d99862de89")
    public HwMedia_Lifeline(Lifeline element) {
        super(element);
    }

    @objid ("343a755d-0391-42b7-8ef3-84301b15261d")
    public String getarbiters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEDIA_LIFELINE_HWMEDIA_LIFELINE_ARBITERS, this.element);
    }

    @objid ("c5f59099-5096-4377-820f-e930dc0d4d23")
    public void setarbiters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEDIA_LIFELINE_HWMEDIA_LIFELINE_ARBITERS, value);
    }

}
