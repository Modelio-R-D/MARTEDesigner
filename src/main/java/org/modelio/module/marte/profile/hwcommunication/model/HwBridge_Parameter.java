package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e2914595-139c-4ff8-82ca-f67550513ae3")
public class HwBridge_Parameter extends HwMedia_Parameter {
    @objid ("e8213e9b-b618-4e64-87b2-17efeffaa300")
    public HwBridge_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwBridge_Parameter"));
    }

    @objid ("bf2c5f61-e0c4-4e2f-b717-e89c42645c7d")
    public HwBridge_Parameter(Parameter element) {
        super(element);
    }

    @objid ("96e0ddc3-302f-4a8c-a6c9-513953fb5be6")
    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_PARAMETER_HWBRIDGE_PARAMETER_SIDES, this.element);
    }

    @objid ("555bf16e-ede7-4367-b678-71fb074cf5d4")
    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_PARAMETER_HWBRIDGE_PARAMETER_SIDES, value);
    }

    @objid ("b55e074c-3acd-4fcb-b12a-8dc6f4b88357")
    public Parameter getElement() {
        return this.element;
    }

}
