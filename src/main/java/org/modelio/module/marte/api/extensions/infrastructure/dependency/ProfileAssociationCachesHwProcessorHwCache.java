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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_caches_HwProcessor_HwCache >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("32500c61-d542-4488-a0e7-26ec6b5d00aa")
public class ProfileAssociationCachesHwProcessorHwCache {
    @objid ("43fca0fd-b683-4263-9f1b-6575327af2d0")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_caches_HwProcessor_HwCache";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("4addbfd9-8f66-4bb7-88b2-daef3c856dd5")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationCachesHwProcessorHwCache proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_caches_HwProcessor_HwCache >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5ddb2b5b-e314-4527-9ae9-b424d9b11048")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationCachesHwProcessorHwCache.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_caches_HwProcessor_HwCache >> then instantiate a {@link ProfileAssociationCachesHwProcessorHwCache} proxy.
     * 
     * @return a {@link ProfileAssociationCachesHwProcessorHwCache} proxy on the created {@link Dependency}.
     */
    @objid ("65fded4e-8df3-42cf-80cc-5a6eaae92d28")
    public static ProfileAssociationCachesHwProcessorHwCache create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationCachesHwProcessorHwCache.STEREOTYPE_NAME);
        return ProfileAssociationCachesHwProcessorHwCache.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationCachesHwProcessorHwCache} proxy from a {@link Dependency} stereotyped << ProfileAssociation_caches_HwProcessor_HwCache >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationCachesHwProcessorHwCache} proxy or <i>null</i>.
     */
    @objid ("f4ce72ec-64f8-4f3b-a404-e6b5281e8473")
    public static ProfileAssociationCachesHwProcessorHwCache instantiate(final Dependency obj) {
        return ProfileAssociationCachesHwProcessorHwCache.canInstantiate(obj) ? new ProfileAssociationCachesHwProcessorHwCache(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationCachesHwProcessorHwCache} proxy from a {@link Dependency} stereotyped << ProfileAssociation_caches_HwProcessor_HwCache >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationCachesHwProcessorHwCache} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d7b35a60-7c16-477e-897a-2436f923fba4")
    public static ProfileAssociationCachesHwProcessorHwCache safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationCachesHwProcessorHwCache.canInstantiate(obj))
        	return new ProfileAssociationCachesHwProcessorHwCache(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationCachesHwProcessorHwCache: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("16e7da46-e8a7-43a3-8dcb-0baedf5bcb2a")
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
        ProfileAssociationCachesHwProcessorHwCache other = (ProfileAssociationCachesHwProcessorHwCache) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("13ddaea1-fbe2-40fc-9d7c-c8dd31a2dc87")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("b7a2b6ef-f807-40d5-81b1-d06d7fdd6e7e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("830319b0-adfa-4dad-8d7e-784c2939d294")
    protected ProfileAssociationCachesHwProcessorHwCache(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("7a30ed48-54e8-4400-8439-0508b2c12494")
    public static final class MdaTypes {
        @objid ("29859e48-cbd6-480a-a0a6-e76e58531744")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("01ec3951-6eb1-43ad-9cd5-2147a989d45d")
        private static Stereotype MDAASSOCDEP;

        @objid ("7e33235f-0d23-4a44-a5d4-032c67068217")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bf8b362f-5a15-4aab-8a9f-b9dba467c839")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2f4900e4-937d-11e0-b960-0027103f347c");
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
