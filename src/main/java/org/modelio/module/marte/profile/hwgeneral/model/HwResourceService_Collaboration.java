package org.modelio.module.marte.profile.hwgeneral.model;

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

@objid ("bd851419-1f0d-4172-9d67-11330c277587")
public class HwResourceService_Collaboration {
    @objid ("7a245661-7b8c-440b-9d9c-983d0288ec1c")
    protected Collaboration element;

    @objid ("0d1c03d6-15e6-4d93-96e7-9bb177b534a7")
    public HwResourceService_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName("HwResourceService_Collaboration"));
    }

    @objid ("e1b45392-ff9f-45b6-8731-c05c0b27dc5e")
    public HwResourceService_Collaboration(Collaboration element) {
        this.element = element;
    }

    @objid ("abfa0405-5195-4b7b-9903-105898c99c94")
    public void setParent(final Behavior source) {
        this.element.setBRepresented(source);
    }

    @objid ("94c283eb-c939-494d-bd51-cddea52331ce")
    public Collaboration getElement() {
        return this.element;
    }

    @objid ("2a4c8320-8b96-492f-938e-ec8450b8ba3f")
    public String getHwResourceService_Collaboration_consumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATION_HWRESOURCESERVICE_COLLABORATION_CONSUMPTION, this.element);
    }

    @objid ("54e75c16-cd86-44f8-99cd-61f5ee9b796f")
    public void setHwResourceService_Collaboration_consumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATION_HWRESOURCESERVICE_COLLABORATION_CONSUMPTION, value);
    }

    @objid ("a28fe766-049c-4329-879d-0fc15297d350")
    public String getHwResourceService_Collaboration_dissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATION_HWRESOURCESERVICE_COLLABORATION_DISSIPATION, this.element);
    }

    @objid ("ad1ec1f3-bbf6-4f3b-953d-2c3712fe68df")
    public void setHwResourceService_Collaboration_dissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATION_HWRESOURCESERVICE_COLLABORATION_DISSIPATION, value);
    }

    @objid ("315535cf-b3af-43a1-a47e-b4ec60eac862")
    public void setParent(final Operation source) {
        this.element.setORepresented(source);
    }

    @objid ("e2db534d-3e27-4cec-a39f-e43dfd4e4db6")
    public void setParent(final ModelTree source) {
        this.element.setOwner(source);
    }

    @objid ("839f3db6-affd-4e1c-9430-177c5847afc5")
    public void setParent(final TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

}
