package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("eb5b8535-71fe-434f-8d33-d84313f4ea13")
public class StorageResource_Attribute extends Resource_Attribute {
    @objid ("23184b37-4af1-403e-9aee-05e6c290f477")
    public StorageResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.STORAGERESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("StorageResource_Attribute"));
    }

    @objid ("97203320-aa25-400e-9cb7-937eca2db681")
    public StorageResource_Attribute(final Attribute element) {
        super(element);
    }

    @objid ("9646162f-4fd2-4c99-b541-a8e6c098c8cc")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_ATTRIBUTE_STORAGERESOURCE_ATTRIBUTE_ELEMENTSIZE, this.element);
    }

    @objid ("94b9d1c3-eb50-4dd9-86a3-40d4992a3795")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.STORAGERESOURCE_ATTRIBUTE_STORAGERESOURCE_ATTRIBUTE_ELEMENTSIZE, value);
    }

}
