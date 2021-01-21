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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_ownedTLBs_HwMMU_HwCache >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d68a7506-c821-445e-8746-a425e25f8c7e")
public class ProfileAssociationOwnedTLBsHwMMUHwCache {
    @objid ("e0f51e80-5610-4506-aa2c-c835e158db51")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_ownedTLBs_HwMMU_HwCache";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("e9e5145c-b0de-4169-b574-7f309aabdd22")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOwnedTLBsHwMMUHwCache proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_ownedTLBs_HwMMU_HwCache >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f4cf08e6-0fac-43d2-b793-f68cd3f84b8c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOwnedTLBsHwMMUHwCache.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_ownedTLBs_HwMMU_HwCache >> then instantiate a {@link ProfileAssociationOwnedTLBsHwMMUHwCache} proxy.
     * 
     * @return a {@link ProfileAssociationOwnedTLBsHwMMUHwCache} proxy on the created {@link Dependency}.
     */
    @objid ("2a07365a-cefb-4559-9044-55f22594ce75")
    public static ProfileAssociationOwnedTLBsHwMMUHwCache create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOwnedTLBsHwMMUHwCache.STEREOTYPE_NAME);
        return ProfileAssociationOwnedTLBsHwMMUHwCache.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOwnedTLBsHwMMUHwCache} proxy from a {@link Dependency} stereotyped << ProfileAssociation_ownedTLBs_HwMMU_HwCache >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOwnedTLBsHwMMUHwCache} proxy or <i>null</i>.
     */
    @objid ("238bd950-a9b3-481a-9ec0-2b919c1ff2d0")
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
    @objid ("83184aef-ee9c-48b6-87c4-cfbc64617447")
    public static ProfileAssociationOwnedTLBsHwMMUHwCache safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOwnedTLBsHwMMUHwCache.canInstantiate(obj))
        	return new ProfileAssociationOwnedTLBsHwMMUHwCache(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOwnedTLBsHwMMUHwCache: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f0d244c6-306b-4df2-83ff-62bd96518532")
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
    @objid ("317bfe54-e120-4a35-9ffb-68680a912b14")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("1f6be45f-bf07-4af5-8384-21f9931810c1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("eb2aa61b-9948-461d-bcb0-9f0f1fda826c")
    protected ProfileAssociationOwnedTLBsHwMMUHwCache(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("ca10e422-9a47-4b82-987d-aff691bd0210")
    public static final class MdaTypes {
        @objid ("a74eaf2d-83e5-41e2-80ee-9d2ade1237ac")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("efc488b6-c648-44ed-8778-74bcd042159c")
        private static Stereotype MDAASSOCDEP;

        @objid ("1cfcbe30-3987-4db8-ace0-54487907eee4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("986f4a52-b95f-49c4-a9d7-b45d3fc6fd50")
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
