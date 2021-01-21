package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("01fb9998-7385-4282-8095-01b41ce55812")
public class StorageResource_Parameter extends Resource_Parameter {
    @objid ("47b947e0-2c81-43db-b315-41aa864fec0b")
    public StorageResource_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.STORAGERESOURCE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("StorageResource_Parameter"));
    }

    @objid ("be16f021-bea9-432a-ab4a-acb6743abe8c")
    public StorageResource_Parameter(final Parameter element) {
        super(element);
    }

    @objid ("5627afe2-761e-4cba-a364-8aa3874cf550")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_PARAMETER_STORAGERESOURCE_PARAMETER_ELEMENTSIZE, this.element);
    }

    @objid ("672e4ec4-4332-4357-90bd-3d08adb99204")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.STORAGERESOURCE_PARAMETER_STORAGERESOURCE_PARAMETER_ELEMENTSIZE, value);
    }

}
