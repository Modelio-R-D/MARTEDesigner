package org.modelio.module.marte.profile.hwgeneral.model;

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

public class HwResourceService_Collaboration {
    protected Collaboration element;

    public HwResourceService_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName("HwResourceService_Collaboration"));
    }

    public HwResourceService_Collaboration(Collaboration element) {
        this.element = element;
    }

    public void setParent(final Behavior source) {
        this.element.setBRepresented(source);
    }

    public Collaboration getElement() {
        return this.element;
    }

    public String getHwResourceService_Collaboration_consumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATION_HWRESOURCESERVICE_COLLABORATION_CONSUMPTION, this.element);
    }

    public void setHwResourceService_Collaboration_consumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATION_HWRESOURCESERVICE_COLLABORATION_CONSUMPTION, value);
    }

    public String getHwResourceService_Collaboration_dissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATION_HWRESOURCESERVICE_COLLABORATION_DISSIPATION, this.element);
    }

    public void setHwResourceService_Collaboration_dissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATION_HWRESOURCESERVICE_COLLABORATION_DISSIPATION, value);
    }

    public void setParent(final Operation source) {
        this.element.setORepresented(source);
    }

    public void setParent(final ModelTree source) {
        this.element.setOwner(source);
    }

    public void setParent(final TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

}
