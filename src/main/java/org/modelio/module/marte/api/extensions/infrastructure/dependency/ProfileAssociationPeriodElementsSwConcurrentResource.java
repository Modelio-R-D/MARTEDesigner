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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_periodElements_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d1ab8c6b-44ce-4bd2-93e3-90eb7932f49d")
public class ProfileAssociationPeriodElementsSwConcurrentResource {
    @objid ("1be53ddc-411d-45e2-a5bb-dce72f892845")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_periodElements_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("7c937bfa-e79c-48c0-a828-9e801f7cf23b")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationPeriodElementsSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_periodElements_SwConcurrentResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1f910041-53fb-4bb1-9597-d87051c598f7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPeriodElementsSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_periodElements_SwConcurrentResource >> then instantiate a {@link ProfileAssociationPeriodElementsSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationPeriodElementsSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("c454eba3-fb90-42ce-aa77-8525b1c6e803")
    public static ProfileAssociationPeriodElementsSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPeriodElementsSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationPeriodElementsSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationPeriodElementsSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_periodElements_SwConcurrentResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationPeriodElementsSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("f08b92d8-58a1-4206-8766-7e126428d13e")
    public static ProfileAssociationPeriodElementsSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationPeriodElementsSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationPeriodElementsSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationPeriodElementsSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_periodElements_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationPeriodElementsSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("24b3d2f8-dbc9-4962-baee-003b199acfd7")
    public static ProfileAssociationPeriodElementsSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationPeriodElementsSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationPeriodElementsSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationPeriodElementsSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("933404e5-9cf5-4d51-8848-87ae7c0a256f")
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
        ProfileAssociationPeriodElementsSwConcurrentResource other = (ProfileAssociationPeriodElementsSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("92c19cdc-0075-4f8b-926b-e2b2b64dc9f3")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("a4861c5e-4f32-42cc-b50e-080296f0da51")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9e35a1d5-6b57-4de3-9357-3afb766e9e23")
    protected ProfileAssociationPeriodElementsSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("d53cd71d-9175-462a-bf8f-9cfe1aace9e8")
    public static final class MdaTypes {
        @objid ("999f2217-f798-4756-bace-5bb385512651")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7715c394-3d13-4e20-a397-77843bed4cc6")
        private static Stereotype MDAASSOCDEP;

        @objid ("7c477f35-174e-4b03-9151-d75611cb4313")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("81ba578b-6b2a-4746-a77a-597b8f52ab68")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "399e9a43-9756-11e0-94fb-0027103f347c");
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
