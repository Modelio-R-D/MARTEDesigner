package org.modelio.module.marte.profile.gcm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("37633f49-227a-461d-bcf7-aa8499ab60a6")
public class FlowProperty_BindableInstance {
    @objid ("5b16207c-2575-4ae4-a382-112e217b4242")
    protected BindableInstance element;

    @objid ("dbe8e11b-1ff6-4088-ad4f-64c13f97401e")
    public FlowProperty_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.FLOWPROPERTY_BINDABLEINSTANCE);
        this.element.setName(MARTEResourceManager.getName("FlowProperty_BindableInstance"));
    }

    @objid ("95a1250d-f9bf-424d-ae16-ea00bad29c52")
    public FlowProperty_BindableInstance(BindableInstance element) {
        this.element = element;
    }

    @objid ("ccc2fded-ab0c-4fd8-9018-779ea55f4a95")
    public BindableInstance getElement() {
        return this.element;
    }

    @objid ("2e5f24be-2696-4450-93b8-10fc4cac8b76")
    public void setParent(Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("cfa5a005-3bf5-4d97-95c9-fce0bf5452d5")
    public void setParent(Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("0ea174af-5046-4c90-af1a-58319f655cad")
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("bbf70bb2-3dcd-492e-bfb1-5215f35d2180")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("dd8548fe-d05f-4a29-b22e-e1eb896057f2")
    public String getdirection() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.FLOWPROPERTY_BINDABLEINSTANCE_FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION, this.element);
    }

    @objid ("9a2eae8c-82e9-4eba-a0e2-57757ece5503")
    public void setdirection(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.FLOWPROPERTY_BINDABLEINSTANCE_FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION, value);
    }

}
