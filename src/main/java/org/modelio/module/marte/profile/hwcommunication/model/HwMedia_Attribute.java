package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("05aa291e-b69d-4bb2-9d9e-2bba82a95520")
public class HwMedia_Attribute extends HwCommunicationResource_Attribute {
    @objid ("d5c87b46-4fed-4ebe-b97f-81340bcacbf6")
    public HwMedia_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEDIA_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwMedia_Attribute"));
    }

    @objid ("33cda1d1-f373-4f03-b647-40f139231a3e")
    public HwMedia_Attribute(Attribute element) {
        super(element);
    }

    @objid ("e4cdffc1-3501-409c-9cb1-158ee56f18e2")
    public String getarbiters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEDIA_ATTRIBUTE_HWMEDIA_ATTRIBUTE_ARBITERS, this.element);
    }

    @objid ("035f0f81-ffbd-4eee-b57e-9b9b4ed4f0d1")
    public void setarbiters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEDIA_ATTRIBUTE_HWMEDIA_ATTRIBUTE_ARBITERS, value);
    }

}
