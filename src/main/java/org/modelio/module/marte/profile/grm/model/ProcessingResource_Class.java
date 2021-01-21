package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("51372ca6-8ca4-4a69-9864-16d1eebc3166")
public class ProcessingResource_Class extends Resource_Class {
    @objid ("5e7af378-93ac-4e96-b474-04cebc0c8ee1")
    public ProcessingResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PROCESSINGRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PROCESSINGRESOURCE_CLASSIFIER));
    }

    @objid ("28a86737-4ff7-45e2-aa90-95fb4c0b7251")
    public ProcessingResource_Class(final Class element) {
        super(element);
    }

    @objid ("2fb8211c-0e11-45fa-bfeb-bbfc04ed4803")
    public String getspeedFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_SPEEDFACTOR, this.element);
    }

    @objid ("801f83ca-2826-4e5a-a930-8ccdba37cbda")
    public void setspeedFactor(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_SPEEDFACTOR, value);
    }

}
