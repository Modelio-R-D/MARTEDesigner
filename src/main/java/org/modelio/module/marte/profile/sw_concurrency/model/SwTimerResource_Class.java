package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.TimerResource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d007b769-b5d3-4709-8356-4cdcdbde1a69")
public class SwTimerResource_Class extends TimerResource_Class {
    @objid ("edab9cc9-9d54-48ca-8b42-398ab218a49c")
    public SwTimerResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWTIMERRESOURCE_CLASSIFIER);
        element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWTIMERRESOURCE_CLASSIFIER));
    }

    @objid ("fd93b6e1-09a7-4aab-94e6-84dccc7985f1")
    public SwTimerResource_Class(Class element) {
        super(element);
    }

}
