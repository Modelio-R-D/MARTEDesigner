package org.modelio.module.marte.profile.rsm.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class InterRepetition_Connector {
    protected Connector element;

    public InterRepetition_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,"InterRepetition_Connector");
        this.element.setName(MARTEResourceManager.getName("InterRepetition_Connector"));
    }

    public InterRepetition_Connector(Connector element) {
        this.element = element;
    }

    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    public Connector getElement() {
        return this.element;
    }

    public String getrepetitionShapeDependence() {
        return ModelUtils.getTaggedValue("InterRepetition_Connector_repetitionShapeDependence", this.element);
    }

    public void setrepetitionShapeDependence(String value) {
        ModelUtils.addStringValue(this.element,"InterRepetition_Connector_repetitionShapeDependence", value);
    }

    public boolean isisModulo() {
        return ModelUtils.hasTaggedValue("InterRepetition_Connector_isModulo", this.element);
    }

    public void isisModulo(boolean value) {
        ModelUtils.addBooleanValue(this.element,"InterRepetition_Connector_isModulo",value);
    }

}
