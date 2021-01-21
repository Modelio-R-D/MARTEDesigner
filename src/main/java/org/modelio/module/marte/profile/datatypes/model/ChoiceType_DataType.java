package org.modelio.module.marte.profile.datatypes.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3272186b-67a6-4add-8f1d-d8ac7300c9bd")
public class ChoiceType_DataType {
    @objid ("f047a9d5-6a6e-4597-944f-d08a9b6e7844")
    protected DataType element;

    @objid ("bb443ace-5d03-4755-8ef1-c37de610947c")
    public ChoiceType_DataType() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDataType();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CHOICETYPE_DATATYPE);
        this.element.setName(MARTEResourceManager.getName("ChoiceType_DataType"));
    }

    @objid ("fa97279f-8efa-4d6f-8831-a3795040517d")
    public ChoiceType_DataType(DataType element) {
        this.element = element;
    }

    @objid ("fc3504ab-3c1d-4c6a-8b4a-7d5390ac893d")
    public DataType getElement() {
        return this.element;
    }

    @objid ("1ab46387-2c99-429f-ba62-fd0c9fcfd3d3")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("dee6d839-c8ca-47fc-816b-09bba298a810")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("8d39e3cd-9db1-4873-967b-034ad51e409d")
    public String getchoiceAttrib() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CHOICETYPE_DATATYPE_CHOICETYPE_DATATYPE_CHOICEATTRIB, this.element);
    }

    @objid ("1f4feed3-5e52-4d4d-b2c8-6fd42f2ac3d3")
    public void setchoiceAttrib(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CHOICETYPE_DATATYPE_CHOICETYPE_DATATYPE_CHOICEATTRIB, value);
    }

    @objid ("821c3d1f-1459-4e71-b01a-68a37c96b97f")
    public String getdefaultAttrib() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CHOICETYPE_DATATYPE_CHOICETYPE_DATATYPE_DEFAULTATTRIB, this.element);
    }

    @objid ("4dd45318-c902-49e0-af84-9e23ac356ea0")
    public void setdefaultAttrib(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CHOICETYPE_DATATYPE_CHOICETYPE_DATATYPE_DEFAULTATTRIB, value);
    }

}
