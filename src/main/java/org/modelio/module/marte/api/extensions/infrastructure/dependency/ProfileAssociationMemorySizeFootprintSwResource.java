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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_memorySizeFootprint_SwResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("adba151d-531f-4058-98ef-ba2b73f4370e")
public class ProfileAssociationMemorySizeFootprintSwResource {
    @objid ("e310fc1e-a527-4f26-af26-64b459d1a034")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_memorySizeFootprint_SwResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("76d2ddca-5e8c-48d9-8d23-7e64a908af30")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMemorySizeFootprintSwResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_memorySizeFootprint_SwResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("48c7b902-4959-419c-ba89-4a636b86d954")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMemorySizeFootprintSwResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_memorySizeFootprint_SwResource >> then instantiate a {@link ProfileAssociationMemorySizeFootprintSwResource} proxy.
     * 
     * @return a {@link ProfileAssociationMemorySizeFootprintSwResource} proxy on the created {@link Dependency}.
     */
    @objid ("413676c1-1c28-44f1-be0f-3b0d4682c8a9")
    public static ProfileAssociationMemorySizeFootprintSwResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMemorySizeFootprintSwResource.STEREOTYPE_NAME);
        return ProfileAssociationMemorySizeFootprintSwResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMemorySizeFootprintSwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_memorySizeFootprint_SwResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMemorySizeFootprintSwResource} proxy or <i>null</i>.
     */
    @objid ("91f0cdfe-9352-408a-b3eb-c75fbc4ba6a0")
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
    @objid ("ab757b25-604c-4243-a783-9b7815774211")
    public static ProfileAssociationMemorySizeFootprintSwResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMemorySizeFootprintSwResource.canInstantiate(obj))
        	return new ProfileAssociationMemorySizeFootprintSwResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMemorySizeFootprintSwResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d776efe6-0325-4f44-a94e-d12f81e1fd72")
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
    @objid ("08bcde03-083a-43e1-87a0-ec1aab6e937c")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("a00da7ea-3730-44bc-bb4c-0f4779b0264e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3445fa68-c91b-4c10-9675-c77b28833f12")
    protected ProfileAssociationMemorySizeFootprintSwResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("214d902a-c125-4d2b-9ef4-361a5876d68b")
    public static final class MdaTypes {
        @objid ("f4f2786a-bc73-48d6-b3a4-9a7940d155c4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ae4380bc-58ae-49ae-b78c-c7192eda9841")
        private static Stereotype MDAASSOCDEP;

        @objid ("dbaf79f1-726f-4c7d-a35f-7f4a4fd557ac")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b33d2c8e-1f16-43ba-af31-03618b2c3870")
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
