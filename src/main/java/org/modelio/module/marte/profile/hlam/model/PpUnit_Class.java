package org.modelio.module.marte.profile.hlam.model;

import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class PpUnit_Class {
    protected Class element;

    public PpUnit_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PPUNIT_CLASS);
        this.element.setName(MARTEResourceManager.getName("PpUnit_Class"));
    }

    public PpUnit_Class(Class element) {
        this.element = element;
    }

    public Class getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getconcPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_CLASS_PPUNIT_CLASS_CONCPOLICY, this.element);
    }

    public void setconcPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PPUNIT_CLASS_PPUNIT_CLASS_CONCPOLICY, value);
    }

    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_CLASS_PPUNIT_CLASS_MEMORYSIZE, this.element);
    }

    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PPUNIT_CLASS_PPUNIT_CLASS_MEMORYSIZE, value);
    }

}
