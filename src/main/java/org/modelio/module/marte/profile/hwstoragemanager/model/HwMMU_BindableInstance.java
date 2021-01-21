package org.modelio.module.marte.profile.hwstoragemanager.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("189163de-74fe-4fb4-97f6-4f2efa708161")
public class HwMMU_BindableInstance extends HwStorageManager_BindableInstance {
    @objid ("635e3742-be98-4ebf-a8b7-e630814655a5")
    public HwMMU_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMMU_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwMMU_BindableInstance"));
    }

    @objid ("23bd2bea-92ec-499b-810c-9ff154d221e9")
    public HwMMU_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("0468f2cd-0150-473e-9123-0c75245c9fd2")
    public String getvirtualAddrSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_VIRTUALADDRSPACE, this.element);
    }

    @objid ("eaaaea81-d2b9-427d-8864-dabce66af521")
    public void setvirtualAddrSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_VIRTUALADDRSPACE, value);
    }

    @objid ("648c947b-f359-435a-9a77-920beb8f2ae1")
    public String getphysicalAddrSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_PHYSICALADDRSPACE, this.element);
    }

    @objid ("3f976c32-0dba-4f6c-94bb-74128198be48")
    public void setphysicalAddrSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_PHYSICALADDRSPACE, value);
    }

    @objid ("f9662030-9c3e-4e90-85a0-a938f922d3ba")
    public String getnbEntries() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_NBENTRIES, this.element);
    }

    @objid ("35a9bacc-e48b-4d30-83f3-8fe057ea6946")
    public void setnbEntries(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_NBENTRIES, value);
    }

    @objid ("4128e407-5214-4687-ba1f-c4a9f77602bd")
    public String getownedTLBs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_OWNEDTLBS, this.element);
    }

    @objid ("3d3594ca-3e8d-4393-befb-7e6d6f8baf4e")
    public void setownedTLBs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_OWNEDTLBS, value);
    }

    @objid ("14b51529-ff77-435f-95a4-3a485aa29990")
    public boolean ismemoryProtection() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_MEMORYPROTECTION, this.element);
    }

    @objid ("577914b5-d0fe-4c8a-bccc-3e423cfa457f")
    public void ismemoryProtection(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_MEMORYPROTECTION,value);
    }

}
