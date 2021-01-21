package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("04fb72ff-bd55-4f34-8dda-66b871d19a71")
public class HwCommunicationResource_Parameter {
    @objid ("8ccf94bf-c3c2-4f0e-ab39-86837d47ba81")
    protected Parameter element;

    @objid ("89677322-b88a-41a0-b52b-3c116228ae8a")
    public HwCommunicationResource_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMMUNICATIONRESOURCE_PARAMETER);
        this.element.setName(MARTEResourceManager.getName("HwCommunicationResource_Parameter"));
    }

    @objid ("3bf424f9-542e-4943-bb71-d2cf58c5c27e")
    public HwCommunicationResource_Parameter(Parameter element) {
        this.element = element;
    }

    @objid ("dce2e5cb-4c8e-4f03-8dc6-712ad3bc6617")
    public void setParent(Operation parent) {
        this.element.setComposed(parent);
    }

    @objid ("55bf6958-69fa-48e1-a14c-26ecef097af6")
    public Parameter getElement() {
        return this.element;
    }

}
