package org.modelio.module.marte.profile.hwstoragemanager.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.StorageResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("fe540c72-4212-499e-b344-128e7d815a79")
public class HwStorageManager_BindableInstance extends StorageResource_BindableInstance {
    @objid ("0bea273b-9564-4a11-8add-61978edd4726")
    public HwStorageManager_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSTORAGEMANAGER_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwStorageManager_BindableInstance"));
    }

    @objid ("ef6f490d-70fe-4570-82f9-ef2b387d57e0")
    public HwStorageManager_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("f63cdc85-065f-432c-834f-7f48df122c24")
    public String getmanagedMemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_MANAGEDMEMORIES, this.element);
    }

    @objid ("c9fccc8d-78dc-48dc-b1cc-480c36d7119d")
    public void setmanagedMemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_MANAGEDMEMORIES, value);
    }

    @objid ("46be30f2-6526-4a61-8890-78ff058e3ab6")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_DESCRIPTION, this.element);
    }

    @objid ("319cfcd9-c298-44bf-88bf-e2cec1d77acc")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_DESCRIPTION, value);
    }

    @objid ("92d041d1-01ed-42b2-8d17-924f921e62c1")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_P_HW_SERVICES, this.element);
    }

    @objid ("0105d07e-1b71-4b48-8f38-af2a26c72e08")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_P_HW_SERVICES, value);
    }

    @objid ("bc923098-e622-4dc6-858b-b1e91d64d87b")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_R_HW_SERVICES, this.element);
    }

    @objid ("c0387030-9dce-4179-8673-b11de74a69d2")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_R_HW_SERVICES, value);
    }

    @objid ("1b72eee1-0cea-4be9-8c3c-af65459d0014")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_OWNEDHW, this.element);
    }

    @objid ("24d535db-09c5-4a75-8594-8a878093a251")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_OWNEDHW, value);
    }

    @objid ("f35551ca-f18d-48e5-868e-9b65f9fc80bf")
    public String getfrequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_FREQUENCY, this.element);
    }

    @objid ("80427e65-8f0a-41ff-ac34-145f306d3aa1")
    public void setfrequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_FREQUENCY, value);
    }

    @objid ("718a676a-66dc-4526-b778-7de7ef5d3b58")
    public String getendPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_ENDPOINTS, this.element);
    }

    @objid ("cf387e60-9f5a-4875-b3db-d883f247a3bb")
    public void setendPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_INSTANCE_HWSTORAGEMANAGER_INSTANCE_ENDPOINTS, value);
    }

}
