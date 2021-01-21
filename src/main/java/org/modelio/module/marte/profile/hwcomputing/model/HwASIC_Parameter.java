package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("547e8f99-ec28-4d9f-b4d5-5a9c3e5deee7")
public class HwASIC_Parameter extends HwComputingResource_Parameter {
    @objid ("3e9cb7ee-8bf3-4fd4-9639-8d85f06aa167")
    public HwASIC_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWASIC_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwASIC_Parameter"));
    }

    @objid ("67db6e83-3da1-46ec-a282-a6a2396f210f")
    public HwASIC_Parameter(Parameter element) {
        super(element);
    }

}
