package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2d13ba10-7ea0-4de2-883e-a54867aab150")
public class ConcurrencyResource_Parameter extends Resource_Parameter {
    @objid ("009ec387-fde7-41ab-8f88-c99f52bc71c3")
    public ConcurrencyResource_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONCURRENCYRESOURCE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("ConcurrencyResource_Parameter"));
    }

    @objid ("ac8bef01-5cf7-4070-b0d2-771f2551dabf")
    public ConcurrencyResource_Parameter(final Parameter element) {
        super(element);
    }

}
