package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b7093647-f71c-46b5-b974-8563fa87ac0e")
public class Scheduler_Node extends Resource_Node {
    @objid ("1c8a2550-d96f-4a47-94ca-1ac74c5bf663")
    public Scheduler_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULER_CLASSIFIER);
        element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SCHEDULER_CLASSIFIER));
        this.isisPreemptible(true);
    }

    @objid ("59a37376-146f-43b2-a0a6-d8c908b21849")
    public Scheduler_Node(final Node element) {
        super(element);
    }

    @objid ("e137ebfe-1605-484c-bbf8-06929df3a433")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_ISPREEMPTIBLE, this.element);
    }

    @objid ("998b2a9a-275c-4466-8c68-7f1740318f26")
    public void isisPreemptible(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_ISPREEMPTIBLE,value);
    }

    @objid ("45419661-02a2-4359-aa71-ca49efc51a6a")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_SCHEDPOLICY, this.element);
    }

    @objid ("968e1992-105f-45ad-8dbe-c5d37be28042")
    public void setschedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_SCHEDPOLICY, value);
    }

    @objid ("ece39339-e4c4-465a-b2f2-02ef46aa205d")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("12d3241f-dc76-4ce9-a58e-08db965bf1d9")
    public void setotherSchedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_OTHERSCHEDPOLICY, value);
    }

    @objid ("05a46005-3033-4424-949b-282fa43a0ddc")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_SCHEDULE, this.element);
    }

    @objid ("3f9cda4b-33bf-40e2-a98f-41d7e27adac7")
    public void setschedule(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_SCHEDULE, value);
    }

}
