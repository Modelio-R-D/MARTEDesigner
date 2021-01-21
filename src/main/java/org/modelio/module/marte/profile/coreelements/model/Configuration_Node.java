package org.modelio.module.marte.profile.coreelements.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9da14b7f-733a-4a2f-82b1-3e6f3cb2e432")
public class Configuration_Node {
    @objid ("729cbfb1-34bb-4af7-9e3d-83df7eb43e9d")
    protected Node element;

    @objid ("d29b9115-b27c-4f5b-aa60-7027694ec6c8")
    public Configuration_Node() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONFIGURATION_NODE);
        this.element.setName(MARTEResourceManager.getName("Configuration_Node"));
    }

    @objid ("a70d6158-1e8e-4cd6-9533-e691a881976d")
    public Configuration_Node(Node element) {
        this.element = element;
    }

    @objid ("b26f06dd-4839-4ec9-b44f-7ff4aa627e05")
    public Node getElement() {
        return this.element;
    }

    @objid ("d5636860-1c79-488e-913c-8f2e6f4277c4")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("cfb89f27-f81d-4eb0-807c-e181402a1d13")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("c164bacf-62a6-4ebb-9ded-09a79763bb50")
    public String getmode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CONFIGURATION_NODE_CONFIGURATION_NODE_MODE, this.element);
    }

    @objid ("11c56ea1-15c3-4855-8ac5-0a9186d16c03")
    public void setmode(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CONFIGURATION_NODE_CONFIGURATION_NODE_MODE, value);
    }

}
