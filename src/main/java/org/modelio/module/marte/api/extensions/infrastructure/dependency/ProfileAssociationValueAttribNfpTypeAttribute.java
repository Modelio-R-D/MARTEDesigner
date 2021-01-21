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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_valueAttrib_NfpType_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5b2c6bdc-7ee0-49cf-b265-bf8dc9adf0a1")
public class ProfileAssociationValueAttribNfpTypeAttribute {
    @objid ("7779cad9-165f-4ae9-9bad-37a922bc0766")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_valueAttrib_NfpType_Attribute";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("3733ec90-9f0d-4b8d-b880-fe9e278eb1e4")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationValueAttribNfpTypeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_valueAttrib_NfpType_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e9dce42e-70db-4c7d-b236-5a09ca235085")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationValueAttribNfpTypeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_valueAttrib_NfpType_Attribute >> then instantiate a {@link ProfileAssociationValueAttribNfpTypeAttribute} proxy.
     * 
     * @return a {@link ProfileAssociationValueAttribNfpTypeAttribute} proxy on the created {@link Dependency}.
     */
    @objid ("503aa6ac-ce21-49e9-8582-5abde7620ae2")
    public static ProfileAssociationValueAttribNfpTypeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationValueAttribNfpTypeAttribute.STEREOTYPE_NAME);
        return ProfileAssociationValueAttribNfpTypeAttribute.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationValueAttribNfpTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_valueAttrib_NfpType_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationValueAttribNfpTypeAttribute} proxy or <i>null</i>.
     */
    @objid ("1bf17dd4-239b-4529-a375-7e5e3bc16e62")
    public static ProfileAssociationValueAttribNfpTypeAttribute instantiate(final Dependency obj) {
        return ProfileAssociationValueAttribNfpTypeAttribute.canInstantiate(obj) ? new ProfileAssociationValueAttribNfpTypeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationValueAttribNfpTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_valueAttrib_NfpType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationValueAttribNfpTypeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5c2bb1c3-d4c4-4f2f-9ad4-46fdac6981d5")
    public static ProfileAssociationValueAttribNfpTypeAttribute safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationValueAttribNfpTypeAttribute.canInstantiate(obj))
        	return new ProfileAssociationValueAttribNfpTypeAttribute(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationValueAttribNfpTypeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("84309ede-e422-4727-9286-a10ffb6f3987")
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
        ProfileAssociationValueAttribNfpTypeAttribute other = (ProfileAssociationValueAttribNfpTypeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("c2b111d1-4313-4c7e-b2c6-83b4429bacc6")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("9b20b3b1-9549-465d-90a0-29f137b18b19")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("761a6810-f96a-49e6-983e-b25c4b9ddb20")
    protected ProfileAssociationValueAttribNfpTypeAttribute(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("9f4b7d94-1fdd-4997-ba07-36f03162055c")
    public static final class MdaTypes {
        @objid ("a0b99e3a-ed7f-4f6b-a775-951410655e94")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c9e44bab-6d66-41ad-a4be-eaa08acb5497")
        private static Stereotype MDAASSOCDEP;

        @objid ("fb103177-fbbf-475d-815a-280dfd1860d7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a8edeccb-d6bd-4ed9-9076-654f6753d20c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "79f94fcd-7e0c-11df-9e39-0014222a9f79");
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
