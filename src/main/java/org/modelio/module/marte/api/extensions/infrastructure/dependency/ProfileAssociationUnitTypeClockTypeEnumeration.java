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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_unitType_ClockType_Enumeration >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("dd977364-902e-4ed1-ae6a-8e966f448329")
public class ProfileAssociationUnitTypeClockTypeEnumeration {
    @objid ("7a5fbe06-4356-469c-8752-b67ca36fa54d")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_unitType_ClockType_Enumeration";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("de838ab4-e0cb-4fb7-be24-56f9b4de19ce")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationUnitTypeClockTypeEnumeration proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_unitType_ClockType_Enumeration >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e3316eb4-e3cf-476d-a956-8aa1ec06a7a1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationUnitTypeClockTypeEnumeration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_unitType_ClockType_Enumeration >> then instantiate a {@link ProfileAssociationUnitTypeClockTypeEnumeration} proxy.
     * 
     * @return a {@link ProfileAssociationUnitTypeClockTypeEnumeration} proxy on the created {@link Dependency}.
     */
    @objid ("29b37407-3278-44d3-835f-26e90b19c459")
    public static ProfileAssociationUnitTypeClockTypeEnumeration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationUnitTypeClockTypeEnumeration.STEREOTYPE_NAME);
        return ProfileAssociationUnitTypeClockTypeEnumeration.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationUnitTypeClockTypeEnumeration} proxy from a {@link Dependency} stereotyped << ProfileAssociation_unitType_ClockType_Enumeration >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationUnitTypeClockTypeEnumeration} proxy or <i>null</i>.
     */
    @objid ("5f6e708a-1dd3-4d02-b961-19484c81f06d")
    public static ProfileAssociationUnitTypeClockTypeEnumeration instantiate(final Dependency obj) {
        return ProfileAssociationUnitTypeClockTypeEnumeration.canInstantiate(obj) ? new ProfileAssociationUnitTypeClockTypeEnumeration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationUnitTypeClockTypeEnumeration} proxy from a {@link Dependency} stereotyped << ProfileAssociation_unitType_ClockType_Enumeration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationUnitTypeClockTypeEnumeration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c371d3ca-9210-4027-8085-220ed3957caf")
    public static ProfileAssociationUnitTypeClockTypeEnumeration safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationUnitTypeClockTypeEnumeration.canInstantiate(obj))
        	return new ProfileAssociationUnitTypeClockTypeEnumeration(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationUnitTypeClockTypeEnumeration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("444a3c94-0a11-4dc6-8457-1e771170f457")
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
        ProfileAssociationUnitTypeClockTypeEnumeration other = (ProfileAssociationUnitTypeClockTypeEnumeration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("11ac475e-f13b-422c-866b-24aba26d998d")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("c61bbe69-1609-48a3-9e16-d58ddcd55c1d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("8b971dad-586a-43c2-a04f-a52a84b82f4b")
    protected ProfileAssociationUnitTypeClockTypeEnumeration(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("7a85ea8d-a17b-46ce-90a3-76b2dc08c51c")
    public static final class MdaTypes {
        @objid ("198e59aa-1cab-44f2-ba8b-d2482cab46a3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ca3eed72-9d1d-45d0-bfd9-24ca39202619")
        private static Stereotype MDAASSOCDEP;

        @objid ("0af698e2-1553-4f6f-b8c8-fa03635cf4a1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("294529c9-8132-4465-a6e6-fa018111192a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c59d0ff5-77b9-11df-a783-0014222a9f79");
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
