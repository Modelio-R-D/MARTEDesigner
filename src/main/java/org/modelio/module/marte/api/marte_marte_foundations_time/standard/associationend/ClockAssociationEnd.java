/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << Clock_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ClockAssociationEnd {
    public static final String STEREOTYPE_NAME = "Clock_AssociationEnd";

    public static final String CLOCK_ASSOCIATIONEND_STANDARD_TAGTYPE = "Clock_AssociationEnd_standard";

    public static final String CLOCK_ASSOCIATIONEND_TYPE_TAGTYPE = "Clock_AssociationEnd_type";

    public static final String CLOCK_ASSOCIATIONEND_UNIT_TAGTYPE = "Clock_AssociationEnd_unit";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link ClockAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << Clock_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << Clock_AssociationEnd >> then instantiate a {@link ClockAssociationEnd} proxy.
     * 
     * @return a {@link ClockAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static ClockAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockAssociationEnd.STEREOTYPE_NAME);
        return ClockAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link ClockAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Clock_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link ClockAssociationEnd} proxy or <i>null</i>.
     */
    public static ClockAssociationEnd instantiate(final AssociationEnd obj) {
        return ClockAssociationEnd.canInstantiate(obj) ? new ClockAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Clock_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link ClockAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ClockAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (ClockAssociationEnd.canInstantiate(obj))
        	return new ClockAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("ClockAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ClockAssociationEnd other = (ClockAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Clock_AssociationEnd_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClock_AssociationEnd_standard() {
        return this.elt.getTagValue(ClockAssociationEnd.MdaTypes.CLOCK_ASSOCIATIONEND_STANDARD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClock_AssociationEnd_type() {
        return this.elt.getTagValue(ClockAssociationEnd.MdaTypes.CLOCK_ASSOCIATIONEND_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_AssociationEnd_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClock_AssociationEnd_unit() {
        return this.elt.getTagValue(ClockAssociationEnd.MdaTypes.CLOCK_ASSOCIATIONEND_UNIT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    public AssociationEnd getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Clock_AssociationEnd_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClock_AssociationEnd_standard(final String value) {
        this.elt.putTagValue(ClockAssociationEnd.MdaTypes.CLOCK_ASSOCIATIONEND_STANDARD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClock_AssociationEnd_type(final String value) {
        this.elt.putTagValue(ClockAssociationEnd.MdaTypes.CLOCK_ASSOCIATIONEND_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_AssociationEnd_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClock_AssociationEnd_unit(final String value) {
        this.elt.putTagValue(ClockAssociationEnd.MdaTypes.CLOCK_ASSOCIATIONEND_UNIT_TAGTYPE_ELT, value);
    }

    protected ClockAssociationEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType CLOCK_ASSOCIATIONEND_STANDARD_TAGTYPE_ELT;

        public static TagType CLOCK_ASSOCIATIONEND_TYPE_TAGTYPE_ELT;

        public static TagType CLOCK_ASSOCIATIONEND_UNIT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dae30f8b-0cce-11df-8525-001302895b2b");
            CLOCK_ASSOCIATIONEND_STANDARD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae30f92-0cce-11df-8525-001302895b2b");
            CLOCK_ASSOCIATIONEND_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae571e1-0cce-11df-8525-001302895b2b");
            CLOCK_ASSOCIATIONEND_UNIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae571e8-0cce-11df-8525-001302895b2b");
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
