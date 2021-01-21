package org.modelio.module.marte.profile.pam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2a254af5-86e6-4a11-a8f6-cf3c779116d5")
public class PaLogicalResource_Association {
    @objid ("868a8450-c6fb-4b54-ad2c-4e43789536b6")
    protected Association element;

    @objid ("fba74f5f-908e-4621-a043-0e92340d30b9")
    public PaLogicalResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PALOGICALRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PALOGICALRESOURCE_ASSOCIATION));
    }

    @objid ("48568263-a68c-4b95-a9a6-8a9a7921e3fe")
    public PaLogicalResource_Association(Association element) {
        this.element = element;
    }

    @objid ("eb8bbb9f-5731-4f39-bb6f-5984ee6df427")
    public void setParent(TemplateParameter source, AssociationEnd destination) {
        this.element.setOwnerTemplateParameter(source);
    }

    @objid ("a3b18c68-054c-4f81-a8c3-d0c31237e981")
    public Association getElement() {
        return this.element;
    }

    @objid ("3a27b406-a057-4f55-8aca-53e29aed67d3")
    public String getutilization() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Association_utilization", this.element);
    }

    @objid ("69a35be2-5360-483f-aa9a-edeaeac66c65")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Association_utilization", value);
    }

    @objid ("a25beff8-2962-4d5d-a91a-f2d791bcbe9a")
    public String getthroughput() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Association_throughput", this.element);
    }

    @objid ("136be4dd-55e6-4b3c-a5bf-f0f5b461d35f")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Association_throughput", value);
    }

    @objid ("7dc694b2-ec38-4e28-929f-5d7cff16c620")
    public String getpoolSize() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Association_poolSize", this.element);
    }

    @objid ("7ff24c07-ebc6-451c-9b88-b6dc496679cd")
    public void setpoolSize(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Association_poolSize", value);
    }

}
