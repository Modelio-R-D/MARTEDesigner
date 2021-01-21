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

@objid ("b06d3933-ba51-4586-833c-df75b18d4840")
public class Scheduler_Link {
    @objid ("992763aa-ca48-4592-81f1-595655d26732")
    protected Link element;

    @objid ("1f980fcd-2746-403c-b5f2-756c4afd97d1")
    public Scheduler_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULER_LINK);
        this.element.setName(MARTEResourceManager.getName("Scheduler_Link"));
        this.isisPreemptible(true);
    }

    @objid ("928c92ef-30be-4871-b242-1835093cd689")
    public Scheduler_Link(final Link element) {
        this.element = element;
    }

    @objid ("a081b2a2-bb79-487e-89eb-d04b8baf14ad")
    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("f6f54dca-46dd-4f42-908d-958fb5406b6b")
    public Link getElement() {
        return this.element;
    }

    @objid ("19202c08-e78a-44b8-8198-d465e74b94c7")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_ISPREEMPTIBLE, this.element);
    }

    @objid ("705dc1c2-06f7-46ae-93b5-fd4e16d47419")
    public void isisPreemptible(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_ISPREEMPTIBLE,value);
    }

    @objid ("b01ab9eb-a94f-4acb-a095-b2d63d85a9fb")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_SCHEDPOLICY, this.element);
    }

    @objid ("3bbcdf3e-bf94-41d0-b824-a1052e256683")
    public void setschedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_SCHEDPOLICY, value);
    }

    @objid ("06efcad4-5b54-4726-bb64-71f72a3f69ac")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("8321fc38-91b4-4446-b7c3-85f8b8c13456")
    public void setotherSchedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_OTHERSCHEDPOLICY, value);
    }

    @objid ("63ae62fc-f01e-4739-a3e8-bba92d9e8ac5")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_SCHEDULE, this.element);
    }

    @objid ("e24d7f2e-8b96-4299-841d-21a330bd702d")
    public void setschedule(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_SCHEDULE, value);
    }

    @objid ("69dd7113-5abe-4573-ba24-6855f797f072")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_PROCESSINGUNITS, this.element);
    }

    @objid ("8a2231d7-b862-42fb-bb44-1015adb04ae6")
    public void setprocessingUnits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_PROCESSINGUNITS, value);
    }

    @objid ("9b125451-0b01-4d9c-9f33-85a2c858e03c")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_HOST, this.element);
    }

    @objid ("37b67c08-3dec-43a7-a0c8-9ce7ffc13c2b")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_HOST, value);
    }

    @objid ("0222d9dd-4771-4a2b-a612-666956dc2050")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("94558b26-a028-43c5-a770-f09ff49a43ef")
    public void setprotectedSharedRsources(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("fbbf779f-719e-485c-a8bb-25598d7a77b4")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("bcf1d8d6-57a8-4e48-b12d-e60e66fca330")
    public void setschedulableResources(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_SCHEDULABLERESOURCES, value);
    }

}
