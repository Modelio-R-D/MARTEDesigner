package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ed7d0f14-4080-4011-9b80-e83acfde1e8e")
public class HwArbiter_Attribute extends HwCommunicationResource_Attribute {
    @objid ("4259dc51-c6d4-4b6b-bf61-d0682f2953f6")
    public HwArbiter_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWARBITER_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwArbiter_Attribute"));
    }

    @objid ("762acedf-99ed-40f2-ba58-3c570aeceba5")
    public HwArbiter_Attribute(Attribute element) {
        super(element);
    }

    @objid ("693eb6cb-2956-49e8-8f99-ff2894afe952")
    public String getcontrolledMedias() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWARBITER_ATTRIBUTE_HWARBITER_ATTRIBUTE_CONTROLLEDMEDIAS, this.element);
    }

    @objid ("4ece104b-5a9c-40ca-8b17-13435bb39166")
    public void setcontrolledMedias(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWARBITER_ATTRIBUTE_HWARBITER_ATTRIBUTE_CONTROLLEDMEDIAS, value);
    }

    @objid ("2fba44db-71a4-4d61-80c8-ed0d5a2b6ec9")
    public Attribute getElement() {
        return this.element;
    }

}
