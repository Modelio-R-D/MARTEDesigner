package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("16779820-6f59-40f0-9697-8ec987d2010c")
public class HwI_O_Association {
    @objid ("a1de3bfa-2b6b-497d-a919-8c9ae4c411a6")
    protected Association element;

    @objid ("2fa59b0f-20c8-46db-abfc-79c85dbf43e8")
    public HwI_O_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWI_O_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwI_O_Association"));
    }

    @objid ("fb369e78-4870-4db8-acbf-e388408a50cb")
    public HwI_O_Association(Association element) {
        this.element = element;
    }

    @objid ("67ec4006-2ccc-4f2c-a434-1f50897080cc")
    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("e9ce36af-bbef-471d-93e2-ccb2c9a0f43b")
    public Association getElement() {
        return this.element;
    }

}
