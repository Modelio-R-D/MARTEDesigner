package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("fbd499dc-e2be-4917-a22b-01fb5dade992")
public class HwComputingResource_Class extends ComputingResource_Class {
    @objid ("bba36776-d827-4b34-b5a2-4ba8550960d0")
    public HwComputingResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_CLASSIFIER));
    }

    @objid ("4cc3de37-8dd6-4388-80c0-a9ab659149fd")
    public HwComputingResource_Class(Class element) {
        super(element);
    }

    @objid ("7f1e7ff3-618a-4329-a70d-7fde8766ea2b")
    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_HWCOMPUTINGRESOURCE_CLASSIFIER_OP_FREQUENCIES, this.element);
    }

    @objid ("5b14186e-c5c3-4cda-94d4-a2a030e6b72f")
    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_HWCOMPUTINGRESOURCE_CLASSIFIER_OP_FREQUENCIES, value);
    }

    @objid ("379b32fc-168c-45b4-866d-10a572b712da")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_HWCOMPUTINGRESOURCE_CLASSIFIER_DESCRIPTION, this.element);
    }

    @objid ("66dc0c3c-7385-4b95-9a01-869402a61d05")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_HWCOMPUTINGRESOURCE_CLASSIFIER_DESCRIPTION, value);
    }

}
