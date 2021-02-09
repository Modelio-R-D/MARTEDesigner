package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Acquire_CollaborationUse {
    protected CollaborationUse element;

    public Acquire_CollaborationUse() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaborationUse();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ACQUIRE_COLLABORATIONUSE);
        this.element.setName(MARTEResourceManager.getName("Acquire_CollaborationUse"));
    }

    public Acquire_CollaborationUse(final CollaborationUse element) {
        this.element = element;
    }

    public void setParent(final NameSpace source, final Collaboration destination) {
        this.element.setNRepresented(source);
        this.element.setType(destination);
    }

    public CollaborationUse getElement() {
        return this.element;
    }

    public boolean isisBlocking() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ACQUIRE_COLLABORATIONUSE_ACQUIRE_COLLABORATIONUSE_ISBLOCKING, this.element);
    }

    public void isisBlocking(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ACQUIRE_COLLABORATIONUSE_ACQUIRE_COLLABORATIONUSE_ISBLOCKING,value);
    }

}
