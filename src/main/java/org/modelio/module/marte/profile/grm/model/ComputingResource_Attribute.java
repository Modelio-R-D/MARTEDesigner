package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("73e94de7-28bb-43cb-a8f2-ea7af37ea9a7")
public class ComputingResource_Attribute extends MutualExclusionResource_Attribute {
    @objid ("71615d9b-d277-478d-9ea4-9ef1dd5561fb")
    public ComputingResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMPUTINGRESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("ComputingResource_Attribute"));
    }

    @objid ("9da438ef-53e4-4b26-940a-06a1d3383f1b")
    public ComputingResource_Attribute(final Attribute element) {
        super(element);
    }

}
