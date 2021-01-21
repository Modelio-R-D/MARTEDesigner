package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("aa0ee9a4-9012-4519-b08b-d684e89c9adf")
public class HwBridge_Attribute extends HwMedia_Attribute {
    @objid ("65943cff-719a-4b1d-8117-841192e2081e")
    public HwBridge_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwBridge_Attribute"));
    }

    @objid ("3364df1a-0c7d-4784-a490-bb82ac0815c9")
    public HwBridge_Attribute(Attribute element) {
        super(element);
    }

    @objid ("53cb2fc6-b22c-44ca-91db-601e95448ddf")
    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_ATTRIBUTE_HWBRIDGE_ATTRIBUTE_SIDES, this.element);
    }

    @objid ("b73f95c9-cc07-401d-b977-751303f46769")
    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_ATTRIBUTE_HWBRIDGE_ATTRIBUTE_SIDES, value);
    }

    @objid ("a080c400-f613-4d3a-8e7c-5770e27711d3")
    public Attribute getElement() {
        return this.element;
    }

}
