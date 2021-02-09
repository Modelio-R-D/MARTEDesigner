/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_setTime_ClockType_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ProfileAssociationSetTimeClockTypeOperation {
    public static final String STEREOTYPE_NAME = "ProfileAssociation_setTime_ClockType_Operation";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationSetTimeClockTypeOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_setTime_ClockType_Operation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSetTimeClockTypeOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_setTime_ClockType_Operation >> then instantiate a {@link ProfileAssociationSetTimeClockTypeOperation} proxy.
     * 
     * @return a {@link ProfileAssociationSetTimeClockTypeOperation} proxy on the created {@link Dependency}.
     */
    public static ProfileAssociationSetTimeClockTypeOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSetTimeClockTypeOperation.STEREOTYPE_NAME);
        return ProfileAssociationSetTimeClockTypeOperation.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSetTimeClockTypeOperation} proxy from a {@link Dependency} stereotyped << ProfileAssociation_setTime_ClockType_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationSetTimeClockTypeOperation} proxy or <i>null</i>.
     */
    public static ProfileAssociationSetTimeClockTypeOperation instantiate(final Dependency obj) {
        return ProfileAssociationSetTimeClockTypeOperation.canInstantiate(obj) ? new ProfileAssociationSetTimeClockTypeOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSetTimeClockTypeOperation} proxy from a {@link Dependency} stereotyped << ProfileAssociation_setTime_ClockType_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationSetTimeClockTypeOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ProfileAssociationSetTimeClockTypeOperation safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationSetTimeClockTypeOperation.canInstantiate(obj))
        	return new ProfileAssociationSetTimeClockTypeOperation(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationSetTimeClockTypeOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ProfileAssociationSetTimeClockTypeOperation other = (ProfileAssociationSetTimeClockTypeOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    public Dependency getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected ProfileAssociationSetTimeClockTypeOperation(final Dependency elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dfec158d-82bb-11df-b65a-0014222a9f79");
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
