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

@objid ("dbd19c09-63b4-436d-874d-7ada3055f41a")
public class ProcessingResource_Link {
    @objid ("5f185f5b-8c56-432b-8560-d18a19f86ec8")
    protected Link element;

    @objid ("4380b25f-d65b-4187-bb45-da26ae2f882a")
    public ProcessingResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PROCESSINGRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("ProcessingResource_Link"));
    }

    @objid ("a0c2f6c9-1dfd-4c94-94f4-fbc470ce60a0")
    public ProcessingResource_Link(final Link element) {
        this.element = element;
    }

    @objid ("104bc390-e8a8-4a9d-b332-22e4bfcd7275")
    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("6953b6c3-4def-4413-9102-d11cab8577c3")
    public Link getElement() {
        return this.element;
    }

    @objid ("b8c80b9c-6b8f-4cf0-b8e2-bfe1de989fd3")
    public String getspeedFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_LINK_PROCESSINGRESOURCE_LINK_SPEEDFACTOR, this.element);
    }

    @objid ("aa61b076-027b-4e64-bf8d-aaaa66e19efd")
    public void setspeedFactor(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_LINK_PROCESSINGRESOURCE_LINK_SPEEDFACTOR, value);
    }

    @objid ("84b74c2d-a274-4ce0-8f6e-ab907381e887")
    public String getmainScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_LINK_PROCESSINGRESOURCE_LINK_MAINSCHEDULER, this.element);
    }

    @objid ("cfb0a42b-a9fa-4b98-9645-e19b4e249515")
    public void setmainScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_LINK_PROCESSINGRESOURCE_LINK_MAINSCHEDULER, value);
    }

}
