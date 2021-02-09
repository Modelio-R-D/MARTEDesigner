package org.modelio.module.marte.profile.coreelements.model;

import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Configuration_Node {
    protected Node element;

    public Configuration_Node() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONFIGURATION_NODE);
        this.element.setName(MARTEResourceManager.getName("Configuration_Node"));
    }

    public Configuration_Node(Node element) {
        this.element = element;
    }

    public Node getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getmode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CONFIGURATION_NODE_CONFIGURATION_NODE_MODE, this.element);
    }

    public void setmode(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CONFIGURATION_NODE_CONFIGURATION_NODE_MODE, value);
    }

}
