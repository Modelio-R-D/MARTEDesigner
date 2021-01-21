package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e01d2748-0f98-45ab-bfe2-46d11c5e587b")
public class ComputingResource_Class extends ProcessingResource_Class {
    @objid ("2f041a79-0f52-46e0-b63d-b19ed4e204e0")
    public ComputingResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMPUTINGRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.COMPUTINGRESOURCE_CLASSIFIER));
    }

    @objid ("e4e39886-71e5-4bf4-a30c-8e7278a5e6d6")
    public ComputingResource_Class(final Class element) {
        super(element);
    }

}
