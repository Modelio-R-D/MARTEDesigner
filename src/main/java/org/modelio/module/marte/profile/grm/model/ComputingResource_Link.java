package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ac062152-fa6d-42cc-b4bb-96464d592d0d")
public class ComputingResource_Link {
    @objid ("9c4d3d8b-9d5c-4f4a-9078-0c573230c081")
    protected Link element;

    @objid ("65b1a27a-969f-4800-814d-81e054accd83")
    public ComputingResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMPUTINGRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("ComputingResource_Link"));
    }

    @objid ("13429c98-9fd1-4ed3-bc46-7c01cd3b68de")
    public ComputingResource_Link(final Link element) {
        this.element = element;
    }

    @objid ("d35370ef-f53f-48da-a310-1989d9a23e0c")
    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("623706eb-72ca-4a4c-bce7-98423576b80f")
    public Link getElement() {
        return this.element;
    }

}
