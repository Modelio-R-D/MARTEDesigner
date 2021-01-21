package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e7724b5c-6098-441b-a3e0-242a11583a69")
public class Resource_Link {
    @objid ("d5309d64-b220-485d-8b3b-924941f8768f")
    protected Link element;

    @objid ("1b3114bd-ecde-468f-8917-67e3f9615c41")
    public Resource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("Resource_Link"));
    }

    @objid ("6c61f0f5-68eb-4035-b2da-bd1de858eadc")
    public Resource_Link(final Link element) {
        this.element = element;
    }

    @objid ("23c36f77-ec40-4f47-8dae-3cacdf02fb44")
    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("06586169-ebe6-40e5-b0d6-b6eec1e20c8a")
    public Link getElement() {
        return this.element;
    }

    @objid ("fb38c6f4-6419-48ad-b3be-6f11059bd079")
    public String getresMult() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_RESMULT, this.element);
    }

    @objid ("832af198-f578-41db-992c-11ac051f332b")
    public void setresMult(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_RESMULT, value);
    }

    @objid ("846d4ece-461b-4aab-9a33-813b716831cb")
    public boolean isisProtected() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISPROTECTED, this.element);
    }

    @objid ("710d70c8-6c1d-4a38-af7c-59eb957f68c4")
    public void isisProtected(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISPROTECTED,value);
    }

    @objid ("f9478d42-0954-4cd4-ba53-48730f7dd729")
    public boolean isisActive() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISACTIVE, this.element);
    }

    @objid ("5266072e-acff-45ec-a9d8-311caa690251")
    public void isisActive(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISACTIVE,value);
    }

}
