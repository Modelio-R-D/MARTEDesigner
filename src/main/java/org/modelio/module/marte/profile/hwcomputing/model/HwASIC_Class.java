package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5cb4f8e2-2593-47e7-90d1-7fdd011fe873")
public class HwASIC_Class extends HwComputingResource_Class {
    @objid ("8c0b42ac-a338-4a43-8326-dfba81741587")
    public HwASIC_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWASIC_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWASIC_CLASSIFIER));
    }

    @objid ("58dc4449-bb0d-4624-b1f7-a2c51b0eafd4")
    public HwASIC_Class(Class element) {
        super(element);
    }

}
