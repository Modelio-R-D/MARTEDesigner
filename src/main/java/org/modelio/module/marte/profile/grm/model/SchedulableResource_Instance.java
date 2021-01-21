package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("17478121-921a-4607-a3ac-4bde75596edb")
public class SchedulableResource_Instance extends Resource_Instance {
    @objid ("db8ee654-8877-42d1-b7af-fcbca1c492d0")
    public SchedulableResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULABLERESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SchedulableResource_Instance"));
    }

    @objid ("ef29caa8-c70b-4a47-b547-bb7dc31f7fbc")
    public SchedulableResource_Instance(final Instance element) {
        super(element);
    }

    @objid ("6d588b63-127b-4f81-818c-0b77eb1781f0")
    public String getschedParams() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS, this.element);
    }

    @objid ("77647ee0-0cbf-4fce-b3a7-ddc37eeac5bd")
    public void setschedParams(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS, value);
    }

}
