package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwCommunicationResource_Parameter {
    protected Parameter element;

    public HwCommunicationResource_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMMUNICATIONRESOURCE_PARAMETER);
        this.element.setName(MARTEResourceManager.getName("HwCommunicationResource_Parameter"));
    }

    public HwCommunicationResource_Parameter(Parameter element) {
        this.element = element;
    }

    public void setParent(Operation parent) {
        this.element.setComposed(parent);
    }

    public Parameter getElement() {
        return this.element;
    }

}
