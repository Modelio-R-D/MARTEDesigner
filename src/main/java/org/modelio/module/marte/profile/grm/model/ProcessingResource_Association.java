package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b42ca672-e2cf-4903-a95c-85a01b6b1f28")
public class ProcessingResource_Association {
    @objid ("14b911d8-e1e8-4642-ab3e-13fd2de2aa56")
    protected Association element;

    @objid ("b0d9cc53-e02e-40be-aaa0-ef3eb3af2339")
    public ProcessingResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PROCESSINGRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("ProcessingResource_Association"));
    }

    @objid ("bf2dc952-91cc-44cd-beda-ec3129754b6f")
    public ProcessingResource_Association(final Association element) {
        this.element = element;
    }

    @objid ("71a56171-f57a-4d16-a76e-07774cb0342c")
    public void setParent(final AssociationEnd source, final AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("72e83932-bff5-4713-a432-fe4921d81e39")
    public Association getElement() {
        return this.element;
    }

    @objid ("9340dc80-b9e7-4652-8539-91e443477c9e")
    public String getspeedFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATION_PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR, this.element);
    }

    @objid ("420ad818-d923-48d3-ac5d-356334c8fa54")
    public void setspeedFactor(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATION_PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR, value);
    }

    @objid ("3ab29420-656a-40f6-8a49-9d04f135be9d")
    public String getmainScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATION_PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER, this.element);
    }

    @objid ("f761d4b0-322b-4740-a087-55069919c7e1")
    public void setmainScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATION_PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER, value);
    }

}
