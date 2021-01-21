package org.modelio.module.marte.profile.sw_brokering.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("67e2db2a-cb57-4d75-9bbc-fbe06a364534")
public class MemoryBroker_Instance extends SwResource_Instance {
    @objid ("9faea451-7e7d-4f6c-9c83-aa3d89ec9a5c")
    public MemoryBroker_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MEMORYBROKER_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("MemoryBroker_Instance"));
    }

    @objid ("47dcd976-296a-49ab-8971-b77469ffc447")
    public MemoryBroker_Instance(Instance element) {
        super(element);
    }

    @objid ("2003921e-bfc7-4d5a-a03d-a369fb2a6e91")
    public String getaccessPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_ACCESSPOLICY, this.element);
    }

    @objid ("51b7e555-6b72-4575-989e-311c249b5764")
    public void setaccessPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_ACCESSPOLICY, value);
    }

    @objid ("d13a08ba-924c-4e62-b7bc-12d1b41a8bbc")
    public String getmemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORIES, this.element);
    }

    @objid ("7ef5688f-a304-42bd-bc6f-294b5d7814d6")
    public void setmemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORIES, value);
    }

    @objid ("2c6931e0-d510-423e-9afd-ae6c62cf35a6")
    public String getmemoryBlockAdressElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS, this.element);
    }

    @objid ("a84074f3-16e2-4bef-8084-c12fbbf0a486")
    public void setmemoryBlockAdressElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS, value);
    }

    @objid ("1da103ea-0ac4-4df0-bdca-db88f3fab658")
    public String getmemoryBlockSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS, this.element);
    }

    @objid ("3d2d6808-1c4a-4350-8e01-51b41aad2b06")
    public void setmemoryBlockSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS, value);
    }

    @objid ("a9a9782a-31e3-4aab-9441-694394dcfe46")
    public String getlockServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_LOCKSERVICES, this.element);
    }

    @objid ("533d35ae-3f5d-4532-9ce5-906f1dd6561c")
    public void setlockServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_LOCKSERVICES, value);
    }

    @objid ("3d40e3df-0b1d-431b-86f4-50c698bebc8a")
    public String getunlockServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNLOCKSERVICES, this.element);
    }

    @objid ("3783e6ea-23c8-4f0d-a38d-23cafe62583a")
    public void setunlockServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNLOCKSERVICES, value);
    }

    @objid ("cb8b471f-d8b7-4c16-8256-e553949b068f")
    public String getmapServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MAPSERVICES, this.element);
    }

    @objid ("b70c22c1-481b-40f5-a38a-b4ab51aa9646")
    public void setmapServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MAPSERVICES, value);
    }

    @objid ("9a6b4568-4505-4e14-9a0c-11b62a4b227e")
    public String getunMapServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNMAPSERVICES, this.element);
    }

    @objid ("b57b32d2-d206-4812-9817-43fc2b26db83")
    public void setunMapServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNMAPSERVICES, value);
    }

    @objid ("018896f3-53a9-418f-be43-bc5bc0855d02")
    public enum AccessPolicyKind {
        Read,
        Write,
        ReadWrite,
        Undef,
        Other;
    }

}
