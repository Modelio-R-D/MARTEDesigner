package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ef36ab8d-52b9-4551-a7b4-8541bcda5dad")
public class HwBranchPredictor_Link {
    @objid ("847e70f8-4fa3-44bf-a3d3-c4b00e1c3a5a")
    protected Link element;

    @objid ("21e8cd7a-11c5-41c3-89ec-86b24cf9edbf")
    public HwBranchPredictor_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRANCHPREDICTOR_LINK);
        this.element.setName(MARTEResourceManager.getName("HwBranchPredictor_Link"));
    }

    @objid ("6983d144-1319-42ff-becd-9519dcff5e2d")
    public HwBranchPredictor_Link(Link element) {
        this.element = element;
    }

    @objid ("33df013c-2fe4-49a7-b9c8-b1d96becc8f3")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("3f1a254e-329e-4b48-9dae-947788e683d1")
    public Link getElement() {
        return this.element;
    }

}
