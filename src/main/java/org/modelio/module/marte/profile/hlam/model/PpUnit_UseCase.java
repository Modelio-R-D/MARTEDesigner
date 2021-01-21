package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5e8ec9c1-0ffb-4908-bf2a-b19d3fffbd63")
public class PpUnit_UseCase {
    @objid ("7a6dba6c-9cde-445a-8d43-92d599379848")
    protected UseCase element;

    @objid ("fbc121d0-e4fa-478d-b489-0b7a300662a2")
    public PpUnit_UseCase() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createUseCase();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PPUNIT_USECASE);
        this.element.setName(MARTEResourceManager.getName("PpUnit_UseCase"));
    }

    @objid ("1a3dcce6-bec9-4abc-8749-5968aad5fcb3")
    public PpUnit_UseCase(UseCase element) {
        this.element = element;
    }

    @objid ("c1a5ef6f-e30e-47ce-8915-dac7b93d5916")
    public UseCase getElement() {
        return this.element;
    }

    @objid ("d0fa0e73-e36b-4a48-a227-80c71a3db589")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("afe657c1-75db-4e6d-ae3a-98a62a871ee4")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("ab903531-a879-4766-9e7e-7823c53cc7b4")
    public String getconcPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_USECASE_PPUNIT_USECASE_CONCPOLICY, this.element);
    }

    @objid ("fdbff439-710f-41ea-91b2-3fe983492eda")
    public void setconcPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PPUNIT_USECASE_PPUNIT_USECASE_CONCPOLICY, value);
    }

    @objid ("ade96053-10eb-439f-9025-2c2e1eea607c")
    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_USECASE_PPUNIT_USECASE_MEMORYSIZE, this.element);
    }

    @objid ("b980603c-8257-449a-b0e4-2a5d447e3bf5")
    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PPUNIT_USECASE_PPUNIT_USECASE_MEMORYSIZE, value);
    }

}
