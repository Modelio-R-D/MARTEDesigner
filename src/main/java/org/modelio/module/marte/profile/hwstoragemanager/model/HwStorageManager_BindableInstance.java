package org.modelio.module.marte.profile.hwstoragemanager.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.StorageResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwStorageManager_BindableInstance extends StorageResource_BindableInstance {
    public HwStorageManager_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSTORAGEMANAGER_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwStorageManager_BindableInstance"));
    }

    public HwStorageManager_BindableInstance(BindableInstance element) {
        super(element);
    }

    public String getmanagedMemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_MANAGEDMEMORIES, this.element);
    }

    public void setmanagedMemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_MANAGEDMEMORIES, value);
    }

    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_DESCRIPTION, this.element);
    }

    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_DESCRIPTION, value);
    }

    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_P_HW_SERVICES, this.element);
    }

    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_P_HW_SERVICES, value);
    }

    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_R_HW_SERVICES, this.element);
    }

    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_R_HW_SERVICES, value);
    }

    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_OWNEDHW, this.element);
    }

    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_OWNEDHW, value);
    }

    public String getfrequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_FREQUENCY, this.element);
    }

    public void setfrequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_FREQUENCY, value);
    }

    public String getendPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_ENDPOINTS, this.element);
    }

    public void setendPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_ENDPOINTS, value);
    }

}
