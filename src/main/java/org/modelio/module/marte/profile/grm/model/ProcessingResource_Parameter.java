package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2a3bf61e-b058-4535-acf4-fab4f35069d7")
public class ProcessingResource_Parameter extends Resource_Parameter {
    @objid ("f0f609b7-5854-4be6-aa2e-2f1c211cec56")
    public ProcessingResource_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PROCESSINGRESOURCE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("ProcessingResource_Parameter"));
    }

    @objid ("fadd820e-b0f6-487f-b18c-dcb882079346")
    public ProcessingResource_Parameter(final Parameter element) {
        super(element);
    }

    @objid ("91d3dd7b-36ed-49ab-a4ce-9d21845238b7")
    public String getspeedFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_PARAMETER_PROCESSINGRESOURCE_PARAMETER_SPEEDFACTOR, this.element);
    }

    @objid ("f4d4656a-2171-4c77-bde6-a0a0efe2d12e")
    public void setspeedFactor(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_PARAMETER_PROCESSINGRESOURCE_PARAMETER_SPEEDFACTOR, value);
    }

    @objid ("e117d7f4-0351-4044-bea0-6b432d0628e7")
    public String getmainScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_PARAMETER_PROCESSINGRESOURCE_PARAMETER_MAINSCHEDULER, this.element);
    }

    @objid ("90e24abb-d519-4c70-a876-38908ce55f82")
    public void setmainScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_PARAMETER_PROCESSINGRESOURCE_PARAMETER_MAINSCHEDULER, value);
    }

}
