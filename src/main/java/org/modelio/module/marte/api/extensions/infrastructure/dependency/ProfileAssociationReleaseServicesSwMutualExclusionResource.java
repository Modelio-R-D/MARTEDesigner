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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_releaseServices_SwMutualExclusionResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d2376da2-3f82-4e3a-9e76-02b00427cfa5")
public class ProfileAssociationReleaseServicesSwMutualExclusionResource {
    @objid ("298f5bdc-0174-40e2-b09c-643f1522302b")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_releaseServices_SwMutualExclusionResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("afdac430-8b6e-40d7-9f67-5e3cbf3f6b55")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationReleaseServicesSwMutualExclusionResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_releaseServices_SwMutualExclusionResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("bfb8ae5d-a4b9-41e5-8846-f1434c4d3302")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationReleaseServicesSwMutualExclusionResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_releaseServices_SwMutualExclusionResource >> then instantiate a {@link ProfileAssociationReleaseServicesSwMutualExclusionResource} proxy.
     * 
     * @return a {@link ProfileAssociationReleaseServicesSwMutualExclusionResource} proxy on the created {@link Dependency}.
     */
    @objid ("9d093441-44cd-4d63-b91d-0db79b312711")
    public static ProfileAssociationReleaseServicesSwMutualExclusionResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationReleaseServicesSwMutualExclusionResource.STEREOTYPE_NAME);
        return ProfileAssociationReleaseServicesSwMutualExclusionResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationReleaseServicesSwMutualExclusionResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_releaseServices_SwMutualExclusionResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationReleaseServicesSwMutualExclusionResource} proxy or <i>null</i>.
     */
    @objid ("57d10164-2360-4115-aa5b-39e1e5ba8f28")
    public static ProfileAssociationReleaseServicesSwMutualExclusionResource instantiate(final Dependency obj) {
        return ProfileAssociationReleaseServicesSwMutualExclusionResource.canInstantiate(obj) ? new ProfileAssociationReleaseServicesSwMutualExclusionResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationReleaseServicesSwMutualExclusionResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_releaseServices_SwMutualExclusionResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationReleaseServicesSwMutualExclusionResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c3ed66ce-132f-448e-ac41-9e7ba11f5e36")
    public static ProfileAssociationReleaseServicesSwMutualExclusionResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationReleaseServicesSwMutualExclusionResource.canInstantiate(obj))
        	return new ProfileAssociationReleaseServicesSwMutualExclusionResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationReleaseServicesSwMutualExclusionResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4f91aaaf-3328-4a3b-8232-abd7efab3ed3")
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
        ProfileAssociationReleaseServicesSwMutualExclusionResource other = (ProfileAssociationReleaseServicesSwMutualExclusionResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("3425100c-ac27-41cb-86ea-f15b65695283")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("8cf0f40f-ba31-4e4c-b208-f08c4f10be55")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a6529bde-93e6-4206-9732-e3e949d0d608")
    protected ProfileAssociationReleaseServicesSwMutualExclusionResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("7f73a3e7-b94f-4e78-8d15-aa4b0edbeeda")
    public static final class MdaTypes {
        @objid ("13f0f19b-c908-4eca-85ed-0045aa7fe53a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("23ea645c-5e14-47a5-bfcf-ba7138e3c2c3")
        private static Stereotype MDAASSOCDEP;

        @objid ("4630fcb2-790f-4a12-a5a0-2cbc52571945")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("afc4f942-c656-459d-9f11-3211ffc73333")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3452d9f7-9759-11e0-94fb-0027103f347c");
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
