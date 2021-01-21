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

@objid ("49029f64-e763-43d8-ba27-13fe0d950c59")
public class SecondaryScheduler_Link extends Scheduler_Link {
    @objid ("7a0fa4f3-7a6b-48c0-a0c5-4fbcd8ed52c4")
    protected Link element;

    @objid ("36b744bc-61ac-49f4-b89b-4567c22768c2")
    public SecondaryScheduler_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SECONDARYSCHEDULER_LINK);
        this.element.setName(MARTEResourceManager.getName("SecondaryScheduler_Link"));
        this.isisPreemptible(true);
    }

    @objid ("a41d3c27-bb45-4c9c-8a50-3688cab40033")
    public SecondaryScheduler_Link(final Link element) {
        this.element = element;
    }

    @objid ("8f4e5b00-3afa-4b4a-9e3f-096d743d245b")
    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("3b2fd21d-0a0d-47c6-b7b7-910d2b35a5f1")
    public Link getElement() {
        return this.element;
    }

    @objid ("4fa13227-5d11-4ae1-9850-a950959ab4e5")
    public String getSecondaryScheduler_Link_virtualProcessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SECONDARYSCHEDULER_LINK_SECONDARYSCHEDULER_LINK_VIRTUALPROCESSINGUNITS, this.element);
    }

    @objid ("9848fc73-50f6-41d8-a524-a0cc17a9bc64")
    public void setSecondaryScheduler_Link_virtualProcessingUnits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SECONDARYSCHEDULER_LINK_SECONDARYSCHEDULER_LINK_VIRTUALPROCESSINGUNITS, value);
    }

}
