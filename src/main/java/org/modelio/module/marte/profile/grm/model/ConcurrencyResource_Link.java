package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3c629c20-c8a7-4bb0-8ce1-6a4a00b1a6a0")
public class ConcurrencyResource_Link {
    @objid ("a1362ef7-aa57-41e3-94a9-f2d9fc49406e")
    protected Link element;

    @objid ("4ec4b579-4de5-4e66-8353-31f9a6669637")
    public ConcurrencyResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONCURRENCYRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("ConcurrencyResource_Link"));
    }

    @objid ("7681fff7-784c-4a21-99ad-a695954bd0d6")
    public ConcurrencyResource_Link(final Link element) {
        this.element = element;
    }

    @objid ("894867b1-a483-4295-881c-6cc05bba8562")
    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("608beb8e-1373-4cb1-ac53-322d5c3d4c46")
    public Link getElement() {
        return this.element;
    }

}
