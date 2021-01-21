package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("38ca535f-7e8d-484e-915c-1889b35f1af1")
public class PpUnit_Actor {
    @objid ("ae4602b9-b1bb-4f5e-bd29-9577927a1fa9")
    protected Actor element;

    @objid ("ba594f4d-3ca8-41aa-bb00-99f559fe8e7d")
    public PpUnit_Actor() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createActor();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PPUNIT_ACTOR);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PPUNIT_ACTOR));
    }

    @objid ("b9506fb1-69a0-4021-bfcc-d6156755e5d3")
    public PpUnit_Actor(Actor element) {
        this.element = element;
    }

    @objid ("0cf1efa5-cb70-4cb7-97d9-dfddd7036b89")
    public Actor getElement() {
        return this.element;
    }

    @objid ("011c148f-4510-4a9c-b495-eff8089dbfdc")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("dce6bcfc-eb28-4f29-9428-3a36763724c4")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("786f1fee-24d9-4255-8355-70bd71d8ff84")
    public String getconcPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_ACTOR_PPUNIT_ACTOR_CONCPOLICY, this.element);
    }

    @objid ("6f534dac-7f30-4574-8446-bc0f0d187743")
    public void setconcPolicy(String value) {
        if(MARTEEnumerationUtils.isCallConcurrencyKind(value)){
            ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PPUNIT_ACTOR_PPUNIT_ACTOR_CONCPOLICY, value);
        }
    }

    @objid ("56531b36-e5bd-41f2-b0f9-1c671dcc1fb1")
    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_ACTOR_PPUNIT_ACTOR_MEMORYSIZE, this.element);
    }

    @objid ("03e05ea1-079d-4896-bd75-5f088d633e77")
    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PPUNIT_ACTOR_PPUNIT_ACTOR_MEMORYSIZE, value);
    }

}
