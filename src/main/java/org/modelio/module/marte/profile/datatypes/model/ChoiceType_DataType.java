package org.modelio.module.marte.profile.datatypes.model;

import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ChoiceType_DataType {
    protected DataType element;

    public ChoiceType_DataType() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDataType();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CHOICETYPE_DATATYPE);
        this.element.setName(MARTEResourceManager.getName("ChoiceType_DataType"));
    }

    public ChoiceType_DataType(DataType element) {
        this.element = element;
    }

    public DataType getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getchoiceAttrib() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CHOICETYPE_DATATYPE_CHOICETYPE_DATATYPE_CHOICEATTRIB, this.element);
    }

    public void setchoiceAttrib(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CHOICETYPE_DATATYPE_CHOICETYPE_DATATYPE_CHOICEATTRIB, value);
    }

    public String getdefaultAttrib() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CHOICETYPE_DATATYPE_CHOICETYPE_DATATYPE_DEFAULTATTRIB, this.element);
    }

    public void setdefaultAttrib(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CHOICETYPE_DATATYPE_CHOICETYPE_DATATYPE_DEFAULTATTRIB, value);
    }

}
