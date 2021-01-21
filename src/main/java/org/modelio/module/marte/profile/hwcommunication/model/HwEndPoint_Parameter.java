package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationEndPoint_Parameter;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("209eff7f-e6f6-49ba-9265-8da090793b78")
public class HwEndPoint_Parameter extends CommunicationEndPoint_Parameter {
    @objid ("832d48b4-c41d-4d4c-babb-cdc7bd94f555")
    public HwEndPoint_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwEndPoint_Parameter"));
    }

    @objid ("ca26c448-84b4-4739-9751-5b4319171934")
    public HwEndPoint_Parameter(Parameter element) {
        super(element);
    }

    @objid ("c96e2c99-ceed-47f6-b85e-efda3da820a1")
    public String getconnectedTo() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_PARAMETER_HWENDPOINT_PARAMETER_CONNECTEDTO, this.element);
    }

    @objid ("b5c07ea1-eb3a-42e4-91c1-3cb0b94b6108")
    public void setconnectedTo(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWENDPOINT_PARAMETER_HWENDPOINT_PARAMETER_CONNECTEDTO, value);
    }

}
