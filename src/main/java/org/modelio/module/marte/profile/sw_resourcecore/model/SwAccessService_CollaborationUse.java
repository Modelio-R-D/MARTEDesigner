package org.modelio.module.marte.profile.sw_resourcecore.model;

import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwAccessService_CollaborationUse {
    protected CollaborationUse element;

    public SwAccessService_CollaborationUse() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaborationUse();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWACCESSSERVICE_COLLABORATIONUSE);
        this.element.setName(MARTEResourceManager.getName("SwAccessService_CollaborationUse"));
    }

    public SwAccessService_CollaborationUse(CollaborationUse element) {
        this.element = element;
    }

    public void setParent(NameSpace source) {
        this.element.setNRepresented(source);
    }

    public CollaborationUse getElement() {
        return this.element;
    }

    public boolean isisModifier() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATIONUSE_SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER, this.element);
    }

    public void isisModifier(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATIONUSE_SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER,value);
    }

    public String getaccessedElement() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATIONUSE_SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT, this.element);
    }

    public void setaccessedElement(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATIONUSE_SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT, value);
    }

}
