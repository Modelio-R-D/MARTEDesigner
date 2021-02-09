package org.modelio.module.marte.profile.sw_brokering.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class MemoryBroker_BindableInstance extends SwResource_BindableInstance {
    public MemoryBroker_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MEMORYBROKER_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("MemoryBroker_BindableInstance"));
    }

    public MemoryBroker_BindableInstance(BindableInstance element) {
        super(element);
    }

    public String getaccessPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_ACCESSPOLICY, this.element);
    }

    public void setaccessPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_ACCESSPOLICY, value);
    }

    public String getmemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORIES, this.element);
    }

    public void setmemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORIES, value);
    }

    public String getmemoryBlockAdressElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS, this.element);
    }

    public void setmemoryBlockAdressElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS, value);
    }

    public String getmemoryBlockSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS, this.element);
    }

    public void setmemoryBlockSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS, value);
    }

    public String getlockServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_LOCKSERVICES, this.element);
    }

    public void setlockServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_LOCKSERVICES, value);
    }

    public String getunlockServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNLOCKSERVICES, this.element);
    }

    public void setunlockServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNLOCKSERVICES, value);
    }

    public String getmapServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MAPSERVICES, this.element);
    }

    public void setmapServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_MAPSERVICES, value);
    }

    public String getunMapServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNMAPSERVICES, this.element);
    }

    public void setunMapServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_INSTANCE_MEMORYBROKER_INSTANCE_UNMAPSERVICES, value);
    }

}
