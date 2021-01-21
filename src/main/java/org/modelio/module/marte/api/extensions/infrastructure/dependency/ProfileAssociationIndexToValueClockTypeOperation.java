/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_indexToValue_ClockType_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("19ffb018-70af-4e02-ae05-90e28b968f77")
public class ProfileAssociationIndexToValueClockTypeOperation {
    @objid ("1dfd8494-caa6-466f-ab04-0e68380c84db")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_indexToValue_ClockType_Operation";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("c9b99006-a7b5-48d2-9d47-4023707a38a5")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationIndexToValueClockTypeOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_indexToValue_ClockType_Operation >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("96b4cbca-5025-4952-8476-b5fa3ac7567d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationIndexToValueClockTypeOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_indexToValue_ClockType_Operation >> then instantiate a {@link ProfileAssociationIndexToValueClockTypeOperation} proxy.
     * 
     * @return a {@link ProfileAssociationIndexToValueClockTypeOperation} proxy on the created {@link Dependency}.
     */
    @objid ("d795097d-672b-4618-ab62-2e7a63c2baeb")
    public static ProfileAssociationIndexToValueClockTypeOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationIndexToValueClockTypeOperation.STEREOTYPE_NAME);
        return ProfileAssociationIndexToValueClockTypeOperation.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationIndexToValueClockTypeOperation} proxy from a {@link Dependency} stereotyped << ProfileAssociation_indexToValue_ClockType_Operation >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationIndexToValueClockTypeOperation} proxy or <i>null</i>.
     */
    @objid ("e27fd726-ca96-4a1e-b873-1352a61c89ca")
    public static ProfileAssociationIndexToValueClockTypeOperation instantiate(final Dependency obj) {
        return ProfileAssociationIndexToValueClockTypeOperation.canInstantiate(obj) ? new ProfileAssociationIndexToValueClockTypeOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationIndexToValueClockTypeOperation} proxy from a {@link Dependency} stereotyped << ProfileAssociation_indexToValue_ClockType_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationIndexToValueClockTypeOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("befb34d9-381b-49e7-a6f4-883578370023")
    public static ProfileAssociationIndexToValueClockTypeOperation safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationIndexToValueClockTypeOperation.canInstantiate(obj))
        	return new ProfileAssociationIndexToValueClockTypeOperation(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationIndexToValueClockTypeOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fc9bc0b5-d610-4fc2-837b-cec444b37d8a")
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
        ProfileAssociationIndexToValueClockTypeOperation other = (ProfileAssociationIndexToValueClockTypeOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("b6f35e19-06a5-4572-92a5-89b8c5a6e36f")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("e3ca1f29-743d-4135-a750-c77f21f048b8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("225adaad-7d47-471b-aa81-eab6d4cb6074")
    protected ProfileAssociationIndexToValueClockTypeOperation(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("c183804c-3bf9-4d2c-b734-f3b303ebd690")
    public static final class MdaTypes {
        @objid ("5c1d3595-4bed-4852-977f-50360de3b1bb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("abea4f59-61da-482d-acd0-fc6bec82372a")
        private static Stereotype MDAASSOCDEP;

        @objid ("5b7af92c-cb33-423c-a41f-36a8947cbcd9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8b97b8bb-65b8-47a1-b0ea-f3658cc9e1e3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f09ee6e6-82bb-11df-b65a-0014222a9f79");
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
