package org.modelio.module.marte.profile.rsm.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Tiler_Connector {
    protected Connector element;

    public Tiler_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,"Tiler_Connector");
        this.element.setName(MARTEResourceManager.getName("Tiler_Connector"));
    }

    public Tiler_Connector(Connector element) {
        this.element = element;
    }

    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    public Connector getElement() {
        return this.element;
    }

    public String getorigin() {
        return ModelUtils.getTaggedValue("Tiler_Connector_origin", this.element);
    }

    public void setorigin(String value) {
        ModelUtils.addStringValue(this.element,"Tiler_Connector_origin", value);
    }

    public String getpaving() {
        return ModelUtils.getTaggedValue("Tiler_Connector_paving", this.element);
    }

    public void setpaving(String value) {
        ModelUtils.addStringValue(this.element,"Tiler_Connector_paving", value);
    }

    public String getfitting() {
        return ModelUtils.getTaggedValue("Tiler_Connector_fitting", this.element);
    }

    public void setfitting(String value) {
        ModelUtils.addStringValue(this.element,"Tiler_Connector_fitting", value);
    }

    public String gettiler() {
        return ModelUtils.getTaggedValue("Tiler_Connector_tiler", this.element);
    }

    public void settiler(String value) {
        ModelUtils.addStringValue(this.element,"Tiler_Connector_tiler", value);
    }

}
