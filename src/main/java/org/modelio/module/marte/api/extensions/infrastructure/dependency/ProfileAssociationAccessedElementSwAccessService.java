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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_accessedElement_SwAccessService >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1c3a1f7a-88ad-451e-a02c-25f3a1fd5d53")
public class ProfileAssociationAccessedElementSwAccessService {
    @objid ("04d27c48-aee7-435f-ad3c-42b11847cbda")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_accessedElement_SwAccessService";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("1381589f-a7e5-4a35-81de-ebeb780ed5f0")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationAccessedElementSwAccessService proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_accessedElement_SwAccessService >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("77640f57-8866-49cc-ba07-a064951b2867")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationAccessedElementSwAccessService.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_accessedElement_SwAccessService >> then instantiate a {@link ProfileAssociationAccessedElementSwAccessService} proxy.
     * 
     * @return a {@link ProfileAssociationAccessedElementSwAccessService} proxy on the created {@link Dependency}.
     */
    @objid ("604dfbbb-6960-4393-89de-5f4b1f1b624b")
    public static ProfileAssociationAccessedElementSwAccessService create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationAccessedElementSwAccessService.STEREOTYPE_NAME);
        return ProfileAssociationAccessedElementSwAccessService.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationAccessedElementSwAccessService} proxy from a {@link Dependency} stereotyped << ProfileAssociation_accessedElement_SwAccessService >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationAccessedElementSwAccessService} proxy or <i>null</i>.
     */
    @objid ("2cec58cf-4f80-47bf-8398-cd7007f9beb4")
    public static ProfileAssociationAccessedElementSwAccessService instantiate(final Dependency obj) {
        return ProfileAssociationAccessedElementSwAccessService.canInstantiate(obj) ? new ProfileAssociationAccessedElementSwAccessService(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationAccessedElementSwAccessService} proxy from a {@link Dependency} stereotyped << ProfileAssociation_accessedElement_SwAccessService >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationAccessedElementSwAccessService} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5afbe463-5a0d-4c48-ad38-3da03b7858e1")
    public static ProfileAssociationAccessedElementSwAccessService safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationAccessedElementSwAccessService.canInstantiate(obj))
        	return new ProfileAssociationAccessedElementSwAccessService(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationAccessedElementSwAccessService: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fb0546e2-b51d-4a94-8098-bde19ac1c6d9")
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
        ProfileAssociationAccessedElementSwAccessService other = (ProfileAssociationAccessedElementSwAccessService) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("fb2734f2-a38a-43df-b21d-59a3e2e899bf")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("134c3ff7-e8fe-47a4-b473-59756edba345")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("076e2ea9-2ddd-4621-8c1f-54123358a91e")
    protected ProfileAssociationAccessedElementSwAccessService(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("26594e78-c334-47e2-8eea-1df530a166e9")
    public static final class MdaTypes {
        @objid ("fc579a89-095c-4f3b-99eb-0978e7d53d49")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ec9c6c06-fde5-4d83-b27b-7636fe31a238")
        private static Stereotype MDAASSOCDEP;

        @objid ("1a5edee8-46cf-40c8-8e20-a85426b4a87b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b7b3abec-6c8a-4271-ba81-a5d107949315")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b3ccad82-9755-11e0-94fb-0027103f347c");
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
