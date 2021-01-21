package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("76294a94-7e7b-4668-a44f-75751c788562")
public class InterruptResource_BindableInstance extends SwConcurrentResource_BindableInstance {
    @objid ("eaf2bae8-6306-4d4c-80f3-3d6715719ca1")
    public InterruptResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.INTERRUPTRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("InterruptResource_BindableInstance"));
    }

    @objid ("efc80e60-795d-4e33-813e-1fd375cb9128")
    public InterruptResource_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("5240dc74-2bc8-4094-bfb1-509d1648b7f2")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_KIND, this.element);
    }

    @objid ("3311e2ba-51b7-4cab-82d7-2964be1035e1")
    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_KIND, value);
    }

    @objid ("67621e7f-651f-4b94-89c4-1d95eca8d690")
    public boolean isisMaskable() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ISMASKABLE, this.element);
    }

    @objid ("a2830966-82b2-4b7a-bc8f-840bf024f018")
    public void isisMaskable(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ISMASKABLE,value);
    }

    @objid ("ac6eadfc-0bd5-49da-a0ee-5bd4aa2b5d8b")
    public String getvectorElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS, this.element);
    }

    @objid ("fa3e5808-e2ac-481d-92a5-990c08a1768c")
    public void setvectorElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS, value);
    }

    @objid ("c15c0fba-e299-429f-9957-995bfb9f7724")
    public String getmaskElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS, this.element);
    }

    @objid ("3202ade9-42e4-45c2-a975-577480ed433d")
    public void setmaskElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS, value);
    }

    @objid ("e4a3d712-270a-47cb-85f8-5903135452d1")
    public String getroutineConnectServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES, this.element);
    }

    @objid ("3a280618-288a-4402-9bc4-4654db17e2e5")
    public void setroutineConnectServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES, value);
    }

    @objid ("43aa3bdc-e787-4689-889d-8f72ed2d8820")
    public String getroutineDisconnectServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES, this.element);
    }

    @objid ("d4bb9e8e-83d3-4e6e-bb3e-28d7d324ad2e")
    public void setroutineDisconnectServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES, value);
    }

}
