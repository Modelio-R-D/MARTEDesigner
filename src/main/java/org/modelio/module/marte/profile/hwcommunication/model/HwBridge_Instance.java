package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2e6712ad-8ef2-4f26-80ba-240277596bcb")
public class HwBridge_Instance extends HwMedia_Instance {
    @objid ("58fa97a5-4a1b-4301-8e68-331d9484fd65")
    public HwBridge_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwBridge_Instance"));
    }

    @objid ("112e039b-6b5e-49aa-b47c-086bc615184c")
    public HwBridge_Instance(Instance element) {
        super(element);
    }

    @objid ("8a34e4f5-cd33-44af-a069-88ebdd4ce84f")
    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_INSTANCE_HWBRIDGE_INSTANCE_SIDES, this.element);
    }

    @objid ("89ee520b-8dfd-4352-8e03-a55d99da7f08")
    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_INSTANCE_HWBRIDGE_INSTANCE_SIDES, value);
    }

}
