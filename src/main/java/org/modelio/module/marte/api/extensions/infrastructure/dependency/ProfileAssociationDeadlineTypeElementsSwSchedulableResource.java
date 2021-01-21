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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_deadlineTypeElements_SwSchedulableResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c658361d-0cd9-427b-b650-7cb46cdc2942")
public class ProfileAssociationDeadlineTypeElementsSwSchedulableResource {
    @objid ("83c9f256-48ce-44ad-b991-8bbc2ea7834c")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_deadlineTypeElements_SwSchedulableResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("99860d0b-b345-4c98-bc0f-63d69f40e765")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationDeadlineTypeElementsSwSchedulableResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_deadlineTypeElements_SwSchedulableResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("592c542e-2ede-4921-a907-67bb0580588c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDeadlineTypeElementsSwSchedulableResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_deadlineTypeElements_SwSchedulableResource >> then instantiate a {@link ProfileAssociationDeadlineTypeElementsSwSchedulableResource} proxy.
     * 
     * @return a {@link ProfileAssociationDeadlineTypeElementsSwSchedulableResource} proxy on the created {@link Dependency}.
     */
    @objid ("be9f1e93-f32f-4e54-be8f-02767ef53ea8")
    public static ProfileAssociationDeadlineTypeElementsSwSchedulableResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDeadlineTypeElementsSwSchedulableResource.STEREOTYPE_NAME);
        return ProfileAssociationDeadlineTypeElementsSwSchedulableResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDeadlineTypeElementsSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_deadlineTypeElements_SwSchedulableResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationDeadlineTypeElementsSwSchedulableResource} proxy or <i>null</i>.
     */
    @objid ("e6620b41-8b37-456f-986a-3eb24d3ca097")
    public static ProfileAssociationDeadlineTypeElementsSwSchedulableResource instantiate(final Dependency obj) {
        return ProfileAssociationDeadlineTypeElementsSwSchedulableResource.canInstantiate(obj) ? new ProfileAssociationDeadlineTypeElementsSwSchedulableResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDeadlineTypeElementsSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_deadlineTypeElements_SwSchedulableResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationDeadlineTypeElementsSwSchedulableResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b580015d-4f3d-4b0a-9c3e-d94c4a24c889")
    public static ProfileAssociationDeadlineTypeElementsSwSchedulableResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationDeadlineTypeElementsSwSchedulableResource.canInstantiate(obj))
        	return new ProfileAssociationDeadlineTypeElementsSwSchedulableResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationDeadlineTypeElementsSwSchedulableResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("56e49ecf-842b-43f4-9690-302d70a156bf")
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
        ProfileAssociationDeadlineTypeElementsSwSchedulableResource other = (ProfileAssociationDeadlineTypeElementsSwSchedulableResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("37798acf-5486-4490-8952-60bbbf7bf743")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("34e7a4ce-27a7-4260-aeaa-753d6e4c4889")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2c001a34-442c-412d-9e3b-96aebe586c4b")
    protected ProfileAssociationDeadlineTypeElementsSwSchedulableResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("f261fa56-3920-4a03-ac97-4d0aaa55041c")
    public static final class MdaTypes {
        @objid ("fb91b1fa-9267-4df6-ab1b-a24572c1b788")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("51cd5244-b42a-48e1-ad62-11e429ad13d0")
        private static Stereotype MDAASSOCDEP;

        @objid ("bc918d17-b2e1-4fb5-9a66-f1b0cf942d9c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6d9617e0-31fb-40fc-8e56-45e5e63ec0a6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "067b54c3-9758-11e0-94fb-0027103f347c");
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
