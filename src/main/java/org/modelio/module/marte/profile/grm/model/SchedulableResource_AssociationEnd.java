package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("642466d0-e0f4-4e30-bce0-31389ea0143e")
public class SchedulableResource_AssociationEnd extends Resource_AssociationEnd {
    @objid ("f4cbdae6-e527-4cbf-9b63-1be4a3fd4b18")
    public SchedulableResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("SchedulableResource_AssociationEnd"));
    }

    @objid ("02dbb031-8e1e-4a93-815f-e4b6a06eff20")
    public SchedulableResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

    @objid ("a73ba796-6944-49ec-86a3-a23040f442f4")
    public String getschedParams() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS, this.element);
    }

    @objid ("79d5def0-6ab4-4484-8e6f-eaeb61fa3f0d")
    public void setschedParams(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS, value);
    }

    @objid ("a8af2e25-721f-4193-af04-e470c6f6a461")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULABLERESOURCE_ASSOCIATIONEND_HOST, this.element);
    }

    @objid ("41b3d56d-95ae-4d3a-aefe-7b0d9b78cabb")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULABLERESOURCE_ASSOCIATIONEND_HOST, value);
    }

    @objid ("26e86934-6f9c-47e9-af69-2660c7edd8ee")
    public String getdependentScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER, this.element);
    }

    @objid ("b837d613-2421-49ed-aa95-96ad7e724f21")
    public void setdependentScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER, value);
    }

}
