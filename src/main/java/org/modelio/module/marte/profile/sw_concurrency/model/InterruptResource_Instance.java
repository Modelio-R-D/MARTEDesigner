package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("36944faa-7377-440b-8b85-cc5d68fc1839")
public class InterruptResource_Instance extends SwConcurrentResource_Instance {
    @objid ("444f9693-b16b-49d1-b4be-c40c3ffc313b")
    public InterruptResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.INTERRUPTRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("InterruptResource_Instance"));
    }

    @objid ("ed6b922f-fd24-4cee-add7-26ff95dd7a0a")
    public InterruptResource_Instance(Instance element) {
        super(element);
    }

    @objid ("2da8920f-72e1-408d-be5d-10b21f9f2fba")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_KIND, this.element);
    }

    @objid ("422b7b81-d280-4d91-b997-574c652a87f8")
    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_KIND, value);
    }

    @objid ("736425ec-ca14-4be2-b363-6c2593c44d44")
    public boolean isisMaskable() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ISMASKABLE, this.element);
    }

    @objid ("74007e0a-e4db-4589-a00c-60745a38fa13")
    public void isisMaskable(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ISMASKABLE,value);
    }

    @objid ("85b7cf68-4806-481b-a586-fa001b75bc34")
    public String getvectorElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS, this.element);
    }

    @objid ("814b6d21-dac8-4471-99b3-4e40eb4ed43b")
    public void setvectorElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS, value);
    }

    @objid ("a5867b67-5c3e-4088-ad74-473229d67b7c")
    public String getmaskElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS, this.element);
    }

    @objid ("b4a6f57b-d664-4f9a-bec8-17d110402c10")
    public void setmaskElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS, value);
    }

    @objid ("b1e97706-8524-4058-8950-22d262531726")
    public String getroutineConnectServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES, this.element);
    }

    @objid ("d8d313a5-7480-4adc-bd0d-6a03e27a7e98")
    public void setroutineConnectServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES, value);
    }

    @objid ("dea4a025-7cb7-491f-8696-ed994fd7933c")
    public String getroutineDisconnectServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES, this.element);
    }

    @objid ("f3fb7ef9-3111-48e9-b77e-89a56f6d6365")
    public void setroutineDisconnectServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES, value);
    }

}
