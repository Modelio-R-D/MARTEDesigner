package org.modelio.module.marte.profile.hwcomputing.model;

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

@objid ("5963f585-d493-4744-b9d9-6015d1e01e37")
public class HwISA_Attribute {
    @objid ("0850e363-e6e1-4226-95d8-0c45f53077a1")
    protected Attribute element;

    @objid ("47430382-caee-4727-9ee8-74046dedcc1a")
    public HwISA_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWISA_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName("HwISA_Attribute"));
    }

    @objid ("fe2f07a7-4f69-4f22-a74c-3499ee9448c9")
    public HwISA_Attribute(Attribute element) {
        this.element = element;
    }

    @objid ("6beb340b-aa6b-4b45-9fac-141ad917debe")
    public String getfamily() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_FAMILY, this.element);
    }

    @objid ("c03e3e57-781f-4ba0-8457-3141f0746a87")
    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("3d1f89fb-136f-4301-a50e-dc3ee89f079a")
    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    @objid ("ee73db62-faeb-44b2-9776-7b853189ade0")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("fa1c6df7-877a-49a7-a528-f3a79a8c3ba6")
    public void setfamily(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_FAMILY, value);
    }

    @objid ("c766a5d0-1d5e-41ef-8138-0e86564ba0a5")
    public String getinst_Width() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_INST_WIDTH, this.element);
    }

    @objid ("f88f9163-4f4c-4dfb-bcd5-3f3de79bbe58")
    public void setinst_Width(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_INST_WIDTH, value);
    }

    @objid ("81d44926-3842-4345-bbb4-1a2bc61e23b9")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_TYPE, this.element);
    }

    @objid ("fcd76eb3-f16b-4b40-aa2f-736e3a603b17")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_TYPE, value);
    }

    @objid ("308e9556-25fc-4ffb-adeb-0ddebc2311b7")
    public Attribute getElement() {
        return this.element;
    }

}
