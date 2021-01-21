package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e03e7519-28a2-49fd-a085-90e6e24ff043")
public class ClockResource_Link {
    @objid ("1f65ac23-e22b-4cff-a439-d93368e83803")
    protected Link element;

    @objid ("645413b9-6a36-4f45-afe2-72eb31ba703b")
    public ClockResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("ClockResource_Link"));
    }

    @objid ("ca13b38a-1ee5-4e41-ae19-544f2f82ff67")
    public ClockResource_Link(final Link element) {
        this.element = element;
    }

    @objid ("9a7a0fc6-7724-439a-aaf2-1c1b4a30498f")
    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("63fae051-441b-4a32-a002-e6f99ea1dde6")
    public Link getElement() {
        return this.element;
    }

}
