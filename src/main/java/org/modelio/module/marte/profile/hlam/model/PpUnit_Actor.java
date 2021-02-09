package org.modelio.module.marte.profile.hlam.model;

import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class PpUnit_Actor {
    protected Actor element;

    public PpUnit_Actor() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createActor();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PPUNIT_ACTOR);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PPUNIT_ACTOR));
    }

    public PpUnit_Actor(Actor element) {
        this.element = element;
    }

    public Actor getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getconcPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_ACTOR_PPUNIT_ACTOR_CONCPOLICY, this.element);
    }

    public void setconcPolicy(String value) {
        if(MARTEEnumerationUtils.isCallConcurrencyKind(value)){
            ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PPUNIT_ACTOR_PPUNIT_ACTOR_CONCPOLICY, value);
        }
    }

    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_ACTOR_PPUNIT_ACTOR_MEMORYSIZE, this.element);
    }

    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PPUNIT_ACTOR_PPUNIT_ACTOR_MEMORYSIZE, value);
    }

}
