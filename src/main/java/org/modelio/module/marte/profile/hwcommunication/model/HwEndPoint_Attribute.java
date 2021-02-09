package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationEndPoint_Attribute;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwEndPoint_Attribute extends CommunicationEndPoint_Attribute {
    public HwEndPoint_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwEndPoint_Attribute"));
    }

    public HwEndPoint_Attribute(Attribute element) {
        super(element);
    }

    public String getconnectedTo() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_ATTRIBUTE_HWENDPOINT_ATTRIBUTE_CONNECTEDTO, this.element);
    }

    public void setconnectedTo(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWENDPOINT_ATTRIBUTE_HWENDPOINT_ATTRIBUTE_CONNECTEDTO, value);
    }

}
