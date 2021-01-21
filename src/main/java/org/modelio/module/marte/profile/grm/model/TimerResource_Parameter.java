package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ce6cef41-0b3c-4285-bc23-c7920e1bb4b4")
public class TimerResource_Parameter extends TimingResource_Parameter {
    @objid ("35c65850-b051-4012-ae47-b656a6a0793d")
    public TimerResource_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMERRESOURCE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("TimerResource_Parameter"));
    }

    @objid ("145d814a-dfba-4453-a649-1fd28673e60b")
    public TimerResource_Parameter(final Parameter element) {
        super(element);
    }

    @objid ("cf5871b7-6519-4e3a-bfe8-5ece0928f184")
    public String getduration() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_PARAMETER_TIMERRESOURCE_PARAMETER_DURATION, this.element);
    }

    @objid ("cfd6185e-051a-40b9-a5c4-266fe4fd46eb")
    public void setduration(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_PARAMETER_TIMERRESOURCE_PARAMETER_DURATION, value);
    }

    @objid ("43635156-7f0f-4294-94b2-87679c468358")
    public boolean isisPeriodic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_PARAMETER_TIMERRESOURCE_PARAMETER_ISPERIODIC, this.element);
    }

    @objid ("8daaa669-806b-41e9-88f4-aeaa229842f2")
    public void isisPeriodic(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_PARAMETER_TIMERRESOURCE_PARAMETER_ISPERIODIC,value);
    }

}
