package org.modelio.module.marte.profile.rsm.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Reshape_Connector {
    protected Connector element;

    public Reshape_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,"Reshape_Connector");
        this.element.setName(MARTEResourceManager.getName("Reshape_Connector"));
    }

    public Reshape_Connector(Connector element) {
        this.element = element;
    }

    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    public Connector getElement() {
        return this.element;
    }

    public String getpatternShape() {
        return ModelUtils.getTaggedValue("Reshape_Connector_patternShape", this.element);
    }

    public void setpatternShape(String value) {
        ModelUtils.addStringValue(this.element,"Reshape_Connector_patternShape", value);
    }

    public String getrepetitonShape() {
        return ModelUtils.getTaggedValue("Reshape_Connector_repetitonShape", this.element);
    }

    public void setrepetitonShape(String value) {
        ModelUtils.addStringValue(this.element,"Reshape_Connector_repetitonShape", value);
    }

}
