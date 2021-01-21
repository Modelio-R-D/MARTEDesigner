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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_ownedHw_HwResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c5940c56-0628-48d8-a014-0e2496dbf7b8")
public class ProfileAssociationOwnedHwHwResource {
    @objid ("48b8c933-b6da-44ff-8332-f5315b31a0d9")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_ownedHw_HwResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("f66b8028-77a0-4510-af14-d687c78e4844")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOwnedHwHwResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_ownedHw_HwResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("28fbf55f-457d-4d01-bbbf-a516c4f8dd38")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOwnedHwHwResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_ownedHw_HwResource >> then instantiate a {@link ProfileAssociationOwnedHwHwResource} proxy.
     * 
     * @return a {@link ProfileAssociationOwnedHwHwResource} proxy on the created {@link Dependency}.
     */
    @objid ("064cc937-be5a-4169-8b47-24615b07b5c3")
    public static ProfileAssociationOwnedHwHwResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOwnedHwHwResource.STEREOTYPE_NAME);
        return ProfileAssociationOwnedHwHwResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOwnedHwHwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_ownedHw_HwResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOwnedHwHwResource} proxy or <i>null</i>.
     */
    @objid ("42bd24e6-acb0-42d2-bce7-aabd111206ed")
    public static ProfileAssociationOwnedHwHwResource instantiate(final Dependency obj) {
        return ProfileAssociationOwnedHwHwResource.canInstantiate(obj) ? new ProfileAssociationOwnedHwHwResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOwnedHwHwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_ownedHw_HwResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationOwnedHwHwResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ecd70136-f4f4-421c-8e55-b69df80b5cfa")
    public static ProfileAssociationOwnedHwHwResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOwnedHwHwResource.canInstantiate(obj))
        	return new ProfileAssociationOwnedHwHwResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOwnedHwHwResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1bb09c6b-fb7d-4dab-99a4-fa6ae575cd88")
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
        ProfileAssociationOwnedHwHwResource other = (ProfileAssociationOwnedHwHwResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("c143d83c-fafa-4659-95f5-0d721b0e39fc")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("1e3483de-bed7-420c-824e-ed80bafc4c4e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("efd08e2e-3da1-4262-8ee1-df4a9ef70d74")
    protected ProfileAssociationOwnedHwHwResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("3a991da8-3a30-4d99-b550-91b50234e9c0")
    public static final class MdaTypes {
        @objid ("9e8bd295-840f-456a-806c-220d7e156abc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("de2aad0c-b5f5-4e8f-b95a-22485b21c4db")
        private static Stereotype MDAASSOCDEP;

        @objid ("bf1cddae-b641-45ba-8114-6498af2d9af6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cf5f03d1-b162-4dfc-9683-b60a93889ea4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cd9ed9c9-937c-11e0-b960-0027103f347c");
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
