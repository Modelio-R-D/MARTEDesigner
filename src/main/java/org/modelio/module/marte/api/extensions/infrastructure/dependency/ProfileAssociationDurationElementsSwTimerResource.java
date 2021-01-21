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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_durationElements_SwTimerResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("60838897-ba9c-4d9c-81e5-6d77cec727d1")
public class ProfileAssociationDurationElementsSwTimerResource {
    @objid ("a672ee55-c3e3-41fb-b438-8fc696bf62ad")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_durationElements_SwTimerResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("3ce1f49e-1fa2-4fc7-80be-d0eec45c6ce0")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationDurationElementsSwTimerResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_durationElements_SwTimerResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9bc63b25-429f-489e-ad97-784d48c56888")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDurationElementsSwTimerResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_durationElements_SwTimerResource >> then instantiate a {@link ProfileAssociationDurationElementsSwTimerResource} proxy.
     * 
     * @return a {@link ProfileAssociationDurationElementsSwTimerResource} proxy on the created {@link Dependency}.
     */
    @objid ("471b0049-0e84-4237-892b-c8db7ab92b69")
    public static ProfileAssociationDurationElementsSwTimerResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDurationElementsSwTimerResource.STEREOTYPE_NAME);
        return ProfileAssociationDurationElementsSwTimerResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDurationElementsSwTimerResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_durationElements_SwTimerResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationDurationElementsSwTimerResource} proxy or <i>null</i>.
     */
    @objid ("178ca0b7-6996-4b42-b003-4365fddf24a3")
    public static ProfileAssociationDurationElementsSwTimerResource instantiate(final Dependency obj) {
        return ProfileAssociationDurationElementsSwTimerResource.canInstantiate(obj) ? new ProfileAssociationDurationElementsSwTimerResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDurationElementsSwTimerResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_durationElements_SwTimerResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationDurationElementsSwTimerResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1ac37963-4e04-451d-b2ff-15e034d1c86d")
    public static ProfileAssociationDurationElementsSwTimerResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationDurationElementsSwTimerResource.canInstantiate(obj))
        	return new ProfileAssociationDurationElementsSwTimerResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationDurationElementsSwTimerResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a667a083-c1e4-4ebc-bbb9-a17851e89f0d")
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
        ProfileAssociationDurationElementsSwTimerResource other = (ProfileAssociationDurationElementsSwTimerResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("4898f134-48d4-4aec-a189-6b7e68d0038c")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("5cbd207e-73f1-4ed7-8557-e6801da6faaf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e6a22666-3bf7-4307-b093-a7718d461fb8")
    protected ProfileAssociationDurationElementsSwTimerResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("61aca0df-703a-483c-bcb8-387065825b37")
    public static final class MdaTypes {
        @objid ("67d9427f-d46f-4bf0-8bbf-6f4bf09ae25b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f88707db-4810-4627-8bcd-a50c20e3d6c1")
        private static Stereotype MDAASSOCDEP;

        @objid ("33fa025f-0d4c-4491-8aa6-d47c421cb7af")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5161c872-a6ad-46d4-8d90-cbf6944cfa65")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c58da4ba-9757-11e0-94fb-0027103f347c");
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
