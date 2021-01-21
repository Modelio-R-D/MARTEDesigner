package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e2bcd9b1-967e-4713-b098-1875f959201e")
public class TimerResource_Class extends TimingResource_Class {
    @objid ("2a3c2f1d-3712-417d-b810-6b6fcc66ab24")
    public TimerResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMERRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.TIMERRESOURCE_CLASSIFIER));
    }

    @objid ("b02300d4-3073-4517-a4aa-d876df5914e9")
    public TimerResource_Class(final Class element) {
        super(element);
    }

    @objid ("91fca0d0-66a5-426b-bbb1-ea3f4119eafe")
    public String getduration() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_DURATION, this.element);
    }

    @objid ("b85e5509-ef9c-405d-b248-a8831e3da427")
    public void setduration(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_DURATION, value);
    }

    @objid ("3be6b50f-61dc-4870-8400-c3737731d761")
    public boolean isisPeriodic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_ISPERIODIC, this.element);
    }

    @objid ("9c425b5e-cac6-42d4-8217-2ff9c48762e8")
    public void isisPeriodic(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_ISPERIODIC,value);
    }

}
