package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("69a65729-3982-4d15-9655-4c554a1c25ea")
public class HwDrive_Instance extends HwMemory_Instance {
    @objid ("cc50bbe5-9295-400c-a24c-683e1bdc08c9")
    public HwDrive_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDRIVE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwDrive_Instance"));
    }

    @objid ("4e1e7398-a4a9-4c72-8184-4f67ffea7394")
    public HwDrive_Instance(Instance element) {
        super(element);
    }

    @objid ("5c6850fb-a29f-4aa9-bb87-68180dcd109e")
    public String getsectorSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDRIVE_INSTANCE_HWDRIVE_INSTANCE_SECTORSIZE, this.element);
    }

    @objid ("91c9a9d6-2307-4990-92fa-a7cbcc7eecc3")
    public void setsectorSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDRIVE_INSTANCE_HWDRIVE_INSTANCE_SECTORSIZE, value);
    }

}
