package org.modelio.module.marte.profile.sw_resourcecore.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a3c92781-fe6f-43d6-9a21-7079fb0b84db")
public class SwAccessService_CollaborationUse {
    @objid ("971cabcd-2180-476b-b535-771cae472fff")
    protected CollaborationUse element;

    @objid ("55837c5b-00d1-42c4-9c9d-c99f249b22a1")
    public SwAccessService_CollaborationUse() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaborationUse();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWACCESSSERVICE_COLLABORATIONUSE);
        this.element.setName(MARTEResourceManager.getName("SwAccessService_CollaborationUse"));
    }

    @objid ("f2aa20a9-2dbd-4893-a10b-dfa3ac63f9db")
    public SwAccessService_CollaborationUse(CollaborationUse element) {
        this.element = element;
    }

    @objid ("b9079629-df87-41e1-9b90-e9af22ac9846")
    public void setParent(NameSpace source) {
        this.element.setNRepresented(source);
    }

    @objid ("4f9d5b58-a936-4299-9fa0-f79856d0dabd")
    public CollaborationUse getElement() {
        return this.element;
    }

    @objid ("451e07d1-727d-4c6b-aeb3-c22ec5b961fb")
    public boolean isisModifier() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATIONUSE_SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER, this.element);
    }

    @objid ("f1075d0f-1407-45d0-900c-ab8cc64fe974")
    public void isisModifier(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATIONUSE_SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER,value);
    }

    @objid ("8d6280f6-fa21-489c-9d1f-4dd76ba6c46a")
    public String getaccessedElement() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATIONUSE_SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT, this.element);
    }

    @objid ("7e6d918e-96d3-45f7-87f0-0116edd1a290")
    public void setaccessedElement(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATIONUSE_SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT, value);
    }

}
