package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5a6a5f08-0a4f-42d1-b48b-0116738d4efc")
public class TimingResource_Parameter extends Resource_Parameter {
    @objid ("2656f3a7-c7ea-4fb4-a7d9-ccc84c7eceeb")
    public TimingResource_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMINGRESOURCE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("TimingResource_Parameter"));
    }

    @objid ("11a06f26-9eab-4326-bdc1-68c98796daa5")
    public TimingResource_Parameter(final Parameter element) {
        super(element);
    }

}
