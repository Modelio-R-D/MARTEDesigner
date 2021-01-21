package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3de3faa2-637e-48b2-9080-7c0264555b7c")
public class HwArbiter_Parameter extends HwCommunicationResource_Parameter {
    @objid ("a63b5f6b-612c-4e64-9905-b15d7f8a2814")
    public HwArbiter_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWARBITER_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwArbiter_Parameter"));
    }

    @objid ("1d59fcdb-808a-450c-99af-6a4eec694b36")
    public HwArbiter_Parameter(Parameter element) {
        super(element);
    }

    @objid ("43689711-13fc-4b36-a470-c53db9195282")
    public String getcontrolledMedias() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWARBITER_PARAMETER_HWARBITER_PARAMETER_CONTROLLEDMEDIAS, this.element);
    }

    @objid ("ac1452a8-d219-4f17-a865-83755fd91ada")
    public void setcontrolledMedias(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWARBITER_PARAMETER_HWARBITER_PARAMETER_CONTROLLEDMEDIAS, value);
    }

    @objid ("a08cb029-1d5e-4a57-9e6a-506475e68a84")
    public Parameter getElement() {
        return this.element;
    }

}
