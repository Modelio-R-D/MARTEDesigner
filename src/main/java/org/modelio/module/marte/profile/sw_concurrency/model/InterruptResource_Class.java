package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9ff70126-3650-4e4d-8486-63d496e4941d")
public class InterruptResource_Class extends SwConcurrentResource_Class {
    @objid ("9f4d6327-ee3f-4e6c-999a-232689ad471c")
    public InterruptResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.INTERRUPTRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.INTERRUPTRESOURCE_CLASSIFIER));
    }

    @objid ("9243de33-c6a8-442b-bb71-c29696cc3154")
    public InterruptResource_Class(Class element) {
        super(element);
    }

    @objid ("f91a8dee-e1fc-48cb-861f-f56de466d3ec")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_KIND, this.element);
    }

    @objid ("71e91602-0e2a-40d9-94e4-31049d9dbfbf")
    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_KIND, value);
    }

    @objid ("a71eca62-3f27-4365-803d-73a5bdcbcd3a")
    public boolean isisMaskable() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE, this.element);
    }

    @objid ("7c2b1c0b-4343-4b1e-b237-5a933a2ec962")
    public void isisMaskable(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE,value);
    }

    @objid ("06ffb9d4-9fc5-4726-bd3d-eda90a860571")
    public String getvectorElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS, this.element);
    }

    @objid ("49a47ccc-0796-4532-89e1-ea021e00af28")
    public void setvectorElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS, value);
    }

    @objid ("be27525b-d79d-46c4-a999-bdcd3106886f")
    public String getmaskElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS, this.element);
    }

    @objid ("258a0626-3f45-4960-bde6-8ebdd0eb658f")
    public void setmaskElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS, value);
    }

    @objid ("1ecc5bf6-49bf-4b87-b709-d77c4f332613")
    public String getroutineConnectServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES, this.element);
    }

    @objid ("78ed320f-299b-4ec1-b718-352d79555847")
    public void setroutineConnectServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES, value);
    }

    @objid ("39d278ce-4939-44a0-904c-c39ab03a1451")
    public String getroutineDisconnectServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES, this.element);
    }

    @objid ("7523e62b-2f84-4cbc-9b63-7b1350286fce")
    public void setroutineDisconnectServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES, value);
    }

}
