package org.modelio.module.marte.profile.hwgeneral.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.GrService_Operation;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4f8410d3-d476-4f9e-95a1-379e6692dc1b")
public class HwResourceService_Operation extends GrService_Operation {
    @objid ("58cf24c7-ceb9-413c-a9a2-f9fa14e3ce86")
    public HwResourceService_Operation() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWRESOURCESERVICE_OPERATION);
                this.element.setName(MARTEResourceManager.getName("HwResourceService_Operation"));
    }

    @objid ("c6218f91-fdd6-4901-a1a7-4b719e098fd0")
    public HwResourceService_Operation(Operation element) {
        super(element);
    }

    @objid ("680e0085-96f0-4535-b7f3-706308c7f6aa")
    public String getHwResourceService_Operation_consumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_OPERATION_HWRESOURCESERVICE_OPERATION_CONSUMPTION, this.element);
    }

    @objid ("335e8987-ce62-4ae4-b3a6-f2d763589790")
    public void setHwResourceService_Operation_consumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCESERVICE_OPERATION_HWRESOURCESERVICE_OPERATION_CONSUMPTION, value);
    }

    @objid ("a76e3888-a900-4d4d-9db0-c170982b783d")
    public String getHwResourceService_Operation_dissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_OPERATION_HWRESOURCESERVICE_OPERATION_DISSIPATION, this.element);
    }

    @objid ("dc0520aa-dcbf-40ce-8a36-42503ee8743b")
    public void setHwResourceService_Operation_dissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCESERVICE_OPERATION_HWRESOURCESERVICE_OPERATION_DISSIPATION, value);
    }

}
