package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("bcc51732-cfd1-4744-a5e1-4fe1ad571e45")
public class ProcessingResource_Attribute extends Resource_Attribute {
    @objid ("a10787be-0e20-4609-a078-ab7f8c5f0b63")
    public ProcessingResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PROCESSINGRESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("ProcessingResource_Attribute"));
    }

    @objid ("e04b3ded-7379-461f-972e-6fa8bd2fe828")
    public ProcessingResource_Attribute(final Attribute element) {
        super(element);
    }

    @objid ("be59d31e-b02b-4af9-b191-ad9335145cb3")
    public String getspeedFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_ATTRIBUTE_PROCESSINGRESOURCE_ATTRIBUTE_SPEEDFACTOR, this.element);
    }

    @objid ("5959a27f-5d7a-4e69-89e5-2f8e9ed3c160")
    public void setspeedFactor(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_ATTRIBUTE_PROCESSINGRESOURCE_ATTRIBUTE_SPEEDFACTOR, value);
    }

    @objid ("a6532054-9f61-4fdb-8e58-abc637e7a0f7")
    public String getmainScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_ATTRIBUTE_PROCESSINGRESOURCE_ATTRIBUTE_MAINSCHEDULER, this.element);
    }

    @objid ("af436635-1232-4067-950c-66f02e7346d8")
    public void setmainScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_ATTRIBUTE_PROCESSINGRESOURCE_ATTRIBUTE_MAINSCHEDULER, value);
    }

}
