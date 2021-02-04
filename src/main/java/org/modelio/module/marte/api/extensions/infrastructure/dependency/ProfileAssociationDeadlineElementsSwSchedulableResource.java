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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_deadlineElements_SwSchedulableResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("879f7ad6-f966-4400-bebe-99acaf1fb701")
public class ProfileAssociationDeadlineElementsSwSchedulableResource {
    @objid ("3484bc65-4b96-476d-b822-81522c3396cf")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_deadlineElements_SwSchedulableResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("f1e4e13b-2d6c-4816-829b-38c0cb1a3e5a")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationDeadlineElementsSwSchedulableResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_deadlineElements_SwSchedulableResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6a9a6601-3b82-4876-b9c6-3287b53e3320")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDeadlineElementsSwSchedulableResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_deadlineElements_SwSchedulableResource >> then instantiate a {@link ProfileAssociationDeadlineElementsSwSchedulableResource} proxy.
     * 
     * @return a {@link ProfileAssociationDeadlineElementsSwSchedulableResource} proxy on the created {@link Dependency}.
     */
    @objid ("e0db3992-55aa-4da0-93ea-e32ac43b60b8")
    public static ProfileAssociationDeadlineElementsSwSchedulableResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDeadlineElementsSwSchedulableResource.STEREOTYPE_NAME);
        return ProfileAssociationDeadlineElementsSwSchedulableResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDeadlineElementsSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_deadlineElements_SwSchedulableResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationDeadlineElementsSwSchedulableResource} proxy or <i>null</i>.
     */
    @objid ("df69fd57-357d-4cdd-a909-c734b22ecf39")
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
    @objid ("5f8af79e-d5d0-4fce-911b-4fa00208e8c4")
    public static ProfileAssociationDeadlineElementsSwSchedulableResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationDeadlineElementsSwSchedulableResource.canInstantiate(obj))
        	return new ProfileAssociationDeadlineElementsSwSchedulableResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationDeadlineElementsSwSchedulableResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("439497da-378e-43a4-9d2f-52171bdb530f")
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
    @objid ("0fa78fc8-a227-416a-b50f-7c0af02fe852")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("2d55f63b-86e5-4a57-be27-f3c1d1095b74")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b1b065cc-60c9-473a-8d91-b22cc81f0f4e")
    protected ProfileAssociationDeadlineElementsSwSchedulableResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("56e71047-e902-422b-b990-05bc9acd4531")
    public static final class MdaTypes {
        @objid ("1c47d8b3-2eeb-4afe-a8a1-6980cfb22cf9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("49cb8a1f-43a4-46f3-b97d-db35e7f69f1c")
        private static Stereotype MDAASSOCDEP;

        @objid ("999efac3-7628-46a8-a878-2631c0dc3a15")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("708aa739-a7de-4053-bdaa-21afc70c6dac")
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
