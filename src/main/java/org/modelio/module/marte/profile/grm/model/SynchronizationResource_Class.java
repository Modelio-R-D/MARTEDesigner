package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7d81d6a7-d665-4832-a628-38b06488c4c4")
public class SynchronizationResource_Class extends Resource_Class {
    @objid ("c5961703-9c6f-4e3a-8e31-6e96e4a21adf")
    public SynchronizationResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SYNCHRONIZATIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SYNCHRONIZATIONRESOURCE_CLASSIFIER));
    }

    @objid ("418f4a4f-4035-43b1-a97e-3f913192f2e3")
    public SynchronizationResource_Class(final Class element) {
        super(element);
    }

}
