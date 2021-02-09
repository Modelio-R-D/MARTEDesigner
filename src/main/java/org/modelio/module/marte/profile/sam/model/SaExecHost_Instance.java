package org.modelio.module.marte.profile.sam.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaExecHost_Instance {
    protected Instance element;

    public SaExecHost_Instance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SAEXECHOST_INSTANCE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAEXECHOST_INSTANCE));
    }

    public SaExecHost_Instance(Instance element) {
        this.element = element;
    }

    public Instance getElement() {
        return this.element;
    }

    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public boolean isisSched() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISSCHED, this.element);
    }

    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISSCHED ,value );
    }

    public String getschSlack() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_SCHSLACK, this.element);
    }

    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_SCHSLACK, value);
    }

    public String getschedUtiliz() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_SCHEDUTILIZ, this.element);
    }

    public void setschedUtiliz(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_SCHEDUTILIZ, value);
    }

    public String getISRswitchT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISRSWITCHT, this.element);
    }

    public void setISRswitchT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISRSWITCHT, value);
    }

    public String getISRprioRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISRPRIORANGE, this.element);
    }

    public void setISRprioRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISRPRIORANGE, value);
    }

}
