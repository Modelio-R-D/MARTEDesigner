package org.modelio.module.marte.profile.gcm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("7bdd539d-f04b-4dfd-ad9c-f147b6657d81")
public class ClientServerPort_Port {
    @objid ("78fabd60-72c3-44f6-a623-e95e7d23eca8")
    protected Port element;

    @objid ("3836d881-4c32-49b4-9069-02783d19fab3")
    public ClientServerPort_Port() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createPort();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLIENTSERVERPORT_PORT);
        this.element.setName(MARTEResourceManager.getName("ClientServerPort_Port"));
    }

    @objid ("2e722cc5-2386-4d0f-899e-380153c5f107")
    public ClientServerPort_Port(Port element) {
        this.element = element;
    }

    @objid ("01e1376f-f4a1-49eb-9069-9f2725d9c513")
    public Port getElement() {
        return this.element;
    }

    @objid ("afc18969-1acc-4506-9d6e-36a162d9924c")
    public void setParent(Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("af4bbd42-0e80-44b8-ac04-1765766b342e")
    public void setParent(Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("34005f02-d60f-4204-a0a9-5dc1cdc517ca")
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("3a5d5c1c-2ad6-46b8-a93a-52216b57f67d")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("b01832ec-dd94-4fe9-932c-9e8978d5cb48")
    public String getspecificationKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_SPECIFICATIONKIND, this.element);
    }

    @objid ("77c59f65-d81e-4d63-8bfd-d9eea0e64a45")
    public void setspecificationKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_SPECIFICATIONKIND, value);
    }

    @objid ("38517ffc-35f8-4fb7-86fc-f8a74b55be38")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_KIND, this.element);
    }

    @objid ("031e549d-d2ee-4cbf-bdf4-d0ef21e7c126")
    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_KIND, value);
    }

    @objid ("dfc878b3-d648-45c4-9c95-fcb971b05e6f")
    public String getprovInterface() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_PROVINTERFACE, this.element);
    }

    @objid ("461b01d0-2d46-4794-a226-7bd46693d3d4")
    public void setprovInterface(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_PROVINTERFACE, value);
    }

    @objid ("6dfa3ecd-c52f-4533-a2d5-ec289edde9e3")
    public String getreqInterface() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_REQINTERFACE, this.element);
    }

    @objid ("3b11dfe4-cafa-41e4-a376-57a375ca8891")
    public void setreqInterface(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_REQINTERFACE, value);
    }

    @objid ("3fbd1db2-89d3-452f-97b5-9243f066ed06")
    public String getfeaturesSpec() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_FEATURESSPEC, this.element);
    }

    @objid ("f00b75b1-4e47-4f95-9dad-b5b3c3017ee6")
    public void setfeaturesSpec(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_FEATURESSPEC, value);
    }

}
