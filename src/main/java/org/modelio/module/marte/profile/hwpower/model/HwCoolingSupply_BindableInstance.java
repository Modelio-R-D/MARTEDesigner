package org.modelio.module.marte.profile.hwpower.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwlayout.model.HwComponent_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0dd22465-a68d-4114-81cf-d53791cc9618")
public class HwCoolingSupply_BindableInstance extends HwComponent_BindableInstance {
    @objid ("48cfbe29-9f9a-4030-8acd-fd44c6430784")
    public HwCoolingSupply_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOOLINGSUPPLY_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwCoolingSupply_BindableInstance"));
    }

    @objid ("3dc36d51-4454-4fe6-9421-35a343bae35d")
    public HwCoolingSupply_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("d103e87f-dd94-409f-9368-41dede1342a4")
    public String getcoolingPower() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_INSTANCE_HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER, this.element);
    }

    @objid ("453d6042-739b-41a4-bd50-e24a7ff86cbf")
    public void setcoolingPower(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOOLINGSUPPLY_INSTANCE_HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER, value);
    }

}
