package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationEndPoint_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("eaac6ceb-f654-41a4-8cd0-9c64c0adc930")
public class HwEndPoint_Class extends CommunicationEndPoint_Class {
    @objid ("ed56670b-dfc3-48ed-a764-9a84bdd5186f")
    public HwEndPoint_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName("HwEndPoint_Class"));
    }

    @objid ("0280ebeb-f108-4f39-b53d-82576b1b258d")
    public HwEndPoint_Class(Class element) {
        this.element = element;
    }

    @objid ("2ab471ce-cf02-48f4-abc1-b67de96761cc")
    public Class getElement() {
        return this.element;
    }

    @objid ("0b510433-69b8-403c-a172-bf1de74cf79c")
    public String getconnectedTo() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_CONNECTEDTO, this.element);
    }

    @objid ("494b4e09-44da-4723-9ab7-be046eb51c46")
    public void setconnectedTo(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_CONNECTEDTO, value);
    }

}
