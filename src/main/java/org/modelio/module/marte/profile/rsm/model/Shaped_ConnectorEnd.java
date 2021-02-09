package org.modelio.module.marte.profile.rsm.model;

import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Shaped_ConnectorEnd {
    protected ConnectorEnd element;

    public Shaped_ConnectorEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnectorEnd();
        ModelUtils.setStereotype(this.element,"Shaped_ConnectorEnd");
        this.element.setName(MARTEResourceManager.getName("Shaped_ConnectorEnd"));
    }

    public Shaped_ConnectorEnd(ConnectorEnd element) {
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

    public String getshape() {
        return ModelUtils.getTaggedValue("Shaped_ConnectorEnd_shape", this.element);
    }

    public void setshape(String value) {
        ModelUtils.addStringValue(this.element,"Shaped_ConnectorEnd_shape", value);
    }

}
