package org.modelio.module.marte.profile.grm.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2ef33bee-d605-4a1d-8192-52d9d7300c23")
public class SchedulableResource_Class extends Resource_Class {
    @objid ("b6689b3a-7307-44ec-a218-5a40b3d41829")
    public SchedulableResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULABLERESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SCHEDULABLERESOURCE_CLASSIFIER));
    }

    @objid ("89d350a9-c7cb-4e7c-9749-10d56f27f40a")
    public SchedulableResource_Class(final Class element) {
        super(element);
    }

    @objid ("ca88df49-a078-4ecf-88a5-ebe5a6b43c6f")
    public List<String> getschedParams() {
        return ModelUtils.getTaggedValues(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_CLASSIFIER_SCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS, this.element);
    }

    @objid ("12c2283d-7f2e-4a55-ae04-1dc3e3fe97b3")
    public void addschedParams(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_CLASSIFIER_SCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS, value);
    }

    @objid ("567ce26c-335d-453d-bb69-12c13334d588")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_CLASSIFIER_SCHEDULABLERESOURCE_CLASSIFIER_HOST, this.element);
    }

    @objid ("96082892-6068-4b6d-bddc-230612e13db8")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDULABLERESOURCE_INSTANCE_HOST, value);
    }

    @objid ("430158e9-6c54-437d-9066-faaabb829bc9")
    public String getdependentScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER, this.element);
    }

    @objid ("16e26a1c-eb2a-4f35-967e-5dc391328d2a")
    public void setdependentScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER, value);
    }

}
