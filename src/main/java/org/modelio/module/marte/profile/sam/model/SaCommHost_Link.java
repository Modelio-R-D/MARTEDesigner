package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ccd4ad1e-2fc1-4082-b067-bbd7ee5aae25")
public class SaCommHost_Link {
    @objid ("4d5fe062-a0a2-43a5-9346-46a16600a6b5")
    protected Link element;

    @objid ("3574f9b0-bab5-4a4d-ae39-64c1ac7c1865")
    public SaCommHost_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SACOMMHOST_LINK);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SACOMMHOST_LINK));
    }

    @objid ("8f035ded-21a7-411d-98c8-f43bf1a528c0")
    public SaCommHost_Link(Link element) {
        this.element = element;
    }

    @objid ("350f9b82-13c8-4fa3-a509-c228f9ee84d4")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("d5e0d1e2-72ed-4fa7-892b-e950e47c9c3c")
    public Link getElement() {
        return this.element;
    }

    @objid ("d109d59d-4d16-4b15-b911-837fdb6fd5d1")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaCommHost_Link_isSched", this.element);
    }

    @objid ("01196769-3c8f-4997-8efb-92037cc54261")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_LINK_SACOMMHOST_LINK_ISSCHED, value);
    }

    @objid ("2c7a08ad-6770-4547-a33c-93ba272beb1e")
    public String getschSlack() {
        return ModelUtils.getTaggedValue("SaCommHost_Link_schSlack", this.element);
    }

    @objid ("39941dca-b55c-44a1-95f8-b70e2d2d69de")
    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_LINK_SACOMMHOST_LINK_SCHSLACK, value);
    }

}
