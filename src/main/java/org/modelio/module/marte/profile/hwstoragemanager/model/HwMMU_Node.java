package org.modelio.module.marte.profile.hwstoragemanager.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8c54bd23-8898-4604-a004-f6cfbc9afde8")
public class HwMMU_Node extends HwStorageManager_Node {
    @objid ("d1a5b904-55ac-4897-b9fc-36f10ee8a4c0")
    public HwMMU_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMMU_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWMMU_CLASSIFIER));
    }

    @objid ("93500c3c-4204-4104-9d7f-96da0cad0be6")
    public HwMMU_Node(Node element) {
        super(element);
    }

    @objid ("849b80ca-e793-4ec5-b356-7b7cfdd5b2b8")
    public String getvirtualAddrSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_VIRTUALADDRSPACE, this.element);
    }

    @objid ("b2218376-0011-4711-8c89-70535ba3e398")
    public void setvirtualAddrSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_VIRTUALADDRSPACE, value);
    }

    @objid ("d27c052d-f994-4280-b1e7-8d5c3386fa4b")
    public String getphysicalAddrSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_PHYSICALADDRSPACE, this.element);
    }

    @objid ("31cc1072-6e21-4dcb-8e12-e58da195d4fc")
    public void setphysicalAddrSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_PHYSICALADDRSPACE, value);
    }

    @objid ("6ceb9f71-4aab-42db-ab3e-fd9936c7d68d")
    public String getnbEntries() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_NBENTRIES, this.element);
    }

    @objid ("1945f4cd-9fa3-4739-9cff-e343830b13b5")
    public void setnbEntries(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_NBENTRIES, value);
    }

    @objid ("6a7ba014-6b60-4cf2-9d4b-7d1468bfc152")
    public String getownedTLBs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_OWNEDTLBS, this.element);
    }

    @objid ("f7eaca68-e6f1-405c-8113-dd390e762599")
    public void setownedTLBs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_OWNEDTLBS, value);
    }

    @objid ("1bea2b45-27ee-44e5-b7e9-dc309b48306f")
    public boolean ismemoryProtection() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_MEMORYPROTECTION, this.element);
    }

    @objid ("da38cb54-e847-4d58-9f29-f15becd5026e")
    public void ismemoryProtection(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_MEMORYPROTECTION,value);
    }

}
