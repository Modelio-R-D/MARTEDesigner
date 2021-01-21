package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e1cb3067-0ce8-47c3-8742-4cf2ecfc531c")
public class RtFeature_Operation {
    @objid ("e2462e00-cb5d-46e0-a874-ee9e157fd1e1")
    protected Operation element;

    @objid ("0be14550-5f62-40b6-a2ca-88159a21fd79")
    public RtFeature_Operation() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTFEATURE_OPERATION);
        this.element.setName(MARTEResourceManager.getName("RtFeature_Operation"));
    }

    @objid ("6ac1fc7b-882e-40ad-b316-8fa290c8c389")
    public RtFeature_Operation(Operation element) {
        this.element = element;
    }

    @objid ("791414d0-6e06-4ea5-ac5b-2dfea66bca35")
    public Operation getElement() {
        return this.element;
    }

    @objid ("a877e790-7730-499f-b9e8-8bc03eee3bce")
    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("b5f10b80-1df2-46a1-92e1-5049c9604d8c")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
