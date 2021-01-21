package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ac729036-c181-484f-9618-fc74697021e3")
public class Scheduler_Class extends Resource_Class {
    @objid ("7ea0563e-9f5c-47f4-a444-90e503a184e2")
    public Scheduler_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULER_CLASSIFIER);
        element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SCHEDULER_CLASSIFIER));
        this.isisPreemptible(true);
    }

    @objid ("009c32b5-d115-4e89-98f8-1d9c29849f67")
    public Scheduler_Class(final Class element) {
        super(element);
    }

    @objid ("68ad65b0-cff0-4d86-948d-05882ca056d8")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_ISPREEMPTIBLE, this.element);
    }

    @objid ("595a9c11-e968-4dfb-b1fb-06ba598e2738")
    public void isisPreemptible(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_ISPREEMPTIBLE,value);
    }

    @objid ("d011c09a-6e91-490b-b14e-84dacf7b03a0")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_SCHEDPOLICY, this.element);
    }

    @objid ("cd76933c-a78e-470a-9866-e63f2178167c")
    public void setschedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_SCHEDPOLICY, value);
    }

    @objid ("6babc497-9369-4be5-ac9a-db09a4c71295")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("41a670c3-b39f-4e02-8233-10c5668746ae")
    public void setotherSchedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_OTHERSCHEDPOLICY, value);
    }

    @objid ("1e4c091a-1938-4cd3-a62a-ae70d7238f5c")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_SCHEDULE, this.element);
    }

    @objid ("4b14ee7f-011e-4924-9c6c-7d4c5353b757")
    public void setschedule(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_SCHEDULE, value);
    }

}
