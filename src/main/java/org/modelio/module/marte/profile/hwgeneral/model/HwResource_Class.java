package org.modelio.module.marte.profile.hwgeneral.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.Resource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d09dab1f-3b61-4cd2-aa28-d4a79aac657f")
public class HwResource_Class extends Resource_Class {
    @objid ("e8d6cfba-cbf4-4cc8-95b8-d409c6ea2431")
    public HwResource_Class() {
        super( MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
        ModelUtils.setStereotype(this.element, MARTEDesignerStereotypes.HWRESOURCE_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWRESOURCE_CLASSIFIER));
    }

    @objid ("77e43a6f-1bb4-43b0-b974-94ad494f4589")
    public HwResource_Class(Class element) {
        super(element);
    }

    @objid ("5e067243-2217-4c9b-a241-9d66b5a6ecfa")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_DESCRIPTION, this.element);
    }

    @objid ("f12549f4-e776-4775-a99d-87e9a5dd2eb9")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_DESCRIPTION, value);
    }

    @objid ("5b9b645f-a240-4860-8a04-27d0e64892ae")
    public String getp_hw_services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_P_HW_SERVICES, this.element);
    }

    @objid ("950fbb67-0d65-4fa3-8db1-b325249301a6")
    public void setp_hw_services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_P_HW_SERVICES, value);
    }

    @objid ("21421bef-03e8-41b5-9dca-2d7f01b3d866")
    public String getr_hw_services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_R_HW_SERVICES, this.element);
    }

    @objid ("c906fa97-7b98-4c17-b68a-a140d281dd59")
    public void setr_hw_services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_R_HW_SERVICES, value);
    }

    @objid ("960630c6-f90c-42a0-a34e-fced5e228042")
    public String getownedhw() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_OWNEDHW, this.element);
    }

    @objid ("399cfdd7-4dc1-41dd-81ac-d3621759aa3a")
    public void setownedhw(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_OWNEDHW, value);
    }

    @objid ("6b58ea9d-04ab-4fb0-89e6-0cef134acff0")
    public String getfrequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_FREQUENCY, this.element);
    }

    @objid ("26207672-66f3-472d-8fa1-b95ad6a7b21a")
    public void setfrequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_FREQUENCY, value);
    }

    @objid ("f135e296-8c23-490c-84b1-2e2b0f378549")
    public String getendpoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_ENDPOINTS, this.element);
    }

    @objid ("35bc01eb-48b3-4b4b-98ee-0e4d5415a365")
    public void setendpoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_ENDPOINTS, value);
    }

}
