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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_periodElements_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d1ab8c6b-44ce-4bd2-93e3-90eb7932f49d")
public class ProfileAssociationPeriodElementsSwConcurrentResource {
    @objid ("d11cf52f-8d8d-4ace-a26e-7d0e4d562d99")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_periodElements_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("38b98cd6-eb45-49e9-85d1-7c92d469d1fb")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationPeriodElementsSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_periodElements_SwConcurrentResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("80e87bf5-c227-4464-aaf6-bf9c598baa96")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPeriodElementsSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_periodElements_SwConcurrentResource >> then instantiate a {@link ProfileAssociationPeriodElementsSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationPeriodElementsSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("154f9b2d-be11-460c-ba74-3976f2acb63f")
    public static ProfileAssociationPeriodElementsSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPeriodElementsSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationPeriodElementsSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationPeriodElementsSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_periodElements_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationPeriodElementsSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("fa72ee89-b4aa-491d-8aea-5d5330b2ee82")
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
    @objid ("c6f971f5-e436-4ede-bebe-09bd5238d4cb")
    public static ProfileAssociationPeriodElementsSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationPeriodElementsSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationPeriodElementsSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationPeriodElementsSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("01e23fb6-0692-4ccb-b3d6-6c3674c4c2e0")
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
    @objid ("641df2ad-ef24-40c5-829f-10b3601e5be0")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("dfd247d9-3749-4e38-a74b-f92f53412d6a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("13e8426a-aab1-4aa8-a387-d2e6577cb583")
    protected ProfileAssociationPeriodElementsSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("d53cd71d-9175-462a-bf8f-9cfe1aace9e8")
    public static final class MdaTypes {
        @objid ("dbe3d863-030d-40cc-b783-e81dcb302472")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b4f47d3f-74c3-49df-85a3-3d9c6a7c5992")
        private static Stereotype MDAASSOCDEP;

        @objid ("a29b4654-0bd1-406a-a446-485ebb15fd11")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f592436e-b456-4254-9a40-6038b2c1d2f5")
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
