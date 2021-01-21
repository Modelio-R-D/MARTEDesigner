package org.modelio.module.marte.profile.pam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("94773521-67e8-4f94-960a-a3ba1e54c6c5")
public class PaLogicalResource_Parameter {
    @objid ("2a2510ae-6134-4a22-a8ce-568100298638")
    protected Parameter element;

    @objid ("3343226e-d906-472b-a342-f58008661f8f")
    public PaLogicalResource_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PALOGICALRESOURCE_PARAMETER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PALOGICALRESOURCE_PARAMETER));
    }

    @objid ("5f7bdf02-4d55-47fc-a96a-dadf4ab7cd56")
    public PaLogicalResource_Parameter(Parameter element) {
        this.element = element;
    }

    @objid ("bd6a18ec-b2fc-494a-829c-b5f0910a461a")
    public Parameter getElement() {
        return this.element;
    }

    @objid ("5cce1e65-3f75-43cb-bde9-a55aa881d4c6")
    public void setParent(Operation parent) {
        this.element.setComposed(parent);
    }

    @objid ("ce045168-7393-40f2-a252-f5908d043962")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("d932fc3d-504c-4466-a7d0-368775d0e616")
    public String getutilization() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Parameter_utilization", this.element);
    }

    @objid ("d9e3dbfb-c6cc-424c-b829-2ea0feb19c12")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PALOGICALRESOURCE_PARAMETER_PALOGICALRESOURCE_PARAMETER_UTILIZATION, value);
    }

    @objid ("a8eb14f2-4c4c-446d-b213-5d74edd81321")
    public String getthroughput() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Parameter_throughput", this.element);
    }

    @objid ("ae63f492-e765-4635-af6f-60c163bf3ff8")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PALOGICALRESOURCE_PARAMETER_PALOGICALRESOURCE_PARAMETER_THROUGHPUT, value);
    }

    @objid ("5b1c0fcb-62d5-4b2e-8779-343113ace26e")
    public String getpoolSize() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Parameter_poolSize", this.element);
    }

    @objid ("e7fe6b58-a8c6-4271-bcd1-034cd6102040")
    public void setpoolSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PALOGICALRESOURCE_PARAMETER_PALOGICALRESOURCE_PARAMETER_POOLSIZE, value);
    }

}
