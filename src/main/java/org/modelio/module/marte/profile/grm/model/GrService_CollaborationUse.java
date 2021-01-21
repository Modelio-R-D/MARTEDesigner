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

@objid ("adaf1090-954a-43c1-9316-af693dc156f2")
public class GrService_CollaborationUse {
    @objid ("1ea5da41-75ef-42eb-bb62-5d48476f1b33")
    protected CollaborationUse element;

    @objid ("03891bd5-7063-4a72-adaa-194c1b83ad40")
    public GrService_CollaborationUse() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaborationUse();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GRSERVICE_COLLABORATIONUSE);
        this.element.setName(MARTEResourceManager.getName("GrService_CollaborationUse"));
    }

    @objid ("14ed973e-6847-4be9-acc3-8adea5a15fa1")
    public GrService_CollaborationUse(final CollaborationUse element) {
        this.element = element;
    }

    @objid ("f3a1e3c9-852e-4327-863c-723f7e640c33")
    public void setParent(final NameSpace source, final Collaboration destination) {
        this.element.setNRepresented(source);
        this.element.setType(destination);
    }

    @objid ("82d0b489-9eed-4c43-b354-aad9e0dc29b4")
    public CollaborationUse getElement() {
        return this.element;
    }

    @objid ("f2b272d1-95ad-4254-ad1f-6d7a38cbaa1d")
    public String getowner() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GRSERVICE_COLLABORATIONUSE_GRSERVICE_COLLABORATIONUSE_OWNER, this.element);
    }

    @objid ("990a04a3-4af2-4db7-98ba-5125107f88ce")
    public void setowner(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GRSERVICE_COLLABORATIONUSE_GRSERVICE_COLLABORATIONUSE_OWNER, value);
    }

}
