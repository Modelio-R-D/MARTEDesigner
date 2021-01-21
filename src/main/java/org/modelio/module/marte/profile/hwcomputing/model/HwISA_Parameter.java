package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("860aac51-b635-42aa-976f-4a8b0aea494e")
public class HwISA_Parameter {
    @objid ("b56ea3fb-58fe-4041-a2e0-ed202a63b9b7")
    protected Parameter element;

    @objid ("468172ce-bb7b-438a-b335-e7a646ca3cea")
    public HwISA_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWISA_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwISA_Parameter"));
    }

    @objid ("cba5d8f7-7e2d-407c-b397-e1aee432a35f")
    public HwISA_Parameter(Parameter element) {
        this.element = element;
    }

    @objid ("3d7036bf-f94f-49a3-a7fd-932887f441c2")
    public void setParent(Operation parent) {
        this.element.setComposed(parent);
    }

    @objid ("e29c190e-0ddb-4fc3-aac0-58107f15e48d")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("9f55c1f3-6f4c-4325-a219-bb96bfb4fa1b")
    public String getfamily() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_FAMILY, this.element);
    }

    @objid ("753b92e3-7a1e-4fce-b6ae-da37c2cc199f")
    public void setfamily(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_FAMILY, value);
    }

    @objid ("d533683d-d440-457a-bdbb-c9d32e9f95b6")
    public String getinst_Width() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_INST_WIDTH, this.element);
    }

    @objid ("f0427cbf-d31a-40fd-824b-aedcddbe17f8")
    public void setinst_Width(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_INST_WIDTH, value);
    }

    @objid ("93cd4688-d978-4a75-b17b-a7d9bc0f1dff")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_TYPE, this.element);
    }

    @objid ("005f7441-30a5-473e-be94-5904f159c890")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_TYPE, value);
    }

    @objid ("5768dfb9-ff2e-4a51-b67d-74e75c1cc9d3")
    public Parameter getElement() {
        return this.element;
    }

}
