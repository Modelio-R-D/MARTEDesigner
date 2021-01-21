package org.modelio.module.marte.profile.hwstoragemanager.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.StorageResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("99e581d5-6b2e-4978-89ff-9edacbcfb9cf")
public class HwStorageManager_Instance extends StorageResource_Instance {
    @objid ("82eb55fe-3084-44ef-8c2a-c209bf8ab3cb")
    public HwStorageManager_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSTORAGEMANAGER_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwStorageManager_Instance"));
    }

    @objid ("9c0f11c8-579b-43b2-9e34-869a8227a4a2")
    public HwStorageManager_Instance(Instance element) {
        super(element);
    }

    @objid ("5b2a7637-061b-4c8c-b26c-0a2984cd58ae")
    public String getmanagedMemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_MANAGEDMEMORIES, this.element);
    }

    @objid ("541a6ed7-6244-47c5-a0ba-42cd3c368dbd")
    public void setmanagedMemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_MANAGEDMEMORIES, value);
    }

    @objid ("7b81f3cb-cc00-4b14-acf8-9fc12c2d8881")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_DESCRIPTION, this.element);
    }

    @objid ("e273ad33-8ea6-4fba-ab05-e4ff23cedd70")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_DESCRIPTION, value);
    }

    @objid ("bfe3571c-b19c-4e99-9021-441f59ea68b0")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_P_HW_SERVICES, this.element);
    }

    @objid ("19750556-78bc-48fd-b812-4ab2658dc761")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_P_HW_SERVICES, value);
    }

    @objid ("f9ca2906-3a84-4dc8-805c-7a1a0b5bb804")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_R_HW_SERVICES, this.element);
    }

    @objid ("94bb4540-ca13-4f75-b297-43a1ead7a419")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_R_HW_SERVICES, value);
    }

    @objid ("95c18ca9-afcb-4c0d-aea1-d288f92f57b1")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_OWNEDHW, this.element);
    }

    @objid ("0660c543-e0cc-4088-86f6-a06b2eb82eb4")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_OWNEDHW, value);
    }

    @objid ("57ee456b-3c3e-4cdf-9cca-994dbd271ff1")
    public String getHwStorageManager_Instance_frequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_FREQUENCY, this.element);
    }

    @objid ("11042084-ee76-4ae9-a5e5-4d9f4a11a8c0")
    public void setHwStorageManager_Instance_frequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_FREQUENCY, value);
    }

    @objid ("6c179db1-d78f-40f7-b693-59b5ec0421e6")
    public String getHwStorageManager_Instance_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_ENDPOINTS, this.element);
    }

    @objid ("68633b33-0b1a-4c8f-b5c8-2a63d87353f7")
    public void setHwStorageManager_Instance_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_ENDPOINTS, value);
    }

}
