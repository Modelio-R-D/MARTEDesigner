package org.modelio.module.marte.profile.hwgeneral.model;

import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwResourceService_CollaborationUse {
    protected CollaborationUse element;

    public HwResourceService_CollaborationUse() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaborationUse();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATIONUSE);
        this.element.setName(MARTEResourceManager.getName("HwResourceService_CollaborationUse"));
    }

    public HwResourceService_CollaborationUse(CollaborationUse element) {
        this.element = element;
    }

    public void setParent(NameSpace owner) {
        this.element.setNRepresented(owner);
    }

    public CollaborationUse getElement() {
        return this.element;
    }

    public String getHwResourceService_CollaborationUse_consumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATIONUSE_HWRESOURCESERVICE_COLLABORATIONUSE_CONSUMPTION, this.element);
    }

    public void setHwResourceService_CollaborationUse_consumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATIONUSE_HWRESOURCESERVICE_COLLABORATIONUSE_CONSUMPTION, value);
    }

    public String getHwResourceService_CollaborationUse_dissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATIONUSE_HWRESOURCESERVICE_COLLABORATIONUSE_DISSIPATION, this.element);
    }

    public void setHwResourceService_CollaborationUse_dissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATIONUSE_HWRESOURCESERVICE_COLLABORATIONUSE_DISSIPATION, value);
    }

    public void setParent(Operation owner) {
        this.element.setORepresented(owner);
    }

}
