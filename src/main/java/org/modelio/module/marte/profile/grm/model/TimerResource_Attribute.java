package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6cf031da-390f-42b8-824c-8a16f9481178")
public class TimerResource_Attribute extends TimingResource_Attribute {
    @objid ("a164980b-0d3b-412d-b757-8524d1847055")
    public TimerResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMERRESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("TimerResource_Attribute"));
    }

    @objid ("6ed80d7d-a975-4ff1-8c19-d8ff4ff76b38")
    public TimerResource_Attribute(final Attribute element) {
        super(element);
    }

    @objid ("22de6190-946c-4886-be43-646a1a48ed2c")
    public String getduration() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_ATTRIBUTE_TIMERRESOURCE_ATTRIBUTE_DURATION, this.element);
    }

    @objid ("d33ec63f-54f2-47e1-aeb1-04fce2adcb2d")
    public void setduration(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_ATTRIBUTE_TIMERRESOURCE_ATTRIBUTE_DURATION, value);
    }

    @objid ("c8f41186-094b-4588-83df-0d66ce524358")
    public boolean isisPeriodic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_ATTRIBUTE_TIMERRESOURCE_ATTRIBUTE_ISPERIODIC, this.element);
    }

    @objid ("2ed31b92-5385-4dee-9826-421765aa021b")
    public void isisPeriodic(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_ATTRIBUTE_TIMERRESOURCE_ATTRIBUTE_ISPERIODIC,value);
    }

}
