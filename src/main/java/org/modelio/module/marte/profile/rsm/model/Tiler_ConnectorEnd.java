package org.modelio.module.marte.profile.rsm.model;

import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Tiler_ConnectorEnd {
    protected ConnectorEnd element;

    public Tiler_ConnectorEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnectorEnd();
        ModelUtils.setStereotype(this.element,"Tiler_ConnectorEnd");
        this.element.setName(MARTEResourceManager.getName("Tiler_ConnectorEnd"));
    }

    public Tiler_ConnectorEnd(ConnectorEnd element) {
        this.element = element;
    }

    public ConnectorEnd getElement() {
        return this.element;
    }

    public void setParent(Link parent) {
        this.element.setLink(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getorigin() {
        return ModelUtils.getTaggedValue("Tiler_ConnectorEnd_origin", this.element);
    }

    public void setorigin(String value) {
        ModelUtils.addStringValue(this.element,"Tiler_ConnectorEnd_origin", value);
    }

    public String getpaving() {
        return ModelUtils.getTaggedValue("Tiler_ConnectorEnd_paving", this.element);
    }

    public void setpaving(String value) {
        ModelUtils.addStringValue(this.element,"Tiler_ConnectorEnd_paving", value);
    }

    public String getfitting() {
        return ModelUtils.getTaggedValue("Tiler_ConnectorEnd_fitting", this.element);
    }

    public void setfitting(String value) {
        ModelUtils.addStringValue(this.element,"Tiler_ConnectorEnd_fitting", value);
    }

    public String gettiler() {
        return ModelUtils.getTaggedValue("Tiler_ConnectorEnd_tiler", this.element);
    }

    public void settiler(String value) {
        ModelUtils.addStringValue(this.element,"Tiler_ConnectorEnd_tiler", value);
    }

}
