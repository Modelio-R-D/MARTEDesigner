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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_host_PaRunTInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0fbffedc-4884-4f00-8635-aca65abd9259")
public class ProfileAssociationHostPaRunTInstance {
    @objid ("f1e86ce0-de9c-4945-86e0-7c02100d199a")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_host_PaRunTInstance";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("91e4f056-2e6e-4293-acdf-dfcca3c833f8")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationHostPaRunTInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_host_PaRunTInstance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f215f093-c893-4ab8-95e8-98b99cc911d9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationHostPaRunTInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_host_PaRunTInstance >> then instantiate a {@link ProfileAssociationHostPaRunTInstance} proxy.
     * 
     * @return a {@link ProfileAssociationHostPaRunTInstance} proxy on the created {@link Dependency}.
     */
    @objid ("e86903cf-d139-4074-9072-0456a44cda5b")
    public static ProfileAssociationHostPaRunTInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationHostPaRunTInstance.STEREOTYPE_NAME);
        return ProfileAssociationHostPaRunTInstance.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationHostPaRunTInstance} proxy from a {@link Dependency} stereotyped << ProfileAssociation_host_PaRunTInstance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationHostPaRunTInstance} proxy or <i>null</i>.
     */
    @objid ("dacdb2b2-ea36-4c39-8737-050a2f0d3fe2")
    public static ProfileAssociationHostPaRunTInstance instantiate(final Dependency obj) {
        return ProfileAssociationHostPaRunTInstance.canInstantiate(obj) ? new ProfileAssociationHostPaRunTInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationHostPaRunTInstance} proxy from a {@link Dependency} stereotyped << ProfileAssociation_host_PaRunTInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationHostPaRunTInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4ab432c1-2052-4e81-891d-5438067fb9f3")
    public static ProfileAssociationHostPaRunTInstance safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationHostPaRunTInstance.canInstantiate(obj))
        	return new ProfileAssociationHostPaRunTInstance(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationHostPaRunTInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0df2a7bf-90a7-43c7-9708-3cc03fedb17f")
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
        ProfileAssociationHostPaRunTInstance other = (ProfileAssociationHostPaRunTInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("c6e2f687-6ac6-40bb-a739-0830813c9216")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("9b3319c4-a288-43b4-b277-d1097c77c57f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c2137b5f-27ac-4666-aba0-d73faaf79296")
    protected ProfileAssociationHostPaRunTInstance(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("3b8489e7-84f9-48c6-9cf0-69b56bcb0e40")
    public static final class MdaTypes {
        @objid ("6cdaf536-a5e8-4201-a364-a8e7040e482c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9312ad74-ba6b-4c21-b51a-556638aa24c4")
        private static Stereotype MDAASSOCDEP;

        @objid ("1ba21bc9-7617-4d2e-aa1a-69f47eb23e31")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("773ea5a7-eece-4032-b718-17f04942aa4e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0d4e1dad-dd21-11e0-a2be-0027103f347c");
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
