package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2d22d1fe-1ee4-488d-b510-91eec04d7b66")
public class TimerResource_Link {
    @objid ("25083c06-6ce7-4dae-8693-b99aa107e1d0")
    protected Link element;

    @objid ("f7e923c3-9f80-42d1-9019-b1a2187a9a46")
    public TimerResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMERRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("TimerResource_Link"));
    }

    @objid ("dc641d96-e1f7-43b8-b8e3-051937e3a71f")
    public TimerResource_Link(final Link element) {
        this.element = element;
    }

    @objid ("6e062530-ae4a-49de-a93e-adc9e0018a37")
    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("2afa5bc8-4339-414b-902c-40c880fce9ff")
    public Link getElement() {
        return this.element;
    }

    @objid ("37c7e44d-2857-4deb-969e-a004f9b7e677")
    public String getduration() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_LINK_TIMERRESOURCE_LINK_DURATION, this.element);
    }

    @objid ("247884fb-ef06-4a52-a050-b6e7308cd850")
    public void setduration(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_LINK_TIMERRESOURCE_LINK_DURATION, value);
    }

    @objid ("8d2e246d-ff92-4aef-b590-b958061705bd")
    public boolean isisPeriodic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_LINK_TIMERRESOURCE_LINK_ISPERIODIC, this.element);
    }

    @objid ("972b3117-fd13-4415-b3a8-25314dfd4029")
    public void isisPeriodic(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_LINK_TIMERRESOURCE_LINK_ISPERIODIC,value);
    }

}
