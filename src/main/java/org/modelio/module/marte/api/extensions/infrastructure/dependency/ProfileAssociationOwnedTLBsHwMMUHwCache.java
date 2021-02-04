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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_ownedTLBs_HwMMU_HwCache >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d68a7506-c821-445e-8746-a425e25f8c7e")
public class ProfileAssociationOwnedTLBsHwMMUHwCache {
    @objid ("0e268a48-dd35-4e78-b4e5-9771a48b5e38")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_ownedTLBs_HwMMU_HwCache";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("365a53ba-127c-48bc-8aa0-d38f282d80a0")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOwnedTLBsHwMMUHwCache proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_ownedTLBs_HwMMU_HwCache >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0c9359af-59c0-4e5f-a160-2dbec731dd4e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOwnedTLBsHwMMUHwCache.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_ownedTLBs_HwMMU_HwCache >> then instantiate a {@link ProfileAssociationOwnedTLBsHwMMUHwCache} proxy.
     * 
     * @return a {@link ProfileAssociationOwnedTLBsHwMMUHwCache} proxy on the created {@link Dependency}.
     */
    @objid ("560c96e4-e0b9-4667-85a4-a9ee9b4468e5")
    public static ProfileAssociationOwnedTLBsHwMMUHwCache create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOwnedTLBsHwMMUHwCache.STEREOTYPE_NAME);
        return ProfileAssociationOwnedTLBsHwMMUHwCache.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOwnedTLBsHwMMUHwCache} proxy from a {@link Dependency} stereotyped << ProfileAssociation_ownedTLBs_HwMMU_HwCache >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOwnedTLBsHwMMUHwCache} proxy or <i>null</i>.
     */
    @objid ("a0e02d22-3b97-4ecb-883c-ec2fa84405c9")
    public static ProfileAssociationOwnedTLBsHwMMUHwCache instantiate(final Dependency obj) {
        return ProfileAssociationOwnedTLBsHwMMUHwCache.canInstantiate(obj) ? new ProfileAssociationOwnedTLBsHwMMUHwCache(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOwnedTLBsHwMMUHwCache} proxy from a {@link Dependency} stereotyped << ProfileAssociation_ownedTLBs_HwMMU_HwCache >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationOwnedTLBsHwMMUHwCache} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("da527503-4dfc-4b3b-b5dd-04cae01a759d")
    public static ProfileAssociationOwnedTLBsHwMMUHwCache safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOwnedTLBsHwMMUHwCache.canInstantiate(obj))
        	return new ProfileAssociationOwnedTLBsHwMMUHwCache(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOwnedTLBsHwMMUHwCache: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("70582b66-d234-433c-a6a3-063c89334666")
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
        ProfileAssociationOwnedTLBsHwMMUHwCache other = (ProfileAssociationOwnedTLBsHwMMUHwCache) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("5ca704c7-5881-4c5e-ba49-eadb1e2449a8")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("852af1ba-f520-4062-9800-758d15931196")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f6f5b871-86f8-4bd6-bb11-cfa657821afb")
    protected ProfileAssociationOwnedTLBsHwMMUHwCache(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("ca10e422-9a47-4b82-987d-aff691bd0210")
    public static final class MdaTypes {
        @objid ("f0a5c1db-2a5a-4d7a-a3d5-5cfe22e6cd9c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ba6a5d28-8061-49b3-83b3-d9ee4f5ea3ca")
        private static Stereotype MDAASSOCDEP;

        @objid ("6571f8f5-1b7f-4b43-9321-685d94e92e0a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("747d8c72-d915-4b22-82d2-dc204cb4ecd5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "876a3944-937d-11e0-b960-0027103f347c");
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
