package org.modelio.module.marte.profile.gcm.model;

import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class FlowPort_Port {
    protected Port element;

    public FlowPort_Port() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createPort();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.FLOWPORT_PORT);
        this.element.setName(MARTEResourceManager.getName("FlowPort_Port"));
    }

    public FlowPort_Port(Port element) {
        this.element = element;
    }

    public Port getElement() {
        return this.element;
    }

    public void setParent(Instance parent) {
        this.element.setCluster(parent);
    }

    public void setParent(Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public boolean isisAtomic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.FLOWPORT_PORT_FLOWPORT_PORT_ISATOMIC, this.element);
    }

    public void isisAtomic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.FLOWPORT_PORT_FLOWPORT_PORT_ISATOMIC,value);
    }

    public String getdirection() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.FLOWPORT_PORT_FLOWPORT_PORT_DIRECTION, this.element);
    }

    public void setdirection(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.FLOWPORT_PORT_FLOWPORT_PORT_DIRECTION, value);
    }

}
