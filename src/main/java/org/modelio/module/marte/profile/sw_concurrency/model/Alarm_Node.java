package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("aa8ee831-d0d9-444b-8e51-449c7fcd9c0d")
public class Alarm_Node extends InterruptResource_Node {
    @objid ("709f7904-849d-488f-99fe-1bd79662151d")
    public Alarm_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ALARM_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.ALARM_CLASSIFIER));
    }

    @objid ("3fd57e15-4d13-456a-9464-9c5de0f8931d")
    public Alarm_Node(Node element) {
        super(element);
    }

    @objid ("1e634940-4ec5-4fcc-8e12-9d7be7351085")
    public boolean isisWatchdog() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ALARM_CLASSIFIER_ALARM_CLASSIFIER_ISWATCHDOG, this.element);
    }

    @objid ("e32c1595-04a8-4152-bae6-510a4afb1464")
    public void isisWatchdog(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ALARM_CLASSIFIER_ALARM_CLASSIFIER_ISWATCHDOG,value);
    }

    @objid ("a2866162-7d8b-44b9-9910-285c556532bf")
    public String gettimers() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ALARM_CLASSIFIER_ALARM_CLASSIFIER_TIMERS, this.element);
    }

    @objid ("f3f05bbc-ad88-49a5-afbc-a3a35cf9dc6c")
    public void settimers(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.ALARM_CLASSIFIER_ALARM_CLASSIFIER_TIMERS, value);
    }

}
