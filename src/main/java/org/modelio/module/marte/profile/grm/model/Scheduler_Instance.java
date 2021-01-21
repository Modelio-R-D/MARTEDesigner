package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("802d2a23-f641-467f-b3b9-ee958c9f384e")
public class Scheduler_Instance extends Resource_Instance {
    @objid ("aaaa4fb3-bf58-41e9-b813-230eca035d4d")
    public Scheduler_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULER_INSTANCE);
        element.setName(MARTEResourceManager.getName("Scheduler_Instance"));
        this.isisPreemptible(true);
    }

    @objid ("9f8ed213-c314-483c-8499-4554cc4e132a")
    public Scheduler_Instance(final Instance element) {
        super(element);
    }

    @objid ("90f18d78-b8fa-4350-8eb3-c123a47c7375")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_ISPREEMPTIBLE, this.element);
    }

    @objid ("0610198b-2444-4f36-bf82-82beab277850")
    public void isisPreemptible(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_ISPREEMPTIBLE,value);
    }

    @objid ("367f7045-8131-4a6f-bbe4-7566c75afe6d")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_SCHEDPOLICY, this.element);
    }

    @objid ("02a69797-eafe-4bdd-aee6-de9ddb38d36c")
    public void setschedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_SCHEDPOLICY, value);
    }

    @objid ("1fb2d9a5-2e04-4525-b856-3d0dc3bd27d3")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("11de5d11-6ec2-49fc-9911-938d8eb54387")
    public void setotherSchedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_OTHERSCHEDPOLICY, value);
    }

    @objid ("5edae740-1116-4790-9efc-2bfff68841a3")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_SCHEDULE, this.element);
    }

    @objid ("af583f10-882d-4488-b28a-2d84952be94c")
    public void setschedule(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_SCHEDULE, value);
    }

}
