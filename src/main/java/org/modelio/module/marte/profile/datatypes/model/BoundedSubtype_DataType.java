package org.modelio.module.marte.profile.datatypes.model;

import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class BoundedSubtype_DataType {
    protected DataType element;

    public BoundedSubtype_DataType() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDataType();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.BOUNDEDSUBTYPE_DATATYPE);
        this.element.setName(MARTEResourceManager.getName("BoundedSubtype_DataType"));
    }

    public BoundedSubtype_DataType(DataType element) {
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

    public String getminValue() {
        return  ModelUtils.getTaggedValue(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_MINVALUE, this.element);
    }

    public void setminValue(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_MINVALUE, value);
    }

    public String getmaxValue() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_MAXVALUE, this.element);
    }

    public void setmaxValue(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_MAXVALUE, value);
    }

    public boolean isisMinOpen() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN, this.element);
    }

    public void isisMinOpen(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN, value);
    }

    public boolean isisMaxOpen() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN, this.element);
    }

    public void isisMaxOpen(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN, value );
    }

}
