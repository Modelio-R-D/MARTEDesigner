package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0431b818-a0f0-4c6f-a37e-54b95b0698b0")
public class ProcessingResource_AssociationEnd extends Resource_AssociationEnd {
    @objid ("7b6546b8-f72e-445f-98ee-c115e7ebdb57")
    public ProcessingResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PROCESSINGRESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("ProcessingResource_AssociationEnd"));
    }

    @objid ("f0db02e9-1461-411c-989c-aff2474494ec")
    public ProcessingResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

    @objid ("03da3c87-7766-428a-9353-04a573ef6be5")
    public String getspeedFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATIONEND_PROCESSINGRESOURCE_ASSOCIATIONEND_SPEEDFACTOR, this.element);
    }

    @objid ("69d915c5-e3b2-47eb-9dc8-cb62be19cbfc")
    public void setspeedFactor(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATIONEND_PROCESSINGRESOURCE_ASSOCIATIONEND_SPEEDFACTOR, value);
    }

    @objid ("fca2a21a-b6cb-462f-a683-08817a9c18c7")
    public String getmainScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATIONEND_PROCESSINGRESOURCE_ASSOCIATIONEND_MAINSCHEDULER, this.element);
    }

    @objid ("8c6d01b0-1106-4243-8c4d-35483fe422ba")
    public void setmainScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATIONEND_PROCESSINGRESOURCE_ASSOCIATIONEND_MAINSCHEDULER, value);
    }

}
