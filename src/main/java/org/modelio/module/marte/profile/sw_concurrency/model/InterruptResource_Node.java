package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ddb28bb4-fec8-483d-9808-204f776976f9")
public class InterruptResource_Node extends SwConcurrentResource_Node {
    @objid ("74ac685b-3876-4021-8bb6-b94a4569ac16")
    public InterruptResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.INTERRUPTRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.INTERRUPTRESOURCE_CLASSIFIER));
    }

    @objid ("5279f871-9d79-4222-a3b4-58d87b5423cc")
    public InterruptResource_Node(Node element) {
        super(element);
    }

    @objid ("dcc6e9d5-a93a-4800-ae5b-2aace5dcb157")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_KIND, this.element);
    }

    @objid ("8ffa3659-613c-4ecb-85a7-74e8ddf69fa1")
    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_KIND, value);
    }

    @objid ("f6185830-cfea-4554-a4e2-bc69dbe3f85c")
    public boolean isisMaskable() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE, this.element);
    }

    @objid ("93be1df4-ff49-4f7a-b8d4-cfa8c60071f8")
    public void isisMaskable(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE,value);
    }

    @objid ("c9110080-ed4b-4488-80c3-e332785d1499")
    public String getvectorElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS, this.element);
    }

    @objid ("1573827f-e306-414a-9f6e-1cf93cff67e9")
    public void setvectorElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS, value);
    }

    @objid ("92b9d7e4-a417-4ebc-af99-66c2a18fbcb5")
    public String getmaskElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS, this.element);
    }

    @objid ("36ce34a9-d5c6-417e-bd8d-176c69cd23e5")
    public void setmaskElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS, value);
    }

    @objid ("29a627f8-73c9-4583-bbee-54039375ce64")
    public String getroutineConnectServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES, this.element);
    }

    @objid ("58754784-316d-4fea-ac22-f001ca576824")
    public void setroutineConnectServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES, value);
    }

    @objid ("7a1bc7f6-8de5-4384-a5f4-85b31a04c36f")
    public String getroutineDisconnectServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES, this.element);
    }

    @objid ("494d9f85-446c-4799-a4d9-4d9a2ed79767")
    public void setroutineDisconnectServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES, value);
    }

}
