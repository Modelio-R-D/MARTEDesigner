package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("83e4d483-93bc-4ce0-95cd-08fe17d64ffb")
public class TimerResource_Association {
    @objid ("1601c78e-eef1-406e-b6c1-ee4e5b5c0872")
    protected Association element;

    @objid ("7bb1fc43-ee7b-4dd1-8e9c-9315b3a19f39")
    public TimerResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMERRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("TimerResource_Association"));
    }

    @objid ("05d27119-7d07-4756-924c-89d1957325c4")
    public TimerResource_Association(final Association element) {
        this.element = element;
    }

    @objid ("ccfda8c8-af71-4eaf-b773-d1984b30f61a")
    public void setParent(final AssociationEnd source, final AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("525abb7c-71dd-4765-9528-7df8093cd5d4")
    public Association getElement() {
        return this.element;
    }

    @objid ("80c98c45-0151-4622-a860-f4847ce1a68b")
    public String getduration() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATION_TIMERRESOURCE_ASSOCIATION_DURATION, this.element);
    }

    @objid ("7ff253dd-ace1-4614-8b2e-47a8048b20a7")
    public void setduration(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATION_TIMERRESOURCE_ASSOCIATION_DURATION, value);
    }

    @objid ("773e2709-bbc2-4e60-8ecf-e3151e61f161")
    public boolean isisPeriodic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATION_TIMERRESOURCE_ASSOCIATION_ISPERIODIC, this.element);
    }

    @objid ("6c5b4d33-bb6f-4178-9126-a428e42e3194")
    public void isisPeriodic(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATION_TIMERRESOURCE_ASSOCIATION_ISPERIODIC,value);
    }

}
