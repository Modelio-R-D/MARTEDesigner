/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.infrastructure.taggedvalue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link TaggedValue} with << TimedValueSpecification_TaggedValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class TimedValueSpecificationTaggedValue {
    public static final String STEREOTYPE_NAME = "TimedValueSpecification_TaggedValue";

    public static final String TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION_TAGTYPE = "TimedValueSpecification_TaggedValue_interpretation";

    public static final String TIMEDVALUESPECIFICATION_TAGGEDVALUE_ON_TAGTYPE = "TimedValueSpecification_TaggedValue_on";

    /**
     * The underlying {@link TaggedValue} represented by this proxy, never null.
     */
    protected final TaggedValue elt;

    /**
     * Tells whether a {@link TimedValueSpecificationTaggedValue proxy} can be instantiated from a {@link MObject} checking it is a {@link TaggedValue} stereotyped << TimedValueSpecification_TaggedValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof TaggedValue) && ((TaggedValue) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedValueSpecificationTaggedValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link TaggedValue} stereotyped << TimedValueSpecification_TaggedValue >> then instantiate a {@link TimedValueSpecificationTaggedValue} proxy.
     * 
     * @return a {@link TimedValueSpecificationTaggedValue} proxy on the created {@link TaggedValue}.
     */
    public static TimedValueSpecificationTaggedValue create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.TaggedValue");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedValueSpecificationTaggedValue.STEREOTYPE_NAME);
        return TimedValueSpecificationTaggedValue.instantiate((TaggedValue)e);
    }

    /**
     * Tries to instantiate a {@link TimedValueSpecificationTaggedValue} proxy from a {@link TaggedValue} stereotyped << TimedValueSpecification_TaggedValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a TaggedValue
     * @return a {@link TimedValueSpecificationTaggedValue} proxy or <i>null</i>.
     */
    public static TimedValueSpecificationTaggedValue instantiate(final TaggedValue obj) {
        return TimedValueSpecificationTaggedValue.canInstantiate(obj) ? new TimedValueSpecificationTaggedValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimedValueSpecificationTaggedValue} proxy from a {@link TaggedValue} stereotyped << TimedValueSpecification_TaggedValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link TaggedValue}
     * @return a {@link TimedValueSpecificationTaggedValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static TimedValueSpecificationTaggedValue safeInstantiate(final TaggedValue obj) throws IllegalArgumentException {
        if (TimedValueSpecificationTaggedValue.canInstantiate(obj))
        	return new TimedValueSpecificationTaggedValue(obj);
        else
        	throw new IllegalArgumentException("TimedValueSpecificationTaggedValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TimedValueSpecificationTaggedValue other = (TimedValueSpecificationTaggedValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link TaggedValue}. 
     * @return the TaggedValue represented by this proxy, never null.
     */
    public TaggedValue getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'TimedValueSpecification_TaggedValue_interpretation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimedValueSpecification_TaggedValue_interpretation() {
        return this.elt.getTagValue(TimedValueSpecificationTaggedValue.MdaTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'TimedValueSpecification_TaggedValue_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getTimedValueSpecification_TaggedValue_on() {
        return this.elt.getTagValues(TimedValueSpecificationTaggedValue.MdaTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_ON_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'TimedValueSpecification_TaggedValue_interpretation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedValueSpecification_TaggedValue_interpretation(final String value) {
        this.elt.putTagValue(TimedValueSpecificationTaggedValue.MdaTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'TimedValueSpecification_TaggedValue_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedValueSpecification_TaggedValue_on(final List<String> values) {
        this.elt.putTagValues(TimedValueSpecificationTaggedValue.MdaTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_ON_TAGTYPE_ELT, values);
    }

    protected TimedValueSpecificationTaggedValue(final TaggedValue elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION_TAGTYPE_ELT;

        public static TagType TIMEDVALUESPECIFICATION_TAGGEDVALUE_ON_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "db341e70-0cce-11df-8525-001302895b2b");
            TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db3680c0-0cce-11df-8525-001302895b2b");
            TIMEDVALUESPECIFICATION_TAGGEDVALUE_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d78b17d0-c7fd-11e0-9823-0027103f347c");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
