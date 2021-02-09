/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << TimerResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class TimerResourceAttribute extends TimingResourceAttribute {
    public static final String STEREOTYPE_NAME = "TimerResource_Attribute";

    public static final String TIMERRESOURCE_ATTRIBUTE_DURATION_TAGTYPE = "TimerResource_Attribute_duration";

    public static final String TIMERRESOURCE_ATTRIBUTE_ISPERIODIC_TAGTYPE = "TimerResource_Attribute_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TimerResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TimerResource_Attribute >> then instantiate a {@link TimerResourceAttribute} proxy.
     * 
     * @return a {@link TimerResourceAttribute} proxy on the created {@link Attribute}.
     */
    public static TimerResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceAttribute.STEREOTYPE_NAME);
        return TimerResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceAttribute} proxy from a {@link Attribute} stereotyped << TimerResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link TimerResourceAttribute} proxy or <i>null</i>.
     */
    public static TimerResourceAttribute instantiate(final Attribute obj) {
        return TimerResourceAttribute.canInstantiate(obj) ? new TimerResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimerResourceAttribute} proxy from a {@link Attribute} stereotyped << TimerResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link TimerResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static TimerResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TimerResourceAttribute.canInstantiate(obj))
        	return new TimerResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("TimerResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        TimerResourceAttribute other = (TimerResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'TimerResource_Attribute_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimerResource_Attribute_duration() {
        return this.elt.getTagValue(TimerResourceAttribute.MdaTypes.TIMERRESOURCE_ATTRIBUTE_DURATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Attribute_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isTimerResource_Attribute_isPeriodic() {
        return this.elt.isTagged(TimerResourceAttribute.MdaTypes.TIMERRESOURCE_ATTRIBUTE_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Attribute_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimerResource_Attribute_duration(final String value) {
        this.elt.putTagValue(TimerResourceAttribute.MdaTypes.TIMERRESOURCE_ATTRIBUTE_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Attribute_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimerResource_Attribute_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceAttribute.MdaTypes.TIMERRESOURCE_ATTRIBUTE_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceAttribute.MdaTypes.TIMERRESOURCE_ATTRIBUTE_ISPERIODIC_TAGTYPE_ELT);
    }

    protected TimerResourceAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TIMERRESOURCE_ATTRIBUTE_DURATION_TAGTYPE_ELT;

        public static TagType TIMERRESOURCE_ATTRIBUTE_ISPERIODIC_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00a1abc6-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_ATTRIBUTE_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abcd-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_ATTRIBUTE_ISPERIODIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abd4-0ccf-11df-8525-001302895b2b");
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
