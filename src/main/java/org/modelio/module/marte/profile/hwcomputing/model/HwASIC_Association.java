package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwASIC_Association {
    protected Association element;

    public HwASIC_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWASIC_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwASIC_Association"));
    }

    public HwASIC_Association(Association element) {
        this.element = element;
    }

    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    public Association getElement() {
        return this.element;
    }

}
