package org.modelio.module.marte.profile.rsm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1b317fab-8242-44c4-8fcb-79918677cfb4")
public class Tiler_Connector {
    @objid ("da4ec187-aa41-4f3e-afad-0f0d67d495e4")
    protected Connector element;

    @objid ("311e9100-6513-4659-86e9-c4989844ef89")
    public Tiler_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,"Tiler_Connector");
        this.element.setName(MARTEResourceManager.getName("Tiler_Connector"));
    }

    @objid ("15d0d455-f317-4284-93f8-5234c4b14167")
    public Tiler_Connector(Connector element) {
        this.element = element;
    }

    @objid ("5499def7-545e-4509-afaf-fbe2e34f76b4")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("66e0e146-1692-4373-8c1d-7b6fe4b28fb9")
    public Connector getElement() {
        return this.element;
    }

    @objid ("76a677db-5e0e-4c09-a010-b0f94a6e628f")
    public String getorigin() {
        return ModelUtils.getTaggedValue("Tiler_Connector_origin", this.element);
    }

    @objid ("c97736c8-2b3f-4f2d-a640-21860fadec8e")
    public void setorigin(String value) {
        ModelUtils.addStringValue(this.element,"Tiler_Connector_origin", value);
    }

    @objid ("f1fecf8d-f94d-46d9-8e29-88089234b9eb")
    public String getpaving() {
        return ModelUtils.getTaggedValue("Tiler_Connector_paving", this.element);
    }

    @objid ("039420a7-8bcf-4b08-b9b4-d0440fdaedc7")
    public void setpaving(String value) {
        ModelUtils.addStringValue(this.element,"Tiler_Connector_paving", value);
    }

    @objid ("8d3ee031-513d-4c74-b8d4-79b7866b4b76")
    public String getfitting() {
        return ModelUtils.getTaggedValue("Tiler_Connector_fitting", this.element);
    }

    @objid ("c940db4e-ec40-4271-8484-f997baab6ffd")
    public void setfitting(String value) {
        ModelUtils.addStringValue(this.element,"Tiler_Connector_fitting", value);
    }

    @objid ("af3e40f0-02de-4198-9aa8-64c60d08b68d")
    public String gettiler() {
        return ModelUtils.getTaggedValue("Tiler_Connector_tiler", this.element);
    }

    @objid ("84fa0e4c-9ac2-427d-9ce1-8400ef0eedd1")
    public void settiler(String value) {
        ModelUtils.addStringValue(this.element,"Tiler_Connector_tiler", value);
    }

}
