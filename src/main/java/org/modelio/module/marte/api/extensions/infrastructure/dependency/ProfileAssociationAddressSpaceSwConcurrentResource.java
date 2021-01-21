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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_addressSpace_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("44794b6e-1fb5-4649-9acd-595643adb302")
public class ProfileAssociationAddressSpaceSwConcurrentResource {
    @objid ("1598f670-8a8c-4988-ba3c-67bc77ba88f7")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_addressSpace_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("44b4783b-de2e-4728-bfc9-ebca24c883c4")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationAddressSpaceSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_addressSpace_SwConcurrentResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("db933f0d-4b32-46da-9ef3-a22ef10b9edb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationAddressSpaceSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_addressSpace_SwConcurrentResource >> then instantiate a {@link ProfileAssociationAddressSpaceSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationAddressSpaceSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("80816dff-37f7-4f65-9400-fe9806e6b329")
    public static ProfileAssociationAddressSpaceSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationAddressSpaceSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationAddressSpaceSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationAddressSpaceSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_addressSpace_SwConcurrentResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationAddressSpaceSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("9620a73d-1f6b-4403-aea2-5e44ae981f43")
    public static ProfileAssociationAddressSpaceSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationAddressSpaceSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationAddressSpaceSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationAddressSpaceSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_addressSpace_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationAddressSpaceSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c04a42e3-ec57-45a2-8109-b2c47bee9dc4")
    public static ProfileAssociationAddressSpaceSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationAddressSpaceSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationAddressSpaceSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationAddressSpaceSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("06b298b9-9e04-4181-9834-8e5447848a2f")
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
        ProfileAssociationAddressSpaceSwConcurrentResource other = (ProfileAssociationAddressSpaceSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("9bae4db9-8a3f-4fec-9eb6-73a23a4340a9")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("0abc5fb2-09ef-45dc-99bf-9a92e195cbe3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("18cc4821-949f-41be-b298-6c3da81781e6")
    protected ProfileAssociationAddressSpaceSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("707c2a37-244e-4c75-9236-046d5e7c2cc2")
    public static final class MdaTypes {
        @objid ("5775dd9a-9fa1-40b6-ad1c-081f5544946f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b876010b-17fc-4559-991d-97ece93582b4")
        private static Stereotype MDAASSOCDEP;

        @objid ("386a5d5c-b567-4b93-b078-312e0114412d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("138a603a-ada9-44be-8cd7-27eecaa360b8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "227ad5e3-9756-11e0-94fb-0027103f347c");
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
