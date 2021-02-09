/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.actor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Actor} with << PpUnit_Actor >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class PpUnitActor {
    public static final String STEREOTYPE_NAME = "PpUnit_Actor";

    public static final String PPUNIT_ACTOR_CONCPOLICY_TAGTYPE = "PpUnit_Actor_concPolicy";

    public static final String PPUNIT_ACTOR_MEMORYSIZE_TAGTYPE = "PpUnit_Actor_memorySize";

    /**
     * The underlying {@link Actor} represented by this proxy, never null.
     */
    protected final Actor elt;

    /**
     * Tells whether a {@link PpUnitActor proxy} can be instantiated from a {@link MObject} checking it is a {@link Actor} stereotyped << PpUnit_Actor >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Actor) && ((Actor) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitActor.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Actor} stereotyped << PpUnit_Actor >> then instantiate a {@link PpUnitActor} proxy.
     * 
     * @return a {@link PpUnitActor} proxy on the created {@link Actor}.
     */
    public static PpUnitActor create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Actor");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitActor.STEREOTYPE_NAME);
        return PpUnitActor.instantiate((Actor)e);
    }

    /**
     * Tries to instantiate a {@link PpUnitActor} proxy from a {@link Actor} stereotyped << PpUnit_Actor >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Actor
     * @return a {@link PpUnitActor} proxy or <i>null</i>.
     */
    public static PpUnitActor instantiate(final Actor obj) {
        return PpUnitActor.canInstantiate(obj) ? new PpUnitActor(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PpUnitActor} proxy from a {@link Actor} stereotyped << PpUnit_Actor >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Actor}
     * @return a {@link PpUnitActor} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static PpUnitActor safeInstantiate(final Actor obj) throws IllegalArgumentException {
        if (PpUnitActor.canInstantiate(obj))
        	return new PpUnitActor(obj);
        else
        	throw new IllegalArgumentException("PpUnitActor: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        PpUnitActor other = (PpUnitActor) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Actor}. 
     * @return the Actor represented by this proxy, never null.
     */
    public Actor getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'PpUnit_Actor_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPpUnit_Actor_concPolicy() {
        return this.elt.getTagValue(PpUnitActor.MdaTypes.PPUNIT_ACTOR_CONCPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PpUnit_Actor_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPpUnit_Actor_memorySize() {
        return this.elt.getTagValue(PpUnitActor.MdaTypes.PPUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PpUnit_Actor_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPpUnit_Actor_concPolicy(final String value) {
        this.elt.putTagValue(PpUnitActor.MdaTypes.PPUNIT_ACTOR_CONCPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PpUnit_Actor_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPpUnit_Actor_memorySize(final String value) {
        this.elt.putTagValue(PpUnitActor.MdaTypes.PPUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    protected PpUnitActor(final Actor elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType PPUNIT_ACTOR_CONCPOLICY_TAGTYPE_ELT;

        public static TagType PPUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00c56ea8-0ccf-11df-8525-001302895b2b");
            PPUNIT_ACTOR_CONCPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00c56ea9-0ccf-11df-8525-001302895b2b");
            PPUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00c56eaa-0ccf-11df-8525-001302895b2b");
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
