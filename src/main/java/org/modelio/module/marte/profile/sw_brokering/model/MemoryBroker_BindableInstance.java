package org.modelio.module.marte.profile.sw_brokering.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("890c2716-e14b-424a-bee0-2e2e31eccf39")
public class MemoryBroker_BindableInstance extends SwResource_BindableInstance {
    @objid ("d817005e-24b1-47db-8f88-8dccfbac0226")
    public MemoryBroker_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MEMORYBROKER_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("MemoryBroker_BindableInstance"));
    }

    @objid ("5cd6deba-614b-495f-a7de-bc6fed006661")
    public MemoryBroker_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("f714f85b-b104-4708-9126-8642bc93a79e")
    public String getaccessPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_ACCESSPOLICY, this.element);
    }

    @objid ("7ce1dbb5-1a70-4177-8e7b-0997fffa4b66")
    public void setaccessPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_ACCESSPOLICY, value);
    }

    @objid ("4732cdda-14d0-4004-9868-ef03579bd0e4")
    public String getmemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORIES, this.element);
    }

    @objid ("9e8e6021-bca2-4384-a91b-00c3fddb004b")
    public void setmemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORIES, value);
    }

    @objid ("7713ea25-2811-4d9b-ba3d-f0ff0f4ed430")
    public String getmemoryBlockAdressElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS, this.element);
    }

    @objid ("5aa2a721-cf4f-4c1f-b098-9e21f974d47d")
    public void setmemoryBlockAdressElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS, value);
    }

    @objid ("87103d6a-9ca9-48e1-85ec-ae9bcbb73830")
    public String getmemoryBlockSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS, this.element);
    }

    @objid ("fc5c35ac-dfbb-498c-a263-90cef4fa99f8")
    public void setmemoryBlockSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS, value);
    }

    @objid ("db879d18-4352-463c-96b5-da49cacb1fc7")
    public String getlockServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_LOCKSERVICES, this.element);
    }

    @objid ("b6f7a47b-4732-4f61-8026-6a1159c44eaf")
    public void setlockServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_LOCKSERVICES, value);
    }

    @objid ("61b30d83-1007-475d-8b6a-609f240e3a5c")
    public String getunlockServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNLOCKSERVICES, this.element);
    }

    @objid ("7de7dc69-4a67-4036-be48-60e039dd9d35")
    public void setunlockServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNLOCKSERVICES, value);
    }

    @objid ("ea3a89e6-d22b-4d9a-b31e-49181b9f49d9")
    public String getmapServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MAPSERVICES, this.element);
    }

    @objid ("031fa70a-e792-45b8-8bda-30a615d32332")
    public void setmapServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MAPSERVICES, value);
    }

    @objid ("2f0687ba-479e-4f65-b6bf-7df835f45e61")
    public String getunMapServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNMAPSERVICES, this.element);
    }

    @objid ("a28e6310-96c1-4704-9db4-22077c8b7295")
    public void setunMapServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNMAPSERVICES, value);
    }

}
