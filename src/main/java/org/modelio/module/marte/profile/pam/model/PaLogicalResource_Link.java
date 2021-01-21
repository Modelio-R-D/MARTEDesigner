package org.modelio.module.marte.profile.pam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7af3073e-8239-4b61-a33d-449c8eb197b6")
public class PaLogicalResource_Link {
    @objid ("cd869e79-d608-40c0-b052-ea91bed53113")
    protected Link element;

    @objid ("838f52ee-f149-4e85-bbf5-f2c8f818fdc3")
    public PaLogicalResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PALOGICALRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PALOGICALRESOURCE_LINK));
    }

    @objid ("8bc4ed92-428b-43bd-965e-538da90d8938")
    public PaLogicalResource_Link(Link element) {
        this.element = element;
    }

    @objid ("3aea4dd5-6f45-409d-a5e5-66bc27522a3a")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("49d21351-206e-4362-8f75-8d24eb44f341")
    public Link getElement() {
        return this.element;
    }

    @objid ("cdbb7a3e-167f-4a55-a549-46512cb9bd4f")
    public String getutilization() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Link_utilization", this.element);
    }

    @objid ("57607c5b-4397-4b64-8404-3085b6f6b774")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Link_utilization", value);
    }

    @objid ("d1ba903c-564e-4ed1-8c79-eb2f84590992")
    public String getthroughput() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Link_throughput", this.element);
    }

    @objid ("ac0e2c9a-84a9-49ef-a3d5-954467f25507")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PALOGICALRESOURCE_LINK_PALOGICALRESOURCE_LINK_THROUGHPUT, value);
    }

    @objid ("00d49148-a8a1-4002-bf26-50ebb31cde9d")
    public String getpoolSize() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Link_poolSize", this.element);
    }

    @objid ("9afa2af9-166e-499e-b376-97205de4970c")
    public void setpoolSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PALOGICALRESOURCE_LINK_PALOGICALRESOURCE_LINK_POOLSIZE, value);
    }

}
