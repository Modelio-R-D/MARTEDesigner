package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2d84844f-c04b-4a21-8e9d-fd9c8908e706")
public class ProcessingResource_Instance extends Resource_Instance {
    @objid ("8f0806f7-444d-4a1b-b594-cdd754f724df")
    public ProcessingResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PROCESSINGRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("ProcessingResource_Instance"));
    }

    @objid ("54000b6e-19f7-45b6-9f25-b60c7be91cf6")
    public ProcessingResource_Instance(final Instance element) {
        super(element);
    }

    @objid ("39c6e991-29b0-4e0d-83f5-4cf15b286637")
    public String getspeedFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_INSTANCE_PROCESSINGRESOURCE_INSTANCE_SPEEDFACTOR, this.element);
    }

    @objid ("a266916d-8105-4ef5-86c4-1951229e4225")
    public void setspeedFactor(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_INSTANCE_PROCESSINGRESOURCE_INSTANCE_SPEEDFACTOR, value);
    }

}
