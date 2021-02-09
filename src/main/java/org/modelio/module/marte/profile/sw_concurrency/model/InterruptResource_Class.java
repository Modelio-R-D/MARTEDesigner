package org.modelio.module.marte.profile.sw_concurrency.model;

import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class InterruptResource_Class extends SwConcurrentResource_Class {
    public InterruptResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.INTERRUPTRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.INTERRUPTRESOURCE_CLASSIFIER));
    }

    public InterruptResource_Class(Class element) {
        super(element);
    }

    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_KIND, this.element);
    }

    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_KIND, value);
    }

    public boolean isisMaskable() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE, this.element);
    }

    public void isisMaskable(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE,value);
    }

    public String getvectorElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS, this.element);
    }

    public void setvectorElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS, value);
    }

    public String getmaskElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS, this.element);
    }

    public void setmaskElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS, value);
    }

    public String getroutineConnectServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES, this.element);
    }

    public void setroutineConnectServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES, value);
    }

    public String getroutineDisconnectServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES, this.element);
    }

    public void setroutineDisconnectServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES, value);
    }

}
