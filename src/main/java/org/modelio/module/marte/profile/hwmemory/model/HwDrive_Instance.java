package org.modelio.module.marte.profile.hwmemory.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwDrive_Instance extends HwMemory_Instance {
    public HwDrive_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDRIVE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwDrive_Instance"));
    }

    public HwDrive_Instance(Instance element) {
        super(element);
    }

    public String getsectorSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDRIVE_INSTANCE_HWDRIVE_INSTANCE_SECTORSIZE, this.element);
    }

    public void setsectorSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDRIVE_INSTANCE_HWDRIVE_INSTANCE_SECTORSIZE, value);
    }

}
