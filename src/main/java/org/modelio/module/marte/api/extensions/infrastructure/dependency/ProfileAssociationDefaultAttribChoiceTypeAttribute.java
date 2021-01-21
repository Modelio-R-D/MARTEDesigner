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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_defaultAttrib_ChoiceType_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ae723a14-74e3-4b92-a212-a878c9403ecb")
public class ProfileAssociationDefaultAttribChoiceTypeAttribute {
    @objid ("f99dec0a-3673-4673-9204-1baed17c1edf")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_defaultAttrib_ChoiceType_Attribute";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("aaba02d4-4e09-4ab7-a79d-68ef34000ea9")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationDefaultAttribChoiceTypeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_defaultAttrib_ChoiceType_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("11450c9f-e6e3-462e-99c5-8f20fc063729")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDefaultAttribChoiceTypeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_defaultAttrib_ChoiceType_Attribute >> then instantiate a {@link ProfileAssociationDefaultAttribChoiceTypeAttribute} proxy.
     * 
     * @return a {@link ProfileAssociationDefaultAttribChoiceTypeAttribute} proxy on the created {@link Dependency}.
     */
    @objid ("e7a88718-557b-42dc-85cd-a8039b5a71f9")
    public static ProfileAssociationDefaultAttribChoiceTypeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDefaultAttribChoiceTypeAttribute.STEREOTYPE_NAME);
        return ProfileAssociationDefaultAttribChoiceTypeAttribute.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDefaultAttribChoiceTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_defaultAttrib_ChoiceType_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationDefaultAttribChoiceTypeAttribute} proxy or <i>null</i>.
     */
    @objid ("5320a0e0-f57c-4c5b-9e29-415c7037db15")
    public static ProfileAssociationDefaultAttribChoiceTypeAttribute instantiate(final Dependency obj) {
        return ProfileAssociationDefaultAttribChoiceTypeAttribute.canInstantiate(obj) ? new ProfileAssociationDefaultAttribChoiceTypeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDefaultAttribChoiceTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_defaultAttrib_ChoiceType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationDefaultAttribChoiceTypeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dd23e281-15f6-4bb9-89ce-2e8fef804103")
    public static ProfileAssociationDefaultAttribChoiceTypeAttribute safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationDefaultAttribChoiceTypeAttribute.canInstantiate(obj))
        	return new ProfileAssociationDefaultAttribChoiceTypeAttribute(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationDefaultAttribChoiceTypeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("294aa02a-a255-4f33-9567-a446902d905c")
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
        ProfileAssociationDefaultAttribChoiceTypeAttribute other = (ProfileAssociationDefaultAttribChoiceTypeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("fddcf777-1ed6-4065-97e3-1195745e491a")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("92193679-9fc5-4762-a680-b579df798465")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a611fe2a-642e-454d-96ea-44cfeab6925f")
    protected ProfileAssociationDefaultAttribChoiceTypeAttribute(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("92bc2719-0df8-4cc6-81b2-b3e45b260cba")
    public static final class MdaTypes {
        @objid ("2954c091-f402-435e-9f5e-33a6880a5122")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("53a6772d-8f5a-4cc7-8689-b3763e3e16c1")
        private static Stereotype MDAASSOCDEP;

        @objid ("1f63cb01-85a0-4e64-84cb-8dd48b87a916")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("95ea06cb-eb39-4ca9-a100-e6866664cf2a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "34c16f66-82b3-11df-b65a-0014222a9f79");
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
