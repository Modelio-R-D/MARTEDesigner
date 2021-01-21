package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("cdb5562f-36f9-4c49-a459-b5d2f8da6861")
public class ComputingResource_BindableInstance extends ProcessingResource_BindableInstance {
    @objid ("6d9cb62f-1d15-40db-9f19-79d966803a9b")
    public ComputingResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMPUTINGRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("ComputingResource_BindableInstance"));
    }

    @objid ("296c73e5-c5c8-4ce9-999d-677604dec640")
    public ComputingResource_BindableInstance(final BindableInstance element) {
        super(element);
    }

}
