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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_memorySizeFootprint_SwResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("adba151d-531f-4058-98ef-ba2b73f4370e")
public class ProfileAssociationMemorySizeFootprintSwResource {
    @objid ("5c1710bd-8ec8-4397-ae98-ccfe1d18cd50")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_memorySizeFootprint_SwResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("90456cf3-8ab9-4932-ab20-d76978752b0d")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMemorySizeFootprintSwResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_memorySizeFootprint_SwResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c53a470a-68cc-4ca0-bc98-6fc97ccd721a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMemorySizeFootprintSwResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_memorySizeFootprint_SwResource >> then instantiate a {@link ProfileAssociationMemorySizeFootprintSwResource} proxy.
     * 
     * @return a {@link ProfileAssociationMemorySizeFootprintSwResource} proxy on the created {@link Dependency}.
     */
    @objid ("25f17b70-598c-4fb6-9f23-523ea20801df")
    public static ProfileAssociationMemorySizeFootprintSwResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMemorySizeFootprintSwResource.STEREOTYPE_NAME);
        return ProfileAssociationMemorySizeFootprintSwResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMemorySizeFootprintSwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_memorySizeFootprint_SwResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMemorySizeFootprintSwResource} proxy or <i>null</i>.
     */
    @objid ("f6a598e8-e4d2-42e6-adbe-d16f3f99db3c")
    public static ProfileAssociationMemorySizeFootprintSwResource instantiate(final Dependency obj) {
        return ProfileAssociationMemorySizeFootprintSwResource.canInstantiate(obj) ? new ProfileAssociationMemorySizeFootprintSwResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMemorySizeFootprintSwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_memorySizeFootprint_SwResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationMemorySizeFootprintSwResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("81597442-5805-46b1-bd8e-8d600c4df5c6")
    public static ProfileAssociationMemorySizeFootprintSwResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMemorySizeFootprintSwResource.canInstantiate(obj))
        	return new ProfileAssociationMemorySizeFootprintSwResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMemorySizeFootprintSwResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ddcbccca-e7e1-4923-9e72-ad9d99d89084")
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
        ProfileAssociationMemorySizeFootprintSwResource other = (ProfileAssociationMemorySizeFootprintSwResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("20ca029d-4968-492c-a91a-987c6b4f59fd")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("0efe6dc5-4507-415a-beca-7e951a448536")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4f5e7ac8-18dc-4db9-9bcd-414bef14aa78")
    protected ProfileAssociationMemorySizeFootprintSwResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("214d902a-c125-4d2b-9ef4-361a5876d68b")
    public static final class MdaTypes {
        @objid ("95fdc905-db45-46ba-87e4-0e7f7dabb32d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b37cc261-789b-4daa-8e23-3967bb0c8781")
        private static Stereotype MDAASSOCDEP;

        @objid ("517dfbdf-9432-4166-91ef-4f82b029bf3e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d4d3d547-24bb-480c-ac21-0618b4c1cb70")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "df7935c3-9755-11e0-94fb-0027103f347c");
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
