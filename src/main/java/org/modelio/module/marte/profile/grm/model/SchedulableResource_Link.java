package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1ce5bdde-05d3-4f24-ade8-1bc0ef615dd7")
public class SchedulableResource_Link {
    @objid ("6a15ee66-c169-49be-9105-ab21a1ae1145")
    protected Link element;

    @objid ("a4ac0f3c-6271-4317-a6b9-419740260951")
    public SchedulableResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULABLERESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("SchedulableResource_Link"));
    }

    @objid ("f4c81137-330c-4568-a768-0745ab5a7593")
    public SchedulableResource_Link(final Link element) {
        this.element = element;
    }

    @objid ("26db1a15-c87c-452e-a66f-54a8c0d5bfa8")
    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("2c60f2c4-80fa-48cf-bea6-c4ccc364b83a")
    public Link getElement() {
        return this.element;
    }

    @objid ("bb10b6f9-da3e-415b-9427-1b388072eea3")
    public String getschedParams() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LINK_SCHEDULABLERESOURCE_LINK_SCHEDPARAMS, this.element);
    }

    @objid ("87103d1a-7661-4f6c-a800-98bec24ca67a")
    public void setschedParams(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LINK_SCHEDULABLERESOURCE_LINK_SCHEDPARAMS, value);
    }

    @objid ("ae2e5050-26c8-4d8b-a525-5cbee0c26995")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LINK_SCHEDULABLERESOURCE_LINK_HOST, this.element);
    }

    @objid ("bc5832bb-fd81-44b3-89a0-ae2448f057bc")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LINK_SCHEDULABLERESOURCE_LINK_HOST, value);
    }

    @objid ("3ddcbc40-6ef2-48db-b9e6-ad435c4583fb")
    public String getdependentScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LINK_SCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER, this.element);
    }

    @objid ("05f876a9-71bc-4036-b1c1-b4894ccf9768")
    public void setdependentScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LINK_SCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER, value);
    }

}
