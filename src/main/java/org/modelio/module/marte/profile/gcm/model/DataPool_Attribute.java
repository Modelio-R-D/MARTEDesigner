package org.modelio.module.marte.profile.gcm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("88e37251-09a4-4c5b-a664-edf761f5c9cf")
public class DataPool_Attribute {
    @objid ("69d5d518-53ee-4477-836c-c6b453c158d4")
    protected Attribute element;

    @objid ("781e4a38-c458-42dc-a53a-627a8eb7a026")
    public DataPool_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DATAPOOL_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName("DataPool_Attribute"));
    }

    @objid ("5eb31dbe-6c50-47c0-b838-3711d36eb4a8")
    public DataPool_Attribute(Attribute element) {
        this.element = element;
    }

    @objid ("76d1f6c3-628f-489d-bcde-5ab2546dae94")
    public Attribute getElement() {
        return this.element;
    }

    @objid ("015baa0b-aede-4e59-80ca-5dff9eaf3a13")
    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    @objid ("387e1bd8-905b-4761-aea6-9aebc98bb183")
    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("2b6e987c-f89a-4d88-94a5-506f774fb467")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("419bf258-4ce2-4de2-8c7e-dcd3b8637f76")
    public String getordering() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_ORDERING, this.element);
    }

    @objid ("abe6cb79-7cf9-43ba-8334-c237d5471a30")
    public void setordering(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_ORDERING, value);
    }

    @objid ("5b1843ea-c8e3-4494-abad-dd394f7816ed")
    public String getinsertion() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_INSERTION, this.element);
    }

    @objid ("7773a236-88ac-4842-8a50-5381362d96a7")
    public void setinsertion(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_INSERTION, value);
    }

    @objid ("97ee69d0-0804-461f-8b90-1a25141ce6e7")
    public String getselection() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_SELECTION, this.element);
    }

    @objid ("fd7d4cad-2b3c-4cdb-8391-47e55ccc1515")
    public void setselection(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_SELECTION, value);
    }

}
