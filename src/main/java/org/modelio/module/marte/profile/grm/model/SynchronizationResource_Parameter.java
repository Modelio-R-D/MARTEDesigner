package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("af2b5a6f-8eba-44b7-a1d4-a28dacdc006c")
public class SynchronizationResource_Parameter extends Resource_Parameter {
    @objid ("83fc0554-23af-433f-8e80-9f45da17cc02")
    public SynchronizationResource_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SYNCHRONIZATIONRESOURCE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("SynchronizationResource_Parameter"));
    }

    @objid ("77ebd30b-1b22-4e85-b9ba-b0e7960115b0")
    public SynchronizationResource_Parameter(final Parameter element) {
        super(element);
    }

}
