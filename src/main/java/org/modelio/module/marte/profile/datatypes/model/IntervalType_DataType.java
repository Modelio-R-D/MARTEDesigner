package org.modelio.module.marte.profile.datatypes.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("bd3dcc6d-2fb0-439f-90c7-b498b45db056")
public class IntervalType_DataType {
    @objid ("3d85c1d2-7b4b-4e88-b180-b3ba067b92dd")
    protected DataType element;

    @objid ("516dc156-0605-461a-a31c-8466af43f889")
    public IntervalType_DataType() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDataType();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.INTERVALTYPE_DATATYPE);
        this.element.setName(MARTEResourceManager.getName("IntervalType_DataType"));
    }

    @objid ("681ac5d3-df74-4482-a0f8-4f8e1fb330c2")
    public IntervalType_DataType(DataType element) {
        this.element = element;
    }

    @objid ("3b83b254-4f6f-4655-b55b-be6ef534b7b5")
    public DataType getElement() {
        return this.element;
    }

    @objid ("ee20e210-3bc3-4a58-bf1e-981f79c291d1")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("0093cd87-3839-43b8-86d8-320df9f874d6")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
