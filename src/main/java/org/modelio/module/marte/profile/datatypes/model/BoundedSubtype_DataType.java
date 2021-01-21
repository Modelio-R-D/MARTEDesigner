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

@objid ("49e4ab4d-c20d-4a50-83c1-6de491352cf6")
public class BoundedSubtype_DataType {
    @objid ("6180aefd-63f7-453c-8ee5-0e39895a71af")
    protected DataType element;

    @objid ("3d4a7c62-6fe9-476b-aad1-6447f0dc1e27")
    public BoundedSubtype_DataType() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDataType();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.BOUNDEDSUBTYPE_DATATYPE);
        this.element.setName(MARTEResourceManager.getName("BoundedSubtype_DataType"));
    }

    @objid ("8ce2dfa4-5c9b-458f-bc4c-1e2407c4113c")
    public BoundedSubtype_DataType(DataType element) {
        this.element = element;
    }

    @objid ("87f2ec4f-6e84-4553-916f-72b919f57066")
    public DataType getElement() {
        return this.element;
    }

    @objid ("9cf64b99-7398-4e25-a1bd-2a93868029d8")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("30a9e16d-6261-43f3-b712-ba6d78f5a57b")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("cf71925e-d1dd-463e-9875-38976999c390")
    public String getminValue() {
        return  ModelUtils.getTaggedValue(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_MINVALUE, this.element);
    }

    @objid ("976fc048-763a-430b-83ad-6f724b80d15b")
    public void setminValue(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_MINVALUE, value);
    }

    @objid ("9216dba5-b8ec-4f1e-aacb-663185dd2497")
    public String getmaxValue() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_MAXVALUE, this.element);
    }

    @objid ("ebaf4474-cf60-44d2-a2a7-f07211b727e0")
    public void setmaxValue(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_MAXVALUE, value);
    }

    @objid ("79a95101-7a90-49e2-801a-3c83eb738801")
    public boolean isisMinOpen() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN, this.element);
    }

    @objid ("db5bd908-42a2-4dfa-b59d-d1cd0512a53e")
    public void isisMinOpen(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN, value);
    }

    @objid ("9d4e2303-6fa6-4e7d-a553-7fc2d4481510")
    public boolean isisMaxOpen() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN, this.element);
    }

    @objid ("11fabc41-2047-4503-9f07-38267f720bf6")
    public void isisMaxOpen(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN, value );
    }

}
