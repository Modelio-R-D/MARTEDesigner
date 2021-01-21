package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("91b5f89c-ab11-4b57-84ad-813b091c95fe")
public class RtFeature_Port {
    @objid ("d3bf322c-f04e-446e-821d-5a4355ef127e")
    protected Port element;

    @objid ("6972a68d-50e2-4506-aa0c-65c1e258687e")
    public RtFeature_Port() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createPort();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTFEATURE_PORT);
        this.element.setName(MARTEResourceManager.getName("RtFeature_Port"));
    }

    @objid ("48f3c655-14b3-4584-aff4-07b5746f94af")
    public RtFeature_Port(Port element) {
        this.element = element;
    }

    @objid ("11c03726-6ab4-46a1-97c2-1a3d9f547334")
    public Port getElement() {
        return this.element;
    }

    @objid ("fabf1a3e-21d8-466f-b5b5-cb5e1f33f02d")
    public void setParent(Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("706a2ab7-6417-47eb-a211-b9fcb22164ff")
    public void setParent(Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("b5039862-238a-494d-aa00-2a98253c9c7d")
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("12c0d3c2-6d31-4e7e-80f5-c495543385ab")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
