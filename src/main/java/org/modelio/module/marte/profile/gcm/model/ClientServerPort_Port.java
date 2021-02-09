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

public class ClientServerPort_Port {
    protected Port element;

    public ClientServerPort_Port() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createPort();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLIENTSERVERPORT_PORT);
        this.element.setName(MARTEResourceManager.getName("ClientServerPort_Port"));
    }

    public ClientServerPort_Port(Port element) {
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

    public String getspecificationKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_SPECIFICATIONKIND, this.element);
    }

    public void setspecificationKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_SPECIFICATIONKIND, value);
    }

    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_KIND, this.element);
    }

    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_KIND, value);
    }

    public String getprovInterface() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_PROVINTERFACE, this.element);
    }

    public void setprovInterface(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_PROVINTERFACE, value);
    }

    public String getreqInterface() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_REQINTERFACE, this.element);
    }

    public void setreqInterface(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_REQINTERFACE, value);
    }

    public String getfeaturesSpec() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_FEATURESSPEC, this.element);
    }

    public void setfeaturesSpec(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_FEATURESSPEC, value);
    }

}
