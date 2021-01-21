package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("90516079-b6d6-4d25-b4e7-6e5deb3e20dd")
public class HwDevice_Link {
    @objid ("239580bb-7037-42ed-8997-1a1cba950c94")
    protected Link element;

    @objid ("f8765369-c3a7-4102-af8c-fa33ac575576")
    public HwDevice_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDEVICE_LINK);
        this.element.setName(MARTEResourceManager.getName("HwDevice_Link"));
    }

    @objid ("1100d9a1-4b7d-4ac0-ba6e-3ec5cdfdc20a")
    public HwDevice_Link(Link element) {
        this.element = element;
    }

    @objid ("593b4f6b-7049-4392-ba19-a93bd10858b9")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("6d9ab4a5-f2be-42dd-9db5-e21c446383b5")
    public Link getElement() {
        return this.element;
    }

}
