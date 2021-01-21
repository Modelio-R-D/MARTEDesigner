package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("78d70260-f311-450b-9ccb-224f67afd931")
public class HwComputingResource_Instance extends ComputingResource_Instance {
    @objid ("358b4a77-fb8b-40ad-b75e-5b085094ea2a")
    public HwComputingResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwComputingResource_Instance"));
    }

    @objid ("ee8e0492-dc1a-4464-9f41-4ee64e55eefb")
    public HwComputingResource_Instance(Instance element) {
        super(element);
    }

    @objid ("a9b45feb-74a6-4339-bbd5-85ec9d2bca7d")
    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_OP_FREQUENCIES, this.element);
    }

    @objid ("1e44b8ff-b942-42dc-9227-c24a326188ca")
    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_OP_FREQUENCIES, value);
    }

    @objid ("38958497-071e-43c4-91b4-86b10b748ab0")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_DESCRIPTION, this.element);
    }

    @objid ("7419de4c-a37c-47b3-bd00-208bce6a61f5")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_DESCRIPTION, value);
    }

}
