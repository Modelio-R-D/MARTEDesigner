package org.modelio.module.marte.profile.pam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a3df4480-0ba8-4704-b9a6-63e2597c9dd1")
public class PaLogicalResource_Instance {
    @objid ("7c86ef9d-cc4d-4700-a083-5fe15f6627c9")
    protected Instance element;

    @objid ("c540c1da-1865-4c08-a69f-6c080e55a668")
    public PaLogicalResource_Instance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PALOGICALRESOURCE_INSTANCE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PALOGICALRESOURCE_INSTANCE));
    }

    @objid ("26d6694e-a161-4e87-911f-035d827d685e")
    public PaLogicalResource_Instance(Instance element) {
        this.element = element;
    }

    @objid ("9e14dc83-0d33-4a16-b511-0707d86d2ce4")
    public Instance getElement() {
        return this.element;
    }

    @objid ("7fb260c6-b710-4721-8ea7-3aefef90621a")
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("73b71ae1-271d-4ecd-9359-858bcd357d31")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("b32b882a-983c-4ca3-b85f-06042f5be3b9")
    public String getutilization() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Instance_utilization", this.element);
    }

    @objid ("659acb5f-92bc-4cd6-9571-8cc00fbdf6b0")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Instance_utilization", value);
    }

    @objid ("ad32e891-b8b9-45e5-b119-c7eec74c1cc5")
    public String getthroughput() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Instance_throughput", this.element);
    }

    @objid ("cae0e5d8-ce44-434b-addb-5a2d4f2ba953")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Instance_throughput", value);
    }

    @objid ("45c55e70-8762-458c-ae02-a5fc42a041b8")
    public String getpoolSize() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Instance_poolSize", this.element);
    }

    @objid ("482c40ee-1765-48c5-85f5-0a38adb404d2")
    public void setpoolSize(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Instance_poolSize", value);
    }

}
