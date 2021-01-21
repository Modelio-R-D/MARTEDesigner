package org.modelio.module.marte.profile.nfps.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6362b349-e316-4a24-bd2f-b17f970836cd")
public class NfpType_DataType {
    @objid ("a079726e-0b1c-4f78-855d-152c74a05f02")
    protected DataType element;

    @objid ("c1dd08e9-ca1f-493d-84ee-37d6a9183003")
    public NfpType_DataType() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDataType();
    }

    @objid ("ce2b9558-27ca-4aed-affa-d603af6eb9c5")
    public NfpType_DataType(DataType element) {
        this.element = element;
    }

    @objid ("f3bb93ae-3301-4470-a2af-175d3ff8fc37")
    public String getvalueAttrib() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_VALUEATTRIB, this.element);
    }

    @objid ("2675aa04-9c92-47f1-9423-49af257cf04f")
    public void setvalueAttrib(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_VALUEATTRIB, value);
    }

    @objid ("f2a6c957-9fb1-4570-a9e8-5a8ea9662954")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("ddacbb8c-0e57-4a34-8392-adda70aafffb")
    public String getunitAttrib() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_UNITATTRIB, this.element);
    }

    @objid ("c4f17404-0894-4a52-9ab6-448ea5f20da0")
    public void setunitAttrib(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_UNITATTRIB, value);
    }

    @objid ("d98b5de5-83a7-4e00-bd69-ad02189dce50")
    public String getexprAttrib() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_EXPRATTRIB, this.element);
    }

    @objid ("236581a3-9cee-472a-8a43-d6453917ad66")
    public void setexprAttrib(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_EXPRATTRIB, value);
    }

    @objid ("9dba3c05-5bc9-4305-b2f3-75466a6cf070")
    public DataType getElement() {
        return this.element;
    }

}
