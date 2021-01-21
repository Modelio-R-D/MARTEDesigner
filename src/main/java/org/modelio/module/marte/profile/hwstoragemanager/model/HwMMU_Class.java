package org.modelio.module.marte.profile.hwstoragemanager.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e60edcec-2767-4e30-abec-ae4863e448de")
public class HwMMU_Class extends HwStorageManager_Class {
    @objid ("63bef37d-1af9-4196-8088-bfddb5ba85d2")
    public HwMMU_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMMU_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWMMU_CLASSIFIER));
    }

    @objid ("09f353d0-6a5f-4434-ae1c-002afb79f686")
    public HwMMU_Class(Class element) {
        super(element);
    }

    @objid ("0d6bb31d-18b4-4a2b-ab73-4553f6a59463")
    public String getvirtualAddrSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_VIRTUALADDRSPACE, this.element);
    }

    @objid ("24a25a6f-d70d-4cf6-a2a6-17cc667099d2")
    public void setvirtualAddrSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_VIRTUALADDRSPACE, value);
    }

    @objid ("e1032881-c0cc-494d-abac-667c379557ba")
    public String getphysicalAddrSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_PHYSICALADDRSPACE, this.element);
    }

    @objid ("db9dc754-909c-4ac5-9d89-aae123a9c9a9")
    public void setphysicalAddrSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_PHYSICALADDRSPACE, value);
    }

    @objid ("b773d399-c488-41c8-999d-db150b6b9dad")
    public String getnbEntries() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_NBENTRIES, this.element);
    }

    @objid ("7f2785a4-59bf-40f9-8750-b1dd7882ac0b")
    public void setnbEntries(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_NBENTRIES, value);
    }

    @objid ("fcf40512-9a45-499d-9717-18f5dde91018")
    public String getownedTLBs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_OWNEDTLBS, this.element);
    }

    @objid ("2bfbbfa5-5754-4f4b-8414-2b7e957e2b56")
    public void setownedTLBs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_OWNEDTLBS, value);
    }

    @objid ("aa772698-0ae5-4e03-9831-5c6416134cea")
    public boolean ismemoryProtection() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_MEMORYPROTECTION, this.element);
    }

    @objid ("f2ae9261-6387-41f5-a8c1-2289b33bf09d")
    public void ismemoryProtection(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_MEMORYPROTECTION,value);
    }

}
