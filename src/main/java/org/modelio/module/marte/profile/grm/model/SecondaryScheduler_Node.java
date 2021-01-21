package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1820e643-4a2a-4bbf-adba-2f930359b1d6")
public class SecondaryScheduler_Node extends Scheduler_Node {
    @objid ("fa4c7337-cb0b-429b-a187-8d6e932da522")
    public SecondaryScheduler_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SECONDARYSCHEDULER_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SECONDARYSCHEDULER_CLASSIFIER));
        this.isisPreemptible(true);
    }

    @objid ("35b4818a-71c1-48c6-8d67-72d28215cca3")
    public SecondaryScheduler_Node(final Node element) {
        super(element);
    }

    @objid ("a9125462-536a-4e27-b8ef-19401eed315e")
    public String getSecondaryScheduler_Node_() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SECONDARYSCHEDULER_CLASSIFIER_SECONDARYSCHEDULER_CLASSIFIER_VIRTUALPROCESSINGUNITS, this.element);
    }

    @objid ("90266d55-2025-41e7-9bad-9d8052d6a14b")
    public void setSecondaryScheduler_Node_(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SECONDARYSCHEDULER_CLASSIFIER_SECONDARYSCHEDULER_CLASSIFIER_VIRTUALPROCESSINGUNITS, value);
    }

}
