package org.modelio.module.marte.profile.sam.model;

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

@objid ("ff28a79d-d1a3-4171-8dc7-f09f2cc027d9")
public class SaExecHost_Attribute {
    @objid ("bdb428dc-d0dd-4206-8435-9cf68bd6fdf7")
    protected Attribute element;

    @objid ("ce66a792-77ea-4151-a906-14ddcd8be73f")
    public SaExecHost_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SAEXECHOST_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAEXECHOST_ATTRIBUTE));
    }

    @objid ("f00dc228-a843-4558-ad34-554d19ff4d15")
    public SaExecHost_Attribute(Attribute element) {
        this.element = element;
    }

    @objid ("47a46e05-4a42-4da2-8fa9-29e898c25162")
    public Attribute getElement() {
        return this.element;
    }

    @objid ("3a47c5d8-e8d6-4fa1-be5c-77755a2dffeb")
    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    @objid ("0edcbd67-c63e-4530-8b69-b584bae2feea")
    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("7cbddb59-ccc7-4b70-9397-9a8eefbbaca7")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("4edbd90f-ee2f-4b32-a40e-6eb4b158416b")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_ISSCHED, this.element);
    }

    @objid ("cafe4189-eed0-4919-8160-5e74e668db91")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_ISSCHED,value);
    }

    @objid ("9083fd05-1f09-4214-8f6c-80b050059a87")
    public String getschSlack() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_SCHSLACK, this.element);
    }

    @objid ("28eb3a7b-e1a7-4c69-a8e1-0b15e4013993")
    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_SCHSLACK, value);
    }

    @objid ("23b6f1d9-daf7-4a0e-8cb7-6407b48a5a17")
    public String getschedUtiliz() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_SCHEDUTILIZ, this.element);
    }

    @objid ("e370e306-335f-49d9-8fdf-0a6e6403f5fb")
    public void setschedUtiliz(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_SCHEDUTILIZ, value);
    }

    @objid ("9eed6f96-f682-428a-aa56-dff639b04da3")
    public String getISRswitchT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_ISRSWITCHT, this.element);
    }

    @objid ("913844a5-f1c1-4a07-964b-74a77afd3d19")
    public void setISRswitchT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_ISRSWITCHT, value);
    }

    @objid ("2b4a6907-a188-44c9-90fc-6513d0732c75")
    public String getISRprioRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_ISRPRIORANGE, this.element);
    }

    @objid ("19df9410-4f68-4e93-bcab-9c1143cca6f5")
    public void setISRprioRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_ISRPRIORANGE, value);
    }

}
