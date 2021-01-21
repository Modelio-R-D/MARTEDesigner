package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("149b6c2c-ce87-464f-9f0f-ef6890a15be7")
public class ConcurrencyResource_Class extends SchedulableResource_Class {
    @objid ("10a3511b-803b-4dd3-a294-222db701fe4f")
    public ConcurrencyResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONCURRENCYRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.CONCURRENCYRESOURCE_CLASSIFIER));
    }

    @objid ("9f9c20a1-1fe1-46a7-b3c2-7b0b1e114a22")
    public ConcurrencyResource_Class(final Class element) {
        super(element);
    }

}
