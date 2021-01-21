package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("bb6ac2c0-9e30-470b-89e7-d135d1537989")
public class ClockResource_Association {
    @objid ("244cd099-82e8-4d96-a0ea-7def65c9b4c0")
    protected Association element;

    @objid ("14768c79-8f88-41db-b922-358e6e71959f")
    public ClockResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("ClockResource_Association"));
    }

    @objid ("0d03fe25-6586-4f91-a8b1-bf41329c784d")
    public ClockResource_Association(final Association element) {
        this.element = element;
    }

    @objid ("bae31453-bcbe-4a70-adc0-eacb4982eea8")
    public void setParent(final AssociationEnd source, final AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("e45646f8-197d-4473-9fa2-99d133bd051c")
    public Association getElement() {
        return this.element;
    }

}
