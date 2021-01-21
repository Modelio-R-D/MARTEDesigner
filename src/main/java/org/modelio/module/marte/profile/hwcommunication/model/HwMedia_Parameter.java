package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c47b1d6c-cec2-42da-b9cb-dc06e24aa393")
public class HwMedia_Parameter extends HwCommunicationResource_Parameter {
    @objid ("fae57464-8c4c-4333-88c0-1057d30b7d75")
    public HwMedia_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEDIA_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwMedia_Parameter"));
    }

    @objid ("e8b54ebb-30d5-4be2-8489-965176310eaf")
    public HwMedia_Parameter(Parameter element) {
        super(element);
    }

    @objid ("f74eea3a-a5d2-4c0d-b4f8-5915089b14ea")
    public String getarbiters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEDIA_PARAMETER_HWMEDIA_PARAMETER_ARBITERS, this.element);
    }

    @objid ("78857d4a-61ba-414d-8f09-d02b10b4516e")
    public void setarbiters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEDIA_PARAMETER_HWMEDIA_PARAMETER_ARBITERS, value);
    }

}
