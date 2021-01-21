package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("11ad0a36-db92-400a-b827-09533b69e8d7")
public class HwBridge_BindableInstance extends HwMedia_BindableInstance {
    @objid ("d352682a-1100-4eeb-a572-2586dd8f9b53")
    public HwBridge_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwBridge_BindableInstance"));
    }

    @objid ("8ca74858-1d86-4694-b8b3-acdccd1e7a39")
    public HwBridge_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("98f07282-dca9-4777-bc75-8e3b950cf850")
    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_INSTANCE_HWBRIDGE_INSTANCE_SIDES, this.element);
    }

    @objid ("32ec6436-da0d-47a8-bfd5-2408f07ae910")
    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_INSTANCE_HWBRIDGE_INSTANCE_SIDES, value);
    }

}
