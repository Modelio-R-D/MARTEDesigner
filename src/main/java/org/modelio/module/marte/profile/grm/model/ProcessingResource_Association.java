package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ProcessingResource_Association {
    protected Association element;

    public ProcessingResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PROCESSINGRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("ProcessingResource_Association"));
    }

    public ProcessingResource_Association(final Association element) {
        this.element = element;
    }

    public void setParent(final AssociationEnd source, final AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    public Association getElement() {
        return this.element;
    }

    public String getspeedFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATION_PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR, this.element);
    }

    public void setspeedFactor(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATION_PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR, value);
    }

    public String getmainScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATION_PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER, this.element);
    }

    public void setmainScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATION_PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER, value);
    }

}
