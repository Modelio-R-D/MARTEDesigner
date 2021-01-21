package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("cfc922b5-82e8-4437-a006-c80545dc582c")
public class PpUnit_Class {
    @objid ("36295aca-7a9e-4a2f-a5e3-91879751a458")
    protected Class element;

    @objid ("61d4d12d-97c9-4907-9800-7a8f670d365b")
    public PpUnit_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PPUNIT_CLASS);
        this.element.setName(MARTEResourceManager.getName("PpUnit_Class"));
    }

    @objid ("9223a8ce-710e-47f7-b867-4c70d8192cbd")
    public PpUnit_Class(Class element) {
        this.element = element;
    }

    @objid ("56d16ada-56b9-4514-8028-711e1d300cd2")
    public Class getElement() {
        return this.element;
    }

    @objid ("4a37fbcf-8187-4f6f-9c34-e92a314fe316")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("bdf7fc18-ac1f-4b75-a8d0-09c558ce5195")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("822550fd-b3d8-48e1-a6f4-27d5b7ac0840")
    public String getconcPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_CLASS_PPUNIT_CLASS_CONCPOLICY, this.element);
    }

    @objid ("c1a35cd3-a666-4f61-8119-0434ec394b88")
    public void setconcPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PPUNIT_CLASS_PPUNIT_CLASS_CONCPOLICY, value);
    }

    @objid ("a9accdae-934e-48df-a3a1-9199354e6283")
    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_CLASS_PPUNIT_CLASS_MEMORYSIZE, this.element);
    }

    @objid ("a831e634-2b9f-446b-a634-3db7df7419dd")
    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PPUNIT_CLASS_PPUNIT_CLASS_MEMORYSIZE, value);
    }

}
