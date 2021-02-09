/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
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
 * Proxy class to handle a {@link Behavior} with << GrService_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GrServiceBehavior {
    public static final String STEREOTYPE_NAME = "GrService_Behavior";

    public static final String GRSERVICE_BEHAVIOR_OWNER_TAGTYPE = "GrService_Behavior_owner";

    /**
     * The underlying {@link Behavior} represented by this proxy, never null.
     */
    protected final Behavior elt;

    /**
     * Tells whether a {@link GrServiceBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << GrService_Behavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << GrService_Behavior >> then instantiate a {@link GrServiceBehavior} proxy.
     * 
     * @return a {@link GrServiceBehavior} proxy on the created {@link Behavior}.
     */
    public static GrServiceBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceBehavior.STEREOTYPE_NAME);
        return GrServiceBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link GrServiceBehavior} proxy from a {@link Behavior} stereotyped << GrService_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link GrServiceBehavior} proxy or <i>null</i>.
     */
    public static GrServiceBehavior instantiate(final Behavior obj) {
        return GrServiceBehavior.canInstantiate(obj) ? new GrServiceBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GrServiceBehavior} proxy from a {@link Behavior} stereotyped << GrService_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link GrServiceBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GrServiceBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (GrServiceBehavior.canInstantiate(obj))
        	return new GrServiceBehavior(obj);
        else
        	throw new IllegalArgumentException("GrServiceBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GrServiceBehavior other = (GrServiceBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    public Behavior getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GrService_Behavior_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGrService_Behavior_owner() {
        return this.elt.getTagValue(GrServiceBehavior.MdaTypes.GRSERVICE_BEHAVIOR_OWNER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GrService_Behavior_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGrService_Behavior_owner(final String value) {
        this.elt.putTagValue(GrServiceBehavior.MdaTypes.GRSERVICE_BEHAVIOR_OWNER_TAGTYPE_ELT, value);
    }

    protected GrServiceBehavior(final Behavior elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GRSERVICE_BEHAVIOR_OWNER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b8f6af0d-0f4a-11df-8c52-0014222a9f79");
            GRSERVICE_BEHAVIOR_OWNER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c36c1fdb-0f4a-11df-8c52-0014222a9f79");
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
