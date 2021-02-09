package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GrService_CollaborationUse {
    protected CollaborationUse element;

    public GrService_CollaborationUse() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaborationUse();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GRSERVICE_COLLABORATIONUSE);
        this.element.setName(MARTEResourceManager.getName("GrService_CollaborationUse"));
    }

    public GrService_CollaborationUse(final CollaborationUse element) {
        this.element = element;
    }

    public void setParent(final NameSpace source, final Collaboration destination) {
        this.element.setNRepresented(source);
        this.element.setType(destination);
    }

    public CollaborationUse getElement() {
        return this.element;
    }

    public String getowner() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GRSERVICE_COLLABORATIONUSE_GRSERVICE_COLLABORATIONUSE_OWNER, this.element);
    }

    public void setowner(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GRSERVICE_COLLABORATIONUSE_GRSERVICE_COLLABORATIONUSE_OWNER, value);
    }

}
