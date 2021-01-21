package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("eb5dd261-2617-4648-9c03-557d4d416049")
public class HwASIC_BindableInstance extends HwComputingResource_BindableInstance {
    @objid ("bc5a491a-0a48-4121-9a3d-6db85e81b8f3")
    public HwASIC_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWASIC_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwASIC_BindableInstance"));
    }

    @objid ("6a2f6e08-8671-4f7c-8642-ed0fb0dd0bf4")
    public HwASIC_BindableInstance(BindableInstance element) {
        super(element);
    }

}
