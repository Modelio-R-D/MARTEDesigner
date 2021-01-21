package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationMedia_Parameter;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5dc56be3-c148-4255-8092-d5e18e00f713")
public class GaCommHost_Parameter extends CommunicationMedia_Parameter {
    @objid ("60d06aa9-4245-426a-b6fa-b079cc9aa48e")
    public GaCommHost_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMHOST_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("GaCommHost_Parameter"));
    }

    @objid ("fa458081-a13b-43f1-9b9d-9e842fd9b338")
    public GaCommHost_Parameter(Parameter element) {
        super(element);
    }

    @objid ("a5024dea-e0c4-4e3d-b9ee-ebfd1f10f7b2")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_THROUGHPUT, this.element);
    }

    @objid ("dba11317-a303-4081-8066-458e19429545")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_THROUGHPUT, value);
    }

    @objid ("7e6faf1e-f666-426d-8497-89a086b07b22")
    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_UTILIZATION, this.element);
    }

    @objid ("9b12df3b-3a2e-40e8-b3fa-a4871f8221ec")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_UTILIZATION, value);
    }

    @objid ("558e2e0d-a68a-42c9-84d9-0390f3752466")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_ISPREEMPTIBLE, this.element);
    }

    @objid ("26fa960b-2e9e-480d-a97b-d85ea4dda6f1")
    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_ISPREEMPTIBLE,value);
    }

    @objid ("ae5b5d16-025e-4787-bc65-394d89b347ae")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_SCHEDPOLICY, this.element);
    }

    @objid ("839a3b3c-686f-42ed-95d0-fb146cf02123")
    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_SCHEDPOLICY, value);
    }

    @objid ("f85249e2-531c-4a27-b804-6372a292c2bd")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("c7af0665-95be-4f96-a94b-885f45d6adf1")
    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_OTHERSCHEDPOLICY, value);
    }

    @objid ("bc834bc6-dfdd-47a7-bc4f-21757a6c61cf")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_SCHEDULE, this.element);
    }

    @objid ("cfe4e8fe-e761-435a-b4d4-dd88cf41feea")
    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_SCHEDULE, value);
    }

    @objid ("258d1c25-04aa-4acf-a0e4-d14eacbf071f")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_PROCESSINGUNITS, this.element);
    }

    @objid ("45851ff0-31a3-4c07-a23a-1202cb3fc4e6")
    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_PROCESSINGUNITS, value);
    }

    @objid ("c04ef125-4eac-4854-b0ca-27302aba6800")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_HOST, this.element);
    }

    @objid ("3dcf4c46-bf72-4479-aa70-83797bfc28d5")
    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_HOST, value);
    }

    @objid ("d36009e4-ef2b-4dfa-96b3-bbd82d1ed36c")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("2b76805f-de0b-4c53-891c-565631d201c2")
    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("5c956db0-68d8-44b4-9686-a898fe260518")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("3608014c-84a3-4f6c-84b6-02185c253037")
    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_PARAMETER_GACOMMHOST_PARAMETER_SCHEDULABLERESOURCES, value);
    }

}
