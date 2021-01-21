package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0cadb34d-8c08-4ddd-8191-c059a171259b")
public class ComputingResource_Parameter extends ProcessingResource_Parameter {
    @objid ("ceabc247-a1f6-43d2-916c-0676e6ffc38c")
    public ComputingResource_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMPUTINGRESOURCE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("ComputingResource_Parameter"));
    }

    @objid ("329bd38e-ab8b-4fd9-8c28-eee5e29e83b4")
    public ComputingResource_Parameter(final Parameter element) {
        super(element);
    }

}
