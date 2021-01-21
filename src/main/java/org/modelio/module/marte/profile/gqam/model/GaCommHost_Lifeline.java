package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationMedia_Lifeline;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ffe9cd6d-4ee6-4a06-87b2-e11bcb38f5e5")
public class GaCommHost_Lifeline extends CommunicationMedia_Lifeline {
    @objid ("26d0ed12-44ec-49ed-923a-1d004d1d68ff")
    public GaCommHost_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMHOST_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("GaCommHost_Lifeline"));
    }

    @objid ("a00c5844-f387-45c3-8e6f-31e204bfbcb5")
    public GaCommHost_Lifeline(Lifeline element) {
        super(element);
    }

    @objid ("1a141e0f-b56e-4f98-ac4b-b96965b1ed0e")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_THROUGHPUT, this.element);
    }

    @objid ("c333ce40-4477-4c2f-9844-1c17f68e02cb")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_THROUGHPUT, value);
    }

    @objid ("b87a2d2a-14ec-43db-8fea-881099a0b7dc")
    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_UTILIZATION, this.element);
    }

    @objid ("ec72ec00-eeef-4de9-90b3-2bfd3fdc081e")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_UTILIZATION, value);
    }

    @objid ("853148fe-b53e-4471-ba10-8a9fde60d682")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_ISPREEMPTIBLE, this.element);
    }

    @objid ("f99fb1e9-b8ac-4123-9b0b-501a311420db")
    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_ISPREEMPTIBLE,value);
    }

    @objid ("c64353ee-fa5c-4d01-bd46-4888277c6a66")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_SCHEDPOLICY, this.element);
    }

    @objid ("4002c1c4-b647-4364-b4f3-a7bac24ca4be")
    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_SCHEDPOLICY, value);
    }

    @objid ("5913333c-8790-420f-b638-1449e082adc4")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("7c9cfa31-788e-40a5-9181-7dbe4724148d")
    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_OTHERSCHEDPOLICY, value);
    }

    @objid ("3c818a29-5317-4ce9-a75e-966e1a19daa5")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_SCHEDULE, this.element);
    }

    @objid ("134206c8-393e-42c9-b974-5b66bab0cb7c")
    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_SCHEDULE, value);
    }

    @objid ("c01c2044-cc5d-469f-b6a1-0b171d5bb594")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_PROCESSINGUNITS, this.element);
    }

    @objid ("3010eea6-3ab1-455b-8bed-076418a1a34b")
    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_PROCESSINGUNITS, value);
    }

    @objid ("3af401ee-9019-47aa-85a2-f4f4e1dcc37c")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_HOST, this.element);
    }

    @objid ("56371bc3-c14c-41e8-a4e6-e4bf2eadd469")
    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_HOST, value);
    }

    @objid ("780bad5c-c77c-43f7-8884-1dd71b451e8b")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("9aa10b13-121b-49d0-8314-64e996505961")
    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("5c212a10-7ca2-4dd6-819d-31d104578caa")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("c317ae6d-ce8c-49ca-936f-da43f2213072")
    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_SCHEDULABLERESOURCES, value);
    }

}
