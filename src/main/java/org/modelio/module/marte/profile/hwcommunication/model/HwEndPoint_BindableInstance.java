package org.modelio.module.marte.profile.hwcommunication.model;

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

@objid ("dd3b8d0b-4519-432b-ad28-5b831b7feba0")
public class HwEndPoint_BindableInstance {
    @objid ("68677a66-e482-471b-8528-7738c9e20f61")
    protected BindableInstance element;

    @objid ("25290c55-640a-442f-84f6-fb89d6a5dde3")
    public HwEndPoint_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("HwEndPoint_BindableInstance"));
    }

    @objid ("dd7dfbb0-f668-4b9c-9e9e-13f819721408")
    public HwEndPoint_BindableInstance(BindableInstance element) {
        this.element = element;
    }

    @objid ("f5b1d4d6-dcab-49dc-8c28-9f06953b849e")
    public BindableInstance getElement() {
        return this.element;
    }

    @objid ("456c2e61-5d49-4f1a-9618-26e63a786c7d")
    public void setParent(Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("b7e94522-4468-4f25-9084-2fbd3e963644")
    public void setParent(Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("c8d5eede-2e9e-420e-9ca4-8c6dab5deede")
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("b816758a-9ccf-4d91-bfa0-dae5b01e1152")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("5db05e04-d186-4d20-871c-5c3d4720ebfe")
    public String getconnectedTo() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_INSTANCE_HWENDPOINT_INSTANCE_CONNECTEDTO, this.element);
    }

    @objid ("5e449561-2c25-4183-9c95-71c385fc28b8")
    public void setconnectedTo(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWENDPOINT_INSTANCE_HWENDPOINT_INSTANCE_CONNECTEDTO, value);
    }

}
