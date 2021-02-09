package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationEndPoint_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwEndPoint_Class extends CommunicationEndPoint_Class {
    public HwEndPoint_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName("HwEndPoint_Class"));
    }

    public HwEndPoint_Class(Class element) {
        this.element = element;
    }

    public Class getElement() {
        return this.element;
    }

    public String getconnectedTo() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_CONNECTEDTO, this.element);
    }

    public void setconnectedTo(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_CONNECTEDTO, value);
    }

}
