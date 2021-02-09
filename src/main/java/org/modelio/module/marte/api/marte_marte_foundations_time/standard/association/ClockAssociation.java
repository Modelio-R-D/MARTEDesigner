/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << Clock_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ClockAssociation {
    public static final String STEREOTYPE_NAME = "Clock_Association";

    public static final String CLOCK_ASSOCIATION_STANDARD_TAGTYPE = "Clock_Association_standard";

    public static final String CLOCK_ASSOCIATION_TYPE_TAGTYPE = "Clock_Association_type";

    public static final String CLOCK_ASSOCIATION_UNIT_TAGTYPE = "Clock_Association_unit";

    /**
     * The underlying {@link Association} represented by this proxy, never null.
     */
    protected final Association elt;

    /**
     * Tells whether a {@link ClockAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << Clock_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << Clock_Association >> then instantiate a {@link ClockAssociation} proxy.
     * 
     * @return a {@link ClockAssociation} proxy on the created {@link Association}.
     */
    public static ClockAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockAssociation.STEREOTYPE_NAME);
        return ClockAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link ClockAssociation} proxy from a {@link Association} stereotyped << Clock_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link ClockAssociation} proxy or <i>null</i>.
     */
    public static ClockAssociation instantiate(final Association obj) {
        return ClockAssociation.canInstantiate(obj) ? new ClockAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockAssociation} proxy from a {@link Association} stereotyped << Clock_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link ClockAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ClockAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (ClockAssociation.canInstantiate(obj))
        	return new ClockAssociation(obj);
        else
        	throw new IllegalArgumentException("ClockAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ClockAssociation other = (ClockAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Clock_Association_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClock_Association_standard() {
        return this.elt.getTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_STANDARD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClock_Association_type() {
        return this.elt.getTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Association_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClock_Association_unit() {
        return this.elt.getTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_UNIT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    public Association getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Clock_Association_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClock_Association_standard(final String value) {
        this.elt.putTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_STANDARD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClock_Association_type(final String value) {
        this.elt.putTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Association_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClock_Association_unit(final String value) {
        this.elt.putTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_UNIT_TAGTYPE_ELT, value);
    }

    protected ClockAssociation(final Association elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType CLOCK_ASSOCIATION_STANDARD_TAGTYPE_ELT;

        public static TagType CLOCK_ASSOCIATION_TYPE_TAGTYPE_ELT;

        public static TagType CLOCK_ASSOCIATION_UNIT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dae30f8a-0cce-11df-8525-001302895b2b");
            CLOCK_ASSOCIATION_STANDARD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae30f91-0cce-11df-8525-001302895b2b");
            CLOCK_ASSOCIATION_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae571e0-0cce-11df-8525-001302895b2b");
            CLOCK_ASSOCIATION_UNIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae571e7-0cce-11df-8525-001302895b2b");
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
