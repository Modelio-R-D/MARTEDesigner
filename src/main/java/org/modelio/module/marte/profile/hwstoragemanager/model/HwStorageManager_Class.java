package org.modelio.module.marte.profile.hwstoragemanager.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.StorageResource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6a1f9ecd-ad4f-4e68-9a78-8193460e0ccd")
public class HwStorageManager_Class extends StorageResource_Class {
    @objid ("539e2a5d-71f1-4afe-8fa3-3e8989b443f3")
    public HwStorageManager_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSTORAGEMANAGER_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWSTORAGEMANAGER_CLASSIFIER));
    }

    @objid ("95fba1c9-7bc4-46e1-ae3e-e96f16dfc124")
    public HwStorageManager_Class(Class element) {
        super(element);
    }

    @objid ("6e06cca1-f076-408e-876e-d0390aab97e5")
    public String getmanagedMemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_MANAGEDMEMORIES, this.element);
    }

    @objid ("44a91f0c-1e5e-421e-95b8-5672b77dbaf9")
    public void setmanagedMemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_MANAGEDMEMORIES, value);
    }

    @objid ("6da4b502-5f70-4534-bbc7-3e9e41eef6f2")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_DESCRIPTION, this.element);
    }

    @objid ("bab4274c-8b31-467e-8475-63027926dff0")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_DESCRIPTION, value);
    }

    @objid ("a6db0a6e-4324-442b-8730-18eb298659f4")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_P_HW_SERVICES, this.element);
    }

    @objid ("6e7b32e5-5fb5-40ca-8aa1-06ee53b6108c")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_P_HW_SERVICES, value);
    }

    @objid ("5793943b-9ed5-48bb-9d24-ea104783ce1c")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_R_HW_SERVICES, this.element);
    }

    @objid ("3d1697ea-f41d-41df-add9-a29b0c0f18fd")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_R_HW_SERVICES, value);
    }

    @objid ("87d7c88f-e441-4ba0-9181-40beedddd9d7")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_OWNEDHW, this.element);
    }

    @objid ("8b469b2f-2bca-475d-8bdd-113e81ef6cbd")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_OWNEDHW, value);
    }

}
