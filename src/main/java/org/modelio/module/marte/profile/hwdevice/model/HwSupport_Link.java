package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e6467211-807f-4e3e-b4e2-d6cd5da078b1")
public class HwSupport_Link {
    @objid ("35670f9e-7cb1-4155-ae29-e99add5907ac")
    protected Link element;

    @objid ("6f6561e5-0bee-4881-a9ea-cfdcab821ef3")
    public HwSupport_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSUPPORT_LINK);
        this.element.setName(MARTEResourceManager.getName("HwSupport_Link"));
    }

    @objid ("f367f67e-e6e3-4080-9a54-517082077c2b")
    public HwSupport_Link(Link element) {
        this.element = element;
    }

    @objid ("49a81633-5211-4b2a-a254-6f1debaa4696")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("3eaa5ec4-333a-456f-8d86-522b6d438690")
    public Link getElement() {
        return this.element;
    }

}
