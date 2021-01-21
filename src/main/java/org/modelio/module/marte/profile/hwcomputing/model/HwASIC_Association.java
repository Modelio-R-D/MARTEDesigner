package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("011d40d5-d8bf-46d6-894c-297020ac1134")
public class HwASIC_Association {
    @objid ("78271280-89b5-4eaa-9542-87330bf8d50b")
    protected Association element;

    @objid ("7fcd34a9-f71a-4793-9aef-0d66e2e84b1d")
    public HwASIC_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWASIC_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwASIC_Association"));
    }

    @objid ("cb83d395-9c42-477e-9ff5-6b6bb2330eea")
    public HwASIC_Association(Association element) {
        this.element = element;
    }

    @objid ("99a34405-2026-4381-84b9-a5cbe4ce3c7e")
    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("ace71ac2-3418-4a2c-9ade-fbd10ad2d4e1")
    public Association getElement() {
        return this.element;
    }

}
