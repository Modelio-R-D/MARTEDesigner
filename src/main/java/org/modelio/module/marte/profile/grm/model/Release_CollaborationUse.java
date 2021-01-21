package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("350f66a4-d712-4eee-b7a3-11fe6258b902")
public class Release_CollaborationUse {
    @objid ("ef0ab5c9-1766-47d9-a831-db302c5653eb")
    protected CollaborationUse element;

    @objid ("6ef9d08f-48f9-40e4-9426-99ab0a207a41")
    public Release_CollaborationUse() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaborationUse();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RELEASE_COLLABORATIONUSE);
        this.element.setName(MARTEResourceManager.getName("Release_CollaborationUse"));
    }

    @objid ("a4cb3267-d0f7-4d03-99f7-c8693b0073ff")
    public Release_CollaborationUse(final CollaborationUse element) {
        this.element = element;
    }

    @objid ("080e6dc4-9f92-4185-b73d-431a50bb7f29")
    public void setParent(final NameSpace source, final Collaboration destination) {
        this.element.setNRepresented(source);
        this.element.setType(destination);
    }

    @objid ("bfbd0b65-085f-4269-98eb-6e1ee20035d5")
    public CollaborationUse getElement() {
        return this.element;
    }

}
