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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_concurrentResources_MemoryPartition >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("59eac0b4-b720-4826-9904-2783490b0649")
public class ProfileAssociationConcurrentResourcesMemoryPartition {
    @objid ("61657b41-89a0-4563-80ac-8a886e6b9eaa")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_concurrentResources_MemoryPartition";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("ff0fd35e-8b80-48c8-bd4d-d552e10eb145")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationConcurrentResourcesMemoryPartition proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_concurrentResources_MemoryPartition >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("88b1ac5e-0e55-4a66-853d-6871fb99c148")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationConcurrentResourcesMemoryPartition.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_concurrentResources_MemoryPartition >> then instantiate a {@link ProfileAssociationConcurrentResourcesMemoryPartition} proxy.
     * 
     * @return a {@link ProfileAssociationConcurrentResourcesMemoryPartition} proxy on the created {@link Dependency}.
     */
    @objid ("09daf067-aa33-47a1-a584-274e02eab4ac")
    public static ProfileAssociationConcurrentResourcesMemoryPartition create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationConcurrentResourcesMemoryPartition.STEREOTYPE_NAME);
        return ProfileAssociationConcurrentResourcesMemoryPartition.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationConcurrentResourcesMemoryPartition} proxy from a {@link Dependency} stereotyped << ProfileAssociation_concurrentResources_MemoryPartition >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationConcurrentResourcesMemoryPartition} proxy or <i>null</i>.
     */
    @objid ("99cf5179-a09f-4777-827c-32b6e8779d6d")
    public static ProfileAssociationConcurrentResourcesMemoryPartition instantiate(final Dependency obj) {
        return ProfileAssociationConcurrentResourcesMemoryPartition.canInstantiate(obj) ? new ProfileAssociationConcurrentResourcesMemoryPartition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationConcurrentResourcesMemoryPartition} proxy from a {@link Dependency} stereotyped << ProfileAssociation_concurrentResources_MemoryPartition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationConcurrentResourcesMemoryPartition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f38b95a2-4868-4879-a28e-54f46e0177c0")
    public static ProfileAssociationConcurrentResourcesMemoryPartition safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationConcurrentResourcesMemoryPartition.canInstantiate(obj))
        	return new ProfileAssociationConcurrentResourcesMemoryPartition(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationConcurrentResourcesMemoryPartition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ae8d7e22-a7c7-4440-9766-739e4d421146")
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
        ProfileAssociationConcurrentResourcesMemoryPartition other = (ProfileAssociationConcurrentResourcesMemoryPartition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("22101946-5fcb-4f80-a1a7-d55585a79e34")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("ff2d0ed8-7846-4ff1-99e6-db0ca95a2166")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("91a5d3a4-40c8-489d-a659-7a21b9023f6f")
    protected ProfileAssociationConcurrentResourcesMemoryPartition(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("a34d8e78-6cdd-4cd5-8dc4-8cf0b8b6bfee")
    public static final class MdaTypes {
        @objid ("582744e2-169b-432d-8318-da269dd90648")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("975efe57-4acd-4c4e-9da4-de7b9cac9cd1")
        private static Stereotype MDAASSOCDEP;

        @objid ("9f8cf92e-7abb-4b84-873f-295014fa2f56")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7e1f1d0c-7db5-42d0-a9d6-fd108ee5d493")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4c219a4e-9757-11e0-94fb-0027103f347c");
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
