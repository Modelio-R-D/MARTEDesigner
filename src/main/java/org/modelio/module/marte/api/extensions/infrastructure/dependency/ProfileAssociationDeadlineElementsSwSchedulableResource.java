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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_deadlineElements_SwSchedulableResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("879f7ad6-f966-4400-bebe-99acaf1fb701")
public class ProfileAssociationDeadlineElementsSwSchedulableResource {
    @objid ("9481c847-deaa-49fd-9f3c-591c1daff9b6")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_deadlineElements_SwSchedulableResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("49325354-86dd-4e22-b3fb-f7982a24898d")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationDeadlineElementsSwSchedulableResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_deadlineElements_SwSchedulableResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a262880e-5dd1-4125-a14f-b9775990f291")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDeadlineElementsSwSchedulableResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_deadlineElements_SwSchedulableResource >> then instantiate a {@link ProfileAssociationDeadlineElementsSwSchedulableResource} proxy.
     * 
     * @return a {@link ProfileAssociationDeadlineElementsSwSchedulableResource} proxy on the created {@link Dependency}.
     */
    @objid ("6a26296b-76e7-4f55-b3b3-2246a9a55e59")
    public static ProfileAssociationDeadlineElementsSwSchedulableResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDeadlineElementsSwSchedulableResource.STEREOTYPE_NAME);
        return ProfileAssociationDeadlineElementsSwSchedulableResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDeadlineElementsSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_deadlineElements_SwSchedulableResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationDeadlineElementsSwSchedulableResource} proxy or <i>null</i>.
     */
    @objid ("6bc56d75-a355-43f4-952d-379a593b14b8")
    public static ProfileAssociationDeadlineElementsSwSchedulableResource instantiate(final Dependency obj) {
        return ProfileAssociationDeadlineElementsSwSchedulableResource.canInstantiate(obj) ? new ProfileAssociationDeadlineElementsSwSchedulableResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDeadlineElementsSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_deadlineElements_SwSchedulableResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationDeadlineElementsSwSchedulableResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1efe206d-f918-4798-947b-7fb701f53316")
    public static ProfileAssociationDeadlineElementsSwSchedulableResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationDeadlineElementsSwSchedulableResource.canInstantiate(obj))
        	return new ProfileAssociationDeadlineElementsSwSchedulableResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationDeadlineElementsSwSchedulableResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9db4424e-d54c-4ace-8179-3c46c8800e17")
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
        ProfileAssociationDeadlineElementsSwSchedulableResource other = (ProfileAssociationDeadlineElementsSwSchedulableResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("31b338ec-8116-4a12-a564-69ec0ece9ac2")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("0743ab7d-c7b8-4ee8-a9fd-aa0636351d96")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("962fe6a2-4377-485f-9dad-cf04bf397ef2")
    protected ProfileAssociationDeadlineElementsSwSchedulableResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("56e71047-e902-422b-b990-05bc9acd4531")
    public static final class MdaTypes {
        @objid ("8c2fefce-3398-4018-a6f8-a476d5bf556b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("061143c0-ab24-4498-ac18-548987b71559")
        private static Stereotype MDAASSOCDEP;

        @objid ("1da6fa41-b9c2-44be-bc11-c274a41b3378")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("be12b124-898c-4682-9f9b-029921746d9e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f8e7f26d-9757-11e0-94fb-0027103f347c");
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
