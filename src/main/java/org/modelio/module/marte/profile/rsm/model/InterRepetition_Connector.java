package org.modelio.module.marte.profile.rsm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("589185e4-20c9-4d47-a743-a72614a56592")
public class InterRepetition_Connector {
    @objid ("2101ce5a-a727-42cd-b892-c5c2122372b0")
    protected Connector element;

    @objid ("c0199ced-a302-44fb-8236-11d33e81692d")
    public InterRepetition_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,"InterRepetition_Connector");
        this.element.setName(MARTEResourceManager.getName("InterRepetition_Connector"));
    }

    @objid ("c3e103d1-812d-4654-b50a-3f65ed75655a")
    public InterRepetition_Connector(Connector element) {
        this.element = element;
    }

    @objid ("b05100d8-6ba6-4802-b3a7-9f3708e1f11f")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("c83cfeb3-fb84-44ba-b3c7-a1723e86a81b")
    public Connector getElement() {
        return this.element;
    }

    @objid ("bb2fdbbe-9cd2-4b82-8d79-3a4ae3de8b53")
    public String getrepetitionShapeDependence() {
        return ModelUtils.getTaggedValue("InterRepetition_Connector_repetitionShapeDependence", this.element);
    }

    @objid ("cc24576c-caf2-4ac0-b4e7-77a65a83ae4c")
    public void setrepetitionShapeDependence(String value) {
        ModelUtils.addStringValue(this.element,"InterRepetition_Connector_repetitionShapeDependence", value);
    }

    @objid ("55010a11-b70d-48c9-aeab-1b65214bf2fa")
    public boolean isisModulo() {
        return ModelUtils.hasTaggedValue("InterRepetition_Connector_isModulo", this.element);
    }

    @objid ("70d02ab7-58c6-4934-b5f8-8d1ec7eb9bcc")
    public void isisModulo(boolean value) {
        ModelUtils.addBooleanValue(this.element,"InterRepetition_Connector_isModulo",value);
    }

}
