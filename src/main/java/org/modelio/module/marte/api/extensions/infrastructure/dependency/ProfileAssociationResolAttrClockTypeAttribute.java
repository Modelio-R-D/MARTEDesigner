/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_resolAttr_ClockType_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7d35d022-d8ce-4d88-8c24-9800b5683b30")
public class ProfileAssociationResolAttrClockTypeAttribute {
    @objid ("86a3038b-ff0c-49fc-ab8c-aa4ae5110e06")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_resolAttr_ClockType_Attribute";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("394c372b-c8e1-486e-8979-7b1e516e46c3")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationResolAttrClockTypeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_resolAttr_ClockType_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("582124f1-82ff-4375-acd6-cadd1689dac0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationResolAttrClockTypeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_resolAttr_ClockType_Attribute >> then instantiate a {@link ProfileAssociationResolAttrClockTypeAttribute} proxy.
     * 
     * @return a {@link ProfileAssociationResolAttrClockTypeAttribute} proxy on the created {@link Dependency}.
     */
    @objid ("ab07e6dd-ece7-4618-979a-98f393d20fba")
    public static ProfileAssociationResolAttrClockTypeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationResolAttrClockTypeAttribute.STEREOTYPE_NAME);
        return ProfileAssociationResolAttrClockTypeAttribute.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationResolAttrClockTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_resolAttr_ClockType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationResolAttrClockTypeAttribute} proxy or <i>null</i>.
     */
    @objid ("b3464dfc-291d-49bc-a857-9be1a022652a")
    public static ProfileAssociationResolAttrClockTypeAttribute instantiate(final Dependency obj) {
        return ProfileAssociationResolAttrClockTypeAttribute.canInstantiate(obj) ? new ProfileAssociationResolAttrClockTypeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationResolAttrClockTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_resolAttr_ClockType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationResolAttrClockTypeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("edd6e9bb-7877-4523-bf9e-dafc58958994")
    public static ProfileAssociationResolAttrClockTypeAttribute safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationResolAttrClockTypeAttribute.canInstantiate(obj))
        	return new ProfileAssociationResolAttrClockTypeAttribute(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationResolAttrClockTypeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6f6a67e6-81cb-4278-b112-e15cbde4de8d")
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
        ProfileAssociationResolAttrClockTypeAttribute other = (ProfileAssociationResolAttrClockTypeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("e7b7dd61-e8d4-4dae-b9f4-db73b3b708a9")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("e7fbd2bd-62b1-4604-89b3-f0f5fdf29661")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3c70d948-3f6e-42b1-8574-26bbe429a89d")
    protected ProfileAssociationResolAttrClockTypeAttribute(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("24ba4f5a-0b2c-4db4-86f0-2e094aa3aa02")
    public static final class MdaTypes {
        @objid ("e1e3efba-896a-4789-942f-9e657d6647c2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5aeba04f-899b-454e-b61a-ec993feb5c28")
        private static Stereotype MDAASSOCDEP;

        @objid ("2f57bcc8-8e30-45e2-b7e2-f37c297b5665")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("021bf6a1-4587-463d-b4b8-0c1381d0d82a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "be6c3908-82bb-11df-b65a-0014222a9f79");
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
