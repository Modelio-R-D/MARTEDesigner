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

@objid ("e6235d36-fe7b-4db5-9bf9-0ff2dade8011")
public class FlowPort_Port {
    @objid ("a43cad4c-bcbf-49b4-9e12-c1597b414158")
    protected Port element;

    @objid ("6a3fda2e-f8eb-4650-b55e-f15d6c85c46e")
    public FlowPort_Port() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createPort();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.FLOWPORT_PORT);
        this.element.setName(MARTEResourceManager.getName("FlowPort_Port"));
    }

    @objid ("26cb0e10-c543-45da-811f-60217b6fafbf")
    public FlowPort_Port(Port element) {
        this.element = element;
    }

    @objid ("674ed32e-54bf-4234-87f6-89e3e3f273ba")
    public Port getElement() {
        return this.element;
    }

    @objid ("4c85955b-48d2-4f6d-99d3-0459f8a552b0")
    public void setParent(Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("243b1652-e16f-4488-9323-d332c7db023d")
    public void setParent(Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("efb4d98c-ccce-494c-97a5-3a4925f002c0")
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("1502f44d-5525-4907-99b9-e4af1725b270")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("beeb0367-7081-4ecc-be55-49108f4e17a5")
    public boolean isisAtomic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.FLOWPORT_PORT_FLOWPORT_PORT_ISATOMIC, this.element);
    }

    @objid ("d3056c37-a13d-43be-b364-ac31053b29eb")
    public void isisAtomic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.FLOWPORT_PORT_FLOWPORT_PORT_ISATOMIC,value);
    }

    @objid ("60926f38-ca7b-45e4-91be-3f309f762c3d")
    public String getdirection() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.FLOWPORT_PORT_FLOWPORT_PORT_DIRECTION, this.element);
    }

    @objid ("026f0c63-df22-408e-8f3f-4ba1b0055519")
    public void setdirection(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.FLOWPORT_PORT_FLOWPORT_PORT_DIRECTION, value);
    }

}
