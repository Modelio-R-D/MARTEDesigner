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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_vectorElements_InterruptResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c6343fcc-fc1b-470f-9d63-37faf9a5b31b")
public class ProfileAssociationVectorElementsInterruptResource {
    @objid ("d774d556-ba75-4d5a-a375-1343196bfc06")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_vectorElements_InterruptResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("1c86fb44-bdd1-4755-bb08-c83a17f97e78")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationVectorElementsInterruptResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_vectorElements_InterruptResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8d4768a6-32b9-4320-b063-9d3d43e4c3ea")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationVectorElementsInterruptResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_vectorElements_InterruptResource >> then instantiate a {@link ProfileAssociationVectorElementsInterruptResource} proxy.
     * 
     * @return a {@link ProfileAssociationVectorElementsInterruptResource} proxy on the created {@link Dependency}.
     */
    @objid ("c62dda15-5f7c-4baa-a246-42d763f9095f")
    public static ProfileAssociationVectorElementsInterruptResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationVectorElementsInterruptResource.STEREOTYPE_NAME);
        return ProfileAssociationVectorElementsInterruptResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationVectorElementsInterruptResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_vectorElements_InterruptResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationVectorElementsInterruptResource} proxy or <i>null</i>.
     */
    @objid ("fcffd2c6-20cb-46cc-9832-023b0e535c7c")
    public static ProfileAssociationVectorElementsInterruptResource instantiate(final Dependency obj) {
        return ProfileAssociationVectorElementsInterruptResource.canInstantiate(obj) ? new ProfileAssociationVectorElementsInterruptResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationVectorElementsInterruptResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_vectorElements_InterruptResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationVectorElementsInterruptResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("67917a03-2c13-4931-9de1-4ea86c14772c")
    public static ProfileAssociationVectorElementsInterruptResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationVectorElementsInterruptResource.canInstantiate(obj))
        	return new ProfileAssociationVectorElementsInterruptResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationVectorElementsInterruptResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6435345f-a3a4-41de-944d-d8611499c0aa")
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
        ProfileAssociationVectorElementsInterruptResource other = (ProfileAssociationVectorElementsInterruptResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("b444ae48-1bee-4c74-b1ca-54181dfa374b")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("6a0f4ced-8aab-4437-b1c0-6deff899c823")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("28cc67d9-20a1-4e12-9242-a73c5da2a5d4")
    protected ProfileAssociationVectorElementsInterruptResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("04d5e99d-c1cb-47f4-9dfe-28134a52b4c1")
    public static final class MdaTypes {
        @objid ("1aa0016e-d163-409b-9607-28b9e978857a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("700ccb25-928b-457c-8a01-b63649075d9b")
        private static Stereotype MDAASSOCDEP;

        @objid ("dc06df37-e177-4d16-905e-6b5d61a564ac")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2af27b19-4840-488c-8a67-c811c4b1f8fc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7d4cc4b1-9757-11e0-94fb-0027103f347c");
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
