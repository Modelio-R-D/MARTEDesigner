package org.modelio.module.marte.profile.sw_concurrency.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class InterruptResource_Instance extends SwConcurrentResource_Instance {
    public InterruptResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.INTERRUPTRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("InterruptResource_Instance"));
    }

    public InterruptResource_Instance(Instance element) {
        super(element);
    }

    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_KIND, this.element);
    }

    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_KIND, value);
    }

    public boolean isisMaskable() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ISMASKABLE, this.element);
    }

    public void isisMaskable(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ISMASKABLE,value);
    }

    public String getvectorElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS, this.element);
    }

    public void setvectorElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS, value);
    }

    public String getmaskElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS, this.element);
    }

    public void setmaskElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS, value);
    }

    public String getroutineConnectServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES, this.element);
    }

    public void setroutineConnectServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES, value);
    }

    public String getroutineDisconnectServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES, this.element);
    }

    public void setroutineDisconnectServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES, value);
    }

}
