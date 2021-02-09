package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationEndPoint_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwEndPoint_Instance extends CommunicationEndPoint_Instance {
    public HwEndPoint_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwEndPoint_Instance"));
    }

    public HwEndPoint_Instance(Instance element) {
        super(element);
    }

    public String getconnectedTo() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_INSTANCE_HWENDPOINT_INSTANCE_CONNECTEDTO, this.element);
    }

    public void setconnectedTo(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWENDPOINT_INSTANCE_HWENDPOINT_INSTANCE_CONNECTEDTO, value);
    }

}
