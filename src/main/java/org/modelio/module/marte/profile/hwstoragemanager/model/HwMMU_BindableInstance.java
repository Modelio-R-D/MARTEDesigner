package org.modelio.module.marte.profile.hwstoragemanager.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwMMU_BindableInstance extends HwStorageManager_BindableInstance {
    public HwMMU_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMMU_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwMMU_BindableInstance"));
    }

    public HwMMU_BindableInstance(BindableInstance element) {
        super(element);
    }

    public String getvirtualAddrSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_VIRTUALADDRSPACE, this.element);
    }

    public void setvirtualAddrSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_VIRTUALADDRSPACE, value);
    }

    public String getphysicalAddrSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_PHYSICALADDRSPACE, this.element);
    }

    public void setphysicalAddrSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_PHYSICALADDRSPACE, value);
    }

    public String getnbEntries() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_NBENTRIES, this.element);
    }

    public void setnbEntries(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_NBENTRIES, value);
    }

    public String getownedTLBs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_OWNEDTLBS, this.element);
    }

    public void setownedTLBs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_OWNEDTLBS, value);
    }

    public boolean ismemoryProtection() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_MEMORYPROTECTION, this.element);
    }

    public void ismemoryProtection(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_MEMORYPROTECTION,value);
    }

}
