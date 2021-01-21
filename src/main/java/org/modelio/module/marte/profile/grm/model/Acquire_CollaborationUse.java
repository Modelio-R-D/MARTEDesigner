package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f4b54599-bc22-42e7-938d-9d59e452e25a")
public class Acquire_CollaborationUse {
    @objid ("f229da39-84ad-4cc0-ae5d-36e426be951d")
    protected CollaborationUse element;

    @objid ("d0551398-d6ec-49f6-9a18-d8f4da86762e")
    public Acquire_CollaborationUse() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaborationUse();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ACQUIRE_COLLABORATIONUSE);
        this.element.setName(MARTEResourceManager.getName("Acquire_CollaborationUse"));
    }

    @objid ("7534d272-8da0-449c-ac61-bef548e27a81")
    public Acquire_CollaborationUse(final CollaborationUse element) {
        this.element = element;
    }

    @objid ("28227e8d-1b37-45fe-97f2-8198a03c8354")
    public void setParent(final NameSpace source, final Collaboration destination) {
        this.element.setNRepresented(source);
        this.element.setType(destination);
    }

    @objid ("24801d00-e662-4abe-b861-c9428323adbe")
    public CollaborationUse getElement() {
        return this.element;
    }

    @objid ("1ce755cb-ce89-40b2-8d23-7bc22b2a690a")
    public boolean isisBlocking() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ACQUIRE_COLLABORATIONUSE_ACQUIRE_COLLABORATIONUSE_ISBLOCKING, this.element);
    }

    @objid ("c5140712-0d66-4b1d-a277-ca3b9a5e0efa")
    public void isisBlocking(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ACQUIRE_COLLABORATIONUSE_ACQUIRE_COLLABORATIONUSE_ISBLOCKING,value);
    }

}
