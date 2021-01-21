package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("cf66ebb6-eb9b-4fcb-9a3d-90b400e3bc66")
public class ConcurrencyResource_Instance extends Resource_Instance {
    @objid ("a366acfe-7830-4295-a3da-e6b3885fc348")
    public ConcurrencyResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONCURRENCYRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("ConcurrencyResource_Instance"));
    }

    @objid ("40c563f7-11bd-43aa-b56b-c98922c73d20")
    public ConcurrencyResource_Instance(final Instance element) {
        super(element);
    }

}
