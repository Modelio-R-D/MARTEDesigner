package org.modelio.module.marte.profile.hwstoragemanager.model;

import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwMMU_Class extends HwStorageManager_Class {
    public HwMMU_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMMU_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWMMU_CLASSIFIER));
    }

    public HwMMU_Class(Class element) {
        super(element);
    }

    public String getvirtualAddrSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_VIRTUALADDRSPACE, this.element);
    }

    public void setvirtualAddrSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_VIRTUALADDRSPACE, value);
    }

    public String getphysicalAddrSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_PHYSICALADDRSPACE, this.element);
    }

    public void setphysicalAddrSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_PHYSICALADDRSPACE, value);
    }

    public String getnbEntries() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_NBENTRIES, this.element);
    }

    public void setnbEntries(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_NBENTRIES, value);
    }

    public String getownedTLBs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_OWNEDTLBS, this.element);
    }

    public void setownedTLBs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_OWNEDTLBS, value);
    }

    public boolean ismemoryProtection() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_MEMORYPROTECTION, this.element);
    }

    public void ismemoryProtection(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_MEMORYPROTECTION,value);
    }

}
