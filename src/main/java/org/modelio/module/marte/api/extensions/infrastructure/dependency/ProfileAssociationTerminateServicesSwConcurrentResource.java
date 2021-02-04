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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_terminateServices_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("62a7f6bb-140c-44ea-8f3c-4b019b226adb")
public class ProfileAssociationTerminateServicesSwConcurrentResource {
    @objid ("b1cea4ff-983d-4c68-abb3-b3e547a65b65")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_terminateServices_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("4faeed24-5b20-4ceb-8b5f-1ce82ab06cf1")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationTerminateServicesSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_terminateServices_SwConcurrentResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("59115ef7-a7ad-45c4-a5cd-3361bb321204")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationTerminateServicesSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_terminateServices_SwConcurrentResource >> then instantiate a {@link ProfileAssociationTerminateServicesSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationTerminateServicesSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("c5c9f5e8-9c30-4764-ae4f-2b332e882c93")
    public static ProfileAssociationTerminateServicesSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationTerminateServicesSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationTerminateServicesSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationTerminateServicesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_terminateServices_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationTerminateServicesSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("05a934bd-01de-4327-931b-217223269705")
    public static ProfileAssociationTerminateServicesSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationTerminateServicesSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationTerminateServicesSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationTerminateServicesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_terminateServices_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationTerminateServicesSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f714f27c-bdb6-492e-80f6-67617ee5e4aa")
    public static ProfileAssociationTerminateServicesSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationTerminateServicesSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationTerminateServicesSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationTerminateServicesSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ff3c9333-5e5f-4fb2-8df6-5ae72109f7e1")
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
        ProfileAssociationTerminateServicesSwConcurrentResource other = (ProfileAssociationTerminateServicesSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("a37ab5d6-9f9a-42ad-84ac-054ae0f0ad4e")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("f804b15b-665c-4b75-8df0-fcdb8f50285c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c9569a6d-b6f2-4e6c-b768-02f466aeb24a")
    protected ProfileAssociationTerminateServicesSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("e651dc0f-6ff9-497b-957c-b8dd06f2dcb8")
    public static final class MdaTypes {
        @objid ("4b851b4d-b088-4a32-bd8f-e764f948eec9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7c9e3e49-ce1b-4997-99a9-c6fe7b4b634c")
        private static Stereotype MDAASSOCDEP;

        @objid ("f09751b1-40b6-4488-9cec-d11800edaee7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e5aa7657-ecf8-48cb-b692-effe434f9a86")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "98ddb727-9756-11e0-94fb-0027103f347c");
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
