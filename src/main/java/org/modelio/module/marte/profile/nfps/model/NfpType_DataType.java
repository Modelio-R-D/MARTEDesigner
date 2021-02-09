package org.modelio.module.marte.profile.nfps.model;

import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class NfpType_DataType {
    protected DataType element;

    public NfpType_DataType() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDataType();
    }

    public NfpType_DataType(DataType element) {
        this.element = element;
    }

    public String getvalueAttrib() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_VALUEATTRIB, this.element);
    }

    public void setvalueAttrib(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_VALUEATTRIB, value);
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public String getunitAttrib() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_UNITATTRIB, this.element);
    }

    public void setunitAttrib(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_UNITATTRIB, value);
    }

    public String getexprAttrib() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_EXPRATTRIB, this.element);
    }

    public void setexprAttrib(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_EXPRATTRIB, value);
    }

    public DataType getElement() {
        return this.element;
    }

}
