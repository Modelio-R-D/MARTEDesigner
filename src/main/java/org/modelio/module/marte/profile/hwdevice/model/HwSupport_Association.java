package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0681fc61-bd4d-4cac-a6f9-8c6690d3ad98")
public class HwSupport_Association {
    @objid ("ffc8376f-79e4-4fc2-86c7-4f5339af125e")
    protected Association element;

    @objid ("e4a8ae75-82df-48be-afb9-2668410a42a3")
    public HwSupport_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSUPPORT_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwSupport_Association"));
    }

    @objid ("908724f4-8741-403c-a770-656102192830")
    public HwSupport_Association(Association element) {
        this.element = element;
    }

    @objid ("591190e6-ea6a-4a63-8773-fc0c14cfd08f")
    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("a4d475ec-347e-4e1e-b119-01fb97f775fb")
    public Association getElement() {
        return this.element;
    }

}
