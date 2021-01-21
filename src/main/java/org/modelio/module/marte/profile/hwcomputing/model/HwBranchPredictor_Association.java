package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7b6b61d3-eecb-44e4-834a-0e60b4ebc888")
public class HwBranchPredictor_Association {
    @objid ("54c1cc83-528e-4792-8b3f-0a781cdef085")
    protected Association element;

    @objid ("7f4580f1-7614-411f-bc31-85b1455b2eeb")
    public HwBranchPredictor_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRANCHPREDICTOR_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwBranchPredictor_Association"));
    }

    @objid ("0ecc67da-a7f9-4074-a17b-01978f4519ac")
    public HwBranchPredictor_Association(Association element) {
        this.element = element;
    }

    @objid ("42b6e5fd-12ca-4786-a601-4bbb9473c7cd")
    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("c5b1c24c-dcff-40dc-9b64-8d17e14e1623")
    public Association getElement() {
        return this.element;
    }

}
