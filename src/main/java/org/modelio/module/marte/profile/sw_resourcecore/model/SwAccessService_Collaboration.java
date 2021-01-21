package org.modelio.module.marte.profile.sw_resourcecore.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c2ce442b-648a-4875-95c6-e568752588bd")
public class SwAccessService_Collaboration {
    @objid ("4cf15101-80cf-43da-a70b-46e72aacb8ae")
    protected Collaboration element;

    @objid ("1a7154b4-a8ca-41e6-9ec3-f747e6c72a7a")
    public SwAccessService_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWACCESSSERVICE_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName("SwAccessService_Collaboration"));
    }

    @objid ("b2284453-0200-4e7e-9942-a43b6b5e6d66")
    public SwAccessService_Collaboration(Collaboration element) {
        this.element = element;
    }

    @objid ("7d4477e0-a942-4692-afac-8d400a24f45f")
    public void setParent(final Behavior source) {
        this.element.setBRepresented(source);
    }

    @objid ("3fe52859-24c3-4651-a6e9-547246eb5c30")
    public Collaboration getElement() {
        return this.element;
    }

    @objid ("c8cc2c27-03f8-44ad-ab02-f17004e27bf6")
    public boolean isisModifier() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATION_SWACCESSSERVICE_COLLABORATION_ISMODIFIER, this.element);
    }

    @objid ("50761125-b244-455c-b6cf-b841b8cf6614")
    public void isisModifier(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATION_SWACCESSSERVICE_COLLABORATION_ISMODIFIER,value);
    }

    @objid ("b6692f70-836c-4f58-8c93-f380ec9dcfd8")
    public String getaccessedElement() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATION_SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT, this.element);
    }

    @objid ("77a1911d-1565-4717-a191-47d46318a4b8")
    public void setaccessedElement(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATION_SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT, value);
    }

    @objid ("48c23b53-8d7a-4c7f-bcf2-7dbc7fd476b7")
    public void setParent(final Operation source) {
        this.element.setORepresented(source);
    }

    @objid ("8be73f93-6c83-41bd-af8b-d619954651ef")
    public void setParent(final ModelTree source) {
        this.element.setOwner(source);
    }

    @objid ("87cc60df-8efc-4e56-9fc7-1779e4c739d8")
    public void setParent(final TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

}
