package org.modelio.module.marte.profile.hwgeneral.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a0921f68-4742-487c-9d2b-7b303dbe716f")
public class HwResourceService_CollaborationUse {
    @objid ("048807b6-205a-41cd-bcbf-970a44b4fbf9")
    protected CollaborationUse element;

    @objid ("5e2b1183-3229-453c-96d2-203e27427dcb")
    public HwResourceService_CollaborationUse() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaborationUse();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATIONUSE);
        this.element.setName(MARTEResourceManager.getName("HwResourceService_CollaborationUse"));
    }

    @objid ("25c04ebc-2177-4ee5-b087-a2c0d07394f8")
    public HwResourceService_CollaborationUse(CollaborationUse element) {
        this.element = element;
    }

    @objid ("243a008a-ff4d-4921-b608-47a5cee657f8")
    public void setParent(NameSpace owner) {
        this.element.setNRepresented(owner);
    }

    @objid ("e7b4b61d-a33b-4a4b-9a06-fa6574c9b90a")
    public CollaborationUse getElement() {
        return this.element;
    }

    @objid ("7c799c30-f683-4a9b-a178-5a739fc4811d")
    public String getHwResourceService_CollaborationUse_consumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATIONUSE_HWRESOURCESERVICE_COLLABORATIONUSE_CONSUMPTION, this.element);
    }

    @objid ("83d7c8f9-3987-466d-9886-b9f4349e30fa")
    public void setHwResourceService_CollaborationUse_consumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATIONUSE_HWRESOURCESERVICE_COLLABORATIONUSE_CONSUMPTION, value);
    }

    @objid ("62fd1545-289a-4cb8-84ef-5b384313ad92")
    public String getHwResourceService_CollaborationUse_dissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATIONUSE_HWRESOURCESERVICE_COLLABORATIONUSE_DISSIPATION, this.element);
    }

    @objid ("55360a26-1e93-4c11-909d-efa9634462c6")
    public void setHwResourceService_CollaborationUse_dissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATIONUSE_HWRESOURCESERVICE_COLLABORATIONUSE_DISSIPATION, value);
    }

    @objid ("6acf9fde-e4fd-421a-b0a2-407e20c09843")
    public void setParent(Operation owner) {
        this.element.setORepresented(owner);
    }

}
