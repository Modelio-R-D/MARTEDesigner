package org.modelio.module.marte.profile.hwstoragemanager.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b276cb3e-9307-4b72-bd28-e09221d46aa6")
public class HwMMU_Instance extends HwStorageManager_Instance {
    @objid ("1e6decb2-61a8-48f9-8d67-e329f5f46d2e")
    public HwMMU_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMMU_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwMMU_Instance"));
    }

    @objid ("643eed4c-3458-49c9-98e2-c8ccc799f7ea")
    public HwMMU_Instance(Instance element) {
        super(element);
    }

    @objid ("daba94de-e95f-4846-bcdf-9d931a48688b")
    public String getvirtualAddrSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_VIRTUALADDRSPACE, this.element);
    }

    @objid ("cf04d647-bd6c-4e16-a634-1ca2388d9c66")
    public void setvirtualAddrSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_VIRTUALADDRSPACE, value);
    }

    @objid ("ba13586e-cca8-4629-b591-243581b76b8b")
    public String getphysicalAddrSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_PHYSICALADDRSPACE, this.element);
    }

    @objid ("b66660dc-d311-49d0-b1a2-eb7a8b621247")
    public void setphysicalAddrSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_PHYSICALADDRSPACE, value);
    }

    @objid ("141b9148-5803-4a87-8ede-43f6d823cf25")
    public String getnbEntries() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_NBENTRIES, this.element);
    }

    @objid ("ad97e2f6-162e-4570-b21d-8203c921287b")
    public void setnbEntries(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_NBENTRIES, value);
    }

    @objid ("3c0a3eac-2167-459b-98f1-b131399b9bbe")
    public String getownedTLBs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_OWNEDTLBS, this.element);
    }

    @objid ("22d0870e-9ca7-448a-8ce8-0dc99502bb86")
    public void setownedTLBs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_OWNEDTLBS, value);
    }

    @objid ("020674ae-3018-40b7-868e-9b68f44e9cc8")
    public boolean ismemoryProtection() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_MEMORYPROTECTION, this.element);
    }

    @objid ("7215603d-ca02-4acf-a188-c0c219075f7b")
    public void ismemoryProtection(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_MEMORYPROTECTION,value);
    }

}
