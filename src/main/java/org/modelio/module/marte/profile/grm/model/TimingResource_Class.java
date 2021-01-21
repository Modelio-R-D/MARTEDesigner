package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0d6883c9-8097-4509-a870-c1c4e9f0c45f")
public class TimingResource_Class extends Resource_Class {
    @objid ("4dc98798-3eef-4605-aca5-974057978c1c")
    public TimingResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMINGRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.TIMINGRESOURCE_CLASSIFIER));
    }

    @objid ("d75c7c21-309e-4260-ac2f-41e4e3741c31")
    public TimingResource_Class(final Class element) {
        super(element);
    }

}
