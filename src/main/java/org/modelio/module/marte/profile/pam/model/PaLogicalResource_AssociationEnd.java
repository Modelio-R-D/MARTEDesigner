package org.modelio.module.marte.profile.pam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8a77abb5-57cd-42a9-a17c-1e28cef59c67")
public class PaLogicalResource_AssociationEnd {
    @objid ("3906a082-3992-4efb-b386-dfddf0ff6627")
    protected AssociationEnd element;

    @objid ("54af004b-8815-4e95-955f-d8041b62ef2e")
    public PaLogicalResource_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PALOGICALRESOURCE_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PALOGICALRESOURCE_ASSOCIATIONEND));
    }

    @objid ("c5958891-d50d-4929-9538-596d90ceb4bb")
    public PaLogicalResource_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    @objid ("3a1b6269-5cf6-4c14-aa31-0c9ee4b12100")
    public AssociationEnd getElement() {
        return this.element;
    }

    @objid ("24155ca5-02c5-4915-ad33-bb1bf2edaff5")
    public void setParent(Classifier parent) {
        this.element.setSource(parent);
    }

    @objid ("3af345e5-319f-4bdc-9e13-0fb6a8228e64")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("d34cf5b1-62bc-4319-b1b3-513c099fd419")
    public String getutilization() {
        return ModelUtils.getTaggedValue("PaLogicalResource_AssociationEnd_utilization", this.element);
    }

    @objid ("248af5d4-0f4d-4f9d-ad72-c8583e272053")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_AssociationEnd_utilization", value);
    }

    @objid ("0211f697-f5b4-45e2-8668-c54f1dc91f7f")
    public String getthroughput() {
        return ModelUtils.getTaggedValue("PaLogicalResource_AssociationEnd_throughput", this.element);
    }

    @objid ("7be56a50-4832-48ce-9ba7-59ec5d177ffd")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_AssociationEnd_throughput", value);
    }

    @objid ("0547229a-4c2c-4866-be36-5a7cc4b332d7")
    public String getpoolSize() {
        return ModelUtils.getTaggedValue("PaLogicalResource_AssociationEnd_poolSize", this.element);
    }

    @objid ("45197763-79a5-494d-8305-a4e6a0e49e4d")
    public void setpoolSize(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_AssociationEnd_poolSize", value);
    }

}
