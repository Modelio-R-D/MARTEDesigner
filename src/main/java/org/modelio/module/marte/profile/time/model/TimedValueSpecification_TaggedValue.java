package org.modelio.module.marte.profile.time.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b48c77d8-d23c-46ef-8639-74fbb6132b65")
public class TimedValueSpecification_TaggedValue {
    @objid ("3a5ad065-7cd5-411d-a156-51c761f10451")
    protected TaggedValue element;

    @objid ("348957cb-c942-4416-a77b-9d50bee44961")
    public TimedValueSpecification_TaggedValue() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE);
        this.element.setName(MARTEResourceManager.getName("TimedValueSpecification_TaggedValue")+ModelUtils.getNbElement(TaggedValue.class, MARTEDesignerStereotypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE));
    }

    @objid ("d0727e5a-54ab-4147-9fc1-f6034096cc6e")
    public TimedValueSpecification_TaggedValue(TaggedValue element) {
        this.element = element;
    }

    @objid ("e56013ca-8163-44ad-a43d-0e31bbe78579")
    public TaggedValue getElement() {
        return this.element;
    }

    @objid ("a6014f56-dcb9-4ea2-91c4-03517caf8ad6")
    public void setParent(ModelElement parent) {
        this.element.setAnnoted(parent);
    }

    @objid ("44555513-683d-4647-b0fd-07d12c7d0dff")
    public String getinterpretation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION, this.element);
    }

    @objid ("9d67a65f-1af7-40d4-85d0-7949c2118644")
    public void setinterpretation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION, value);
    }

    @objid ("28ec75b0-ba05-4476-a947-429ad5e85ab1")
    public List<TimedElement> getTimedElement() {
        List<TimedElement> res = new java.util.ArrayList<>();        
        for(Dependency dep : this.element.getDependsOnDependency()){
            res.add(new TimedElement(dep));
        }
        return res;
    }

}
