package org.modelio.module.marte.profile.time.model;

import java.util.List;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimedValueSpecification_TaggedValue {
    protected TaggedValue element;

    public TimedValueSpecification_TaggedValue() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE);
        this.element.setName(MARTEResourceManager.getName("TimedValueSpecification_TaggedValue")+ModelUtils.getNbElement(TaggedValue.class, MARTEDesignerStereotypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE));
    }

    public TimedValueSpecification_TaggedValue(TaggedValue element) {
        this.element = element;
    }

    public TaggedValue getElement() {
        return this.element;
    }

    public void setParent(ModelElement parent) {
        this.element.setAnnoted(parent);
    }

    public String getinterpretation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION, this.element);
    }

    public void setinterpretation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION, value);
    }

    public List<TimedElement> getTimedElement() {
        List<TimedElement> res = new java.util.ArrayList<>();        
        for(Dependency dep : this.element.getDependsOnDependency()){
            res.add(new TimedElement(dep));
        }
        return res;
    }

}
