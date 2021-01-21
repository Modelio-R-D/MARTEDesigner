package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationEndPoint_Lifeline;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b61ab749-1847-4344-be91-25db6e52f993")
public class HwEndPoint_Lifeline extends CommunicationEndPoint_Lifeline {
    @objid ("31b30e96-a060-4533-8933-02859c7432de")
    public HwEndPoint_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwEndPoint_Lifeline"));
    }

    @objid ("937d3622-1150-447e-a098-7d1ce1f53423")
    public HwEndPoint_Lifeline(Lifeline element) {
        super(element);
    }

    @objid ("203a61ff-f2d7-4323-b633-3d37d572cf6a")
    public String getconnectedTo() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_LIFELINE_HWENDPOINT_LIFELINE_CONNECTEDTO, this.element);
    }

    @objid ("a5cd9880-0ae8-4108-b078-f04e7e4e177c")
    public void setconnectedTo(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWENDPOINT_LIFELINE_HWENDPOINT_LIFELINE_CONNECTEDTO, value);
    }

}
