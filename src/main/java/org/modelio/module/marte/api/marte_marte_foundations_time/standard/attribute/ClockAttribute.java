/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << Clock_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ClockAttribute {
    public static final String STEREOTYPE_NAME = "Clock_Attribute";

    public static final String CLOCK_ATTRIBUTE_STANDARD_TAGTYPE = "Clock_Attribute_standard";

    public static final String CLOCK_ATTRIBUTE_TYPE_TAGTYPE = "Clock_Attribute_type";

    public static final String CLOCK_ATTRIBUTE_UNIT_TAGTYPE = "Clock_Attribute_unit";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    protected final Attribute elt;

    /**
     * Tells whether a {@link ClockAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Clock_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Clock_Attribute >> then instantiate a {@link ClockAttribute} proxy.
     * 
     * @return a {@link ClockAttribute} proxy on the created {@link Attribute}.
     */
    public static ClockAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockAttribute.STEREOTYPE_NAME);
        return ClockAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link ClockAttribute} proxy from a {@link Attribute} stereotyped << Clock_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link ClockAttribute} proxy or <i>null</i>.
     */
    public static ClockAttribute instantiate(final Attribute obj) {
        return ClockAttribute.canInstantiate(obj) ? new ClockAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockAttribute} proxy from a {@link Attribute} stereotyped << Clock_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link ClockAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ClockAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (ClockAttribute.canInstantiate(obj))
        	return new ClockAttribute(obj);
        else
        	throw new IllegalArgumentException("ClockAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ClockAttribute other = (ClockAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Clock_Attribute_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClock_Attribute_standard() {
        return this.elt.getTagValue(ClockAttribute.MdaTypes.CLOCK_ATTRIBUTE_STANDARD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClock_Attribute_type() {
        return this.elt.getTagValue(ClockAttribute.MdaTypes.CLOCK_ATTRIBUTE_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Attribute_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClock_Attribute_unit() {
        return this.elt.getTagValue(ClockAttribute.MdaTypes.CLOCK_ATTRIBUTE_UNIT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    public Attribute getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Clock_Attribute_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClock_Attribute_standard(final String value) {
        this.elt.putTagValue(ClockAttribute.MdaTypes.CLOCK_ATTRIBUTE_STANDARD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClock_Attribute_type(final String value) {
        this.elt.putTagValue(ClockAttribute.MdaTypes.CLOCK_ATTRIBUTE_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Attribute_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClock_Attribute_unit(final String value) {
        this.elt.putTagValue(ClockAttribute.MdaTypes.CLOCK_ATTRIBUTE_UNIT_TAGTYPE_ELT, value);
    }

    protected ClockAttribute(final Attribute elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType CLOCK_ATTRIBUTE_STANDARD_TAGTYPE_ELT;

        public static TagType CLOCK_ATTRIBUTE_TYPE_TAGTYPE_ELT;

        public static TagType CLOCK_ATTRIBUTE_UNIT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dad723f3-0cce-11df-8525-001302895b2b");
            CLOCK_ATTRIBUTE_STANDARD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae30f90-0cce-11df-8525-001302895b2b");
            CLOCK_ATTRIBUTE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae571df-0cce-11df-8525-001302895b2b");
            CLOCK_ATTRIBUTE_UNIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae571e6-0cce-11df-8525-001302895b2b");
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
