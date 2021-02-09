package org.modelio.module.marte.profile.hlam.model;

import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class PpUnit_UseCase {
    protected UseCase element;

    public PpUnit_UseCase() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createUseCase();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PPUNIT_USECASE);
        this.element.setName(MARTEResourceManager.getName("PpUnit_UseCase"));
    }

    public PpUnit_UseCase(UseCase element) {
        this.element = element;
    }

    public UseCase getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getconcPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_USECASE_PPUNIT_USECASE_CONCPOLICY, this.element);
    }

    public void setconcPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PPUNIT_USECASE_PPUNIT_USECASE_CONCPOLICY, value);
    }

    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_USECASE_PPUNIT_USECASE_MEMORYSIZE, this.element);
    }

    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PPUNIT_USECASE_PPUNIT_USECASE_MEMORYSIZE, value);
    }

}
