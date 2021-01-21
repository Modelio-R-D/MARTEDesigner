package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4f382d40-b71c-4a01-9fbb-580dc585577d")
public class HwI_O_Link {
    @objid ("1b3d61c8-4ce8-4f93-af37-0354cdf33b3f")
    protected Link element;

    @objid ("ec456704-a514-45bb-9977-522d6d31cff8")
    public HwI_O_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWI_O_LINK);
        this.element.setName(MARTEResourceManager.getName("HwI_O_Link"));
    }

    @objid ("0a447464-f00b-4438-b36f-6e2acef50c91")
    public HwI_O_Link(Link element) {
        this.element = element;
    }

    @objid ("7981665e-3633-4283-ae2a-de7b0c34a27b")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("5694836d-9508-4362-adc5-6dd0cb328c3e")
    public Link getElement() {
        return this.element;
    }

}
