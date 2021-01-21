package org.modelio.module.marte.profile.rsm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a13e67ae-4e89-41be-8bec-699da97ac067")
public class Reshape_Connector {
    @objid ("06bf0611-beb3-4765-86d8-5965ca24e1bd")
    protected Connector element;

    @objid ("b8905253-3f8f-498d-949e-5e58a0c88d02")
    public Reshape_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,"Reshape_Connector");
        this.element.setName(MARTEResourceManager.getName("Reshape_Connector"));
    }

    @objid ("40c9e1be-4df1-477d-ba16-1905bc72da54")
    public Reshape_Connector(Connector element) {
        this.element = element;
    }

    @objid ("a0e52c70-e251-473c-b316-d6cbf32812fd")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("fd363679-5e30-40b1-8421-686c852245ba")
    public Connector getElement() {
        return this.element;
    }

    @objid ("ea94b591-f217-4dfa-9845-7881678f06eb")
    public String getpatternShape() {
        return ModelUtils.getTaggedValue("Reshape_Connector_patternShape", this.element);
    }

    @objid ("5038822b-0639-4b1e-b861-e080115fab23")
    public void setpatternShape(String value) {
        ModelUtils.addStringValue(this.element,"Reshape_Connector_patternShape", value);
    }

    @objid ("c5e6b1d9-8106-4a5c-816b-d407ab5bebc1")
    public String getrepetitonShape() {
        return ModelUtils.getTaggedValue("Reshape_Connector_repetitonShape", this.element);
    }

    @objid ("24dfa5be-e741-41da-be66-8fd0ffa08d01")
    public void setrepetitonShape(String value) {
        ModelUtils.addStringValue(this.element,"Reshape_Connector_repetitonShape", value);
    }

}
