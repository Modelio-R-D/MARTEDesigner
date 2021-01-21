package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("adf3a8f5-c8fb-4b76-b3fe-a8d4cef549e9")
public class TimerResource_AssociationEnd extends TimingResource_AssociationEnd {
    @objid ("5e74ce44-22d4-4c3c-b15b-e18fb2ddd235")
    public TimerResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMERRESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("TimerResource_AssociationEnd"));
    }

    @objid ("e277b1af-3e9d-495a-be68-075876213af0")
    public TimerResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

    @objid ("9f32455c-41f4-4f29-a138-065b3b50e84e")
    public String getduration() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATIONEND_TIMERRESOURCE_ASSOCIATIONEND_DURATION, this.element);
    }

    @objid ("68902c90-a28f-4aed-9f20-0aa455bcbbf1")
    public void setduration(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATIONEND_TIMERRESOURCE_ASSOCIATIONEND_DURATION, value);
    }

    @objid ("1a3d378b-20cb-4e9a-8057-9cf1d0a177f7")
    public boolean isisPeriodic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATIONEND_TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC, this.element);
    }

    @objid ("8a0101fb-ef71-45aa-b094-4866fe0fec2e")
    public void isisPeriodic(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATIONEND_TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC,value);
    }

}
