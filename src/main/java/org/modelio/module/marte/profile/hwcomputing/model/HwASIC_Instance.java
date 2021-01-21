package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("780eb194-f650-4402-92ef-ef79866932d0")
public class HwASIC_Instance extends HwComputingResource_Instance {
    @objid ("2660e031-d95e-4412-ac60-828e9aea364b")
    public HwASIC_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWASIC_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwASIC_Instance"));
    }

    @objid ("405bea5b-21de-4323-af2d-016baae714c1")
    public HwASIC_Instance(Instance element) {
        super(element);
    }

}
