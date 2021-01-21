package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("51f42d16-3e51-407e-b185-05adb528ec85")
public class ClockResource_Class extends TimingResource_Class {
    @objid ("f742ea24-c06c-43aa-b697-9a755436310d")
    public ClockResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.CLOCKRESOURCE_CLASSIFIER));
    }

    @objid ("e3388f96-c3c6-4bd6-b71f-9eb0096aed34")
    public ClockResource_Class(final Class element) {
        super(element);
    }

}
