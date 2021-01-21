package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e81e6170-7cc3-4e18-9f4c-8f6980aeb766")
public class HwSupport_Parameter extends HwDevice_Parameter {
    @objid ("596c4f5a-7e7f-459d-a8d1-27b54298222a")
    public HwSupport_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSUPPORT_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwSupport_Parameter"));
    }

    @objid ("9875ba37-76b6-4948-9c77-3331af6d5c02")
    public HwSupport_Parameter(Parameter element) {
        super(element);
    }

}
