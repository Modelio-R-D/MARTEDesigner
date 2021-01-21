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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_instance_PaRunTInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("08a1cf9c-9b0c-404a-a51f-681258435250")
public class ProfileAssociationInstancePaRunTInstance {
    @objid ("5fd023fb-96df-404a-9111-be39a979b8f0")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_instance_PaRunTInstance";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("5e803895-e5ea-41d3-b536-f1d5e40faf9f")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationInstancePaRunTInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_instance_PaRunTInstance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7edf2a29-17da-4276-8450-fac686b394b6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationInstancePaRunTInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_instance_PaRunTInstance >> then instantiate a {@link ProfileAssociationInstancePaRunTInstance} proxy.
     * 
     * @return a {@link ProfileAssociationInstancePaRunTInstance} proxy on the created {@link Dependency}.
     */
    @objid ("c19edfb8-5d12-4ea3-90de-383a0e57dfa9")
    public static ProfileAssociationInstancePaRunTInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationInstancePaRunTInstance.STEREOTYPE_NAME);
        return ProfileAssociationInstancePaRunTInstance.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationInstancePaRunTInstance} proxy from a {@link Dependency} stereotyped << ProfileAssociation_instance_PaRunTInstance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationInstancePaRunTInstance} proxy or <i>null</i>.
     */
    @objid ("5e21233c-b8a1-4e07-a404-25b063f9f545")
    public static ProfileAssociationInstancePaRunTInstance instantiate(final Dependency obj) {
        return ProfileAssociationInstancePaRunTInstance.canInstantiate(obj) ? new ProfileAssociationInstancePaRunTInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationInstancePaRunTInstance} proxy from a {@link Dependency} stereotyped << ProfileAssociation_instance_PaRunTInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationInstancePaRunTInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ddf6075e-38d4-48f4-b5ca-b4b5876a514a")
    public static ProfileAssociationInstancePaRunTInstance safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationInstancePaRunTInstance.canInstantiate(obj))
        	return new ProfileAssociationInstancePaRunTInstance(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationInstancePaRunTInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9ec2d2f9-26ac-4552-936b-d24d6f0b08da")
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
        ProfileAssociationInstancePaRunTInstance other = (ProfileAssociationInstancePaRunTInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("688a79a8-add1-4a16-95b4-a830dfa251cc")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("86a585ec-0bfb-4460-9ec8-4acbb5b02136")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0891db07-4e1f-4c73-bb95-44e0abc7aca8")
    protected ProfileAssociationInstancePaRunTInstance(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("509c8c15-7777-4021-9a20-8d615a808ff7")
    public static final class MdaTypes {
        @objid ("d9afc3b1-d454-451e-8761-e478d786cb56")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1c1d36d6-b28c-4fec-825f-60678e4bc23f")
        private static Stereotype MDAASSOCDEP;

        @objid ("54196c9c-74b2-4387-8c85-15f80ad45121")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("878d9010-6607-4bfd-a135-6aff8483a1bc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0d2eff92-dd21-11e0-a2be-0027103f347c");
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
