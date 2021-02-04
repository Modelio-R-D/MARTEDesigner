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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_choiceAttrib_ChoiceType_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("87d6cd96-c4bd-4dd4-87a1-dcfb738d576e")
public class ProfileAssociationChoiceAttribChoiceTypeAttribute {
    @objid ("141d65ac-8b96-47a6-a146-8d64bd02e438")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_choiceAttrib_ChoiceType_Attribute";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("36db0b42-1d06-4b8b-b9f9-c8fe7bc08dd0")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationChoiceAttribChoiceTypeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_choiceAttrib_ChoiceType_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9126a6f2-7b1b-4b1e-9b9a-e20c1a2e0a17")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationChoiceAttribChoiceTypeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_choiceAttrib_ChoiceType_Attribute >> then instantiate a {@link ProfileAssociationChoiceAttribChoiceTypeAttribute} proxy.
     * 
     * @return a {@link ProfileAssociationChoiceAttribChoiceTypeAttribute} proxy on the created {@link Dependency}.
     */
    @objid ("ab89ff13-eee1-492b-a586-ec2f0e1a89ad")
    public static ProfileAssociationChoiceAttribChoiceTypeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationChoiceAttribChoiceTypeAttribute.STEREOTYPE_NAME);
        return ProfileAssociationChoiceAttribChoiceTypeAttribute.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationChoiceAttribChoiceTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_choiceAttrib_ChoiceType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationChoiceAttribChoiceTypeAttribute} proxy or <i>null</i>.
     */
    @objid ("769e02f0-dd12-4284-8079-244760b396d9")
    public static ProfileAssociationChoiceAttribChoiceTypeAttribute instantiate(final Dependency obj) {
        return ProfileAssociationChoiceAttribChoiceTypeAttribute.canInstantiate(obj) ? new ProfileAssociationChoiceAttribChoiceTypeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationChoiceAttribChoiceTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_choiceAttrib_ChoiceType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationChoiceAttribChoiceTypeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("58bea8b6-7660-4330-b9b0-1be29a197b24")
    public static ProfileAssociationChoiceAttribChoiceTypeAttribute safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationChoiceAttribChoiceTypeAttribute.canInstantiate(obj))
        	return new ProfileAssociationChoiceAttribChoiceTypeAttribute(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationChoiceAttribChoiceTypeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0c319bb9-4f67-49b2-9065-7f20afb69dd2")
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
        ProfileAssociationChoiceAttribChoiceTypeAttribute other = (ProfileAssociationChoiceAttribChoiceTypeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("14d614ea-ac3b-4c73-bbc1-c816946786a8")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("51759ca8-7e61-4480-b84c-53d478a9671c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ef702f2d-e206-46a4-942a-1cdec28dbb0f")
    protected ProfileAssociationChoiceAttribChoiceTypeAttribute(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("73742a79-b6a5-4571-8b7a-807ac0387743")
    public static final class MdaTypes {
        @objid ("d0ef3512-8cbd-4796-abcf-496bf03e0d75")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5862e4ec-ba53-46a4-91e3-b3d4b4e6fddb")
        private static Stereotype MDAASSOCDEP;

        @objid ("e974a73f-2952-4e20-9cde-b7cc6f706758")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3a3f2134-e46a-42cb-b17d-886b43dd3bfa")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fb2c03b0-82b2-11df-b65a-0014222a9f79");
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
