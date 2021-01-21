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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_usedResources_ResourceUsage_Resource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("03b005df-f015-4e2f-b771-d1e031c35348")
public class ProfileAssociationUsedResourcesResourceUsageResource {
    @objid ("4e10ebd4-8078-44fc-8702-ddf41b411a15")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_usedResources_ResourceUsage_Resource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("a10f4478-7d78-42d3-a1f5-2a41e83bff2c")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationUsedResourcesResourceUsageResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_usedResources_ResourceUsage_Resource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("95487358-16b2-465d-b907-59e141b91570")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationUsedResourcesResourceUsageResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_usedResources_ResourceUsage_Resource >> then instantiate a {@link ProfileAssociationUsedResourcesResourceUsageResource} proxy.
     * 
     * @return a {@link ProfileAssociationUsedResourcesResourceUsageResource} proxy on the created {@link Dependency}.
     */
    @objid ("d05be94c-f59e-40c1-832c-645ec4bd6a25")
    public static ProfileAssociationUsedResourcesResourceUsageResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationUsedResourcesResourceUsageResource.STEREOTYPE_NAME);
        return ProfileAssociationUsedResourcesResourceUsageResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationUsedResourcesResourceUsageResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_usedResources_ResourceUsage_Resource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationUsedResourcesResourceUsageResource} proxy or <i>null</i>.
     */
    @objid ("48194187-d61e-48ea-a2fa-42c6b0f0cb07")
    public static ProfileAssociationUsedResourcesResourceUsageResource instantiate(final Dependency obj) {
        return ProfileAssociationUsedResourcesResourceUsageResource.canInstantiate(obj) ? new ProfileAssociationUsedResourcesResourceUsageResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationUsedResourcesResourceUsageResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_usedResources_ResourceUsage_Resource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationUsedResourcesResourceUsageResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9d3d58b5-bcc1-45db-a5d2-b9d06ab225cc")
    public static ProfileAssociationUsedResourcesResourceUsageResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationUsedResourcesResourceUsageResource.canInstantiate(obj))
        	return new ProfileAssociationUsedResourcesResourceUsageResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationUsedResourcesResourceUsageResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("64444cd3-8ba5-43de-94d8-a0ceeb221579")
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
        ProfileAssociationUsedResourcesResourceUsageResource other = (ProfileAssociationUsedResourcesResourceUsageResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("e86505f7-d17b-46f3-b261-4dcd0e934d50")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("c2ee99e7-3477-4360-a930-26ce9ee202fb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b785c1ef-5192-4893-bd33-13c429ea9271")
    protected ProfileAssociationUsedResourcesResourceUsageResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("55c8d16d-551f-4cee-880c-9895038f4290")
    public static final class MdaTypes {
        @objid ("13ad5b33-92f3-47a4-854f-a72d1202c40a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c1b8fea9-2382-4d18-9fe8-db0400da4157")
        private static Stereotype MDAASSOCDEP;

        @objid ("7272a94c-f5d1-4a75-a885-7f911e09db6a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c8a01358-b831-4cb2-9bd5-4ff80ab92434")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b6841b28-8b69-11df-9343-0014222a9f79");
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
