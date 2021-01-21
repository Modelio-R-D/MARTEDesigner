/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.infrastructure.taggedvalue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("c67f622e-fae6-43f5-8658-029c8b420f00")
public class TimedValueSpecificationTaggedValue {
    @objid ("b7ad4dfa-1b48-4072-ad95-b0f5ac369258")
    public static final String STEREOTYPE_NAME = "TimedValueSpecification_TaggedValue";

    @objid ("6d456507-30aa-4dd4-aeef-99f3994a2959")
    public static final String TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION_TAGTYPE = "TimedValueSpecification_TaggedValue_interpretation";

    @objid ("2d60cf05-9f7e-45b9-babf-2776843b4b5a")
    public static final String TIMEDVALUESPECIFICATION_TAGGEDVALUE_ON_TAGTYPE = "TimedValueSpecification_TaggedValue_on";

    /**
     * The underlying {@link TaggedValue} represented by this proxy, never null.
     */
    @objid ("ff635d14-2825-4a32-abea-2371e8a0cb1e")
    protected final TaggedValue elt;

    /**
     * Tells whether a {@link TimedValueSpecificationTaggedValue proxy} can be instantiated from a {@link MObject} checking it is a {@link TaggedValue} stereotyped << TimedValueSpecification_TaggedValue >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e770af2a-e199-4c74-96e0-98af863eadbd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof TaggedValue) && ((TaggedValue) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedValueSpecificationTaggedValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link TaggedValue} stereotyped << TimedValueSpecification_TaggedValue >> then instantiate a {@link TimedValueSpecificationTaggedValue} proxy.
     * 
     * @return a {@link TimedValueSpecificationTaggedValue} proxy on the created {@link TaggedValue}.
     */
    @objid ("91b60780-c3af-474a-bb90-1a97e14eaea4")
    public static TimedValueSpecificationTaggedValue create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("TaggedValue");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedValueSpecificationTaggedValue.STEREOTYPE_NAME);
        return TimedValueSpecificationTaggedValue.instantiate((TaggedValue)e);
    }

    /**
     * Tries to instantiate a {@link TimedValueSpecificationTaggedValue} proxy from a {@link TaggedValue} stereotyped << TimedValueSpecification_TaggedValue >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a TaggedValue
     * @return a {@link TimedValueSpecificationTaggedValue} proxy or <i>null</i>.
     */
    @objid ("c693e62a-4aba-4e9c-8f2f-e95aefb8ebca")
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
    @objid ("ffad7d0f-cd30-4e9b-a324-18ce44633a6f")
    public static TimedValueSpecificationTaggedValue safeInstantiate(final TaggedValue obj) throws IllegalArgumentException {
        if (TimedValueSpecificationTaggedValue.canInstantiate(obj))
        	return new TimedValueSpecificationTaggedValue(obj);
        else
        	throw new IllegalArgumentException("TimedValueSpecificationTaggedValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9a4b7132-bee7-449e-a372-2d8dfb892863")
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
    @objid ("55d0ac26-7c67-4c87-af15-4ab542aa71a0")
    public TaggedValue getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'TimedValueSpecification_TaggedValue_interpretation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9b01ab04-e273-474c-9874-5a8dbec95a3a")
    public String getTimedValueSpecification_TaggedValue_interpretation() {
        return this.elt.getTagValue(TimedValueSpecificationTaggedValue.MdaTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'TimedValueSpecification_TaggedValue_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("63a7bf89-8280-4d70-bf06-5e3a5955dfdb")
    public List<String> getTimedValueSpecification_TaggedValue_on() {
        return this.elt.getTagValues(TimedValueSpecificationTaggedValue.MdaTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_ON_TAGTYPE_ELT);
    }

    @objid ("39867353-f38b-4304-9def-a7a575f5c267")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'TimedValueSpecification_TaggedValue_interpretation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ca851d3-01d1-477e-84e0-677647343d63")
    public void setTimedValueSpecification_TaggedValue_interpretation(final String value) {
        this.elt.putTagValue(TimedValueSpecificationTaggedValue.MdaTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'TimedValueSpecification_TaggedValue_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1a1706f-807d-41fc-b178-b7d6022c258c")
    public void setTimedValueSpecification_TaggedValue_on(final List<String> values) {
        this.elt.putTagValues(TimedValueSpecificationTaggedValue.MdaTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_ON_TAGTYPE_ELT, values);
    }

    @objid ("0dd75579-332e-4f16-9885-247fa38fbb7e")
    protected TimedValueSpecificationTaggedValue(final TaggedValue elt) {
        this.elt = elt;
    }

    @objid ("96527654-91c3-4807-ac3b-948ef1e74d8e")
    public static final class MdaTypes {
        @objid ("5ac0cbdb-c839-40fe-bfe8-88e0edbad3b5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9a0f1a61-401b-4261-bca5-363fb3a168fa")
        public static TagType TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION_TAGTYPE_ELT;

        @objid ("b9f175fc-7180-4596-8169-5f346303eb88")
        public static TagType TIMEDVALUESPECIFICATION_TAGGEDVALUE_ON_TAGTYPE_ELT;

        @objid ("c92fda1d-8e05-472a-8a83-4a0f5f6c3c34")
        private static Stereotype MDAASSOCDEP;

        @objid ("c654e367-8e9b-428b-af1a-9cde5f63047f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f664c3c8-6d15-4307-835a-e00b7b721b3f")
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
