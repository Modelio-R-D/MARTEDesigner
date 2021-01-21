package org.modelio.module.marte.profile.hwstoragemanager.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.StorageResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("23730190-6246-42ea-bfa3-a6bfcf73aa7e")
public class HwStorageManager_Node extends StorageResource_Node {
    @objid ("465140ff-195f-49a5-9a83-6cbe543846b8")
    public HwStorageManager_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSTORAGEMANAGER_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWSTORAGEMANAGER_CLASSIFIER));
    }

    @objid ("aae4e52d-74e5-441a-967f-fb9dfdbf1aea")
    public HwStorageManager_Node(Node element) {
        super(element);
    }

    @objid ("cf388b2c-7209-4e1d-8156-d4ac33db3533")
    public String getmanagedMemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_MANAGEDMEMORIES, this.element);
    }

    @objid ("277a12bd-0598-4ace-8599-52b3b0d34b3c")
    public void setmanagedMemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_MANAGEDMEMORIES, value);
    }

    @objid ("3f9d0bb1-80e8-4d3d-9195-c9714889c8aa")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_DESCRIPTION, this.element);
    }

    @objid ("42ffb590-5aa7-4d74-b981-efb9212d3c04")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_DESCRIPTION, value);
    }

    @objid ("680c6d52-3d4a-47a3-bcf8-d365ad1a0efc")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_P_HW_SERVICES, this.element);
    }

    @objid ("e64c10ea-695e-4e25-9026-4b441a20f860")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_P_HW_SERVICES, value);
    }

    @objid ("239f942e-d56a-46a1-8acb-8cab76173ef1")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_R_HW_SERVICES, this.element);
    }

    @objid ("c46eea43-4fe1-48fe-85e5-f77be6c9dc4a")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_R_HW_SERVICES, value);
    }

    @objid ("abc5ede0-5fd2-478a-b0cc-7641df8de9fe")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_OWNEDHW, this.element);
    }

    @objid ("3b51b78f-9824-4e0e-b218-ec00f2cf5ab4")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_OWNEDHW, value);
    }

}
