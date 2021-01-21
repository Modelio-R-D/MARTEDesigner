package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3502d618-9ddb-4923-a9cd-358161c24bd8")
public class SaExecHost_Parameter {
    @objid ("4db5f44d-94f7-4aaa-a970-6522ae3c7c61")
    protected BehaviorParameter element;

    @objid ("1ffed9d8-998d-4977-b4c0-d1a84c249e6d")
    public SaExecHost_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBehaviorParameter();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SAEXECHOST_PARAMETER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAEXECHOST_PARAMETER));
    }

    @objid ("e5d4b19a-a6e9-4d59-8d91-b43237933631")
    public SaExecHost_Parameter(BehaviorParameter element) {
        this.element = element;
    }

    @objid ("794d36e0-9782-4e2d-a997-7e65fa752971")
    public BehaviorParameter getElement() {
        return this.element;
    }

    @objid ("6edfb20e-2de5-4636-ac02-26b6e1e29ed0")
    public void setParent(Behavior parent) {
        this.element.setOwner(parent);
    }

    @objid ("93a8be12-6338-4f5a-84f1-4cbb61621182")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("a9864218-8686-47f8-9933-f2372c814c81")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaExecHost_Parameter_isSched", this.element);
    }

    @objid ("99f6c50c-e9ac-4d9f-9864-53050b4c9a06")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_ISSCHED,value);
    }

    @objid ("8969818a-f2cb-4f41-9146-93ffbcb232ed")
    public String getschSlack() {
        return ModelUtils.getTaggedValue("SaExecHost_Parameter_schSlack", this.element);
    }

    @objid ("42add861-0b2a-484a-af8d-b5661e0205b4")
    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_SCHSLACK, value);
    }

    @objid ("b1698fe5-9408-47bf-a878-c931f6125b4c")
    public String getschedUtiliz() {
        return ModelUtils.getTaggedValue("SaExecHost_Parameter_schedUtiliz", this.element);
    }

    @objid ("158bb26e-cae5-4601-95c9-61ded16a364b")
    public void setschedUtiliz(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_SCHEDUTILIZ, value);
    }

    @objid ("10aff406-8b79-4dad-b59f-918adff7c109")
    public String getISRswitchT() {
        return ModelUtils.getTaggedValue("SaExecHost_Parameter_ISRswitchT", this.element);
    }

    @objid ("bd429e9b-d750-4444-9ca9-4c8a49c0bb52")
    public void setISRswitchT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_ISRSWITCHT, value);
    }

    @objid ("5ecc50e8-c901-44c9-8c47-e872502992a9")
    public String getISRprioRange() {
        return ModelUtils.getTaggedValue("SaExecHost_Parameter_ISRprioRange", this.element);
    }

    @objid ("ad9b0a50-bbd8-410c-812a-10e1d698b22e")
    public void setISRprioRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_ISRPRIORANGE, value);
    }

}
