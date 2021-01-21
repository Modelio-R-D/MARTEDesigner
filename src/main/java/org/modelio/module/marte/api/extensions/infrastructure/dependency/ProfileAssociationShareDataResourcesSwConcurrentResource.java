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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_shareDataResources_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("75f0685a-4227-4b73-b2fb-4734d3024949")
public class ProfileAssociationShareDataResourcesSwConcurrentResource {
    @objid ("96a6e795-40b9-4354-988a-badac1750340")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_shareDataResources_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("43644ce4-42cb-4727-9c28-313ae2a30bad")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationShareDataResourcesSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_shareDataResources_SwConcurrentResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("11eccf9f-e2b5-48d4-a412-33318f58a190")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationShareDataResourcesSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_shareDataResources_SwConcurrentResource >> then instantiate a {@link ProfileAssociationShareDataResourcesSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationShareDataResourcesSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("261ffea6-271e-46b2-8b06-e42065135345")
    public static ProfileAssociationShareDataResourcesSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationShareDataResourcesSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationShareDataResourcesSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationShareDataResourcesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_shareDataResources_SwConcurrentResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationShareDataResourcesSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("71715d5e-7a27-45e7-8e8e-97644b1557fe")
    public static ProfileAssociationShareDataResourcesSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationShareDataResourcesSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationShareDataResourcesSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationShareDataResourcesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_shareDataResources_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationShareDataResourcesSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3d367d74-a79a-4292-a6e4-1f94aee604b1")
    public static ProfileAssociationShareDataResourcesSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationShareDataResourcesSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationShareDataResourcesSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationShareDataResourcesSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("749fcc89-dddc-49ad-a09d-df4f2de760db")
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
        ProfileAssociationShareDataResourcesSwConcurrentResource other = (ProfileAssociationShareDataResourcesSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("fff49a4a-98ac-4b68-a8fb-4317e34a8c3e")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("2953ed97-e419-43fd-82ba-700cbf5a244f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("54986173-d803-4cad-94c7-94998be0a655")
    protected ProfileAssociationShareDataResourcesSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("c2a1a409-7c04-458d-be26-3320b8abb590")
    public static final class MdaTypes {
        @objid ("b06cbb30-887a-4087-8aad-ca140a926dca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c4c82255-cba0-48a1-9427-78d567d83771")
        private static Stereotype MDAASSOCDEP;

        @objid ("0a104acb-5029-4f04-ad6e-8e3fc538b745")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("285c21ea-a1e6-44f8-9999-daab455d24e9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c4252972-9756-11e0-94fb-0027103f347c");
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
